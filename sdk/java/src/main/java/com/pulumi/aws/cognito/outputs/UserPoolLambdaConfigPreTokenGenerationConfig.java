// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserPoolLambdaConfigPreTokenGenerationConfig {
    /**
     * @return The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send email notifications to users.
     * 
     */
    private String lambdaArn;
    /**
     * @return The Lambda version represents the signature of the &#34;request&#34; attribute in the &#34;event&#34; information Amazon Cognito passes to your custom email Lambda function. The only supported value is `V1_0`.
     * 
     */
    private String lambdaVersion;

    private UserPoolLambdaConfigPreTokenGenerationConfig() {}
    /**
     * @return The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send email notifications to users.
     * 
     */
    public String lambdaArn() {
        return this.lambdaArn;
    }
    /**
     * @return The Lambda version represents the signature of the &#34;request&#34; attribute in the &#34;event&#34; information Amazon Cognito passes to your custom email Lambda function. The only supported value is `V1_0`.
     * 
     */
    public String lambdaVersion() {
        return this.lambdaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolLambdaConfigPreTokenGenerationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lambdaArn;
        private String lambdaVersion;
        public Builder() {}
        public Builder(UserPoolLambdaConfigPreTokenGenerationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaArn = defaults.lambdaArn;
    	      this.lambdaVersion = defaults.lambdaVersion;
        }

        @CustomType.Setter
        public Builder lambdaArn(String lambdaArn) {
            if (lambdaArn == null) {
              throw new MissingRequiredPropertyException("UserPoolLambdaConfigPreTokenGenerationConfig", "lambdaArn");
            }
            this.lambdaArn = lambdaArn;
            return this;
        }
        @CustomType.Setter
        public Builder lambdaVersion(String lambdaVersion) {
            if (lambdaVersion == null) {
              throw new MissingRequiredPropertyException("UserPoolLambdaConfigPreTokenGenerationConfig", "lambdaVersion");
            }
            this.lambdaVersion = lambdaVersion;
            return this;
        }
        public UserPoolLambdaConfigPreTokenGenerationConfig build() {
            final var _resultValue = new UserPoolLambdaConfigPreTokenGenerationConfig();
            _resultValue.lambdaArn = lambdaArn;
            _resultValue.lambdaVersion = lambdaVersion;
            return _resultValue;
        }
    }
}
