/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.serviceregistry.api.response;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @since Mar 14, 2017
 * @see 
 */
public class TestHeartbeatResponse {

    HeartbeatResponse oHeartbeatResponse = null;

    @Before
    public void setUp() throws Exception {
        oHeartbeatResponse = new HeartbeatResponse();
    }

    @After
    public void tearDown() throws Exception {
        oHeartbeatResponse = null;
    }

    @Test
    public void testDefaultValues() {
        Assert.assertNull(oHeartbeatResponse.getMessage());
        Assert.assertEquals(false, oHeartbeatResponse.isOk());
    }

    @Test
    public void testIntializedValues() {
        initFields(); //Initialize the Object
        Assert.assertEquals("testMessage", oHeartbeatResponse.getMessage());
        Assert.assertEquals(true, oHeartbeatResponse.isOk());
    }

    private void initFields() {
        oHeartbeatResponse.setMessage("testMessage");
        oHeartbeatResponse.setOk(true);

    }

}
