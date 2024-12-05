/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.airlift.json.subtype;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

public sealed interface Employee
{
    record Programmer(String name)
            implements Employee {}

    @JsonPropertyOrder({"name", "reports"})
    record Manager(String name, List<Employee> reports)
            implements Employee {}
}
