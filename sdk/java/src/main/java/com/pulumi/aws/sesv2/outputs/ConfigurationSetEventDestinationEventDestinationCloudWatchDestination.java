// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.outputs;

import com.pulumi.aws.sesv2.outputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfiguration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConfigurationSetEventDestinationEventDestinationCloudWatchDestination {
    /**
     * @return An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See dimension_configuration below.
     * 
     */
    private List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfiguration> dimensionConfigurations;

    private ConfigurationSetEventDestinationEventDestinationCloudWatchDestination() {}
    /**
     * @return An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See dimension_configuration below.
     * 
     */
    public List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfiguration> dimensionConfigurations() {
        return this.dimensionConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSetEventDestinationEventDestinationCloudWatchDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfiguration> dimensionConfigurations;
        public Builder() {}
        public Builder(ConfigurationSetEventDestinationEventDestinationCloudWatchDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionConfigurations = defaults.dimensionConfigurations;
        }

        @CustomType.Setter
        public Builder dimensionConfigurations(List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfiguration> dimensionConfigurations) {
            if (dimensionConfigurations == null) {
              throw new MissingRequiredPropertyException("ConfigurationSetEventDestinationEventDestinationCloudWatchDestination", "dimensionConfigurations");
            }
            this.dimensionConfigurations = dimensionConfigurations;
            return this;
        }
        public Builder dimensionConfigurations(ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfiguration... dimensionConfigurations) {
            return dimensionConfigurations(List.of(dimensionConfigurations));
        }
        public ConfigurationSetEventDestinationEventDestinationCloudWatchDestination build() {
            final var _resultValue = new ConfigurationSetEventDestinationEventDestinationCloudWatchDestination();
            _resultValue.dimensionConfigurations = dimensionConfigurations;
            return _resultValue;
        }
    }
}
