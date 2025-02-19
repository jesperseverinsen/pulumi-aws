// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetExperienceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExperienceArgs Empty = new GetExperienceArgs();

    /**
     * Identifier of the Experience.
     * 
     */
    @Import(name="experienceId", required=true)
    private Output<String> experienceId;

    /**
     * @return Identifier of the Experience.
     * 
     */
    public Output<String> experienceId() {
        return this.experienceId;
    }

    /**
     * Identifier of the index that contains the Experience.
     * 
     */
    @Import(name="indexId", required=true)
    private Output<String> indexId;

    /**
     * @return Identifier of the index that contains the Experience.
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }

    private GetExperienceArgs() {}

    private GetExperienceArgs(GetExperienceArgs $) {
        this.experienceId = $.experienceId;
        this.indexId = $.indexId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExperienceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExperienceArgs $;

        public Builder() {
            $ = new GetExperienceArgs();
        }

        public Builder(GetExperienceArgs defaults) {
            $ = new GetExperienceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param experienceId Identifier of the Experience.
         * 
         * @return builder
         * 
         */
        public Builder experienceId(Output<String> experienceId) {
            $.experienceId = experienceId;
            return this;
        }

        /**
         * @param experienceId Identifier of the Experience.
         * 
         * @return builder
         * 
         */
        public Builder experienceId(String experienceId) {
            return experienceId(Output.of(experienceId));
        }

        /**
         * @param indexId Identifier of the index that contains the Experience.
         * 
         * @return builder
         * 
         */
        public Builder indexId(Output<String> indexId) {
            $.indexId = indexId;
            return this;
        }

        /**
         * @param indexId Identifier of the index that contains the Experience.
         * 
         * @return builder
         * 
         */
        public Builder indexId(String indexId) {
            return indexId(Output.of(indexId));
        }

        public GetExperienceArgs build() {
            if ($.experienceId == null) {
                throw new MissingRequiredPropertyException("GetExperienceArgs", "experienceId");
            }
            if ($.indexId == null) {
                throw new MissingRequiredPropertyException("GetExperienceArgs", "indexId");
            }
            return $;
        }
    }

}
