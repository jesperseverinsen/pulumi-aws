// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationVpcConfiguration {
    /**
     * @return The Security Group IDs used by the VPC configuration.
     * 
     */
    private List<String> securityGroupIds;
    /**
     * @return The Subnet IDs used by the VPC configuration.
     * 
     */
    private List<String> subnetIds;
    private @Nullable String vpcConfigurationId;
    private @Nullable String vpcId;

    private ApplicationApplicationConfigurationVpcConfiguration() {}
    /**
     * @return The Security Group IDs used by the VPC configuration.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return The Subnet IDs used by the VPC configuration.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    public Optional<String> vpcConfigurationId() {
        return Optional.ofNullable(this.vpcConfigurationId);
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationVpcConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcConfigurationId;
        private @Nullable String vpcId;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcConfigurationId = defaults.vpcConfigurationId;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder securityGroupIds(List<String> securityGroupIds) {
            if (securityGroupIds == null) {
              throw new MissingRequiredPropertyException("ApplicationApplicationConfigurationVpcConfiguration", "securityGroupIds");
            }
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            if (subnetIds == null) {
              throw new MissingRequiredPropertyException("ApplicationApplicationConfigurationVpcConfiguration", "subnetIds");
            }
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder vpcConfigurationId(@Nullable String vpcConfigurationId) {

            this.vpcConfigurationId = vpcConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(@Nullable String vpcId) {

            this.vpcId = vpcId;
            return this;
        }
        public ApplicationApplicationConfigurationVpcConfiguration build() {
            final var _resultValue = new ApplicationApplicationConfigurationVpcConfiguration();
            _resultValue.securityGroupIds = securityGroupIds;
            _resultValue.subnetIds = subnetIds;
            _resultValue.vpcConfigurationId = vpcConfigurationId;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
