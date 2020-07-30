package com.walkover.sample.model;

import java.util.Objects;

public class ResponseObject {

    private String autoCorrect;
    private String pageNumber;
    private String pageSize;
    private String q;
    private String safeSearch;


    private ResponseObject(ResponseBuilder builder) {
        this.autoCorrect = builder.autoCorrect;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.q=builder.q;
        this.safeSearch = builder.safeSearch;
    }

    public static class ResponseBuilder

    {

        private String autoCorrect = "true";
        private String pageNumber;
        private String pageSize;
        private String q;
        private String safeSearch = "true";

        public static ResponseBuilder newInstance()
        {
            return new ResponseBuilder();
        }


        private ResponseBuilder() {}

        public ResponseBuilder(String pageNumber,String pageSize, String queryString) {
            this.pageNumber = pageNumber;
            this.pageSize = pageSize;
            this.q = queryString;
        }


            public String getAutoCorrect () {
            return autoCorrect;
        }

            public void setAutoCorrect (String autoCorrect){
            this.autoCorrect = autoCorrect;
        }

            public String getPageNumber () {
            return pageNumber;
        }

            public void setPageNumber (String pageNumber){
            this.pageNumber = pageNumber;
        }

            public String getPageSize () {
            return pageSize;
        }

            public void setPageSize (String pageSize){
            this.pageSize = pageSize;
        }

            public String getQ () {
            return q;
        }

            public void setQ (String q){
            this.q = q;
        }

            public String getSafeSearch () {
            return safeSearch;
        }

            public void setSafeSearch (String safeSearch){
            this.safeSearch = safeSearch;
        }


        public ResponseObject build()
        {
            return new ResponseObject(this);
        }

    }

    public String getAutoCorrect() {
        return autoCorrect;
    }

    public void setAutoCorrect(String autoCorrect) {
        this.autoCorrect = autoCorrect;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getSafeSearch() {
        return safeSearch;
    }

    public void setSafeSearch(String safeSearch) {
        this.safeSearch = safeSearch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponseObject)) return false;
        ResponseObject that = (ResponseObject) o;
        return getAutoCorrect().equals(that.getAutoCorrect()) &&
                getPageNumber().equals(that.getPageNumber()) &&
                getPageSize().equals(that.getPageSize()) &&
                getQ().equals(that.getQ()) &&
                getSafeSearch().equals(that.getSafeSearch());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAutoCorrect(), getPageNumber(), getPageSize(), getQ(), getSafeSearch());
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "autoCorrect='" + autoCorrect + '\'' +
                ", pageNumber='" + pageNumber + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", q='" + q + '\'' +
                ", safeSearch='" + safeSearch + '\'' +
                '}';
    }
}
