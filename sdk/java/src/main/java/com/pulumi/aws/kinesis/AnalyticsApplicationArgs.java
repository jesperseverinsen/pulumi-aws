// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationCloudwatchLoggingOptionsArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationArgs Empty = new AnalyticsApplicationArgs();

    /**
     * The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
    private @Nullable Output<AnalyticsApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    /**
     * @return The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationCloudwatchLoggingOptionsArgs>> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }

    /**
     * SQL Code to transform input data, and generate output.
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return SQL Code to transform input data, and generate output.
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Description of the application.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the application.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Input configuration of the application. See Inputs below for more details.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<AnalyticsApplicationInputsArgs> inputs;

    /**
     * @return Input configuration of the application. See Inputs below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationInputsArgs>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * Name of the Kinesis Analytics Application.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Kinesis Analytics Application.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Output destination configuration of the application. See Outputs below for more details.
     * 
     */
    @Import(name="outputs")
    private @Nullable Output<List<AnalyticsApplicationOutputArgs>> outputs;

    /**
     * @return Output destination configuration of the application. See Outputs below for more details.
     * 
     */
    public Optional<Output<List<AnalyticsApplicationOutputArgs>>> outputs() {
        return Optional.ofNullable(this.outputs);
    }

    /**
     * An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     * 
     */
    @Import(name="referenceDataSources")
    private @Nullable Output<AnalyticsApplicationReferenceDataSourcesArgs> referenceDataSources;

    /**
     * @return An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationReferenceDataSourcesArgs>> referenceDataSources() {
        return Optional.ofNullable(this.referenceDataSources);
    }

    /**
     * Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
     * To modify an application&#39;s starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
     * 
     */
    @Import(name="startApplication")
    private @Nullable Output<Boolean> startApplication;

    /**
     * @return Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
     * To modify an application&#39;s starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
     * 
     */
    public Optional<Output<Boolean>> startApplication() {
        return Optional.ofNullable(this.startApplication);
    }

    /**
     * Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AnalyticsApplicationArgs() {}

    private AnalyticsApplicationArgs(AnalyticsApplicationArgs $) {
        this.cloudwatchLoggingOptions = $.cloudwatchLoggingOptions;
        this.code = $.code;
        this.description = $.description;
        this.inputs = $.inputs;
        this.name = $.name;
        this.outputs = $.outputs;
        this.referenceDataSources = $.referenceDataSources;
        this.startApplication = $.startApplication;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationArgs $;

        public Builder() {
            $ = new AnalyticsApplicationArgs();
        }

        public Builder(AnalyticsApplicationArgs defaults) {
            $ = new AnalyticsApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchLoggingOptions The CloudWatch log stream options to monitor application errors.
         * See CloudWatch Logging Options below for more details.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLoggingOptions(@Nullable Output<AnalyticsApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            $.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        /**
         * @param cloudwatchLoggingOptions The CloudWatch log stream options to monitor application errors.
         * See CloudWatch Logging Options below for more details.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLoggingOptions(AnalyticsApplicationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            return cloudwatchLoggingOptions(Output.of(cloudwatchLoggingOptions));
        }

        /**
         * @param code SQL Code to transform input data, and generate output.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code SQL Code to transform input data, and generate output.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        /**
         * @param description Description of the application.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the application.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param inputs Input configuration of the application. See Inputs below for more details.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<AnalyticsApplicationInputsArgs> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs Input configuration of the application. See Inputs below for more details.
         * 
         * @return builder
         * 
         */
        public Builder inputs(AnalyticsApplicationInputsArgs inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param name Name of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputs Output destination configuration of the application. See Outputs below for more details.
         * 
         * @return builder
         * 
         */
        public Builder outputs(@Nullable Output<List<AnalyticsApplicationOutputArgs>> outputs) {
            $.outputs = outputs;
            return this;
        }

        /**
         * @param outputs Output destination configuration of the application. See Outputs below for more details.
         * 
         * @return builder
         * 
         */
        public Builder outputs(List<AnalyticsApplicationOutputArgs> outputs) {
            return outputs(Output.of(outputs));
        }

        /**
         * @param outputs Output destination configuration of the application. See Outputs below for more details.
         * 
         * @return builder
         * 
         */
        public Builder outputs(AnalyticsApplicationOutputArgs... outputs) {
            return outputs(List.of(outputs));
        }

        /**
         * @param referenceDataSources An S3 Reference Data Source for the application.
         * See Reference Data Sources below for more details.
         * 
         * @return builder
         * 
         */
        public Builder referenceDataSources(@Nullable Output<AnalyticsApplicationReferenceDataSourcesArgs> referenceDataSources) {
            $.referenceDataSources = referenceDataSources;
            return this;
        }

        /**
         * @param referenceDataSources An S3 Reference Data Source for the application.
         * See Reference Data Sources below for more details.
         * 
         * @return builder
         * 
         */
        public Builder referenceDataSources(AnalyticsApplicationReferenceDataSourcesArgs referenceDataSources) {
            return referenceDataSources(Output.of(referenceDataSources));
        }

        /**
         * @param startApplication Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
         * To modify an application&#39;s starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
         * 
         * @return builder
         * 
         */
        public Builder startApplication(@Nullable Output<Boolean> startApplication) {
            $.startApplication = startApplication;
            return this;
        }

        /**
         * @param startApplication Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
         * To modify an application&#39;s starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
         * 
         * @return builder
         * 
         */
        public Builder startApplication(Boolean startApplication) {
            return startApplication(Output.of(startApplication));
        }

        /**
         * @param tags Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AnalyticsApplicationArgs build() {
            return $;
        }
    }

}
