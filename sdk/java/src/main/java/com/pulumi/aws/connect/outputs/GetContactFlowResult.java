// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetContactFlowResult {
    /**
     * @return ARN of the Contact Flow.
     * 
     */
    private String arn;
    private String contactFlowId;
    /**
     * @return Logic of the Contact Flow.
     * 
     */
    private String content;
    /**
     * @return Description of the Contact Flow.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    private String name;
    /**
     * @return Tags to assign to the Contact Flow.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Type of Contact Flow.
     * 
     */
    private @Nullable String type;

    private GetContactFlowResult() {}
    /**
     * @return ARN of the Contact Flow.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public String contactFlowId() {
        return this.contactFlowId;
    }
    /**
     * @return Logic of the Contact Flow.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return Description of the Contact Flow.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Tags to assign to the Contact Flow.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Type of Contact Flow.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactFlowResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String contactFlowId;
        private String content;
        private String description;
        private String id;
        private String instanceId;
        private String name;
        private Map<String,String> tags;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetContactFlowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.content = defaults.content;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder contactFlowId(String contactFlowId) {
            if (contactFlowId == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "contactFlowId");
            }
            this.contactFlowId = contactFlowId;
            return this;
        }
        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetContactFlowResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetContactFlowResult build() {
            final var _resultValue = new GetContactFlowResult();
            _resultValue.arn = arn;
            _resultValue.contactFlowId = contactFlowId;
            _resultValue.content = content;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.name = name;
            _resultValue.tags = tags;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
