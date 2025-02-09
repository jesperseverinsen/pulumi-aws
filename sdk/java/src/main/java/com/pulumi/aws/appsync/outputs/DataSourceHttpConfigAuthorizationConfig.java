// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.aws.appsync.outputs.DataSourceHttpConfigAuthorizationConfigAwsIamConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceHttpConfigAuthorizationConfig {
    /**
     * @return Authorization type that the HTTP endpoint requires. Default values is `AWS_IAM`.
     * 
     */
    private @Nullable String authorizationType;
    /**
     * @return Identity and Access Management (IAM) settings. See AWS IAM Config.
     * 
     */
    private @Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfig awsIamConfig;

    private DataSourceHttpConfigAuthorizationConfig() {}
    /**
     * @return Authorization type that the HTTP endpoint requires. Default values is `AWS_IAM`.
     * 
     */
    public Optional<String> authorizationType() {
        return Optional.ofNullable(this.authorizationType);
    }
    /**
     * @return Identity and Access Management (IAM) settings. See AWS IAM Config.
     * 
     */
    public Optional<DataSourceHttpConfigAuthorizationConfigAwsIamConfig> awsIamConfig() {
        return Optional.ofNullable(this.awsIamConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfigAuthorizationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authorizationType;
        private @Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfig awsIamConfig;
        public Builder() {}
        public Builder(DataSourceHttpConfigAuthorizationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.awsIamConfig = defaults.awsIamConfig;
        }

        @CustomType.Setter
        public Builder authorizationType(@Nullable String authorizationType) {

            this.authorizationType = authorizationType;
            return this;
        }
        @CustomType.Setter
        public Builder awsIamConfig(@Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfig awsIamConfig) {

            this.awsIamConfig = awsIamConfig;
            return this;
        }
        public DataSourceHttpConfigAuthorizationConfig build() {
            final var _resultValue = new DataSourceHttpConfigAuthorizationConfig();
            _resultValue.authorizationType = authorizationType;
            _resultValue.awsIamConfig = awsIamConfig;
            return _resultValue;
        }
    }
}
