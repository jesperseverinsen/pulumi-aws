// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs Empty = new JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs();

    /**
     * Specifies the name of the job definition.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the job definition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the environment variable.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the environment variable.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs() {}

    private JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs(JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs $;

        public Builder() {
            $ = new JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs();
        }

        public Builder(JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs defaults) {
            $ = new JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the job definition.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the job definition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("JobDefinitionEksPropertiesPodPropertiesContainersEnvArgs", "value");
            }
            return $;
        }
    }

}
