/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01.implementation;

import com.microsoft.azure.management.eventgrid.v2018_01_01.EventSubscriptionProvisioningState;
import com.microsoft.azure.management.eventgrid.v2018_01_01.EventSubscriptionDestination;
import com.microsoft.azure.management.eventgrid.v2018_01_01.EventSubscriptionFilter;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Event Subscription.
 */
@JsonFlatten
public class EventSubscriptionInner extends ProxyResource {
    /**
     * Name of the topic of the event subscription.
     */
    @JsonProperty(value = "properties.topic", access = JsonProperty.Access.WRITE_ONLY)
    private String topic;

    /**
     * Provisioning state of the event subscription. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EventSubscriptionProvisioningState provisioningState;

    /**
     * Information about the destination where events have to be delivered for
     * the event subscription.
     */
    @JsonProperty(value = "properties.destination")
    private EventSubscriptionDestination destination;

    /**
     * Information about the filter for the event subscription.
     */
    @JsonProperty(value = "properties.filter")
    private EventSubscriptionFilter filter;

    /**
     * List of user defined labels.
     */
    @JsonProperty(value = "properties.labels")
    private List<String> labels;

    /**
     * Get name of the topic of the event subscription.
     *
     * @return the topic value
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Get provisioning state of the event subscription. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public EventSubscriptionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get information about the destination where events have to be delivered for the event subscription.
     *
     * @return the destination value
     */
    public EventSubscriptionDestination destination() {
        return this.destination;
    }

    /**
     * Set information about the destination where events have to be delivered for the event subscription.
     *
     * @param destination the destination value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withDestination(EventSubscriptionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get information about the filter for the event subscription.
     *
     * @return the filter value
     */
    public EventSubscriptionFilter filter() {
        return this.filter;
    }

    /**
     * Set information about the filter for the event subscription.
     *
     * @param filter the filter value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withFilter(EventSubscriptionFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get list of user defined labels.
     *
     * @return the labels value
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set list of user defined labels.
     *
     * @param labels the labels value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

}