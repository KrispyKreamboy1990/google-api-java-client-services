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

package com.google.api.services.adexperiencereport.v1.model;

/**
 * Summary of the ad experience rating of a site for a specific platform.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Experience Report API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlatformSummary extends com.google.api.client.json.GenericJson {

  /**
   * The status of the site reviewed for the Better Ads Standards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String betterAdsStatus;

  /**
   * The date on which ad filtering begins.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String enforcementTime;

  /**
   * The ad filtering status of the site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filterStatus;

  /**
   * The last time that the site changed status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastChangeTime;

  /**
   * The assigned regions for the site and platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> region;

  /**
   * A link that leads to a full ad experience report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reportUrl;

  /**
   * Whether the site is currently under review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean underReview;

  /**
   * The status of the site reviewed for the Better Ads Standards.
   * @return value or {@code null} for none
   */
  public java.lang.String getBetterAdsStatus() {
    return betterAdsStatus;
  }

  /**
   * The status of the site reviewed for the Better Ads Standards.
   * @param betterAdsStatus betterAdsStatus or {@code null} for none
   */
  public PlatformSummary setBetterAdsStatus(java.lang.String betterAdsStatus) {
    this.betterAdsStatus = betterAdsStatus;
    return this;
  }

  /**
   * The date on which ad filtering begins.
   * @return value or {@code null} for none
   */
  public String getEnforcementTime() {
    return enforcementTime;
  }

  /**
   * The date on which ad filtering begins.
   * @param enforcementTime enforcementTime or {@code null} for none
   */
  public PlatformSummary setEnforcementTime(String enforcementTime) {
    this.enforcementTime = enforcementTime;
    return this;
  }

  /**
   * The ad filtering status of the site.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilterStatus() {
    return filterStatus;
  }

  /**
   * The ad filtering status of the site.
   * @param filterStatus filterStatus or {@code null} for none
   */
  public PlatformSummary setFilterStatus(java.lang.String filterStatus) {
    this.filterStatus = filterStatus;
    return this;
  }

  /**
   * The last time that the site changed status.
   * @return value or {@code null} for none
   */
  public String getLastChangeTime() {
    return lastChangeTime;
  }

  /**
   * The last time that the site changed status.
   * @param lastChangeTime lastChangeTime or {@code null} for none
   */
  public PlatformSummary setLastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
    return this;
  }

  /**
   * The assigned regions for the site and platform.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegion() {
    return region;
  }

  /**
   * The assigned regions for the site and platform.
   * @param region region or {@code null} for none
   */
  public PlatformSummary setRegion(java.util.List<java.lang.String> region) {
    this.region = region;
    return this;
  }

  /**
   * A link that leads to a full ad experience report.
   * @return value or {@code null} for none
   */
  public java.lang.String getReportUrl() {
    return reportUrl;
  }

  /**
   * A link that leads to a full ad experience report.
   * @param reportUrl reportUrl or {@code null} for none
   */
  public PlatformSummary setReportUrl(java.lang.String reportUrl) {
    this.reportUrl = reportUrl;
    return this;
  }

  /**
   * Whether the site is currently under review.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnderReview() {
    return underReview;
  }

  /**
   * Whether the site is currently under review.
   * @param underReview underReview or {@code null} for none
   */
  public PlatformSummary setUnderReview(java.lang.Boolean underReview) {
    this.underReview = underReview;
    return this;
  }

  @Override
  public PlatformSummary set(String fieldName, Object value) {
    return (PlatformSummary) super.set(fieldName, value);
  }

  @Override
  public PlatformSummary clone() {
    return (PlatformSummary) super.clone();
  }

}
