/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.zliu.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Wind extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2137264200328618263L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Wind\",\"namespace\":\"com.zliu.schema\",\"fields\":[{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"deg\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public double speed;
  @Deprecated public double deg;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Wind() {}

  /**
   * All-args constructor.
   * @param speed The new value for speed
   * @param deg The new value for deg
   */
  public Wind(java.lang.Double speed, java.lang.Double deg) {
    this.speed = speed;
    this.deg = deg;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return speed;
    case 1: return deg;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: speed = (java.lang.Double)value$; break;
    case 1: deg = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'speed' field.
   * @return The value of the 'speed' field.
   */
  public java.lang.Double getSpeed() {
    return speed;
  }

  /**
   * Sets the value of the 'speed' field.
   * @param value the value to set.
   */
  public void setSpeed(java.lang.Double value) {
    this.speed = value;
  }

  /**
   * Gets the value of the 'deg' field.
   * @return The value of the 'deg' field.
   */
  public java.lang.Double getDeg() {
    return deg;
  }

  /**
   * Sets the value of the 'deg' field.
   * @param value the value to set.
   */
  public void setDeg(java.lang.Double value) {
    this.deg = value;
  }

  /**
   * Creates a new Wind RecordBuilder.
   * @return A new Wind RecordBuilder
   */
  public static com.zliu.schema.Wind.Builder newBuilder() {
    return new com.zliu.schema.Wind.Builder();
  }

  /**
   * Creates a new Wind RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Wind RecordBuilder
   */
  public static com.zliu.schema.Wind.Builder newBuilder(com.zliu.schema.Wind.Builder other) {
    return new com.zliu.schema.Wind.Builder(other);
  }

  /**
   * Creates a new Wind RecordBuilder by copying an existing Wind instance.
   * @param other The existing instance to copy.
   * @return A new Wind RecordBuilder
   */
  public static com.zliu.schema.Wind.Builder newBuilder(com.zliu.schema.Wind other) {
    return new com.zliu.schema.Wind.Builder(other);
  }

  /**
   * RecordBuilder for Wind instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Wind>
    implements org.apache.avro.data.RecordBuilder<Wind> {

    private double speed;
    private double deg;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.zliu.schema.Wind.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.speed)) {
        this.speed = data().deepCopy(fields()[0].schema(), other.speed);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deg)) {
        this.deg = data().deepCopy(fields()[1].schema(), other.deg);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Wind instance
     * @param other The existing instance to copy.
     */
    private Builder(com.zliu.schema.Wind other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.speed)) {
        this.speed = data().deepCopy(fields()[0].schema(), other.speed);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deg)) {
        this.deg = data().deepCopy(fields()[1].schema(), other.deg);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'speed' field.
      * @return The value.
      */
    public java.lang.Double getSpeed() {
      return speed;
    }

    /**
      * Sets the value of the 'speed' field.
      * @param value The value of 'speed'.
      * @return This builder.
      */
    public com.zliu.schema.Wind.Builder setSpeed(double value) {
      validate(fields()[0], value);
      this.speed = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'speed' field has been set.
      * @return True if the 'speed' field has been set, false otherwise.
      */
    public boolean hasSpeed() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'speed' field.
      * @return This builder.
      */
    public com.zliu.schema.Wind.Builder clearSpeed() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'deg' field.
      * @return The value.
      */
    public java.lang.Double getDeg() {
      return deg;
    }

    /**
      * Sets the value of the 'deg' field.
      * @param value The value of 'deg'.
      * @return This builder.
      */
    public com.zliu.schema.Wind.Builder setDeg(double value) {
      validate(fields()[1], value);
      this.deg = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'deg' field has been set.
      * @return True if the 'deg' field has been set, false otherwise.
      */
    public boolean hasDeg() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'deg' field.
      * @return This builder.
      */
    public com.zliu.schema.Wind.Builder clearDeg() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Wind build() {
      try {
        Wind record = new Wind();
        record.speed = fieldSetFlags()[0] ? this.speed : (java.lang.Double) defaultValue(fields()[0]);
        record.deg = fieldSetFlags()[1] ? this.deg : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
