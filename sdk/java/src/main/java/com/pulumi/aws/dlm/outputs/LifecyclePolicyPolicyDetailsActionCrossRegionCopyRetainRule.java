// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule {
    /**
     * @return How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values. Conflicts with `cron_expression`. If set, `interval_unit` and `times` must also be set.
     * 
     */
    private Integer interval;
    /**
     * @return The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value. Conflicts with `cron_expression`. Must be set if `interval` is set.
     * 
     */
    private String intervalUnit;

    private LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule() {}
    /**
     * @return How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values. Conflicts with `cron_expression`. If set, `interval_unit` and `times` must also be set.
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value. Conflicts with `cron_expression`. Must be set if `interval` is set.
     * 
     */
    public String intervalUnit() {
        return this.intervalUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer interval;
        private String intervalUnit;
        public Builder() {}
        public Builder(LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
        }

        @CustomType.Setter
        public Builder interval(Integer interval) {
            if (interval == null) {
              throw new MissingRequiredPropertyException("LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule", "interval");
            }
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder intervalUnit(String intervalUnit) {
            if (intervalUnit == null) {
              throw new MissingRequiredPropertyException("LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule", "intervalUnit");
            }
            this.intervalUnit = intervalUnit;
            return this;
        }
        public LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule build() {
            final var _resultValue = new LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule();
            _resultValue.interval = interval;
            _resultValue.intervalUnit = intervalUnit;
            return _resultValue;
        }
    }
}
