package org.youzipi.template.jinja;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Resources;
import com.hubspot.jinjava.Jinjava;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Jinjava jinjava = new Jinjava();


        Shop shop1 = Shop.builder()
                .shopName("shop1")
                .accountName("account1")
                .platform("ele+mt")
                .build();

        Shop shop2 = Shop.builder()
                .shopName("shop2")
                .accountName("account1")
                .platform("ele")
                .build();

        HashMap<String, Object> context = Maps.newHashMap();
        context.put("shops", Arrays.asList(shop1, shop2));
        context.put("title", "20190301 19:00");
        String template = Resources.toString(Resources.getResource("email.jinja2"), Charsets.UTF_8);
        String result = jinjava.render(template, context);
        System.out.println(result);

    }
}
