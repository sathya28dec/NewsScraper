/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.walkover.sample.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class value_record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2215171865776796199L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"value_record\",\"namespace\":\"com.walkover.sample.schema\",\"fields\":[{\"name\":\"datePublished\",\"type\":\"string\",\"logicalType\":\"date\"},{\"name\":\"image\",\"type\":{\"type\":\"record\",\"name\":\"image\",\"fields\":[{\"name\":\"base64Encoding\",\"type\":[\"string\",\"null\"],\"default\":\"true\"},{\"name\":\"imageWebSearchUrl\",\"type\":[\"string\",\"null\"],\"default\":\"true\"},{\"name\":\"thumbnail\",\"type\":\"string\"},{\"name\":\"width\",\"type\":\"int\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"thumbnailWidth\",\"type\":\"int\"},{\"name\":\"title\",\"type\":[\"string\",\"null\"],\"default\":\"true\"},{\"name\":\"thumbnailHeight\",\"type\":\"int\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"height\",\"type\":\"int\"}]}},{\"name\":\"keywords\",\"type\":\"string\"},{\"name\":\"provider\",\"type\":{\"type\":\"record\",\"name\":\"provider\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"}]}},{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"language\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"title\",\"type\":\"string\"},{\"name\":\"body\",\"type\":\"string\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"isSafe\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<value_record> ENCODER =
      new BinaryMessageEncoder<value_record>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<value_record> DECODER =
      new BinaryMessageDecoder<value_record>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<value_record> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<value_record> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<value_record>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this value_record to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a value_record from a ByteBuffer. */
  public static value_record fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence datePublished;
  @Deprecated public com.walkover.sample.schema.image image;
  @Deprecated public java.lang.CharSequence keywords;
  @Deprecated public com.walkover.sample.schema.provider provider;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public java.lang.CharSequence language;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.CharSequence body;
  @Deprecated public java.lang.CharSequence url;
  @Deprecated public boolean isSafe;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public value_record() {}

  /**
   * All-args constructor.
   * @param datePublished The new value for datePublished
   * @param image The new value for image
   * @param keywords The new value for keywords
   * @param provider The new value for provider
   * @param description The new value for description
   * @param language The new value for language
   * @param id The new value for id
   * @param title The new value for title
   * @param body The new value for body
   * @param url The new value for url
   * @param isSafe The new value for isSafe
   */
  public value_record(java.lang.CharSequence datePublished, com.walkover.sample.schema.image image, java.lang.CharSequence keywords, com.walkover.sample.schema.provider provider, java.lang.CharSequence description, java.lang.CharSequence language, java.lang.CharSequence id, java.lang.CharSequence title, java.lang.CharSequence body, java.lang.CharSequence url, java.lang.Boolean isSafe) {
    this.datePublished = datePublished;
    this.image = image;
    this.keywords = keywords;
    this.provider = provider;
    this.description = description;
    this.language = language;
    this.id = id;
    this.title = title;
    this.body = body;
    this.url = url;
    this.isSafe = isSafe;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return datePublished;
    case 1: return image;
    case 2: return keywords;
    case 3: return provider;
    case 4: return description;
    case 5: return language;
    case 6: return id;
    case 7: return title;
    case 8: return body;
    case 9: return url;
    case 10: return isSafe;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: datePublished = (java.lang.CharSequence)value$; break;
    case 1: image = (com.walkover.sample.schema.image)value$; break;
    case 2: keywords = (java.lang.CharSequence)value$; break;
    case 3: provider = (com.walkover.sample.schema.provider)value$; break;
    case 4: description = (java.lang.CharSequence)value$; break;
    case 5: language = (java.lang.CharSequence)value$; break;
    case 6: id = (java.lang.CharSequence)value$; break;
    case 7: title = (java.lang.CharSequence)value$; break;
    case 8: body = (java.lang.CharSequence)value$; break;
    case 9: url = (java.lang.CharSequence)value$; break;
    case 10: isSafe = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'datePublished' field.
   * @return The value of the 'datePublished' field.
   */
  public java.lang.CharSequence getDatePublished() {
    return datePublished;
  }

  /**
   * Sets the value of the 'datePublished' field.
   * @param value the value to set.
   */
  public void setDatePublished(java.lang.CharSequence value) {
    this.datePublished = value;
  }

  /**
   * Gets the value of the 'image' field.
   * @return The value of the 'image' field.
   */
  public com.walkover.sample.schema.image getImage() {
    return image;
  }

  /**
   * Sets the value of the 'image' field.
   * @param value the value to set.
   */
  public void setImage(com.walkover.sample.schema.image value) {
    this.image = value;
  }

  /**
   * Gets the value of the 'keywords' field.
   * @return The value of the 'keywords' field.
   */
  public java.lang.CharSequence getKeywords() {
    return keywords;
  }

  /**
   * Sets the value of the 'keywords' field.
   * @param value the value to set.
   */
  public void setKeywords(java.lang.CharSequence value) {
    this.keywords = value;
  }

  /**
   * Gets the value of the 'provider' field.
   * @return The value of the 'provider' field.
   */
  public com.walkover.sample.schema.provider getProvider() {
    return provider;
  }

  /**
   * Sets the value of the 'provider' field.
   * @param value the value to set.
   */
  public void setProvider(com.walkover.sample.schema.provider value) {
    this.provider = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'language' field.
   * @return The value of the 'language' field.
   */
  public java.lang.CharSequence getLanguage() {
    return language;
  }

  /**
   * Sets the value of the 'language' field.
   * @param value the value to set.
   */
  public void setLanguage(java.lang.CharSequence value) {
    this.language = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'body' field.
   * @return The value of the 'body' field.
   */
  public java.lang.CharSequence getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.lang.CharSequence value) {
    this.body = value;
  }

  /**
   * Gets the value of the 'url' field.
   * @return The value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'isSafe' field.
   * @return The value of the 'isSafe' field.
   */
  public java.lang.Boolean getIsSafe() {
    return isSafe;
  }

  /**
   * Sets the value of the 'isSafe' field.
   * @param value the value to set.
   */
  public void setIsSafe(java.lang.Boolean value) {
    this.isSafe = value;
  }

  /**
   * Creates a new value_record RecordBuilder.
   * @return A new value_record RecordBuilder
   */
  public static com.walkover.sample.schema.value_record.Builder newBuilder() {
    return new com.walkover.sample.schema.value_record.Builder();
  }

  /**
   * Creates a new value_record RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new value_record RecordBuilder
   */
  public static com.walkover.sample.schema.value_record.Builder newBuilder(com.walkover.sample.schema.value_record.Builder other) {
    return new com.walkover.sample.schema.value_record.Builder(other);
  }

  /**
   * Creates a new value_record RecordBuilder by copying an existing value_record instance.
   * @param other The existing instance to copy.
   * @return A new value_record RecordBuilder
   */
  public static com.walkover.sample.schema.value_record.Builder newBuilder(com.walkover.sample.schema.value_record other) {
    return new com.walkover.sample.schema.value_record.Builder(other);
  }

  /**
   * RecordBuilder for value_record instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<value_record>
    implements org.apache.avro.data.RecordBuilder<value_record> {

    private java.lang.CharSequence datePublished;
    private com.walkover.sample.schema.image image;
    private com.walkover.sample.schema.image.Builder imageBuilder;
    private java.lang.CharSequence keywords;
    private com.walkover.sample.schema.provider provider;
    private com.walkover.sample.schema.provider.Builder providerBuilder;
    private java.lang.CharSequence description;
    private java.lang.CharSequence language;
    private java.lang.CharSequence id;
    private java.lang.CharSequence title;
    private java.lang.CharSequence body;
    private java.lang.CharSequence url;
    private boolean isSafe;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.walkover.sample.schema.value_record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.datePublished)) {
        this.datePublished = data().deepCopy(fields()[0].schema(), other.datePublished);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.image)) {
        this.image = data().deepCopy(fields()[1].schema(), other.image);
        fieldSetFlags()[1] = true;
      }
      if (other.hasImageBuilder()) {
        this.imageBuilder = com.walkover.sample.schema.image.newBuilder(other.getImageBuilder());
      }
      if (isValidValue(fields()[2], other.keywords)) {
        this.keywords = data().deepCopy(fields()[2].schema(), other.keywords);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.provider)) {
        this.provider = data().deepCopy(fields()[3].schema(), other.provider);
        fieldSetFlags()[3] = true;
      }
      if (other.hasProviderBuilder()) {
        this.providerBuilder = com.walkover.sample.schema.provider.newBuilder(other.getProviderBuilder());
      }
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.language)) {
        this.language = data().deepCopy(fields()[5].schema(), other.language);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.id)) {
        this.id = data().deepCopy(fields()[6].schema(), other.id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.title)) {
        this.title = data().deepCopy(fields()[7].schema(), other.title);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.body)) {
        this.body = data().deepCopy(fields()[8].schema(), other.body);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.url)) {
        this.url = data().deepCopy(fields()[9].schema(), other.url);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.isSafe)) {
        this.isSafe = data().deepCopy(fields()[10].schema(), other.isSafe);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing value_record instance
     * @param other The existing instance to copy.
     */
    private Builder(com.walkover.sample.schema.value_record other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.datePublished)) {
        this.datePublished = data().deepCopy(fields()[0].schema(), other.datePublished);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.image)) {
        this.image = data().deepCopy(fields()[1].schema(), other.image);
        fieldSetFlags()[1] = true;
      }
      this.imageBuilder = null;
      if (isValidValue(fields()[2], other.keywords)) {
        this.keywords = data().deepCopy(fields()[2].schema(), other.keywords);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.provider)) {
        this.provider = data().deepCopy(fields()[3].schema(), other.provider);
        fieldSetFlags()[3] = true;
      }
      this.providerBuilder = null;
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.language)) {
        this.language = data().deepCopy(fields()[5].schema(), other.language);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.id)) {
        this.id = data().deepCopy(fields()[6].schema(), other.id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.title)) {
        this.title = data().deepCopy(fields()[7].schema(), other.title);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.body)) {
        this.body = data().deepCopy(fields()[8].schema(), other.body);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.url)) {
        this.url = data().deepCopy(fields()[9].schema(), other.url);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.isSafe)) {
        this.isSafe = data().deepCopy(fields()[10].schema(), other.isSafe);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'datePublished' field.
      * @return The value.
      */
    public java.lang.CharSequence getDatePublished() {
      return datePublished;
    }

    /**
      * Sets the value of the 'datePublished' field.
      * @param value The value of 'datePublished'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setDatePublished(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.datePublished = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'datePublished' field has been set.
      * @return True if the 'datePublished' field has been set, false otherwise.
      */
    public boolean hasDatePublished() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'datePublished' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearDatePublished() {
      datePublished = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'image' field.
      * @return The value.
      */
    public com.walkover.sample.schema.image getImage() {
      return image;
    }

    /**
      * Sets the value of the 'image' field.
      * @param value The value of 'image'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setImage(com.walkover.sample.schema.image value) {
      validate(fields()[1], value);
      this.imageBuilder = null;
      this.image = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'image' field has been set.
      * @return True if the 'image' field has been set, false otherwise.
      */
    public boolean hasImage() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'image' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.walkover.sample.schema.image.Builder getImageBuilder() {
      if (imageBuilder == null) {
        if (hasImage()) {
          setImageBuilder(com.walkover.sample.schema.image.newBuilder(image));
        } else {
          setImageBuilder(com.walkover.sample.schema.image.newBuilder());
        }
      }
      return imageBuilder;
    }

    /**
     * Sets the Builder instance for the 'image' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.walkover.sample.schema.value_record.Builder setImageBuilder(com.walkover.sample.schema.image.Builder value) {
      clearImage();
      imageBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'image' field has an active Builder instance
     * @return True if the 'image' field has an active Builder instance
     */
    public boolean hasImageBuilder() {
      return imageBuilder != null;
    }

    /**
      * Clears the value of the 'image' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearImage() {
      image = null;
      imageBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'keywords' field.
      * @return The value.
      */
    public java.lang.CharSequence getKeywords() {
      return keywords;
    }

    /**
      * Sets the value of the 'keywords' field.
      * @param value The value of 'keywords'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setKeywords(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.keywords = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'keywords' field has been set.
      * @return True if the 'keywords' field has been set, false otherwise.
      */
    public boolean hasKeywords() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'keywords' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearKeywords() {
      keywords = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'provider' field.
      * @return The value.
      */
    public com.walkover.sample.schema.provider getProvider() {
      return provider;
    }

    /**
      * Sets the value of the 'provider' field.
      * @param value The value of 'provider'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setProvider(com.walkover.sample.schema.provider value) {
      validate(fields()[3], value);
      this.providerBuilder = null;
      this.provider = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'provider' field has been set.
      * @return True if the 'provider' field has been set, false otherwise.
      */
    public boolean hasProvider() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'provider' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.walkover.sample.schema.provider.Builder getProviderBuilder() {
      if (providerBuilder == null) {
        if (hasProvider()) {
          setProviderBuilder(com.walkover.sample.schema.provider.newBuilder(provider));
        } else {
          setProviderBuilder(com.walkover.sample.schema.provider.newBuilder());
        }
      }
      return providerBuilder;
    }

    /**
     * Sets the Builder instance for the 'provider' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.walkover.sample.schema.value_record.Builder setProviderBuilder(com.walkover.sample.schema.provider.Builder value) {
      clearProvider();
      providerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'provider' field has an active Builder instance
     * @return True if the 'provider' field has an active Builder instance
     */
    public boolean hasProviderBuilder() {
      return providerBuilder != null;
    }

    /**
      * Clears the value of the 'provider' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearProvider() {
      provider = null;
      providerBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.description = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearDescription() {
      description = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'language' field.
      * @return The value.
      */
    public java.lang.CharSequence getLanguage() {
      return language;
    }

    /**
      * Sets the value of the 'language' field.
      * @param value The value of 'language'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setLanguage(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.language = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'language' field has been set.
      * @return True if the 'language' field has been set, false otherwise.
      */
    public boolean hasLanguage() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'language' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearLanguage() {
      language = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setId(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.id = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearId() {
      id = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.CharSequence getTitle() {
      return title;
    }

    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.title = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearTitle() {
      title = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'body' field.
      * @return The value.
      */
    public java.lang.CharSequence getBody() {
      return body;
    }

    /**
      * Sets the value of the 'body' field.
      * @param value The value of 'body'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setBody(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.body = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'body' field has been set.
      * @return True if the 'body' field has been set, false otherwise.
      */
    public boolean hasBody() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'body' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearBody() {
      body = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public java.lang.CharSequence getUrl() {
      return url;
    }

    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.url = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearUrl() {
      url = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSafe' field.
      * @return The value.
      */
    public java.lang.Boolean getIsSafe() {
      return isSafe;
    }

    /**
      * Sets the value of the 'isSafe' field.
      * @param value The value of 'isSafe'.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder setIsSafe(boolean value) {
      validate(fields()[10], value);
      this.isSafe = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'isSafe' field has been set.
      * @return True if the 'isSafe' field has been set, false otherwise.
      */
    public boolean hasIsSafe() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'isSafe' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.value_record.Builder clearIsSafe() {
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public value_record build() {
      try {
        value_record record = new value_record();
        record.datePublished = fieldSetFlags()[0] ? this.datePublished : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (imageBuilder != null) {
          record.image = this.imageBuilder.build();
        } else {
          record.image = fieldSetFlags()[1] ? this.image : (com.walkover.sample.schema.image) defaultValue(fields()[1]);
        }
        record.keywords = fieldSetFlags()[2] ? this.keywords : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (providerBuilder != null) {
          record.provider = this.providerBuilder.build();
        } else {
          record.provider = fieldSetFlags()[3] ? this.provider : (com.walkover.sample.schema.provider) defaultValue(fields()[3]);
        }
        record.description = fieldSetFlags()[4] ? this.description : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.language = fieldSetFlags()[5] ? this.language : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.id = fieldSetFlags()[6] ? this.id : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.title = fieldSetFlags()[7] ? this.title : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.body = fieldSetFlags()[8] ? this.body : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.url = fieldSetFlags()[9] ? this.url : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.isSafe = fieldSetFlags()[10] ? this.isSafe : (java.lang.Boolean) defaultValue(fields()[10]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<value_record>
    WRITER$ = (org.apache.avro.io.DatumWriter<value_record>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<value_record>
    READER$ = (org.apache.avro.io.DatumReader<value_record>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
