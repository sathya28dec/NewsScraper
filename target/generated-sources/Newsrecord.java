import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "didUMean",
    "relatedSearch",
    "_type",
    "totalCount",
    "value"
})
public class Newsrecord {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("didUMean")
    private String didUMean;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("relatedSearch")
    private List<Object> relatedSearch = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_type")
    private String type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private List<Object> value = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("didUMean")
    public String getDidUMean() {
        return didUMean;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("didUMean")
    public void setDidUMean(String didUMean) {
        this.didUMean = didUMean;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("relatedSearch")
    public List<Object> getRelatedSearch() {
        return relatedSearch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("relatedSearch")
    public void setRelatedSearch(List<Object> relatedSearch) {
        this.relatedSearch = relatedSearch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public List<Object> getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(List<Object> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(didUMean).append(relatedSearch).append(type).append(totalCount).append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Newsrecord) == false) {
            return false;
        }
        Newsrecord rhs = ((Newsrecord) other);
        return new EqualsBuilder().append(didUMean, rhs.didUMean).append(relatedSearch, rhs.relatedSearch).append(type, rhs.type).append(totalCount, rhs.totalCount).append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
