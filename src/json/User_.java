
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
    "id",
    "id_str",
    "name",
    "screen_name",
    "location",
    "description",
    "url",
    "entities",
    "protected",
    "followers_count",
    "friends_count",
    "listed_count",
    "created_at",
    "favourites_count",
    "utc_offset",
    "time_zone",
    "geo_enabled",
    "verified",
    "statuses_count",
    "lang",
    "contributors_enabled",
    "is_translator",
    "profile_background_color",
    "profile_background_image_url",
    "profile_background_image_url_https",
    "profile_background_tile",
    "profile_image_url",
    "profile_image_url_https",
    "profile_banner_url",
    "profile_link_color",
    "profile_sidebar_border_color",
    "profile_sidebar_fill_color",
    "profile_text_color",
    "profile_use_background_image",
    "default_profile",
    "default_profile_image",
    "following",
    "follow_request_sent",
    "notifications"
})
public class User_ {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("name")
    private String name;
    @JsonProperty("screen_name")
    private String screen_name;
    @JsonProperty("location")
    private String location;
    @JsonProperty("description")
    private String description;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("entities")
    private Entities__ entities;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("followers_count")
    private Integer followers_count;
    @JsonProperty("friends_count")
    private Integer friends_count;
    @JsonProperty("listed_count")
    private Integer listed_count;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("favourites_count")
    private Integer favourites_count;
    @JsonProperty("utc_offset")
    private Object utc_offset;
    @JsonProperty("time_zone")
    private Object time_zone;
    @JsonProperty("geo_enabled")
    private Boolean geo_enabled;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("statuses_count")
    private Integer statuses_count;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("contributors_enabled")
    private Boolean contributors_enabled;
    @JsonProperty("is_translator")
    private Boolean is_translator;
    @JsonProperty("profile_background_color")
    private String profile_background_color;
    @JsonProperty("profile_background_image_url")
    private String profile_background_image_url;
    @JsonProperty("profile_background_image_url_https")
    private String profile_background_image_url_https;
    @JsonProperty("profile_background_tile")
    private Boolean profile_background_tile;
    @JsonProperty("profile_image_url")
    private String profile_image_url;
    @JsonProperty("profile_image_url_https")
    private String profile_image_url_https;
    @JsonProperty("profile_banner_url")
    private String profile_banner_url;
    @JsonProperty("profile_link_color")
    private String profile_link_color;
    @JsonProperty("profile_sidebar_border_color")
    private String profile_sidebar_border_color;
    @JsonProperty("profile_sidebar_fill_color")
    private String profile_sidebar_fill_color;
    @JsonProperty("profile_text_color")
    private String profile_text_color;
    @JsonProperty("profile_use_background_image")
    private Boolean profile_use_background_image;
    @JsonProperty("default_profile")
    private Boolean default_profile;
    @JsonProperty("default_profile_image")
    private Boolean default_profile_image;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("follow_request_sent")
    private Boolean follow_request_sent;
    @JsonProperty("notifications")
    private Object notifications;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("screen_name")
    public String getScreen_name() {
        return screen_name;
    }

