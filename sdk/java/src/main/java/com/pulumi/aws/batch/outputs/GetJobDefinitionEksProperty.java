// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetJobDefinitionEksProperty {
    /**
     * @return The properties for the Kubernetes pod resources of a job.
     * 
     */
    private List<Object> podProperties;

    private GetJobDefinitionEksProperty() {}
    /**
     * @return The properties for the Kubernetes pod resources of a job.
     * 
     */
    public List<Object> podProperties() {
        return this.podProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobDefinitionEksProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Object> podProperties;
        public Builder() {}
        public Builder(GetJobDefinitionEksProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podProperties = defaults.podProperties;
        }

        @CustomType.Setter
        public Builder podProperties(List<Object> podProperties) {
            if (podProperties == null) {
              throw new MissingRequiredPropertyException("GetJobDefinitionEksProperty", "podProperties");
            }
            this.podProperties = podProperties;
            return this;
        }
        public Builder podProperties(Object... podProperties) {
            return podProperties(List.of(podProperties));
        }
        public GetJobDefinitionEksProperty build() {
            final var _resultValue = new GetJobDefinitionEksProperty();
            _resultValue.podProperties = podProperties;
            return _resultValue;
        }
    }
}
