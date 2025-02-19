// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourceexplorer.inputs;

import com.pulumi.aws.resourceexplorer.inputs.SearchResourceResourceProperty;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SearchResource extends com.pulumi.resources.InvokeArgs {

    public static final SearchResource Empty = new SearchResource();

    /**
     * Amazon resource name of resource.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Amazon resource name of resource.
     * 
     */
    public String arn() {
        return this.arn;
    }

    /**
     * The date and time that the information about this resource property was last updated.
     * 
     */
    @Import(name="lastReportedAt", required=true)
    private String lastReportedAt;

    /**
     * @return The date and time that the information about this resource property was last updated.
     * 
     */
    public String lastReportedAt() {
        return this.lastReportedAt;
    }

    /**
     * Amazon Web Services account that owns the resource.
     * 
     */
    @Import(name="owningAccountId", required=true)
    private String owningAccountId;

    /**
     * @return Amazon Web Services account that owns the resource.
     * 
     */
    public String owningAccountId() {
        return this.owningAccountId;
    }

    /**
     * Amazon Web Services Region in which the resource was created and exists.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return Amazon Web Services Region in which the resource was created and exists.
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * Structure with additional type-specific details about the resource.  See `resource_property` below.
     * 
     */
    @Import(name="resourceProperties")
    private @Nullable List<SearchResourceResourceProperty> resourceProperties;

    /**
     * @return Structure with additional type-specific details about the resource.  See `resource_property` below.
     * 
     */
    public Optional<List<SearchResourceResourceProperty>> resourceProperties() {
        return Optional.ofNullable(this.resourceProperties);
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return Type of the resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Amazon Web Service that owns the resource and is responsible for creating and updating it.
     * 
     */
    @Import(name="service", required=true)
    private String service;

    /**
     * @return Amazon Web Service that owns the resource and is responsible for creating and updating it.
     * 
     */
    public String service() {
        return this.service;
    }

    private SearchResource() {}

    private SearchResource(SearchResource $) {
        this.arn = $.arn;
        this.lastReportedAt = $.lastReportedAt;
        this.owningAccountId = $.owningAccountId;
        this.region = $.region;
        this.resourceProperties = $.resourceProperties;
        this.resourceType = $.resourceType;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SearchResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SearchResource $;

        public Builder() {
            $ = new SearchResource();
        }

        public Builder(SearchResource defaults) {
            $ = new SearchResource(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon resource name of resource.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param lastReportedAt The date and time that the information about this resource property was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastReportedAt(String lastReportedAt) {
            $.lastReportedAt = lastReportedAt;
            return this;
        }

        /**
         * @param owningAccountId Amazon Web Services account that owns the resource.
         * 
         * @return builder
         * 
         */
        public Builder owningAccountId(String owningAccountId) {
            $.owningAccountId = owningAccountId;
            return this;
        }

        /**
         * @param region Amazon Web Services Region in which the resource was created and exists.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param resourceProperties Structure with additional type-specific details about the resource.  See `resource_property` below.
         * 
         * @return builder
         * 
         */
        public Builder resourceProperties(@Nullable List<SearchResourceResourceProperty> resourceProperties) {
            $.resourceProperties = resourceProperties;
            return this;
        }

        /**
         * @param resourceProperties Structure with additional type-specific details about the resource.  See `resource_property` below.
         * 
         * @return builder
         * 
         */
        public Builder resourceProperties(SearchResourceResourceProperty... resourceProperties) {
            return resourceProperties(List.of(resourceProperties));
        }

        /**
         * @param resourceType Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param service Amazon Web Service that owns the resource and is responsible for creating and updating it.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            $.service = service;
            return this;
        }

        public SearchResource build() {
            if ($.arn == null) {
                throw new MissingRequiredPropertyException("SearchResource", "arn");
            }
            if ($.lastReportedAt == null) {
                throw new MissingRequiredPropertyException("SearchResource", "lastReportedAt");
            }
            if ($.owningAccountId == null) {
                throw new MissingRequiredPropertyException("SearchResource", "owningAccountId");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("SearchResource", "region");
            }
            if ($.resourceType == null) {
                throw new MissingRequiredPropertyException("SearchResource", "resourceType");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("SearchResource", "service");
            }
            return $;
        }
    }

}
