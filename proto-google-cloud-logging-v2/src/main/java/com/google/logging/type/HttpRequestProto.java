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
// source: google/logging/type/http_request.proto

package com.google.logging.type;

public final class HttpRequestProto {
  private HttpRequestProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_type_HttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_type_HttpRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/logging/type/http_request.proto"
          + "\022\023google.logging.type\032\036google/protobuf/d"
          + "uration.proto\032\034google/api/annotations.pr"
          + "oto\"\357\002\n\013HttpRequest\022\026\n\016request_method\030\001 "
          + "\001(\t\022\023\n\013request_url\030\002 \001(\t\022\024\n\014request_size"
          + "\030\003 \001(\003\022\016\n\006status\030\004 \001(\005\022\025\n\rresponse_size\030"
          + "\005 \001(\003\022\022\n\nuser_agent\030\006 \001(\t\022\021\n\tremote_ip\030\007"
          + " \001(\t\022\021\n\tserver_ip\030\r \001(\t\022\017\n\007referer\030\010 \001(\t"
          + "\022*\n\007latency\030\016 \001(\0132\031.google.protobuf.Dura"
          + "tion\022\024\n\014cache_lookup\030\013 \001(\010\022\021\n\tcache_hit\030"
          + "\t \001(\010\022*\n\"cache_validated_with_origin_ser"
          + "ver\030\n \001(\010\022\030\n\020cache_fill_bytes\030\014 \001(\003\022\020\n\010p"
          + "rotocol\030\017 \001(\tB\237\001\n\027com.google.logging.typ"
          + "eB\020HttpRequestProtoP\001Z8google.golang.org"
          + "/genproto/googleapis/logging/type;ltype\252"
          + "\002\031Google.Cloud.Logging.Type\312\002\031Google\\Clo"
          + "ud\\Logging\\Typeb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_logging_type_HttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_type_HttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_type_HttpRequest_descriptor,
            new java.lang.String[] {
              "RequestMethod",
              "RequestUrl",
              "RequestSize",
              "Status",
              "ResponseSize",
              "UserAgent",
              "RemoteIp",
              "ServerIp",
              "Referer",
              "Latency",
              "CacheLookup",
              "CacheHit",
              "CacheValidatedWithOriginServer",
              "CacheFillBytes",
              "Protocol",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
