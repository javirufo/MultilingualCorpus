
package json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "created_at",
    "id",
    "id_str",
    "text",
    "source",
    "truncated",
    "in_reply_to_status_id",
    "in_reply_to_status_id_str",
    "in_reply_to_user_id",
    "in_reply_to_user_id_str",
    "in_reply_to_screen_name",
    "user",
    "geo",
    "coordinates",
    "place",
    "contributors",
    "retweet_count",
    "favorite_count",
    "entities",
    "favorited",
    "retweeted",
    "possibly_sensitive",
    "lang",
    "retweeted_status"
})
public class TweetJson {

    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("text")
    private String text;
    @JsonProperty("source")
    private String source;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("in_reply_to_status_id")
    private Object in_reply_to_status_id;
    @JsonProperty("in_reply_to_status_id_str")
    private Object in_reply_to_status_id_str;
    @JsonProperty("in_reply_to_user_id")
    private Object in_reply_to_user_id;
    @JsonProperty("in_reply_to_user_id_str")
    private Object in_reply_to_user_id_str;
    @JsonProperty("in_reply_to_screen_name")
    private Object in_reply_to_screen_name;
    @JsonProperty("user")
    private User user;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("retweet_count")
    private Integer retweet_count;
    @JsonProperty("favorite_count")
    private Integer favorite_count;
    @JsonProperty("entities")
    private Entities_ entities;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("possibly_sensitive")
    private Boolean possibly_sensitive;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("retweeted_status")
    private Retweeted_status retweeted_status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @JsonProperty("id")
    public Double getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Double id) {
        this.id = id;
    }

    @JsonProperty("id_str")
    public String getId_str() {
        return id_str;
    }

    @JsonProperty("id_str")
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setIn_reply_to_status_id(Object in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setIn_reply_to_status_id_str(Object in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setIn_reply_to_user_id(Object in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setIn_reply_to_user_id_str(Object in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setIn_reply_to_screen_name(Object in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("retweet_count")
    public Integer getRetweet_count() {
        return retweet_count;
    }

    @JsonProperty("retweet_count")
    public void setRetweet_count(Integer retweet_count) {
        this.retweet_count = retweet_count;
    }

    @JsonProperty("favorite_count")
    public Integer getFavorite_count() {
        return favorite_count;
    }

    @JsonProperty("favorite_count")
    public void setFavorite_count(Integer favorite_count) {
        this.favorite_count = favorite_count;
    }

    @JsonProperty("entities")
    public Entities_ getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("possibly_sensitive")
    public Boolean getPossibly_sensitive() {
        return possibly_sensitive;
    }

    @JsonProperty("possibly_sensitive")
    public void setPossibly_sensitive(Boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("retweeted_status")
    public Retweeted_status getRetweeted_status() {
        return retweeted_status;
    }

    @JsonProperty("retweeted_status")
    public void setRetweeted_status(Retweeted_status retweeted_status) {
        this.retweeted_status = retweeted_status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
