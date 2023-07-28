// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package org.springframework.pulsar.listener;

public final class Proto {

	private Proto() {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public interface PersonOrBuilder extends
			// @@protoc_insertion_point(interface_extends:proto.Person)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>optional int32 id = 1;</code>
		 * @return Whether the id field is set.
		 */
		boolean hasId();

		/**
		 * <code>optional int32 id = 1;</code>
		 * @return The id.
		 */
		int getId();

		/**
		 * <code>optional string name = 2;</code>
		 * @return Whether the name field is set.
		 */
		boolean hasName();

		/**
		 * <code>optional string name = 2;</code>
		 * @return The name.
		 */
		java.lang.String getName();

		/**
		 * <code>optional string name = 2;</code>
		 * @return The bytes for name.
		 */
		com.google.protobuf.ByteString getNameBytes();

	}

	/**
	 * Protobuf type {@code proto.Person}
	 */
	public static final class Person extends com.google.protobuf.GeneratedMessageV3 implements
			// @@protoc_insertion_point(message_implements:proto.Person)
			PersonOrBuilder {

		private static final long serialVersionUID = 0L;

		// Use Person.newBuilder() to construct.
		private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private Person() {
			name_ = "";
		}

		@java.lang.Override
		@SuppressWarnings({ "unused" })
		protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
			return new Person();
		}

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private Person(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			if (extensionRegistry == null) {
				throw new java.lang.NullPointerException();
			}
			int mutableBitField0 = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
				.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
						case 0:
							done = true;
							break;
						case 8: {
							bitField0_ |= 0x00000001;
							id_ = input.readInt32();
							break;
						}
						case 18: {
							java.lang.String s = input.readStringRequireUtf8();
							bitField0_ |= 0x00000002;
							name_ = s;
							break;
						}
						default: {
							if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
								done = true;
							}
							break;
						}
					}
				}
			}
			catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			}
			catch (com.google.protobuf.UninitializedMessageException e) {
				throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
			}
			catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
			}
			finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.springframework.pulsar.listener.Proto.internal_static_proto_Person_descriptor;
		}

		@java.lang.Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return org.springframework.pulsar.listener.Proto.internal_static_proto_Person_fieldAccessorTable
				.ensureFieldAccessorsInitialized(org.springframework.pulsar.listener.Proto.Person.class,
						org.springframework.pulsar.listener.Proto.Person.Builder.class);
		}

		private int bitField0_;

		public static final int ID_FIELD_NUMBER = 1;

		private int id_;

		/**
		 * <code>optional int32 id = 1;</code>
		 * @return Whether the id field is set.
		 */
		@java.lang.Override
		public boolean hasId() {
			return (bitField0_ & 0x00000001) != 0;
		}

		/**
		 * <code>optional int32 id = 1;</code>
		 * @return The id.
		 */
		@java.lang.Override
		public int getId() {
			return id_;
		}

		public static final int NAME_FIELD_NUMBER = 2;

		private volatile java.lang.Object name_;

		/**
		 * <code>optional string name = 2;</code>
		 * @return Whether the name field is set.
		 */
		@java.lang.Override
		public boolean hasName() {
			return (bitField0_ & 0x00000002) != 0;
		}

		/**
		 * <code>optional string name = 2;</code>
		 * @return The name.
		 */
		@java.lang.Override
		public java.lang.String getName() {
			java.lang.Object ref = name_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			}
			else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				name_ = s;
				return s;
			}
		}

		/**
		 * <code>optional string name = 2;</code>
		 * @return The bytes for name.
		 */
		@java.lang.Override
		public com.google.protobuf.ByteString getNameBytes() {
			java.lang.Object ref = name_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				name_ = b;
				return b;
			}
			else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		private byte memoizedIsInitialized = -1;

		@java.lang.Override
		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1) {
				return true;
			}
			if (isInitialized == 0) {
				return false;
			}

			memoizedIsInitialized = 1;
			return true;
		}

		@java.lang.Override
		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			if ((bitField0_ & 0x00000001) != 0) {
				output.writeInt32(1, id_);
			}
			if ((bitField0_ & 0x00000002) != 0) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
			}
			unknownFields.writeTo(output);
		}

		@java.lang.Override
		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1) {
				return size;
			}

			size = 0;
			if ((bitField0_ & 0x00000001) != 0) {
				size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, id_);
			}
			if ((bitField0_ & 0x00000002) != 0) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
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
			if (!(obj instanceof org.springframework.pulsar.listener.Proto.Person)) {
				return super.equals(obj);
			}
			org.springframework.pulsar.listener.Proto.Person other = (org.springframework.pulsar.listener.Proto.Person) obj;

			if (hasId() != other.hasId()) {
				return false;
			}
			if (hasId()) {
				if (getId() != other.getId()) {
					return false;
				}
			}
			if (hasName() != other.hasName()) {
				return false;
			}
			if (hasName()) {
				if (!getName().equals(other.getName())) {
					return false;
				}
			}
			return unknownFields.equals(other.unknownFields);
		}

		@java.lang.Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			if (hasId()) {
				hash = (37 * hash) + ID_FIELD_NUMBER;
				hash = (53 * hash) + getId();
			}
			if (hasName()) {
				hash = (37 * hash) + NAME_FIELD_NUMBER;
				hash = (53 * hash) + getName().hashCode();
			}
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(java.nio.ByteBuffer data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(java.nio.ByteBuffer data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
					extensionRegistry);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static org.springframework.pulsar.listener.Proto.Person parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		@java.lang.Override
		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(org.springframework.pulsar.listener.Proto.Person prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		@java.lang.Override
		public Builder toBuilder() {
			return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			return new Builder(parent);
		}

		/**
		 * Protobuf type {@code proto.Person}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:proto.Person)
				org.springframework.pulsar.listener.Proto.PersonOrBuilder {

			public static com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return org.springframework.pulsar.listener.Proto.internal_static_proto_Person_descriptor;
			}

			@java.lang.Override
			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
				return org.springframework.pulsar.listener.Proto.internal_static_proto_Person_fieldAccessorTable
					.ensureFieldAccessorsInitialized(org.springframework.pulsar.listener.Proto.Person.class,
							org.springframework.pulsar.listener.Proto.Person.Builder.class);
			}

			// Construct using
			// org.springframework.pulsar.listener.Proto.Person.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
			}

			@java.lang.Override
			public Builder clear() {
				super.clear();
				id_ = 0;
				bitField0_ = bitField0_ & ~0x00000001;
				name_ = "";
				bitField0_ = bitField0_ & ~0x00000002;
				return this;
			}

			@java.lang.Override
			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return org.springframework.pulsar.listener.Proto.internal_static_proto_Person_descriptor;
			}

			@java.lang.Override
			public org.springframework.pulsar.listener.Proto.Person getDefaultInstanceForType() {
				return org.springframework.pulsar.listener.Proto.Person.getDefaultInstance();
			}

			@java.lang.Override
			public org.springframework.pulsar.listener.Proto.Person build() {
				org.springframework.pulsar.listener.Proto.Person result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			@java.lang.Override
			public org.springframework.pulsar.listener.Proto.Person buildPartial() {
				org.springframework.pulsar.listener.Proto.Person result = new org.springframework.pulsar.listener.Proto.Person(
						this);
				int fromBitField0 = bitField0_;
				int toBitField0 = 0;
				if ((fromBitField0 & 0x00000001) != 0) {
					result.id_ = id_;
					toBitField0 |= 0x00000001;
				}
				if ((fromBitField0 & 0x00000002) != 0) {
					toBitField0 |= 0x00000002;
				}
				result.name_ = name_;
				result.bitField0_ = toBitField0;
				onBuilt();
				return result;
			}

			@java.lang.Override
			public Builder clone() {
				return super.clone();
			}

			@java.lang.Override
			public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
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
			public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
					java.lang.Object value) {
				return super.setRepeatedField(field, index, value);
			}

			@java.lang.Override
			public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
					java.lang.Object value) {
				return super.addRepeatedField(field, value);
			}

			@java.lang.Override
			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof org.springframework.pulsar.listener.Proto.Person) {
					return mergeFrom((org.springframework.pulsar.listener.Proto.Person) other);
				}
				else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(org.springframework.pulsar.listener.Proto.Person other) {
				if (other == org.springframework.pulsar.listener.Proto.Person.getDefaultInstance()) {
					return this;
				}
				if (other.hasId()) {
					setId(other.getId());
				}
				if (other.hasName()) {
					bitField0_ |= 0x00000002;
					name_ = other.name_;
					onChanged();
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
			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				org.springframework.pulsar.listener.Proto.Person parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				}
				catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (org.springframework.pulsar.listener.Proto.Person) e.getUnfinishedMessage();
					throw e.unwrapIOException();
				}
				finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private int id_;

			/**
			 * <code>optional int32 id = 1;</code>
			 * @return Whether the id field is set.
			 */
			@java.lang.Override
			public boolean hasId() {
				return (bitField0_ & 0x00000001) != 0;
			}

			/**
			 * <code>optional int32 id = 1;</code>
			 * @return The id.
			 */
			@java.lang.Override
			public int getId() {
				return id_;
			}

			/**
			 * <code>optional int32 id = 1;</code>
			 * @param value The id to set.
			 * @return This builder for chaining.
			 */
			public Builder setId(int value) {
				bitField0_ |= 0x00000001;
				id_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional int32 id = 1;</code>
			 * @return This builder for chaining.
			 */
			public Builder clearId() {
				bitField0_ = bitField0_ & ~0x00000001;
				id_ = 0;
				onChanged();
				return this;
			}

			private java.lang.Object name_ = "";

			/**
			 * <code>optional string name = 2;</code>
			 * @return Whether the name field is set.
			 */
			public boolean hasName() {
				return (bitField0_ & 0x00000002) != 0;
			}

			/**
			 * <code>optional string name = 2;</code>
			 * @return The name.
			 */
			public java.lang.String getName() {
				java.lang.Object ref = name_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					name_ = s;
					return s;
				}
				else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string name = 2;</code>
			 * @return The bytes for name.
			 */
			public com.google.protobuf.ByteString getNameBytes() {
				java.lang.Object ref = name_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
						.copyFromUtf8((java.lang.String) ref);
					name_ = b;
					return b;
				}
				else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string name = 2;</code>
			 * @param value The name to set.
			 * @return This builder for chaining.
			 */
			public Builder setName(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				name_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string name = 2;</code>
			 * @return This builder for chaining.
			 */
			public Builder clearName() {
				bitField0_ = bitField0_ & ~0x00000002;
				name_ = getDefaultInstance().getName();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string name = 2;</code>
			 * @param value The bytes for name to set.
			 * @return This builder for chaining.
			 */
			public Builder setNameBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);
				bitField0_ |= 0x00000002;
				name_ = value;
				onChanged();
				return this;
			}

			@java.lang.Override
			public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFields(unknownFields);
			}

			@java.lang.Override
			public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}

			// @@protoc_insertion_point(builder_scope:proto.Person)

		}

		// @@protoc_insertion_point(class_scope:proto.Person)
		private static final org.springframework.pulsar.listener.Proto.Person DEFAULT_INSTANCE;
		static {
			DEFAULT_INSTANCE = new org.springframework.pulsar.listener.Proto.Person();
		}

		public static org.springframework.pulsar.listener.Proto.Person getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		private static final com.google.protobuf.Parser<Person> PARSER = new com.google.protobuf.AbstractParser<>() {
			@java.lang.Override
			public Person parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Person(input, extensionRegistry);
			}
		};

		public static com.google.protobuf.Parser<Person> parser() {
			return PARSER;
		}

		@java.lang.Override
		public com.google.protobuf.Parser<Person> getParserForType() {
			return PARSER;
		}

		@java.lang.Override
		public org.springframework.pulsar.listener.Proto.Person getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_proto_Person_descriptor;

	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_proto_Person_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static final com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = { "\n\014person.proto\022\005proto\"<\n\006Person\022\017\n\002id\030\001 "
				+ "\001(\005H\000\210\001\001\022\021\n\004name\030\002 \001(\tH\001\210\001\001B\005\n\003_idB\007\n\005_n"
				+ "ameB,\n#org.springframework.pulsar.listen" + "erB\005Protob\006proto3" };
		descriptor = com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {});
		internal_static_proto_Person_descriptor = getDescriptor().getMessageTypes().get(0);
		internal_static_proto_Person_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_proto_Person_descriptor, new java.lang.String[] { "Id", "Name", "Id", "Name", });
	}

	// @@protoc_insertion_point(outer_class_scope)

}
