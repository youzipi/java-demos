package org.youzipi.template.jinja;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Shop {
    private String shopId;
    private String shopName;
    private String accountId;
    private String accountName;
    private String platform;

}
