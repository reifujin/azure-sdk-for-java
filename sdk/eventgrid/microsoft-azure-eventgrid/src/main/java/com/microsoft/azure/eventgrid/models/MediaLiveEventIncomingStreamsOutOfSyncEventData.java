/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Incoming streams out of sync event data.
 */
public class MediaLiveEventIncomingStreamsOutOfSyncEventData {
    /**
     * Gets the minimum last timestamp received.
     */
    @JsonProperty(value = "minLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String minLastTimestamp;

    /**
     * Gets the type of stream with minimum last timestamp.
     */
    @JsonProperty(value = "typeOfStreamWithMinLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String typeOfStreamWithMinLastTimestamp;

    /**
     * Gets the maximum timestamp among all the tracks (audio or video).
     */
    @JsonProperty(value = "maxLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String maxLastTimestamp;

    /**
     * Gets the type of stream with maximum last timestamp.
     */
    @JsonProperty(value = "typeOfStreamWithMaxLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String typeOfStreamWithMaxLastTimestamp;

    /**
     * Gets the timescale in which "MinLastTimestamp" is represented.
     */
    @JsonProperty(value = "timescaleOfMinLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timescaleOfMinLastTimestamp;

    /**
     * Gets the timescale in which "MaxLastTimestamp" is represented.
     */
    @JsonProperty(value = "timescaleOfMaxLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timescaleOfMaxLastTimestamp;

    /**
     * Get gets the minimum last timestamp received.
     *
     * @return the minLastTimestamp value
     */
    public String minLastTimestamp() {
        return this.minLastTimestamp;
    }

    /**
     * Get gets the type of stream with minimum last timestamp.
     *
     * @return the typeOfStreamWithMinLastTimestamp value
     */
    public String typeOfStreamWithMinLastTimestamp() {
        return this.typeOfStreamWithMinLastTimestamp;
    }

    /**
     * Get gets the maximum timestamp among all the tracks (audio or video).
     *
     * @return the maxLastTimestamp value
     */
    public String maxLastTimestamp() {
        return this.maxLastTimestamp;
    }

    /**
     * Get gets the type of stream with maximum last timestamp.
     *
     * @return the typeOfStreamWithMaxLastTimestamp value
     */
    public String typeOfStreamWithMaxLastTimestamp() {
        return this.typeOfStreamWithMaxLastTimestamp;
    }

    /**
     * Get gets the timescale in which "MinLastTimestamp" is represented.
     *
     * @return the timescaleOfMinLastTimestamp value
     */
    public String timescaleOfMinLastTimestamp() {
        return this.timescaleOfMinLastTimestamp;
    }

    /**
     * Get gets the timescale in which "MaxLastTimestamp" is represented.
     *
     * @return the timescaleOfMaxLastTimestamp value
     */
    public String timescaleOfMaxLastTimestamp() {
        return this.timescaleOfMaxLastTimestamp;
    }

}
