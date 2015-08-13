/**
 * Copyright (c) 2015 Intel Corporation
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
package org.trustedanalytics.resourceserver.unit;

import org.trustedanalytics.resourceserver.data.ResourceTemplate;
import org.trustedanalytics.resourceserver.data.DataProvider;
import org.trustedanalytics.resourceserver.rest.ResourceController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfiguration.class)
public class ResourceControllerTest {

    public final static String CF_RESOURCE = "resource_string"; 
    
    private ResourceController sut;
    
    @Autowired
    private DataProvider dataProvider;
    
  
    @Before
    public void setUp() {
        sut = new ResourceController(dataProvider);
    }
    
    @Test
    public void getResourceValueTest() {
        ResourceTemplate a = sut.getResourceValue();
        assertEquals(CF_RESOURCE,a.getValue());
    }

}
