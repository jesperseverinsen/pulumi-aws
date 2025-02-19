// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final LinkAssociationState Empty = new LinkAssociationState();

    /**
     * The ID of the device.
     * 
     */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return The ID of the device.
     * 
     */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId")
    private @Nullable Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Optional<Output<String>> globalNetworkId() {
        return Optional.ofNullable(this.globalNetworkId);
    }

    /**
     * The ID of the link.
     * 
     */
    @Import(name="linkId")
    private @Nullable Output<String> linkId;

    /**
     * @return The ID of the link.
     * 
     */
    public Optional<Output<String>> linkId() {
        return Optional.ofNullable(this.linkId);
    }

    private LinkAssociationState() {}

    private LinkAssociationState(LinkAssociationState $) {
        this.deviceId = $.deviceId;
        this.globalNetworkId = $.globalNetworkId;
        this.linkId = $.linkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkAssociationState $;

        public Builder() {
            $ = new LinkAssociationState();
        }

        public Builder(LinkAssociationState defaults) {
            $ = new LinkAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId The ID of the device.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId The ID of the device.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(@Nullable Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param linkId The ID of the link.
         * 
         * @return builder
         * 
         */
        public Builder linkId(@Nullable Output<String> linkId) {
            $.linkId = linkId;
            return this;
        }

        /**
         * @param linkId The ID of the link.
         * 
         * @return builder
         * 
         */
        public Builder linkId(String linkId) {
            return linkId(Output.of(linkId));
        }

        public LinkAssociationState build() {
            return $;
        }
    }

}
