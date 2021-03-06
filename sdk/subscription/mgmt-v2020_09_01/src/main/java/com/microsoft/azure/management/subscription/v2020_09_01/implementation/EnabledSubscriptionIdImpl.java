/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2020_09_01.implementation;

import com.microsoft.azure.management.subscription.v2020_09_01.EnabledSubscriptionId;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class EnabledSubscriptionIdImpl extends WrapperImpl<EnabledSubscriptionIdInner> implements EnabledSubscriptionId {
    private final SubscriptionManager manager;
    EnabledSubscriptionIdImpl(EnabledSubscriptionIdInner inner, SubscriptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SubscriptionManager manager() {
        return this.manager;
    }

    @Override
    public String value() {
        return this.inner().value();
    }

}
