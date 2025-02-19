// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rekognition.inputs;

import com.pulumi.aws.rekognition.inputs.CollectionTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CollectionState extends com.pulumi.resources.ResourceArgs {

    public static final CollectionState Empty = new CollectionState();

    /**
     * ARN of the Collection.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the Collection.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the collection
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="collectionId")
    private @Nullable Output<String> collectionId;

    /**
     * @return The name of the collection
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<String>> collectionId() {
        return Optional.ofNullable(this.collectionId);
    }

    /**
     * The Face Model Version that the collection was initialized with
     * 
     */
    @Import(name="faceModelVersion")
    private @Nullable Output<String> faceModelVersion;

    /**
     * @return The Face Model Version that the collection was initialized with
     * 
     */
    public Optional<Output<String>> faceModelVersion() {
        return Optional.ofNullable(this.faceModelVersion);
    }

    /**
     * A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    @Import(name="timeouts")
    private @Nullable Output<CollectionTimeoutsArgs> timeouts;

    public Optional<Output<CollectionTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private CollectionState() {}

    private CollectionState(CollectionState $) {
        this.arn = $.arn;
        this.collectionId = $.collectionId;
        this.faceModelVersion = $.faceModelVersion;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CollectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CollectionState $;

        public Builder() {
            $ = new CollectionState();
        }

        public Builder(CollectionState defaults) {
            $ = new CollectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the Collection.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the Collection.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param collectionId The name of the collection
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder collectionId(@Nullable Output<String> collectionId) {
            $.collectionId = collectionId;
            return this;
        }

        /**
         * @param collectionId The name of the collection
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder collectionId(String collectionId) {
            return collectionId(Output.of(collectionId));
        }

        /**
         * @param faceModelVersion The Face Model Version that the collection was initialized with
         * 
         * @return builder
         * 
         */
        public Builder faceModelVersion(@Nullable Output<String> faceModelVersion) {
            $.faceModelVersion = faceModelVersion;
            return this;
        }

        /**
         * @param faceModelVersion The Face Model Version that the collection was initialized with
         * 
         * @return builder
         * 
         */
        public Builder faceModelVersion(String faceModelVersion) {
            return faceModelVersion(Output.of(faceModelVersion));
        }

        /**
         * @param tags A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder timeouts(@Nullable Output<CollectionTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(CollectionTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public CollectionState build() {
            return $;
        }
    }

}
