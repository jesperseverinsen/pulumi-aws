// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securitylake;

import com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs;
import com.pulumi.aws.securitylake.inputs.DataLakeTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataLakeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataLakeArgs Empty = new DataLakeArgs();

    /**
     * Specify the Region or Regions that will contribute data to the rollup region.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<DataLakeConfigurationArgs> configuration;

    /**
     * @return Specify the Region or Regions that will contribute data to the rollup region.
     * 
     */
    public Optional<Output<DataLakeConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
     * 
     */
    @Import(name="metaStoreManagerRoleArn", required=true)
    private Output<String> metaStoreManagerRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
     * 
     */
    public Output<String> metaStoreManagerRoleArn() {
        return this.metaStoreManagerRoleArn;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="timeouts")
    private @Nullable Output<DataLakeTimeoutsArgs> timeouts;

    public Optional<Output<DataLakeTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private DataLakeArgs() {}

    private DataLakeArgs(DataLakeArgs $) {
        this.configuration = $.configuration;
        this.metaStoreManagerRoleArn = $.metaStoreManagerRoleArn;
        this.tags = $.tags;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakeArgs $;

        public Builder() {
            $ = new DataLakeArgs();
        }

        public Builder(DataLakeArgs defaults) {
            $ = new DataLakeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration Specify the Region or Regions that will contribute data to the rollup region.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<DataLakeConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Specify the Region or Regions that will contribute data to the rollup region.
         * 
         * @return builder
         * 
         */
        public Builder configuration(DataLakeConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param metaStoreManagerRoleArn The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
         * 
         * @return builder
         * 
         */
        public Builder metaStoreManagerRoleArn(Output<String> metaStoreManagerRoleArn) {
            $.metaStoreManagerRoleArn = metaStoreManagerRoleArn;
            return this;
        }

        /**
         * @param metaStoreManagerRoleArn The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
         * 
         * @return builder
         * 
         */
        public Builder metaStoreManagerRoleArn(String metaStoreManagerRoleArn) {
            return metaStoreManagerRoleArn(Output.of(metaStoreManagerRoleArn));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder timeouts(@Nullable Output<DataLakeTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(DataLakeTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public DataLakeArgs build() {
            if ($.metaStoreManagerRoleArn == null) {
                throw new MissingRequiredPropertyException("DataLakeArgs", "metaStoreManagerRoleArn");
            }
            return $;
        }
    }

}
