package com.walkover.sample.model;

import org.apache.parquet.example.data.simple.SimpleGroup;
import org.apache.parquet.schema.Type;

import java.util.List;
import java.util.Objects;

public class Parquet {

    private List<SimpleGroup> data;
    private List<Type> schema;

    public void setData(List<SimpleGroup> data) {
        this.data = data;
    }

    public Parquet(List<SimpleGroup> data, List<Type> schema) {
        this.data = data;
        this.schema = schema;
    }

    public List<SimpleGroup> getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parquet)) return false;
        Parquet parquet = (Parquet) o;
        return getData().equals(parquet.getData()) &&
                getSchema().equals(parquet.getSchema());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getSchema());
    }

    public List<Type> getSchema() {
        return schema;
    }
}
