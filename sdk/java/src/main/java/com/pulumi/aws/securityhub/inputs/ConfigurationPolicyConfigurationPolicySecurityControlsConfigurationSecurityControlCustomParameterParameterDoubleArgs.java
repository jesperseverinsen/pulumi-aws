// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;


public final class ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs Empty = new ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs();

    @Import(name="value", required=true)
    private Output<Double> value;

    public Output<Double> value() {
        return this.value;
    }

    private ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs() {}

    private ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs $;

        public Builder() {
            $ = new ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs();
        }

        public Builder(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs defaults) {
            $ = new ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<Double> value) {
            $.value = value;
            return this;
        }

        public Builder value(Double value) {
            return value(Output.of(value));
        }

        public ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs", "value");
            }
            return $;
        }
    }

}
