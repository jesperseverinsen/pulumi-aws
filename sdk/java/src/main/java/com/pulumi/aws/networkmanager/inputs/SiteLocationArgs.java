// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SiteLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SiteLocationArgs Empty = new SiteLocationArgs();

    /**
     * Address of the location.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Address of the location.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Latitude of the location.
     * 
     */
    @Import(name="latitude")
    private @Nullable Output<String> latitude;

    /**
     * @return Latitude of the location.
     * 
     */
    public Optional<Output<String>> latitude() {
        return Optional.ofNullable(this.latitude);
    }

    /**
     * Longitude of the location.
     * 
     */
    @Import(name="longitude")
    private @Nullable Output<String> longitude;

    /**
     * @return Longitude of the location.
     * 
     */
    public Optional<Output<String>> longitude() {
        return Optional.ofNullable(this.longitude);
    }

    private SiteLocationArgs() {}

    private SiteLocationArgs(SiteLocationArgs $) {
        this.address = $.address;
        this.latitude = $.latitude;
        this.longitude = $.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteLocationArgs $;

        public Builder() {
            $ = new SiteLocationArgs();
        }

        public Builder(SiteLocationArgs defaults) {
            $ = new SiteLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Address of the location.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Address of the location.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param latitude Latitude of the location.
         * 
         * @return builder
         * 
         */
        public Builder latitude(@Nullable Output<String> latitude) {
            $.latitude = latitude;
            return this;
        }

        /**
         * @param latitude Latitude of the location.
         * 
         * @return builder
         * 
         */
        public Builder latitude(String latitude) {
            return latitude(Output.of(latitude));
        }

        /**
         * @param longitude Longitude of the location.
         * 
         * @return builder
         * 
         */
        public Builder longitude(@Nullable Output<String> longitude) {
            $.longitude = longitude;
            return this;
        }

        /**
         * @param longitude Longitude of the location.
         * 
         * @return builder
         * 
         */
        public Builder longitude(String longitude) {
            return longitude(Output.of(longitude));
        }

        public SiteLocationArgs build() {
            return $;
        }
    }

}
