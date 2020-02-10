/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/log_entry.proto

package com.google.logging.v2;

public interface LogEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the log to which this log entry belongs:
   *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
   *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
   *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
   * A project number may optionally be used in place of PROJECT_ID. The project
   * number is translated to its corresponding PROJECT_ID internally and the
   * `log_name` field will contain PROJECT_ID in queries and exports.
   * `[LOG_ID]` must be URL-encoded within `log_name`. Example:
   * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * `[LOG_ID]` must be less than 512 characters long and can only include the
   * following characters: upper and lower case alphanumeric characters,
   * forward-slash, underscore, hyphen, and period.
   * For backward compatibility, if `log_name` begins with a forward-slash, such
   * as `/projects/...`, then the log entry is ingested as usual but the
   * forward-slash is removed. Listing the log entry will not show the leading
   * slash and filtering for a log name with a leading slash will never return
   * any results.
   * </pre>
   *
   * <code>string log_name = 12;</code>
   *
   * @return The logName.
   */
  java.lang.String getLogName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the log to which this log entry belongs:
   *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
   *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
   *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
   * A project number may optionally be used in place of PROJECT_ID. The project
   * number is translated to its corresponding PROJECT_ID internally and the
   * `log_name` field will contain PROJECT_ID in queries and exports.
   * `[LOG_ID]` must be URL-encoded within `log_name`. Example:
   * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * `[LOG_ID]` must be less than 512 characters long and can only include the
   * following characters: upper and lower case alphanumeric characters,
   * forward-slash, underscore, hyphen, and period.
   * For backward compatibility, if `log_name` begins with a forward-slash, such
   * as `/projects/...`, then the log entry is ingested as usual but the
   * forward-slash is removed. Listing the log entry will not show the leading
   * slash and filtering for a log name with a leading slash will never return
   * any results.
   * </pre>
   *
   * <code>string log_name = 12;</code>
   *
   * @return The bytes for logName.
   */
  com.google.protobuf.ByteString getLogNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The monitored resource that produced this log entry.
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 8;</code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * Required. The monitored resource that produced this log entry.
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 8;</code>
   *
   * @return The resource.
   */
  com.google.api.MonitoredResource getResource();
  /**
   *
   *
   * <pre>
   * Required. The monitored resource that produced this log entry.
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 8;</code>
   */
  com.google.api.MonitoredResourceOrBuilder getResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a protocol buffer. Some Google
   * Cloud Platform services use this field for their log entry payloads.
   * The following protocol buffer types are supported; user-defined types
   * are not supported:
   *   "type.googleapis.com/google.cloud.audit.AuditLog"
   *   "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * </pre>
   *
   * <code>.google.protobuf.Any proto_payload = 2;</code>
   *
   * @return Whether the protoPayload field is set.
   */
  boolean hasProtoPayload();
  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a protocol buffer. Some Google
   * Cloud Platform services use this field for their log entry payloads.
   * The following protocol buffer types are supported; user-defined types
   * are not supported:
   *   "type.googleapis.com/google.cloud.audit.AuditLog"
   *   "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * </pre>
   *
   * <code>.google.protobuf.Any proto_payload = 2;</code>
   *
   * @return The protoPayload.
   */
  com.google.protobuf.Any getProtoPayload();
  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a protocol buffer. Some Google
   * Cloud Platform services use this field for their log entry payloads.
   * The following protocol buffer types are supported; user-defined types
   * are not supported:
   *   "type.googleapis.com/google.cloud.audit.AuditLog"
   *   "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * </pre>
   *
   * <code>.google.protobuf.Any proto_payload = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getProtoPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a Unicode string (UTF-8).
   * </pre>
   *
   * <code>string text_payload = 3;</code>
   *
   * @return The textPayload.
   */
  java.lang.String getTextPayload();
  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a Unicode string (UTF-8).
   * </pre>
   *
   * <code>string text_payload = 3;</code>
   *
   * @return The bytes for textPayload.
   */
  com.google.protobuf.ByteString getTextPayloadBytes();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a structure that is
   * expressed as a JSON object.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_payload = 6;</code>
   *
   * @return Whether the jsonPayload field is set.
   */
  boolean hasJsonPayload();
  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a structure that is
   * expressed as a JSON object.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_payload = 6;</code>
   *
   * @return The jsonPayload.
   */
  com.google.protobuf.Struct getJsonPayload();
  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a structure that is
   * expressed as a JSON object.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_payload = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getJsonPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The time the event described by the log entry occurred.  This
   * time is used to compute the log entry's age and to enforce the logs
   * retention period. If this field is omitted in a new log entry, then Logging
   * assigns it the current time.  Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the
   * timestamp is displayed.
   * Incoming log entries should have timestamps that are no more than the [logs
   * retention period](/logging/quotas) in the past, and no more than 24 hours
   * in the future. Log entries outside those time boundaries will not be
   * available when calling `entries.list`, but those log entries can still be
   * [exported with LogSinks](/logging/docs/api/tasks/exporting-logs).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9;</code>
   *
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   *
   *
   * <pre>
   * Optional. The time the event described by the log entry occurred.  This
   * time is used to compute the log entry's age and to enforce the logs
   * retention period. If this field is omitted in a new log entry, then Logging
   * assigns it the current time.  Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the
   * timestamp is displayed.
   * Incoming log entries should have timestamps that are no more than the [logs
   * retention period](/logging/quotas) in the past, and no more than 24 hours
   * in the future. Log entries outside those time boundaries will not be
   * available when calling `entries.list`, but those log entries can still be
   * [exported with LogSinks](/logging/docs/api/tasks/exporting-logs).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9;</code>
   *
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   *
   *
   * <pre>
   * Optional. The time the event described by the log entry occurred.  This
   * time is used to compute the log entry's age and to enforce the logs
   * retention period. If this field is omitted in a new log entry, then Logging
   * assigns it the current time.  Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the
   * timestamp is displayed.
   * Incoming log entries should have timestamps that are no more than the [logs
   * retention period](/logging/quotas) in the past, and no more than 24 hours
   * in the future. Log entries outside those time boundaries will not be
   * available when calling `entries.list`, but those log entries can still be
   * [exported with LogSinks](/logging/docs/api/tasks/exporting-logs).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the log entry was received by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
   *
   * @return Whether the receiveTimestamp field is set.
   */
  boolean hasReceiveTimestamp();
  /**
   *
   *
   * <pre>
   * Output only. The time the log entry was received by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
   *
   * @return The receiveTimestamp.
   */
  com.google.protobuf.Timestamp getReceiveTimestamp();
  /**
   *
   *
   * <pre>
   * Output only. The time the log entry was received by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReceiveTimestampOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The severity of the log entry. The default value is
   * `LogSeverity.DEFAULT`.
   * </pre>
   *
   * <code>.google.logging.type.LogSeverity severity = 10;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Optional. The severity of the log entry. The default value is
   * `LogSeverity.DEFAULT`.
   * </pre>
   *
   * <code>.google.logging.type.LogSeverity severity = 10;</code>
   *
   * @return The severity.
   */
  com.google.logging.type.LogSeverity getSeverity();

  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for the log entry. If you provide a value,
   * then Logging considers other log entries in the same project, with the same
   * `timestamp`, and with the same `insert_id` to be duplicates which are
   * removed in a single query result. However, there are no guarantees of
   * de-duplication in the export of logs.
   * If the `insert_id` is omitted when writing a log entry, the Logging API
   *  assigns its own unique identifier in this field.
   * In queries, the `insert_id` is also used to order log entries that have
   * the same `log_name` and `timestamp` values.
   * </pre>
   *
   * <code>string insert_id = 4;</code>
   *
   * @return The insertId.
   */
  java.lang.String getInsertId();
  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for the log entry. If you provide a value,
   * then Logging considers other log entries in the same project, with the same
   * `timestamp`, and with the same `insert_id` to be duplicates which are
   * removed in a single query result. However, there are no guarantees of
   * de-duplication in the export of logs.
   * If the `insert_id` is omitted when writing a log entry, the Logging API
   *  assigns its own unique identifier in this field.
   * In queries, the `insert_id` is also used to order log entries that have
   * the same `log_name` and `timestamp` values.
   * </pre>
   *
   * <code>string insert_id = 4;</code>
   *
   * @return The bytes for insertId.
   */
  com.google.protobuf.ByteString getInsertIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Information about the HTTP request associated with this log
   * entry, if applicable.
   * </pre>
   *
   * <code>.google.logging.type.HttpRequest http_request = 7;</code>
   *
   * @return Whether the httpRequest field is set.
   */
  boolean hasHttpRequest();
  /**
   *
   *
   * <pre>
   * Optional. Information about the HTTP request associated with this log
   * entry, if applicable.
   * </pre>
   *
   * <code>.google.logging.type.HttpRequest http_request = 7;</code>
   *
   * @return The httpRequest.
   */
  com.google.logging.type.HttpRequest getHttpRequest();
  /**
   *
   *
   * <pre>
   * Optional. Information about the HTTP request associated with this log
   * entry, if applicable.
   * </pre>
   *
   * <code>.google.logging.type.HttpRequest http_request = 7;</code>
   */
  com.google.logging.type.HttpRequestOrBuilder getHttpRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Deprecated. Output only. Additional metadata about the monitored resource.
   * Only `k8s_container`, `k8s_pod`, and `k8s_node` MonitoredResources have
   * this field populated for GKE versions older than 1.12.6. For GKE versions
   * 1.12.6 and above, the `metadata` field has been deprecated. The Kubernetes
   * pod labels that used to be in `metadata.userLabels` will now be present in
   * the `labels` field with a key prefix of `k8s-pod/`. The Stackdriver system
   * labels that were present in the `metadata.systemLabels` field will no
   * longer be available in the LogEntry.
   * </pre>
   *
   * <code>.google.api.MonitoredResourceMetadata metadata = 25 [deprecated = true];</code>
   *
   * @return Whether the metadata field is set.
   */
  @java.lang.Deprecated
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Deprecated. Output only. Additional metadata about the monitored resource.
   * Only `k8s_container`, `k8s_pod`, and `k8s_node` MonitoredResources have
   * this field populated for GKE versions older than 1.12.6. For GKE versions
   * 1.12.6 and above, the `metadata` field has been deprecated. The Kubernetes
   * pod labels that used to be in `metadata.userLabels` will now be present in
   * the `labels` field with a key prefix of `k8s-pod/`. The Stackdriver system
   * labels that were present in the `metadata.systemLabels` field will no
   * longer be available in the LogEntry.
   * </pre>
   *
   * <code>.google.api.MonitoredResourceMetadata metadata = 25 [deprecated = true];</code>
   *
   * @return The metadata.
   */
  @java.lang.Deprecated
  com.google.api.MonitoredResourceMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Deprecated. Output only. Additional metadata about the monitored resource.
   * Only `k8s_container`, `k8s_pod`, and `k8s_node` MonitoredResources have
   * this field populated for GKE versions older than 1.12.6. For GKE versions
   * 1.12.6 and above, the `metadata` field has been deprecated. The Kubernetes
   * pod labels that used to be in `metadata.userLabels` will now be present in
   * the `labels` field with a key prefix of `k8s-pod/`. The Stackdriver system
   * labels that were present in the `metadata.systemLabels` field will no
   * longer be available in the LogEntry.
   * </pre>
   *
   * <code>.google.api.MonitoredResourceMetadata metadata = 25 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.api.MonitoredResourceMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>.google.logging.v2.LogEntryOperation operation = 15;</code>
   *
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   *
   *
   * <pre>
   * Optional. Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>.google.logging.v2.LogEntryOperation operation = 15;</code>
   *
   * @return The operation.
   */
  com.google.logging.v2.LogEntryOperation getOperation();
  /**
   *
   *
   * <pre>
   * Optional. Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>.google.logging.v2.LogEntryOperation operation = 15;</code>
   */
  com.google.logging.v2.LogEntryOperationOrBuilder getOperationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resource name of the trace associated with the log entry, if any.
   * If it contains a relative resource name, the name is assumed to be relative
   * to `//tracing.googleapis.com`. Example:
   * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
   * </pre>
   *
   * <code>string trace = 22;</code>
   *
   * @return The trace.
   */
  java.lang.String getTrace();
  /**
   *
   *
   * <pre>
   * Optional. Resource name of the trace associated with the log entry, if any.
   * If it contains a relative resource name, the name is assumed to be relative
   * to `//tracing.googleapis.com`. Example:
   * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
   * </pre>
   *
   * <code>string trace = 22;</code>
   *
   * @return The bytes for trace.
   */
  com.google.protobuf.ByteString getTraceBytes();

  /**
   *
   *
   * <pre>
   * Optional. The span ID within the trace associated with the log entry.
   * For Trace spans, this is the same format that the Trace API v2 uses: a
   * 16-character hexadecimal encoding of an 8-byte array, such as
   * &lt;code&gt;"000000000000004a"&lt;/code&gt;.
   * </pre>
   *
   * <code>string span_id = 27;</code>
   *
   * @return The spanId.
   */
  java.lang.String getSpanId();
  /**
   *
   *
   * <pre>
   * Optional. The span ID within the trace associated with the log entry.
   * For Trace spans, this is the same format that the Trace API v2 uses: a
   * 16-character hexadecimal encoding of an 8-byte array, such as
   * &lt;code&gt;"000000000000004a"&lt;/code&gt;.
   * </pre>
   *
   * <code>string span_id = 27;</code>
   *
   * @return The bytes for spanId.
   */
  com.google.protobuf.ByteString getSpanIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The sampling decision of the trace associated with the log entry.
   * True means that the trace resource name in the `trace` field was sampled
   * for storage in a trace backend. False means that the trace was not sampled
   * for storage when this log entry was written, or the sampling decision was
   * unknown at the time. A non-sampled `trace` value is still useful as a
   * request correlation identifier. The default is False.
   * </pre>
   *
   * <code>bool trace_sampled = 30;</code>
   *
   * @return The traceSampled.
   */
  boolean getTraceSampled();

  /**
   *
   *
   * <pre>
   * Optional. Source code location information associated with the log entry,
   * if any.
   * </pre>
   *
   * <code>.google.logging.v2.LogEntrySourceLocation source_location = 23;</code>
   *
   * @return Whether the sourceLocation field is set.
   */
  boolean hasSourceLocation();
  /**
   *
   *
   * <pre>
   * Optional. Source code location information associated with the log entry,
   * if any.
   * </pre>
   *
   * <code>.google.logging.v2.LogEntrySourceLocation source_location = 23;</code>
   *
   * @return The sourceLocation.
   */
  com.google.logging.v2.LogEntrySourceLocation getSourceLocation();
  /**
   *
   *
   * <pre>
   * Optional. Source code location information associated with the log entry,
   * if any.
   * </pre>
   *
   * <code>.google.logging.v2.LogEntrySourceLocation source_location = 23;</code>
   */
  com.google.logging.v2.LogEntrySourceLocationOrBuilder getSourceLocationOrBuilder();

  public com.google.logging.v2.LogEntry.PayloadCase getPayloadCase();
}
