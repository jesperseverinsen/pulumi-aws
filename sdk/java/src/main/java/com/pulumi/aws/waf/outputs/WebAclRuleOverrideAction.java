// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleOverrideAction {
    /**
     * @return Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
     * e.g., `ALLOW` or `BLOCK`
     * 
     */
    private String type;

    private WebAclRuleOverrideAction() {}
    /**
     * @return Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
     * e.g., `ALLOW` or `BLOCK`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleOverrideAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(WebAclRuleOverrideAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("WebAclRuleOverrideAction", "type");
            }
            this.type = type;
            return this;
        }
        public WebAclRuleOverrideAction build() {
            final var _resultValue = new WebAclRuleOverrideAction();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
