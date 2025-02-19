// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class UserPoolUsernameConfiguration {
    /**
     * @return Whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
     * 
     */
    private Boolean caseSensitive;

    private UserPoolUsernameConfiguration() {}
    /**
     * @return Whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
     * 
     */
    public Boolean caseSensitive() {
        return this.caseSensitive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUsernameConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean caseSensitive;
        public Builder() {}
        public Builder(UserPoolUsernameConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
        }

        @CustomType.Setter
        public Builder caseSensitive(Boolean caseSensitive) {
            if (caseSensitive == null) {
              throw new MissingRequiredPropertyException("UserPoolUsernameConfiguration", "caseSensitive");
            }
            this.caseSensitive = caseSensitive;
            return this;
        }
        public UserPoolUsernameConfiguration build() {
            final var _resultValue = new UserPoolUsernameConfiguration();
            _resultValue.caseSensitive = caseSensitive;
            return _resultValue;
        }
    }
}
