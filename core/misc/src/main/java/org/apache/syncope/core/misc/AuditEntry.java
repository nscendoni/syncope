/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License; Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing;
 * software distributed under the License is distributed on an
 * "AS IS" BASIS; WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND; either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.core.misc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.syncope.common.lib.AbstractBaseBean;
import org.apache.syncope.common.lib.types.AuditLoggerName;

public class AuditEntry extends AbstractBaseBean {

    private static final long serialVersionUID = -2299082316063743582L;

    private final String who;

    private final AuditLoggerName logger;

    private final Object before;

    private final Object output;

    private final Object[] input;

    @JsonCreator
    public AuditEntry(
            @JsonProperty("who") final String who,
            @JsonProperty("logger") final AuditLoggerName logger,
            @JsonProperty("before") final Object before,
            @JsonProperty("output") final Object output,
            @JsonProperty("input") final Object[] input) {

        super();
        
        this.who = who;
        this.logger = logger;
        this.before = before;
        this.output = output;
        this.input = input;
    }

    public String getWho() {
        return who;
    }

    public AuditLoggerName getLogger() {
        return logger;
    }

    public Object getBefore() {
        return before;
    }

    public Object getOutput() {
        return output;
    }

    public Object[] getInput() {
        return input;
    }

}
