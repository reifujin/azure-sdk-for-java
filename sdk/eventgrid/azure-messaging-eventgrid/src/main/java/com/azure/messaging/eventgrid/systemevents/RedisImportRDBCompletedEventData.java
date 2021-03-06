// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The RedisImportRDBCompletedEventData model. */
@Fluent
public final class RedisImportRDBCompletedEventData {
    /*
     * The time at which the event occurred.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * The name of this event.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The status of this event. Failed or  succeeded
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the timestamp property: The time at which the event occurred.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The time at which the event occurred.
     *
     * @param timestamp the timestamp value to set.
     * @return the RedisImportRDBCompletedEventData object itself.
     */
    public RedisImportRDBCompletedEventData setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the name property: The name of this event.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this event.
     *
     * @param name the name value to set.
     * @return the RedisImportRDBCompletedEventData object itself.
     */
    public RedisImportRDBCompletedEventData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: The status of this event. Failed or succeeded.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of this event. Failed or succeeded.
     *
     * @param status the status value to set.
     * @return the RedisImportRDBCompletedEventData object itself.
     */
    public RedisImportRDBCompletedEventData setStatus(String status) {
        this.status = status;
        return this;
    }
}
