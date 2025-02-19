// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearchingest.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class PipelineBufferOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineBufferOptionsArgs Empty = new PipelineBufferOptionsArgs();

    /**
     * Whether persistent buffering should be enabled.
     * 
     */
    @Import(name="persistentBufferEnabled", required=true)
    private Output<Boolean> persistentBufferEnabled;

    /**
     * @return Whether persistent buffering should be enabled.
     * 
     */
    public Output<Boolean> persistentBufferEnabled() {
        return this.persistentBufferEnabled;
    }

    private PipelineBufferOptionsArgs() {}

    private PipelineBufferOptionsArgs(PipelineBufferOptionsArgs $) {
        this.persistentBufferEnabled = $.persistentBufferEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineBufferOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineBufferOptionsArgs $;

        public Builder() {
            $ = new PipelineBufferOptionsArgs();
        }

        public Builder(PipelineBufferOptionsArgs defaults) {
            $ = new PipelineBufferOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param persistentBufferEnabled Whether persistent buffering should be enabled.
         * 
         * @return builder
         * 
         */
        public Builder persistentBufferEnabled(Output<Boolean> persistentBufferEnabled) {
            $.persistentBufferEnabled = persistentBufferEnabled;
            return this;
        }

        /**
         * @param persistentBufferEnabled Whether persistent buffering should be enabled.
         * 
         * @return builder
         * 
         */
        public Builder persistentBufferEnabled(Boolean persistentBufferEnabled) {
            return persistentBufferEnabled(Output.of(persistentBufferEnabled));
        }

        public PipelineBufferOptionsArgs build() {
            if ($.persistentBufferEnabled == null) {
                throw new MissingRequiredPropertyException("PipelineBufferOptionsArgs", "persistentBufferEnabled");
            }
            return $;
        }
    }

}
