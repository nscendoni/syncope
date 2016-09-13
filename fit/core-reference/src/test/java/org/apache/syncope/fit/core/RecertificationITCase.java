/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.fit.core;

import java.util.List;
import org.apache.syncope.common.lib.to.WorkflowFormPropertyTO;
import org.apache.syncope.common.lib.to.WorkflowFormTO;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
<<<<<<< HEAD
public class RecertificationITCase extends AbstractTaskITCase {
=======
public class RecertificationITCase extends AbstractTaskITCase{
>>>>>>> c611d69ebfcd8fa642c8f58d4a363d1d66147449

    @Test
    public void recertification() {
        execTask(taskService, "e95555d2-1b09-42c8-b25b-f4c4ec598989", "JOB_FIRED", 10, false);

        List<WorkflowFormTO> forms = userWorkflowService.getForms();
        assertFalse(forms.isEmpty());
<<<<<<< HEAD
        for (WorkflowFormTO form : forms) {
            userWorkflowService.claimForm(form.getTaskId());
            WorkflowFormPropertyTO property = form.getPropertyMap().get("approve");
            property.setValue("true");
            userWorkflowService.submitForm(form);
=======
        for (WorkflowFormTO f : forms) {
            userWorkflowService.claimForm(f.getTaskId());
            WorkflowFormPropertyTO w = f.getPropertyMap().get("approve");
            w.setValue("true");
            userWorkflowService.submitForm(f);
>>>>>>> c611d69ebfcd8fa642c8f58d4a363d1d66147449
        }

        forms = userWorkflowService.getForms();
        assertTrue(forms.isEmpty());
<<<<<<< HEAD
    }

}
=======

    }

}
>>>>>>> c611d69ebfcd8fa642c8f58d4a363d1d66147449
