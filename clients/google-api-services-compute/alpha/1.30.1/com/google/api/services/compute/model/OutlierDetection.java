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

package com.google.api.services.compute.model;

/**
 * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend
 * service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OutlierDetection extends com.google.api.client.json.GenericJson {

  /**
   * The base time that a host is ejected for. The real ejection time is equal to the base ejection
   * time multiplied by the number of times the host has been ejected. Defaults to 30000ms or 30s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration baseEjectionTime;

  /**
   * Number of errors before a host is ejected from the connection pool. When the backend host is
   * accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer consecutiveErrors;

  /**
   * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are
   * mapped to one of those status codes) before a consecutive gateway failure ejection occurs.
   * Defaults to 3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer consecutiveGatewayFailure;

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly.
   * Defaults to 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer enforcingConsecutiveErrors;

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through consecutive gateway failures. This setting can be used to disable ejection or to ramp
   * it up slowly. Defaults to 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer enforcingConsecutiveGatewayFailure;

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through success rate statistics. This setting can be used to disable ejection or to ramp it up
   * slowly. Defaults to 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer enforcingSuccessRate;

  /**
   * Time interval between ejection analysis sweeps. This can result in both new ejections as well
   * as hosts being returned to service. Defaults to 1 second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration interval;

  /**
   * Maximum percentage of hosts in the load balancing pool for the backend service that can be
   * ejected. Defaults to 50%.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxEjectionPercent;

  /**
   * The number of hosts in a cluster that must have enough request volume to detect success rate
   * outliers. If the number of hosts is less than this setting, outlier detection via success rate
   * statistics is not performed for any host in the cluster. Defaults to 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successRateMinimumHosts;

  /**
   * The minimum number of total requests that must be collected in one interval (as defined by the
   * interval duration above) to include this host in success rate based outlier detection. If the
   * volume is lower than this setting, outlier detection via success rate statistics is not
   * performed for that host. Defaults to 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successRateRequestVolume;

  /**
   * This factor is used to determine the ejection threshold for success rate outlier ejection. The
   * ejection threshold is the difference between the mean success rate, and the product of this
   * factor and the standard deviation of the mean success rate: mean - (stdev *
   * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if
   * the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successRateStdevFactor;

  /**
   * The base time that a host is ejected for. The real ejection time is equal to the base ejection
   * time multiplied by the number of times the host has been ejected. Defaults to 30000ms or 30s.
   * @return value or {@code null} for none
   */
  public Duration getBaseEjectionTime() {
    return baseEjectionTime;
  }

  /**
   * The base time that a host is ejected for. The real ejection time is equal to the base ejection
   * time multiplied by the number of times the host has been ejected. Defaults to 30000ms or 30s.
   * @param baseEjectionTime baseEjectionTime or {@code null} for none
   */
  public OutlierDetection setBaseEjectionTime(Duration baseEjectionTime) {
    this.baseEjectionTime = baseEjectionTime;
    return this;
  }

  /**
   * Number of errors before a host is ejected from the connection pool. When the backend host is
   * accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getConsecutiveErrors() {
    return consecutiveErrors;
  }

  /**
   * Number of errors before a host is ejected from the connection pool. When the backend host is
   * accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
   * @param consecutiveErrors consecutiveErrors or {@code null} for none
   */
  public OutlierDetection setConsecutiveErrors(java.lang.Integer consecutiveErrors) {
    this.consecutiveErrors = consecutiveErrors;
    return this;
  }

  /**
   * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are
   * mapped to one of those status codes) before a consecutive gateway failure ejection occurs.
   * Defaults to 3.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getConsecutiveGatewayFailure() {
    return consecutiveGatewayFailure;
  }

  /**
   * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are
   * mapped to one of those status codes) before a consecutive gateway failure ejection occurs.
   * Defaults to 3.
   * @param consecutiveGatewayFailure consecutiveGatewayFailure or {@code null} for none
   */
  public OutlierDetection setConsecutiveGatewayFailure(java.lang.Integer consecutiveGatewayFailure) {
    this.consecutiveGatewayFailure = consecutiveGatewayFailure;
    return this;
  }

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly.
   * Defaults to 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEnforcingConsecutiveErrors() {
    return enforcingConsecutiveErrors;
  }

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly.
   * Defaults to 0.
   * @param enforcingConsecutiveErrors enforcingConsecutiveErrors or {@code null} for none
   */
  public OutlierDetection setEnforcingConsecutiveErrors(java.lang.Integer enforcingConsecutiveErrors) {
    this.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
    return this;
  }

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through consecutive gateway failures. This setting can be used to disable ejection or to ramp
   * it up slowly. Defaults to 100.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEnforcingConsecutiveGatewayFailure() {
    return enforcingConsecutiveGatewayFailure;
  }

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through consecutive gateway failures. This setting can be used to disable ejection or to ramp
   * it up slowly. Defaults to 100.
   * @param enforcingConsecutiveGatewayFailure enforcingConsecutiveGatewayFailure or {@code null} for none
   */
  public OutlierDetection setEnforcingConsecutiveGatewayFailure(java.lang.Integer enforcingConsecutiveGatewayFailure) {
    this.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
    return this;
  }

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through success rate statistics. This setting can be used to disable ejection or to ramp it up
   * slowly. Defaults to 100.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEnforcingSuccessRate() {
    return enforcingSuccessRate;
  }

  /**
   * The percentage chance that a host will be actually ejected when an outlier status is detected
   * through success rate statistics. This setting can be used to disable ejection or to ramp it up
   * slowly. Defaults to 100.
   * @param enforcingSuccessRate enforcingSuccessRate or {@code null} for none
   */
  public OutlierDetection setEnforcingSuccessRate(java.lang.Integer enforcingSuccessRate) {
    this.enforcingSuccessRate = enforcingSuccessRate;
    return this;
  }

  /**
   * Time interval between ejection analysis sweeps. This can result in both new ejections as well
   * as hosts being returned to service. Defaults to 1 second.
   * @return value or {@code null} for none
   */
  public Duration getInterval() {
    return interval;
  }

  /**
   * Time interval between ejection analysis sweeps. This can result in both new ejections as well
   * as hosts being returned to service. Defaults to 1 second.
   * @param interval interval or {@code null} for none
   */
  public OutlierDetection setInterval(Duration interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Maximum percentage of hosts in the load balancing pool for the backend service that can be
   * ejected. Defaults to 50%.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxEjectionPercent() {
    return maxEjectionPercent;
  }

  /**
   * Maximum percentage of hosts in the load balancing pool for the backend service that can be
   * ejected. Defaults to 50%.
   * @param maxEjectionPercent maxEjectionPercent or {@code null} for none
   */
  public OutlierDetection setMaxEjectionPercent(java.lang.Integer maxEjectionPercent) {
    this.maxEjectionPercent = maxEjectionPercent;
    return this;
  }

  /**
   * The number of hosts in a cluster that must have enough request volume to detect success rate
   * outliers. If the number of hosts is less than this setting, outlier detection via success rate
   * statistics is not performed for any host in the cluster. Defaults to 5.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessRateMinimumHosts() {
    return successRateMinimumHosts;
  }

  /**
   * The number of hosts in a cluster that must have enough request volume to detect success rate
   * outliers. If the number of hosts is less than this setting, outlier detection via success rate
   * statistics is not performed for any host in the cluster. Defaults to 5.
   * @param successRateMinimumHosts successRateMinimumHosts or {@code null} for none
   */
  public OutlierDetection setSuccessRateMinimumHosts(java.lang.Integer successRateMinimumHosts) {
    this.successRateMinimumHosts = successRateMinimumHosts;
    return this;
  }

  /**
   * The minimum number of total requests that must be collected in one interval (as defined by the
   * interval duration above) to include this host in success rate based outlier detection. If the
   * volume is lower than this setting, outlier detection via success rate statistics is not
   * performed for that host. Defaults to 100.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessRateRequestVolume() {
    return successRateRequestVolume;
  }

  /**
   * The minimum number of total requests that must be collected in one interval (as defined by the
   * interval duration above) to include this host in success rate based outlier detection. If the
   * volume is lower than this setting, outlier detection via success rate statistics is not
   * performed for that host. Defaults to 100.
   * @param successRateRequestVolume successRateRequestVolume or {@code null} for none
   */
  public OutlierDetection setSuccessRateRequestVolume(java.lang.Integer successRateRequestVolume) {
    this.successRateRequestVolume = successRateRequestVolume;
    return this;
  }

  /**
   * This factor is used to determine the ejection threshold for success rate outlier ejection. The
   * ejection threshold is the difference between the mean success rate, and the product of this
   * factor and the standard deviation of the mean success rate: mean - (stdev *
   * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if
   * the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessRateStdevFactor() {
    return successRateStdevFactor;
  }

  /**
   * This factor is used to determine the ejection threshold for success rate outlier ejection. The
   * ejection threshold is the difference between the mean success rate, and the product of this
   * factor and the standard deviation of the mean success rate: mean - (stdev *
   * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if
   * the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
   * @param successRateStdevFactor successRateStdevFactor or {@code null} for none
   */
  public OutlierDetection setSuccessRateStdevFactor(java.lang.Integer successRateStdevFactor) {
    this.successRateStdevFactor = successRateStdevFactor;
    return this;
  }

  @Override
  public OutlierDetection set(String fieldName, Object value) {
    return (OutlierDetection) super.set(fieldName, value);
  }

  @Override
  public OutlierDetection clone() {
    return (OutlierDetection) super.clone();
  }

}
