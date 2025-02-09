// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class PlanAdvancedBackupSetting {
    /**
     * @return Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Set to `{ WindowsVSS = &#34;enabled&#34; }` to enable Windows VSS backup option and create a VSS Windows backup.
     * 
     */
    private Map<String,String> backupOptions;
    /**
     * @return The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon EC2. Valid values: `EC2`.
     * 
     */
    private String resourceType;

    private PlanAdvancedBackupSetting() {}
    /**
     * @return Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Set to `{ WindowsVSS = &#34;enabled&#34; }` to enable Windows VSS backup option and create a VSS Windows backup.
     * 
     */
    public Map<String,String> backupOptions() {
        return this.backupOptions;
    }
    /**
     * @return The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon EC2. Valid values: `EC2`.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanAdvancedBackupSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> backupOptions;
        private String resourceType;
        public Builder() {}
        public Builder(PlanAdvancedBackupSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupOptions = defaults.backupOptions;
    	      this.resourceType = defaults.resourceType;
        }

        @CustomType.Setter
        public Builder backupOptions(Map<String,String> backupOptions) {
            if (backupOptions == null) {
              throw new MissingRequiredPropertyException("PlanAdvancedBackupSetting", "backupOptions");
            }
            this.backupOptions = backupOptions;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("PlanAdvancedBackupSetting", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        public PlanAdvancedBackupSetting build() {
            final var _resultValue = new PlanAdvancedBackupSetting();
            _resultValue.backupOptions = backupOptions;
            _resultValue.resourceType = resourceType;
            return _resultValue;
        }
    }
}