    @JsonProperty("screen_name")
    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("entities")
    public Entities__ getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities__ entities) {
        this.entities = entities;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @JsonProperty("followers_count")
    public Integer getFollowers_count() {
        return followers_count;
    }

    @JsonProperty("followers_count")
    public void setFollowers_count(Integer followers_count) {
        this.followers_count = followers_count;
    }

    @JsonProperty("friends_count")
    public Integer getFriends_count() {
        return friends_count;
    }

    @JsonProperty("friends_count")
    public void setFriends_count(Integer friends_count) {
        this.friends_count = friends_count;
    }

    @JsonProperty("listed_count")
    public Integer getListed_count() {
        return listed_count;
    }

    @JsonProperty("listed_count")
    public void setListed_count(Integer listed_count) {
        this.listed_count = listed_count;
    }

    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @JsonProperty("favourites_count")
    public Integer getFavourites_count() {
        return favourites_count;
    }

    @JsonProperty("favourites_count")
    public void setFavourites_count(Integer favourites_count) {
        this.favourites_count = favourites_count;
    }

    @JsonProperty("utc_offset")
    public Object getUtc_offset() {
        return utc_offset;
    }

    @JsonProperty("utc_offset")
    public void setUtc_offset(Object utc_offset) {
        this.utc_offset = utc_offset;
    }

    @JsonProperty("time_zone")
    public Object getTime_zone() {
        return time_zone;
    }

    @JsonProperty("time_zone")
    public void setTime_zone(Object time_zone) {
        this.time_zone = time_zone;
    }

    @JsonProperty("geo_enabled")
    public Boolean getGeo_enabled() {
        return geo_enabled;
    }

    @JsonProperty("geo_enabled")
    public void setGeo_enabled(Boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("statuses_count")
    public Integer getStatuses_count() {
        return statuses_count;
    }

    @JsonProperty("statuses_count")
    public void setStatuses_count(Integer statuses_count) {
        this.statuses_count = statuses_count;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("contributors_enabled")
    public Boolean getContributors_enabled() {
        return contributors_enabled;
    }

    @JsonProperty("contributors_enabled")
    public void setContributors_enabled(Boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    @JsonProperty("is_translator")
    public Boolean getIs_translator() {
        return is_translator;
    }

    @JsonProperty("is_translator")
    public void setIs_translator(Boolean is_translator) {
        this.is_translator = is_translator;
    }

    @JsonProperty("profile_background_color")
    public String getProfile_background_color() {
        return profile_background_color;
    }

    @JsonProperty("profile_background_color")
    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    @JsonProperty("profile_background_image_url")
    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    @JsonProperty("profile_background_image_url")
    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    @JsonProperty("profile_background_image_url_https")
    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    @JsonProperty("profile_background_image_url_https")
    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }

    @JsonProperty("profile_background_tile")
    public Boolean getProfile_background_tile() {
        return profile_background_tile;
    }

    @JsonProperty("profile_background_tile")
    public void setProfile_background_tile(Boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
    }

    @JsonProperty("profile_image_url")
    public String getProfile_image_url() {
        return profile_image_url;
    }

    @JsonProperty("profile_image_url")
    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    @JsonProperty("profile_image_url_https")
    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    @JsonProperty("profile_image_url_https")
    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    @JsonProperty("profile_banner_url")
    public String getProfile_banner_url() {
        return profile_banner_url;
    }

    @JsonProperty("profile_banner_url")
    public void setProfile_banner_url(String profile_banner_url) {
        this.profile_banner_url = profile_banner_url;
    }

    @JsonProperty("profile_link_color")
    public String getProfile_link_color() {
        return profile_link_color;
    }

    @JsonProperty("profile_link_color")
    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    @JsonProperty("profile_sidebar_border_color")
    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    @JsonProperty("profile_text_color")
    public String getProfile_text_color() {
        return profile_text_color;
    }

    @JsonProperty("profile_text_color")
    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    @JsonProperty("profile_use_background_image")
    public Boolean getProfile_use_background_image() {
        return profile_use_background_image;
    }

    @JsonProperty("profile_use_background_image")
    public void setProfile_use_background_image(Boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }

    @JsonProperty("default_profile")
    public Boolean getDefault_profile() {
        return default_profile;
    }

    @JsonProperty("default_profile")
    public void setDefault_profile(Boolean default_profile) {
        this.default_profile = default_profile;
    }

    @JsonProperty("default_profile_image")
    public Boolean getDefault_profile_image() {
        return default_profile_image;
    }

    @JsonProperty("default_profile_image")
    public void setDefault_profile_image(Boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }

    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    @JsonProperty("follow_request_sent")
    public Boolean getFollow_request_sent() {
        return follow_request_sent;
    }

    @JsonProperty("follow_request_sent")
    public void setFollow_request_sent(Boolean follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }

    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
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
