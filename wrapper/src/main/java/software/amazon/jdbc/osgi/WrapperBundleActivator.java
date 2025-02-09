/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package software.amazon.jdbc.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class WrapperBundleActivator implements BundleActivator {

  public void start(BundleContext context) throws Exception {
    if (!software.amazon.jdbc.Driver.isRegistered()) {
      software.amazon.jdbc.Driver.register();
    }
  }

  public void stop(BundleContext context) throws Exception {
    if (software.amazon.jdbc.Driver.isRegistered()) {
      software.amazon.jdbc.Driver.deregister();
    }
  }
}
