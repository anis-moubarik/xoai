/**
 * Copyright 2012 Lyncode
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     client://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lyncode.xoai.serviceprovider.parameters;

public class GetRecordParameters {
    public static GetRecordParameters request () {
        return new GetRecordParameters();
    }

    private String identifier;
    private String metadataPrefix;

    public String getIdentifier() {
        return identifier;
    }

    public GetRecordParameters withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public String getMetadataPrefix() {
        return metadataPrefix;
    }

    public GetRecordParameters withMetadataFormatPrefix(String metadataFormatPrefix) {
        this.metadataPrefix = metadataFormatPrefix;
        return this;
    }

    public boolean areValid() {
        return identifier != null && metadataPrefix != null;
    }
}
