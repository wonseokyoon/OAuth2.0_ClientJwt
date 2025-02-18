package Clientjwt.dto;

import java.util.Map;

public class dukfeelResponse implements OAuth2Response{

    private final Map<String, Object> attribute;

    public dukfeelResponse(Map<String, Object> attribute) {

        this.attribute = (Map<String, Object>) attribute.get("response");
    }

    @Override
    public String getProvider() {
        return "dukfeel";
    }

    @Override
    public String getProviderId() {
        return "23413241234";
    }

    @Override
    public String getEmail() {
        return attribute.get("username").toString() + "@dev.com";
    }

    @Override
    public String getName() {
        return attribute.get("username").toString();
    }
}