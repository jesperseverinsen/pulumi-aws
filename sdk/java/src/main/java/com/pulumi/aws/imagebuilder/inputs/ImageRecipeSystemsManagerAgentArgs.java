// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class ImageRecipeSystemsManagerAgentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRecipeSystemsManagerAgentArgs Empty = new ImageRecipeSystemsManagerAgentArgs();

    /**
     * Whether to remove the Systems Manager Agent after the image has been built. Defaults to `false`.
     * 
     */
    @Import(name="uninstallAfterBuild", required=true)
    private Output<Boolean> uninstallAfterBuild;

    /**
     * @return Whether to remove the Systems Manager Agent after the image has been built. Defaults to `false`.
     * 
     */
    public Output<Boolean> uninstallAfterBuild() {
        return this.uninstallAfterBuild;
    }

    private ImageRecipeSystemsManagerAgentArgs() {}

    private ImageRecipeSystemsManagerAgentArgs(ImageRecipeSystemsManagerAgentArgs $) {
        this.uninstallAfterBuild = $.uninstallAfterBuild;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRecipeSystemsManagerAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRecipeSystemsManagerAgentArgs $;

        public Builder() {
            $ = new ImageRecipeSystemsManagerAgentArgs();
        }

        public Builder(ImageRecipeSystemsManagerAgentArgs defaults) {
            $ = new ImageRecipeSystemsManagerAgentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uninstallAfterBuild Whether to remove the Systems Manager Agent after the image has been built. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder uninstallAfterBuild(Output<Boolean> uninstallAfterBuild) {
            $.uninstallAfterBuild = uninstallAfterBuild;
            return this;
        }

        /**
         * @param uninstallAfterBuild Whether to remove the Systems Manager Agent after the image has been built. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder uninstallAfterBuild(Boolean uninstallAfterBuild) {
            return uninstallAfterBuild(Output.of(uninstallAfterBuild));
        }

        public ImageRecipeSystemsManagerAgentArgs build() {
            if ($.uninstallAfterBuild == null) {
                throw new MissingRequiredPropertyException("ImageRecipeSystemsManagerAgentArgs", "uninstallAfterBuild");
            }
            return $;
        }
    }

}
