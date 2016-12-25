// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Country.proto

package com.jianan.fingerboard.tuner.bean;

public final class CountryItem {
  private CountryItem() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CountryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.jianan.fingerboard.tuner.Country)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes nameZh = 1;</code>
     */
    com.google.protobuf.ByteString getNameZh();

    /**
     * <code>optional string code = 2;</code>
     */
    java.lang.String getCode();
    /**
     * <code>optional string code = 2;</code>
     */
    com.google.protobuf.ByteString
        getCodeBytes();
  }
  /**
   * Protobuf type {@code com.jianan.fingerboard.tuner.Country}
   */
  public  static final class Country extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.jianan.fingerboard.tuner.Country)
      CountryOrBuilder {
    // Use Country.newBuilder() to construct.
    private Country(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Country() {
      nameZh_ = com.google.protobuf.ByteString.EMPTY;
      code_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Country(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {

              nameZh_ = input.readBytes();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              code_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jianan.fingerboard.tuner.bean.CountryItem.internal_static_com_jianan_fingerboard_tuner_Country_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jianan.fingerboard.tuner.bean.CountryItem.internal_static_com_jianan_fingerboard_tuner_Country_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jianan.fingerboard.tuner.bean.CountryItem.Country.class, com.jianan.fingerboard.tuner.bean.CountryItem.Country.Builder.class);
    }

    public static final int NAMEZH_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString nameZh_;
    /**
     * <code>optional bytes nameZh = 1;</code>
     */
    public com.google.protobuf.ByteString getNameZh() {
      return nameZh_;
    }

    public static final int CODE_FIELD_NUMBER = 2;
    private volatile java.lang.Object code_;
    /**
     * <code>optional string code = 2;</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      }
    }
    /**
     * <code>optional string code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!nameZh_.isEmpty()) {
        output.writeBytes(1, nameZh_);
      }
      if (!getCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!nameZh_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, nameZh_);
      }
      if (!getCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.jianan.fingerboard.tuner.bean.CountryItem.Country)) {
        return super.equals(obj);
      }
      com.jianan.fingerboard.tuner.bean.CountryItem.Country other = (com.jianan.fingerboard.tuner.bean.CountryItem.Country) obj;

      boolean result = true;
      result = result && getNameZh()
          .equals(other.getNameZh());
      result = result && getCode()
          .equals(other.getCode());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + NAMEZH_FIELD_NUMBER;
      hash = (53 * hash) + getNameZh().hashCode();
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.jianan.fingerboard.tuner.bean.CountryItem.Country prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.jianan.fingerboard.tuner.Country}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.jianan.fingerboard.tuner.Country)
        com.jianan.fingerboard.tuner.bean.CountryItem.CountryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jianan.fingerboard.tuner.bean.CountryItem.internal_static_com_jianan_fingerboard_tuner_Country_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jianan.fingerboard.tuner.bean.CountryItem.internal_static_com_jianan_fingerboard_tuner_Country_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.jianan.fingerboard.tuner.bean.CountryItem.Country.class, com.jianan.fingerboard.tuner.bean.CountryItem.Country.Builder.class);
      }

      // Construct using com.jianan.fingerboard.tuner.bean.CountryItem.Country.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        nameZh_ = com.google.protobuf.ByteString.EMPTY;

        code_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jianan.fingerboard.tuner.bean.CountryItem.internal_static_com_jianan_fingerboard_tuner_Country_descriptor;
      }

      public com.jianan.fingerboard.tuner.bean.CountryItem.Country getDefaultInstanceForType() {
        return com.jianan.fingerboard.tuner.bean.CountryItem.Country.getDefaultInstance();
      }

      public com.jianan.fingerboard.tuner.bean.CountryItem.Country build() {
        com.jianan.fingerboard.tuner.bean.CountryItem.Country result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.jianan.fingerboard.tuner.bean.CountryItem.Country buildPartial() {
        com.jianan.fingerboard.tuner.bean.CountryItem.Country result = new com.jianan.fingerboard.tuner.bean.CountryItem.Country(this);
        result.nameZh_ = nameZh_;
        result.code_ = code_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jianan.fingerboard.tuner.bean.CountryItem.Country) {
          return mergeFrom((com.jianan.fingerboard.tuner.bean.CountryItem.Country)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.jianan.fingerboard.tuner.bean.CountryItem.Country other) {
        if (other == com.jianan.fingerboard.tuner.bean.CountryItem.Country.getDefaultInstance()) return this;
        if (other.getNameZh() != com.google.protobuf.ByteString.EMPTY) {
          setNameZh(other.getNameZh());
        }
        if (!other.getCode().isEmpty()) {
          code_ = other.code_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.jianan.fingerboard.tuner.bean.CountryItem.Country parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.jianan.fingerboard.tuner.bean.CountryItem.Country) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString nameZh_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes nameZh = 1;</code>
       */
      public com.google.protobuf.ByteString getNameZh() {
        return nameZh_;
      }
      /**
       * <code>optional bytes nameZh = 1;</code>
       */
      public Builder setNameZh(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nameZh_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes nameZh = 1;</code>
       */
      public Builder clearNameZh() {
        
        nameZh_ = getDefaultInstance().getNameZh();
        onChanged();
        return this;
      }

      private java.lang.Object code_ = "";
      /**
       * <code>optional string code = 2;</code>
       */
      public java.lang.String getCode() {
        java.lang.Object ref = code_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          code_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCodeBytes() {
        java.lang.Object ref = code_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          code_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public Builder setCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public Builder clearCode() {
        
        code_ = getDefaultInstance().getCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public Builder setCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        code_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.jianan.fingerboard.tuner.Country)
    }

    // @@protoc_insertion_point(class_scope:com.jianan.fingerboard.tuner.Country)
    private static final com.jianan.fingerboard.tuner.bean.CountryItem.Country DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.jianan.fingerboard.tuner.bean.CountryItem.Country();
    }

    public static com.jianan.fingerboard.tuner.bean.CountryItem.Country getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Country>
        PARSER = new com.google.protobuf.AbstractParser<Country>() {
      public Country parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Country(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Country> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Country> getParserForType() {
      return PARSER;
    }

    public com.jianan.fingerboard.tuner.bean.CountryItem.Country getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jianan_fingerboard_tuner_Country_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jianan_fingerboard_tuner_Country_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rCountry.proto\022\034com.jianan.fingerboard." +
      "tuner\"\'\n\007Country\022\016\n\006nameZh\030\001 \001(\014\022\014\n\004code" +
      "\030\002 \001(\tB0\n!com.jianan.fingerboard.tuner.b" +
      "eanB\013CountryItemb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_jianan_fingerboard_tuner_Country_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jianan_fingerboard_tuner_Country_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jianan_fingerboard_tuner_Country_descriptor,
        new java.lang.String[] { "NameZh", "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
