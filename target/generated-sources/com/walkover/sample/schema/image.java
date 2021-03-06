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
public class image extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 658806517652844443L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"image\",\"namespace\":\"com.walkover.sample.schema\",\"fields\":[{\"name\":\"base64Encoding\",\"type\":[\"string\",\"null\"],\"default\":\"true\"},{\"name\":\"imageWebSearchUrl\",\"type\":[\"string\",\"null\"],\"default\":\"true\"},{\"name\":\"thumbnail\",\"type\":\"string\"},{\"name\":\"width\",\"type\":\"int\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"thumbnailWidth\",\"type\":\"int\"},{\"name\":\"title\",\"type\":[\"string\",\"null\"],\"default\":\"true\"},{\"name\":\"thumbnailHeight\",\"type\":\"int\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"height\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<image> ENCODER =
      new BinaryMessageEncoder<image>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<image> DECODER =
      new BinaryMessageDecoder<image>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<image> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<image> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<image>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this image to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a image from a ByteBuffer. */
  public static image fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence base64Encoding;
  @Deprecated public java.lang.CharSequence imageWebSearchUrl;
  @Deprecated public java.lang.CharSequence thumbnail;
  @Deprecated public int width;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public int thumbnailWidth;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public int thumbnailHeight;
  @Deprecated public java.lang.CharSequence url;
  @Deprecated public int height;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public image() {}

  /**
   * All-args constructor.
   * @param base64Encoding The new value for base64Encoding
   * @param imageWebSearchUrl The new value for imageWebSearchUrl
   * @param thumbnail The new value for thumbnail
   * @param width The new value for width
   * @param name The new value for name
   * @param thumbnailWidth The new value for thumbnailWidth
   * @param title The new value for title
   * @param thumbnailHeight The new value for thumbnailHeight
   * @param url The new value for url
   * @param height The new value for height
   */
  public image(java.lang.CharSequence base64Encoding, java.lang.CharSequence imageWebSearchUrl, java.lang.CharSequence thumbnail, java.lang.Integer width, java.lang.CharSequence name, java.lang.Integer thumbnailWidth, java.lang.CharSequence title, java.lang.Integer thumbnailHeight, java.lang.CharSequence url, java.lang.Integer height) {
    this.base64Encoding = base64Encoding;
    this.imageWebSearchUrl = imageWebSearchUrl;
    this.thumbnail = thumbnail;
    this.width = width;
    this.name = name;
    this.thumbnailWidth = thumbnailWidth;
    this.title = title;
    this.thumbnailHeight = thumbnailHeight;
    this.url = url;
    this.height = height;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return base64Encoding;
    case 1: return imageWebSearchUrl;
    case 2: return thumbnail;
    case 3: return width;
    case 4: return name;
    case 5: return thumbnailWidth;
    case 6: return title;
    case 7: return thumbnailHeight;
    case 8: return url;
    case 9: return height;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: base64Encoding = (java.lang.CharSequence)value$; break;
    case 1: imageWebSearchUrl = (java.lang.CharSequence)value$; break;
    case 2: thumbnail = (java.lang.CharSequence)value$; break;
    case 3: width = (java.lang.Integer)value$; break;
    case 4: name = (java.lang.CharSequence)value$; break;
    case 5: thumbnailWidth = (java.lang.Integer)value$; break;
    case 6: title = (java.lang.CharSequence)value$; break;
    case 7: thumbnailHeight = (java.lang.Integer)value$; break;
    case 8: url = (java.lang.CharSequence)value$; break;
    case 9: height = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'base64Encoding' field.
   * @return The value of the 'base64Encoding' field.
   */
  public java.lang.CharSequence getBase64Encoding() {
    return base64Encoding;
  }

  /**
   * Sets the value of the 'base64Encoding' field.
   * @param value the value to set.
   */
  public void setBase64Encoding(java.lang.CharSequence value) {
    this.base64Encoding = value;
  }

  /**
   * Gets the value of the 'imageWebSearchUrl' field.
   * @return The value of the 'imageWebSearchUrl' field.
   */
  public java.lang.CharSequence getImageWebSearchUrl() {
    return imageWebSearchUrl;
  }

  /**
   * Sets the value of the 'imageWebSearchUrl' field.
   * @param value the value to set.
   */
  public void setImageWebSearchUrl(java.lang.CharSequence value) {
    this.imageWebSearchUrl = value;
  }

  /**
   * Gets the value of the 'thumbnail' field.
   * @return The value of the 'thumbnail' field.
   */
  public java.lang.CharSequence getThumbnail() {
    return thumbnail;
  }

  /**
   * Sets the value of the 'thumbnail' field.
   * @param value the value to set.
   */
  public void setThumbnail(java.lang.CharSequence value) {
    this.thumbnail = value;
  }

  /**
   * Gets the value of the 'width' field.
   * @return The value of the 'width' field.
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Sets the value of the 'width' field.
   * @param value the value to set.
   */
  public void setWidth(java.lang.Integer value) {
    this.width = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'thumbnailWidth' field.
   * @return The value of the 'thumbnailWidth' field.
   */
  public java.lang.Integer getThumbnailWidth() {
    return thumbnailWidth;
  }

  /**
   * Sets the value of the 'thumbnailWidth' field.
   * @param value the value to set.
   */
  public void setThumbnailWidth(java.lang.Integer value) {
    this.thumbnailWidth = value;
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
   * Gets the value of the 'thumbnailHeight' field.
   * @return The value of the 'thumbnailHeight' field.
   */
  public java.lang.Integer getThumbnailHeight() {
    return thumbnailHeight;
  }

  /**
   * Sets the value of the 'thumbnailHeight' field.
   * @param value the value to set.
   */
  public void setThumbnailHeight(java.lang.Integer value) {
    this.thumbnailHeight = value;
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
   * Gets the value of the 'height' field.
   * @return The value of the 'height' field.
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Sets the value of the 'height' field.
   * @param value the value to set.
   */
  public void setHeight(java.lang.Integer value) {
    this.height = value;
  }

  /**
   * Creates a new image RecordBuilder.
   * @return A new image RecordBuilder
   */
  public static com.walkover.sample.schema.image.Builder newBuilder() {
    return new com.walkover.sample.schema.image.Builder();
  }

  /**
   * Creates a new image RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new image RecordBuilder
   */
  public static com.walkover.sample.schema.image.Builder newBuilder(com.walkover.sample.schema.image.Builder other) {
    return new com.walkover.sample.schema.image.Builder(other);
  }

  /**
   * Creates a new image RecordBuilder by copying an existing image instance.
   * @param other The existing instance to copy.
   * @return A new image RecordBuilder
   */
  public static com.walkover.sample.schema.image.Builder newBuilder(com.walkover.sample.schema.image other) {
    return new com.walkover.sample.schema.image.Builder(other);
  }

  /**
   * RecordBuilder for image instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<image>
    implements org.apache.avro.data.RecordBuilder<image> {

    private java.lang.CharSequence base64Encoding;
    private java.lang.CharSequence imageWebSearchUrl;
    private java.lang.CharSequence thumbnail;
    private int width;
    private java.lang.CharSequence name;
    private int thumbnailWidth;
    private java.lang.CharSequence title;
    private int thumbnailHeight;
    private java.lang.CharSequence url;
    private int height;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.walkover.sample.schema.image.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.base64Encoding)) {
        this.base64Encoding = data().deepCopy(fields()[0].schema(), other.base64Encoding);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.imageWebSearchUrl)) {
        this.imageWebSearchUrl = data().deepCopy(fields()[1].schema(), other.imageWebSearchUrl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.thumbnail)) {
        this.thumbnail = data().deepCopy(fields()[2].schema(), other.thumbnail);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.width)) {
        this.width = data().deepCopy(fields()[3].schema(), other.width);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.name)) {
        this.name = data().deepCopy(fields()[4].schema(), other.name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.thumbnailWidth)) {
        this.thumbnailWidth = data().deepCopy(fields()[5].schema(), other.thumbnailWidth);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.title)) {
        this.title = data().deepCopy(fields()[6].schema(), other.title);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.thumbnailHeight)) {
        this.thumbnailHeight = data().deepCopy(fields()[7].schema(), other.thumbnailHeight);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.url)) {
        this.url = data().deepCopy(fields()[8].schema(), other.url);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.height)) {
        this.height = data().deepCopy(fields()[9].schema(), other.height);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing image instance
     * @param other The existing instance to copy.
     */
    private Builder(com.walkover.sample.schema.image other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.base64Encoding)) {
        this.base64Encoding = data().deepCopy(fields()[0].schema(), other.base64Encoding);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.imageWebSearchUrl)) {
        this.imageWebSearchUrl = data().deepCopy(fields()[1].schema(), other.imageWebSearchUrl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.thumbnail)) {
        this.thumbnail = data().deepCopy(fields()[2].schema(), other.thumbnail);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.width)) {
        this.width = data().deepCopy(fields()[3].schema(), other.width);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.name)) {
        this.name = data().deepCopy(fields()[4].schema(), other.name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.thumbnailWidth)) {
        this.thumbnailWidth = data().deepCopy(fields()[5].schema(), other.thumbnailWidth);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.title)) {
        this.title = data().deepCopy(fields()[6].schema(), other.title);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.thumbnailHeight)) {
        this.thumbnailHeight = data().deepCopy(fields()[7].schema(), other.thumbnailHeight);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.url)) {
        this.url = data().deepCopy(fields()[8].schema(), other.url);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.height)) {
        this.height = data().deepCopy(fields()[9].schema(), other.height);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'base64Encoding' field.
      * @return The value.
      */
    public java.lang.CharSequence getBase64Encoding() {
      return base64Encoding;
    }

    /**
      * Sets the value of the 'base64Encoding' field.
      * @param value The value of 'base64Encoding'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setBase64Encoding(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.base64Encoding = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'base64Encoding' field has been set.
      * @return True if the 'base64Encoding' field has been set, false otherwise.
      */
    public boolean hasBase64Encoding() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'base64Encoding' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearBase64Encoding() {
      base64Encoding = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'imageWebSearchUrl' field.
      * @return The value.
      */
    public java.lang.CharSequence getImageWebSearchUrl() {
      return imageWebSearchUrl;
    }

    /**
      * Sets the value of the 'imageWebSearchUrl' field.
      * @param value The value of 'imageWebSearchUrl'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setImageWebSearchUrl(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.imageWebSearchUrl = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'imageWebSearchUrl' field has been set.
      * @return True if the 'imageWebSearchUrl' field has been set, false otherwise.
      */
    public boolean hasImageWebSearchUrl() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'imageWebSearchUrl' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearImageWebSearchUrl() {
      imageWebSearchUrl = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'thumbnail' field.
      * @return The value.
      */
    public java.lang.CharSequence getThumbnail() {
      return thumbnail;
    }

    /**
      * Sets the value of the 'thumbnail' field.
      * @param value The value of 'thumbnail'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setThumbnail(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.thumbnail = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'thumbnail' field has been set.
      * @return True if the 'thumbnail' field has been set, false otherwise.
      */
    public boolean hasThumbnail() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'thumbnail' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearThumbnail() {
      thumbnail = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'width' field.
      * @return The value.
      */
    public java.lang.Integer getWidth() {
      return width;
    }

    /**
      * Sets the value of the 'width' field.
      * @param value The value of 'width'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setWidth(int value) {
      validate(fields()[3], value);
      this.width = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'width' field has been set.
      * @return True if the 'width' field has been set, false otherwise.
      */
    public boolean hasWidth() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'width' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearWidth() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.name = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearName() {
      name = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'thumbnailWidth' field.
      * @return The value.
      */
    public java.lang.Integer getThumbnailWidth() {
      return thumbnailWidth;
    }

    /**
      * Sets the value of the 'thumbnailWidth' field.
      * @param value The value of 'thumbnailWidth'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setThumbnailWidth(int value) {
      validate(fields()[5], value);
      this.thumbnailWidth = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'thumbnailWidth' field has been set.
      * @return True if the 'thumbnailWidth' field has been set, false otherwise.
      */
    public boolean hasThumbnailWidth() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'thumbnailWidth' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearThumbnailWidth() {
      fieldSetFlags()[5] = false;
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
    public com.walkover.sample.schema.image.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.title = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearTitle() {
      title = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'thumbnailHeight' field.
      * @return The value.
      */
    public java.lang.Integer getThumbnailHeight() {
      return thumbnailHeight;
    }

    /**
      * Sets the value of the 'thumbnailHeight' field.
      * @param value The value of 'thumbnailHeight'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setThumbnailHeight(int value) {
      validate(fields()[7], value);
      this.thumbnailHeight = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'thumbnailHeight' field has been set.
      * @return True if the 'thumbnailHeight' field has been set, false otherwise.
      */
    public boolean hasThumbnailHeight() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'thumbnailHeight' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearThumbnailHeight() {
      fieldSetFlags()[7] = false;
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
    public com.walkover.sample.schema.image.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.url = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearUrl() {
      url = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * @return The value.
      */
    public java.lang.Integer getHeight() {
      return height;
    }

    /**
      * Sets the value of the 'height' field.
      * @param value The value of 'height'.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder setHeight(int value) {
      validate(fields()[9], value);
      this.height = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'height' field.
      * @return This builder.
      */
    public com.walkover.sample.schema.image.Builder clearHeight() {
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public image build() {
      try {
        image record = new image();
        record.base64Encoding = fieldSetFlags()[0] ? this.base64Encoding : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.imageWebSearchUrl = fieldSetFlags()[1] ? this.imageWebSearchUrl : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.thumbnail = fieldSetFlags()[2] ? this.thumbnail : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.width = fieldSetFlags()[3] ? this.width : (java.lang.Integer) defaultValue(fields()[3]);
        record.name = fieldSetFlags()[4] ? this.name : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.thumbnailWidth = fieldSetFlags()[5] ? this.thumbnailWidth : (java.lang.Integer) defaultValue(fields()[5]);
        record.title = fieldSetFlags()[6] ? this.title : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.thumbnailHeight = fieldSetFlags()[7] ? this.thumbnailHeight : (java.lang.Integer) defaultValue(fields()[7]);
        record.url = fieldSetFlags()[8] ? this.url : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.height = fieldSetFlags()[9] ? this.height : (java.lang.Integer) defaultValue(fields()[9]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<image>
    WRITER$ = (org.apache.avro.io.DatumWriter<image>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<image>
    READER$ = (org.apache.avro.io.DatumReader<image>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
