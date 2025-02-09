// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.aws.quicksight.outputs.GetDataSetPhysicalTableMapS3SourceInputColumn;
import com.pulumi.aws.quicksight.outputs.GetDataSetPhysicalTableMapS3SourceUploadSetting;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataSetPhysicalTableMapS3Source {
    private String dataSourceArn;
    private List<GetDataSetPhysicalTableMapS3SourceInputColumn> inputColumns;
    private List<GetDataSetPhysicalTableMapS3SourceUploadSetting> uploadSettings;

    private GetDataSetPhysicalTableMapS3Source() {}
    public String dataSourceArn() {
        return this.dataSourceArn;
    }
    public List<GetDataSetPhysicalTableMapS3SourceInputColumn> inputColumns() {
        return this.inputColumns;
    }
    public List<GetDataSetPhysicalTableMapS3SourceUploadSetting> uploadSettings() {
        return this.uploadSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSetPhysicalTableMapS3Source defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dataSourceArn;
        private List<GetDataSetPhysicalTableMapS3SourceInputColumn> inputColumns;
        private List<GetDataSetPhysicalTableMapS3SourceUploadSetting> uploadSettings;
        public Builder() {}
        public Builder(GetDataSetPhysicalTableMapS3Source defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceArn = defaults.dataSourceArn;
    	      this.inputColumns = defaults.inputColumns;
    	      this.uploadSettings = defaults.uploadSettings;
        }

        @CustomType.Setter
        public Builder dataSourceArn(String dataSourceArn) {
            if (dataSourceArn == null) {
              throw new MissingRequiredPropertyException("GetDataSetPhysicalTableMapS3Source", "dataSourceArn");
            }
            this.dataSourceArn = dataSourceArn;
            return this;
        }
        @CustomType.Setter
        public Builder inputColumns(List<GetDataSetPhysicalTableMapS3SourceInputColumn> inputColumns) {
            if (inputColumns == null) {
              throw new MissingRequiredPropertyException("GetDataSetPhysicalTableMapS3Source", "inputColumns");
            }
            this.inputColumns = inputColumns;
            return this;
        }
        public Builder inputColumns(GetDataSetPhysicalTableMapS3SourceInputColumn... inputColumns) {
            return inputColumns(List.of(inputColumns));
        }
        @CustomType.Setter
        public Builder uploadSettings(List<GetDataSetPhysicalTableMapS3SourceUploadSetting> uploadSettings) {
            if (uploadSettings == null) {
              throw new MissingRequiredPropertyException("GetDataSetPhysicalTableMapS3Source", "uploadSettings");
            }
            this.uploadSettings = uploadSettings;
            return this;
        }
        public Builder uploadSettings(GetDataSetPhysicalTableMapS3SourceUploadSetting... uploadSettings) {
            return uploadSettings(List.of(uploadSettings));
        }
        public GetDataSetPhysicalTableMapS3Source build() {
            final var _resultValue = new GetDataSetPhysicalTableMapS3Source();
            _resultValue.dataSourceArn = dataSourceArn;
            _resultValue.inputColumns = inputColumns;
            _resultValue.uploadSettings = uploadSettings;
            return _resultValue;
        }
    }
}
