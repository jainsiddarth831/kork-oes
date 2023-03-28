/*
 * Copyright 2020 Armory, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.spinnaker.kork.plugins
class SpringStrictPluginLoaderStatusProviderTest{}

/*
import dev.minutest.junit.JUnit5Minutests
import dev.minutest.rootContext
import dev.minutest.test
import io.mockk.every
import io.mockk.mockk
import org.springframework.core.env.ConfigurableEnvironment
import strikt.api.expectThat
import strikt.assertions.isFalse
import strikt.assertions.isTrue

class SpringStrictPluginLoaderStatusProviderTest : JUnit5Minutests {

  fun tests() = rootContext<Fixture> {
    fixture {
      Fixture()
    }

    test("strict plugin loading default to false") {
      expectThat(subject.isStrictPluginLoading()).isFalse()
    }

    test("strict plugin loading is overridable") {
      every { environment.getProperty("spinnaker.extensibility.strict-plugin-loading") } returns "true"
      expectThat(subject.isStrictPluginLoading()).isTrue()
    }
  }

  private class Fixture {
    val environment: ConfigurableEnvironment = mockk(relaxed = true)
    val subject = SpringStrictPluginLoaderStatusProvider(environment)
  }
}

 */
