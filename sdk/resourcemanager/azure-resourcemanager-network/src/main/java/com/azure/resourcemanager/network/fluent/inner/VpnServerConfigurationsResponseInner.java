// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VpnServerConfigurationsResponse model. */
@Fluent
public final class VpnServerConfigurationsResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnServerConfigurationsResponseInner.class);

    /*
     * List of VpnServerConfigurations associated with VirtualWan.
     */
    @JsonProperty(value = "vpnServerConfigurationResourceIds")
    private List<String> vpnServerConfigurationResourceIds;

    /**
     * Get the vpnServerConfigurationResourceIds property: List of VpnServerConfigurations associated with VirtualWan.
     *
     * @return the vpnServerConfigurationResourceIds value.
     */
    public List<String> vpnServerConfigurationResourceIds() {
        return this.vpnServerConfigurationResourceIds;
    }

    /**
     * Set the vpnServerConfigurationResourceIds property: List of VpnServerConfigurations associated with VirtualWan.
     *
     * @param vpnServerConfigurationResourceIds the vpnServerConfigurationResourceIds value to set.
     * @return the VpnServerConfigurationsResponseInner object itself.
     */
    public VpnServerConfigurationsResponseInner withVpnServerConfigurationResourceIds(
        List<String> vpnServerConfigurationResourceIds) {
        this.vpnServerConfigurationResourceIds = vpnServerConfigurationResourceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
