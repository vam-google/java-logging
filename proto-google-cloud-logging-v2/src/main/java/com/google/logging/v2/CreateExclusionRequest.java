/*
 * Copyright 2019 Google LLC
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
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * The parameters to `CreateExclusion`.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.CreateExclusionRequest}
 */
public final class CreateExclusionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.CreateExclusionRequest)
    CreateExclusionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateExclusionRequest.newBuilder() to construct.
  private CreateExclusionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateExclusionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateExclusionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateExclusionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.logging.v2.LogExclusion.Builder subBuilder = null;
              if (exclusion_ != null) {
                subBuilder = exclusion_.toBuilder();
              }
              exclusion_ =
                  input.readMessage(com.google.logging.v2.LogExclusion.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(exclusion_);
                exclusion_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_CreateExclusionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_CreateExclusionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.CreateExclusionRequest.class,
            com.google.logging.v2.CreateExclusionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource in which to create the exclusion:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource in which to create the exclusion:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXCLUSION_FIELD_NUMBER = 2;
  private com.google.logging.v2.LogExclusion exclusion_;
  /**
   *
   *
   * <pre>
   * Required. The new exclusion, whose `name` parameter is an exclusion name
   * that is not already used in the parent resource.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
   *
   * @return Whether the exclusion field is set.
   */
  public boolean hasExclusion() {
    return exclusion_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new exclusion, whose `name` parameter is an exclusion name
   * that is not already used in the parent resource.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
   *
   * @return The exclusion.
   */
  public com.google.logging.v2.LogExclusion getExclusion() {
    return exclusion_ == null
        ? com.google.logging.v2.LogExclusion.getDefaultInstance()
        : exclusion_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new exclusion, whose `name` parameter is an exclusion name
   * that is not already used in the parent resource.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
   */
  public com.google.logging.v2.LogExclusionOrBuilder getExclusionOrBuilder() {
    return getExclusion();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (exclusion_ != null) {
      output.writeMessage(2, getExclusion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (exclusion_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExclusion());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.CreateExclusionRequest)) {
      return super.equals(obj);
    }
    com.google.logging.v2.CreateExclusionRequest other =
        (com.google.logging.v2.CreateExclusionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasExclusion() != other.hasExclusion()) return false;
    if (hasExclusion()) {
      if (!getExclusion().equals(other.getExclusion())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasExclusion()) {
      hash = (37 * hash) + EXCLUSION_FIELD_NUMBER;
      hash = (53 * hash) + getExclusion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CreateExclusionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.CreateExclusionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The parameters to `CreateExclusion`.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.CreateExclusionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.CreateExclusionRequest)
      com.google.logging.v2.CreateExclusionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CreateExclusionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CreateExclusionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.CreateExclusionRequest.class,
              com.google.logging.v2.CreateExclusionRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.CreateExclusionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (exclusionBuilder_ == null) {
        exclusion_ = null;
      } else {
        exclusion_ = null;
        exclusionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CreateExclusionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.CreateExclusionRequest getDefaultInstanceForType() {
      return com.google.logging.v2.CreateExclusionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.CreateExclusionRequest build() {
      com.google.logging.v2.CreateExclusionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.CreateExclusionRequest buildPartial() {
      com.google.logging.v2.CreateExclusionRequest result =
          new com.google.logging.v2.CreateExclusionRequest(this);
      result.parent_ = parent_;
      if (exclusionBuilder_ == null) {
        result.exclusion_ = exclusion_;
      } else {
        result.exclusion_ = exclusionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.CreateExclusionRequest) {
        return mergeFrom((com.google.logging.v2.CreateExclusionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.CreateExclusionRequest other) {
      if (other == com.google.logging.v2.CreateExclusionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasExclusion()) {
        mergeExclusion(other.getExclusion());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.logging.v2.CreateExclusionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.CreateExclusionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource in which to create the exclusion:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource in which to create the exclusion:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource in which to create the exclusion:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource in which to create the exclusion:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource in which to create the exclusion:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.logging.v2.LogExclusion exclusion_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogExclusion,
            com.google.logging.v2.LogExclusion.Builder,
            com.google.logging.v2.LogExclusionOrBuilder>
        exclusionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     *
     * @return Whether the exclusion field is set.
     */
    public boolean hasExclusion() {
      return exclusionBuilder_ != null || exclusion_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     *
     * @return The exclusion.
     */
    public com.google.logging.v2.LogExclusion getExclusion() {
      if (exclusionBuilder_ == null) {
        return exclusion_ == null
            ? com.google.logging.v2.LogExclusion.getDefaultInstance()
            : exclusion_;
      } else {
        return exclusionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     */
    public Builder setExclusion(com.google.logging.v2.LogExclusion value) {
      if (exclusionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exclusion_ = value;
        onChanged();
      } else {
        exclusionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     */
    public Builder setExclusion(com.google.logging.v2.LogExclusion.Builder builderForValue) {
      if (exclusionBuilder_ == null) {
        exclusion_ = builderForValue.build();
        onChanged();
      } else {
        exclusionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     */
    public Builder mergeExclusion(com.google.logging.v2.LogExclusion value) {
      if (exclusionBuilder_ == null) {
        if (exclusion_ != null) {
          exclusion_ =
              com.google.logging.v2.LogExclusion.newBuilder(exclusion_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          exclusion_ = value;
        }
        onChanged();
      } else {
        exclusionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     */
    public Builder clearExclusion() {
      if (exclusionBuilder_ == null) {
        exclusion_ = null;
        onChanged();
      } else {
        exclusion_ = null;
        exclusionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     */
    public com.google.logging.v2.LogExclusion.Builder getExclusionBuilder() {

      onChanged();
      return getExclusionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     */
    public com.google.logging.v2.LogExclusionOrBuilder getExclusionOrBuilder() {
      if (exclusionBuilder_ != null) {
        return exclusionBuilder_.getMessageOrBuilder();
      } else {
        return exclusion_ == null
            ? com.google.logging.v2.LogExclusion.getDefaultInstance()
            : exclusion_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new exclusion, whose `name` parameter is an exclusion name
     * that is not already used in the parent resource.
     * </pre>
     *
     * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogExclusion,
            com.google.logging.v2.LogExclusion.Builder,
            com.google.logging.v2.LogExclusionOrBuilder>
        getExclusionFieldBuilder() {
      if (exclusionBuilder_ == null) {
        exclusionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.logging.v2.LogExclusion,
                com.google.logging.v2.LogExclusion.Builder,
                com.google.logging.v2.LogExclusionOrBuilder>(
                getExclusion(), getParentForChildren(), isClean());
        exclusion_ = null;
      }
      return exclusionBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.CreateExclusionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.CreateExclusionRequest)
  private static final com.google.logging.v2.CreateExclusionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.CreateExclusionRequest();
  }

  public static com.google.logging.v2.CreateExclusionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateExclusionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateExclusionRequest>() {
        @java.lang.Override
        public CreateExclusionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateExclusionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateExclusionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateExclusionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.CreateExclusionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
