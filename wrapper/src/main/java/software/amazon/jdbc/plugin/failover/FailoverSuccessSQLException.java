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

package software.amazon.jdbc.plugin.failover;

import software.amazon.jdbc.util.Messages;
import software.amazon.jdbc.util.SqlState;

public class FailoverSuccessSQLException extends FailoverSQLException {

  public FailoverSuccessSQLException(Throwable cause) {
    super(Messages.get("Failover.connectionChangedError"),
        SqlState.COMMUNICATION_LINK_CHANGED.getState(), cause);
  }

  public FailoverSuccessSQLException(String message) {
    super(message, SqlState.COMMUNICATION_LINK_CHANGED.getState());
  }

  public FailoverSuccessSQLException() {
    super(Messages.get("Failover.connectionChangedError"),
        SqlState.COMMUNICATION_LINK_CHANGED.getState());
  }
}
