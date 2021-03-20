package com.tacoscloud.tacos.annotation;

@FruitProvider(id = 1,name = "apple",address = "2020hao")
public class Apple {
    private int appleId;
    private String appleProviderName;
    private String appleProviderAddress;

    public int getAppleId() {
        return appleId;
    }

    public void setAppleId(int appleId) {
        this.appleId = appleId;
    }

    public String getAppleProviderName() {
        return appleProviderName;
    }

    public void setAppleProviderName(String appleProviderName) {
        this.appleProviderName = appleProviderName;
    }

    public String getAppleProviderAddress() {
        return appleProviderAddress;
    }

    public void setAppleProviderAddress(String appleProviderAddress) {
        this.appleProviderAddress = appleProviderAddress;
    }
}
