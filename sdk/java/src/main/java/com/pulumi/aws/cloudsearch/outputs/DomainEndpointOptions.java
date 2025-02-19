// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainEndpointOptions {
    /**
     * @return Enables or disables the requirement that all requests to the domain arrive over HTTPS.
     * 
     */
    private @Nullable Boolean enforceHttps;
    /**
     * @return The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
     * 
     */
    private @Nullable String tlsSecurityPolicy;

    private DomainEndpointOptions() {}
    /**
     * @return Enables or disables the requirement that all requests to the domain arrive over HTTPS.
     * 
     */
    public Optional<Boolean> enforceHttps() {
        return Optional.ofNullable(this.enforceHttps);
    }
    /**
     * @return The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
     * 
     */
    public Optional<String> tlsSecurityPolicy() {
        return Optional.ofNullable(this.tlsSecurityPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEndpointOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enforceHttps;
        private @Nullable String tlsSecurityPolicy;
        public Builder() {}
        public Builder(DomainEndpointOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforceHttps = defaults.enforceHttps;
    	      this.tlsSecurityPolicy = defaults.tlsSecurityPolicy;
        }

        @CustomType.Setter
        public Builder enforceHttps(@Nullable Boolean enforceHttps) {

            this.enforceHttps = enforceHttps;
            return this;
        }
        @CustomType.Setter
        public Builder tlsSecurityPolicy(@Nullable String tlsSecurityPolicy) {

            this.tlsSecurityPolicy = tlsSecurityPolicy;
            return this;
        }
        public DomainEndpointOptions build() {
            final var _resultValue = new DomainEndpointOptions();
            _resultValue.enforceHttps = enforceHttps;
            _resultValue.tlsSecurityPolicy = tlsSecurityPolicy;
            return _resultValue;
        }
    }
}
