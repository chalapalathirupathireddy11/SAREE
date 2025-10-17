package com.sarees.sarees.Audit;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SareeShopInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> sareeShop = new HashMap<String, String>();
        sareeShop.put("App Name", "SareeShop");
        sareeShop.put("App Description", "Saree Shop  Web Application for Users and Admin");
        sareeShop.put("App Version", "1.0.0");
        sareeShop.put("Contact Email", "info@sareeShop.com");
        sareeShop.put("Contact Mobile", "+91(91) 673 4587");
        builder.withDetail("sareeShop-info", sareeShop);
    }
}
