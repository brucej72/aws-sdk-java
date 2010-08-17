/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Snapshot Attribute Request Marshaller
 */
public class ModifySnapshotAttributeRequestMarshaller implements Marshaller<Request<ModifySnapshotAttributeRequest>, ModifySnapshotAttributeRequest> {

    public Request<ModifySnapshotAttributeRequest> marshall(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) {
        Request<ModifySnapshotAttributeRequest> request = new DefaultRequest<ModifySnapshotAttributeRequest>(modifySnapshotAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySnapshotAttribute");
        request.addParameter("Version", "2010-06-15");
        if (modifySnapshotAttributeRequest != null) {
            if (modifySnapshotAttributeRequest.getSnapshotId() != null) {
                request.addParameter("SnapshotId", StringUtils.fromString(modifySnapshotAttributeRequest.getSnapshotId()));
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            if (modifySnapshotAttributeRequest.getAttribute() != null) {
                request.addParameter("Attribute", StringUtils.fromString(modifySnapshotAttributeRequest.getAttribute()));
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            if (modifySnapshotAttributeRequest.getOperationType() != null) {
                request.addParameter("OperationType", StringUtils.fromString(modifySnapshotAttributeRequest.getOperationType()));
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            java.util.List<String> userIdsList = modifySnapshotAttributeRequest.getUserIds();
            int userIdsListIndex = 1;
            for (String userIdsListValue : userIdsList) {
                if (userIdsListValue != null) {
                    request.addParameter("UserId." + userIdsListIndex, StringUtils.fromString(userIdsListValue));
                }
                userIdsListIndex++;
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            java.util.List<String> groupNamesList = modifySnapshotAttributeRequest.getGroupNames();
            int groupNamesListIndex = 1;
            for (String groupNamesListValue : groupNamesList) {
                if (groupNamesListValue != null) {
                    request.addParameter("Group." + groupNamesListIndex, StringUtils.fromString(groupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }


        return request;
    }
}
