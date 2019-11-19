/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies which Redis node(s) to reboot.
 */
public class RedisRebootParameters {
    /**
     * Which Redis node(s) to reboot. Depending on this value data loss is
     * possible. Possible values include: 'PrimaryNode', 'SecondaryNode',
     * 'AllNodes'.
     */
    @JsonProperty(value = "rebootType", required = true)
    private RebootType rebootType;

    /**
     * If clustering is enabled, the ID of the shard to be rebooted.
     */
    @JsonProperty(value = "shardId")
    private Integer shardId;

    /**
     * Get which Redis node(s) to reboot. Depending on this value data loss is possible. Possible values include: 'PrimaryNode', 'SecondaryNode', 'AllNodes'.
     *
     * @return the rebootType value
     */
    public RebootType rebootType() {
        return this.rebootType;
    }

    /**
     * Set which Redis node(s) to reboot. Depending on this value data loss is possible. Possible values include: 'PrimaryNode', 'SecondaryNode', 'AllNodes'.
     *
     * @param rebootType the rebootType value to set
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withRebootType(RebootType rebootType) {
        this.rebootType = rebootType;
        return this;
    }

    /**
     * Get if clustering is enabled, the ID of the shard to be rebooted.
     *
     * @return the shardId value
     */
    public Integer shardId() {
        return this.shardId;
    }

    /**
     * Set if clustering is enabled, the ID of the shard to be rebooted.
     *
     * @param shardId the shardId value to set
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withShardId(Integer shardId) {
        this.shardId = shardId;
        return this;
    }

}