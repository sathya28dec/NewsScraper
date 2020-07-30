package com.walkover.sample.model;

import java.util.Objects;

public class NounText implements Comparable<NounText> {

    private String noun;


    private NounText(NounBuilder builder) {
        this.noun = builder.noun;
    }

    public static class NounBuilder {

        private String noun;

        public static NounBuilder newInstance() {
            return new NounBuilder();
        }

        private NounBuilder() {
        }

        public NounBuilder(String noun) {
            this.noun = noun;
        }

        public String getNoun() {
            return noun;
        }

        public void setNoun(String noun) {
            this.noun = noun;
        }


        public NounText build() {
            return new NounText(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof NounBuilder)) return false;
            NounBuilder that = (NounBuilder) o;
            return getNoun().equals(that.getNoun());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getNoun());
        }

    }

    @Override
    public String toString() {
        return "noun text is " + this.noun;
    }

    @Override
    public int compareTo(NounText inNoun) {
        return noun.compareTo(inNoun.noun);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NounText)) return false;
        NounText nounText = (NounText) o;
        return noun.equals(nounText.noun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noun);
    }
}
