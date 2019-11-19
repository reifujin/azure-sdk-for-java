/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The virtual machine sizes capability.
 */
public class VmSizesCapability {
    /**
     * The list of virtual machine size capabilities.
     */
    @JsonProperty(value = "available")
    private List<String> available;

    /**
     * Get the list of virtual machine size capabilities.
     *
     * @return the available value
     */
    public List<String> available() {
        return this.available;
    }

    /**
     * Set the list of virtual machine size capabilities.
     *
     * @param available the available value to set
     * @return the VmSizesCapability object itself.
     */
    public VmSizesCapability withAvailable(List<String> available) {
        this.available = available;
        return this;
    }

}