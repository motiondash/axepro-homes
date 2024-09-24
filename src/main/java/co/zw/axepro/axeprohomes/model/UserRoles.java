package co.zw.axepro.axeprohomes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserRoles {
    @JsonProperty("ADMIN")
    ADMIN,

    @JsonProperty("PROPERTY_OWNER")
    PROPERTY_OWNER,

    @JsonProperty("CLIENT")
    CLIENT
}
