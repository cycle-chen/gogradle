/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.blindpirate.gogradle.ide

import com.github.blindpirate.gogradle.GogradleRunner
import com.github.blindpirate.gogradle.task.TaskTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static com.github.blindpirate.gogradle.task.GolangTaskContainer.VENDOR_TASK_NAME
import static org.mockito.Mockito.verify

@RunWith(GogradleRunner)
class JetBrainsIdeTaskTest extends TaskTest {
    JetBrainsIdeTask task

    @Before
    void setUp() {
        task = buildTask(JetBrainsIdeTask)
    }

    @Test
    void 'gogland task should be executed successfully'() {
        // when
        task.generateXmls()
        // then
        verify(jetBrainsIdeIntegration).generateXmls()
        assertTaskDependsOn(task, VENDOR_TASK_NAME)
    }

}