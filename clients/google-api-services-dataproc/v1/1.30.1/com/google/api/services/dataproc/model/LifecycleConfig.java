/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dataproc.model;

/**
 * Specifies the cluster auto-delete schedule configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LifecycleConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The time when cluster will be auto-deleted (see JSON representation of Timestamp
   * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String autoDeleteTime;

  /**
   * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this
   * period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of
   * Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String autoDeleteTtl;

  /**
   * Optional. The duration to keep the cluster alive while idling (when no jobs are running).
   * Passing this threshold will cause the cluster to be deleted. Minimum value is 10 minutes;
   * maximum value is 14 days (see JSON representation of Duration (https://developers.google.com
   * /protocol-buffers/docs/proto3#json).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String idleDeleteTtl;

  /**
   * Output only. The time when cluster became idle (most recent job finished) and became eligible
   * for deletion due to idleness (see JSON representation of Timestamp
   * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String idleStartTime;

  /**
   * Optional. The time when cluster will be auto-deleted (see JSON representation of Timestamp
   * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * @return value or {@code null} for none
   */
  public String getAutoDeleteTime() {
    return autoDeleteTime;
  }

  /**
   * Optional. The time when cluster will be auto-deleted (see JSON representation of Timestamp
   * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * @param autoDeleteTime autoDeleteTime or {@code null} for none
   */
  public LifecycleConfig setAutoDeleteTime(String autoDeleteTime) {
    this.autoDeleteTime = autoDeleteTime;
    return this;
  }

  /**
   * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this
   * period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of
   * Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * @return value or {@code null} for none
   */
  public String getAutoDeleteTtl() {
    return autoDeleteTtl;
  }

  /**
   * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this
   * period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of
   * Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * @param autoDeleteTtl autoDeleteTtl or {@code null} for none
   */
  public LifecycleConfig setAutoDeleteTtl(String autoDeleteTtl) {
    this.autoDeleteTtl = autoDeleteTtl;
    return this;
  }

  /**
   * Optional. The duration to keep the cluster alive while idling (when no jobs are running).
   * Passing this threshold will cause the cluster to be deleted. Minimum value is 10 minutes;
   * maximum value is 14 days (see JSON representation of Duration (https://developers.google.com
   * /protocol-buffers/docs/proto3#json).
   * @return value or {@code null} for none
   */
  public String getIdleDeleteTtl() {
    return idleDeleteTtl;
  }

  /**
   * Optional. The duration to keep the cluster alive while idling (when no jobs are running).
   * Passing this threshold will cause the cluster to be deleted. Minimum value is 10 minutes;
   * maximum value is 14 days (see JSON representation of Duration (https://developers.google.com
   * /protocol-buffers/docs/proto3#json).
   * @param idleDeleteTtl idleDeleteTtl or {@code null} for none
   */
  public LifecycleConfig setIdleDeleteTtl(String idleDeleteTtl) {
    this.idleDeleteTtl = idleDeleteTtl;
    return this;
  }

  /**
   * Output only. The time when cluster became idle (most recent job finished) and became eligible
   * for deletion due to idleness (see JSON representation of Timestamp
   * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * @return value or {@code null} for none
   */
  public String getIdleStartTime() {
    return idleStartTime;
  }

  /**
   * Output only. The time when cluster became idle (most recent job finished) and became eligible
   * for deletion due to idleness (see JSON representation of Timestamp
   * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * @param idleStartTime idleStartTime or {@code null} for none
   */
  public LifecycleConfig setIdleStartTime(String idleStartTime) {
    this.idleStartTime = idleStartTime;
    return this;
  }

  @Override
  public LifecycleConfig set(String fieldName, Object value) {
    return (LifecycleConfig) super.set(fieldName, value);
  }

  @Override
  public LifecycleConfig clone() {
    return (LifecycleConfig) super.clone();
  }

}
