// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LustreFileSystemLogConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LustreFileSystemLogConfigurationArgs Empty = new LustreFileSystemLogConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) that specifies the destination of the logs. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs `/aws/fsx/lustre` log group.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return The Amazon Resource Name (ARN) that specifies the destination of the logs. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs `/aws/fsx/lustre` log group.
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Sets which data repository events are logged by Amazon FSx. Valid values are `WARN_ONLY`, `FAILURE_ONLY`, `ERROR_ONLY`, `WARN_ERROR` and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    @Import(name="level")
    private @Nullable Output<String> level;

    /**
     * @return Sets which data repository events are logged by Amazon FSx. Valid values are `WARN_ONLY`, `FAILURE_ONLY`, `ERROR_ONLY`, `WARN_ERROR` and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    private LustreFileSystemLogConfigurationArgs() {}

    private LustreFileSystemLogConfigurationArgs(LustreFileSystemLogConfigurationArgs $) {
        this.destination = $.destination;
        this.level = $.level;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LustreFileSystemLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LustreFileSystemLogConfigurationArgs $;

        public Builder() {
            $ = new LustreFileSystemLogConfigurationArgs();
        }

        public Builder(LustreFileSystemLogConfigurationArgs defaults) {
            $ = new LustreFileSystemLogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination The Amazon Resource Name (ARN) that specifies the destination of the logs. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs `/aws/fsx/lustre` log group.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The Amazon Resource Name (ARN) that specifies the destination of the logs. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs `/aws/fsx/lustre` log group.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param level Sets which data repository events are logged by Amazon FSx. Valid values are `WARN_ONLY`, `FAILURE_ONLY`, `ERROR_ONLY`, `WARN_ERROR` and `DISABLED`. Default value is `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level Sets which data repository events are logged by Amazon FSx. Valid values are `WARN_ONLY`, `FAILURE_ONLY`, `ERROR_ONLY`, `WARN_ERROR` and `DISABLED`. Default value is `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        public LustreFileSystemLogConfigurationArgs build() {
            return $;
        }
    }

}
