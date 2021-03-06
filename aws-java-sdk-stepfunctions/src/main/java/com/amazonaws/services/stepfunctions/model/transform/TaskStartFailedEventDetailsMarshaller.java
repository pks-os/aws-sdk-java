/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.stepfunctions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskStartFailedEventDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskStartFailedEventDetailsMarshaller {

    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> RESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resource").build();
    private static final MarshallingInfo<String> ERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("error").build();
    private static final MarshallingInfo<String> CAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cause").build();

    private static final TaskStartFailedEventDetailsMarshaller instance = new TaskStartFailedEventDetailsMarshaller();

    public static TaskStartFailedEventDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskStartFailedEventDetails taskStartFailedEventDetails, ProtocolMarshaller protocolMarshaller) {

        if (taskStartFailedEventDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskStartFailedEventDetails.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(taskStartFailedEventDetails.getResource(), RESOURCE_BINDING);
            protocolMarshaller.marshall(taskStartFailedEventDetails.getError(), ERROR_BINDING);
            protocolMarshaller.marshall(taskStartFailedEventDetails.getCause(), CAUSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
