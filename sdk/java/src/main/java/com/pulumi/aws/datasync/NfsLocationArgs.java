// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.datasync.inputs.NfsLocationMountOptionsArgs;
import com.pulumi.aws.datasync.inputs.NfsLocationOnPremConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NfsLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NfsLocationArgs Empty = new NfsLocationArgs();

    /**
     * Configuration block containing mount options used by DataSync to access the NFS Server.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<NfsLocationMountOptionsArgs> mountOptions;

    /**
     * @return Configuration block containing mount options used by DataSync to access the NFS Server.
     * 
     */
    public Optional<Output<NfsLocationMountOptionsArgs>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * Configuration block containing information for connecting to the NFS File System.
     * 
     */
    @Import(name="onPremConfig", required=true)
    private Output<NfsLocationOnPremConfigArgs> onPremConfig;

    /**
     * @return Configuration block containing information for connecting to the NFS File System.
     * 
     */
    public Output<NfsLocationOnPremConfigArgs> onPremConfig() {
        return this.onPremConfig;
    }

    /**
     * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
     * 
     */
    @Import(name="serverHostname", required=true)
    private Output<String> serverHostname;

    /**
     * @return Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
     * 
     */
    public Output<String> serverHostname() {
        return this.serverHostname;
    }

    /**
     * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
     * 
     */
    @Import(name="subdirectory", required=true)
    private Output<String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
     * 
     */
    public Output<String> subdirectory() {
        return this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NfsLocationArgs() {}

    private NfsLocationArgs(NfsLocationArgs $) {
        this.mountOptions = $.mountOptions;
        this.onPremConfig = $.onPremConfig;
        this.serverHostname = $.serverHostname;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NfsLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NfsLocationArgs $;

        public Builder() {
            $ = new NfsLocationArgs();
        }

        public Builder(NfsLocationArgs defaults) {
            $ = new NfsLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mountOptions Configuration block containing mount options used by DataSync to access the NFS Server.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<NfsLocationMountOptionsArgs> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions Configuration block containing mount options used by DataSync to access the NFS Server.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(NfsLocationMountOptionsArgs mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        /**
         * @param onPremConfig Configuration block containing information for connecting to the NFS File System.
         * 
         * @return builder
         * 
         */
        public Builder onPremConfig(Output<NfsLocationOnPremConfigArgs> onPremConfig) {
            $.onPremConfig = onPremConfig;
            return this;
        }

        /**
         * @param onPremConfig Configuration block containing information for connecting to the NFS File System.
         * 
         * @return builder
         * 
         */
        public Builder onPremConfig(NfsLocationOnPremConfigArgs onPremConfig) {
            return onPremConfig(Output.of(onPremConfig));
        }

        /**
         * @param serverHostname Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
         * 
         * @return builder
         * 
         */
        public Builder serverHostname(Output<String> serverHostname) {
            $.serverHostname = serverHostname;
            return this;
        }

        /**
         * @param serverHostname Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
         * 
         * @return builder
         * 
         */
        public Builder serverHostname(String serverHostname) {
            return serverHostname(Output.of(serverHostname));
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NfsLocationArgs build() {
            if ($.onPremConfig == null) {
                throw new MissingRequiredPropertyException("NfsLocationArgs", "onPremConfig");
            }
            if ($.serverHostname == null) {
                throw new MissingRequiredPropertyException("NfsLocationArgs", "serverHostname");
            }
            if ($.subdirectory == null) {
                throw new MissingRequiredPropertyException("NfsLocationArgs", "subdirectory");
            }
            return $;
        }
    }

}
