// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight;

import com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcConnectionArgs Empty = new VpcConnectionArgs();

    /**
     * AWS account ID.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return AWS account ID.
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * 
     */
    @Import(name="dnsResolvers")
    private @Nullable Output<List<String>> dnsResolvers;

    /**
     * @return A list of IP addresses of DNS resolver endpoints for the VPC connection.
     * 
     */
    public Optional<Output<List<String>>> dnsResolvers() {
        return Optional.ofNullable(this.dnsResolvers);
    }

    /**
     * The display name for the VPC connection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The display name for the VPC connection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The IAM role to associate with the VPC connection.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The IAM role to associate with the VPC connection.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A list of security group IDs for the VPC connection.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    /**
     * @return A list of security group IDs for the VPC connection.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * A list of subnet IDs for the VPC connection.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return A list of subnet IDs for the VPC connection.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
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
    private @Nullable Output<VpcConnectionTimeoutsArgs> timeouts;

    public Optional<Output<VpcConnectionTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * The ID of the VPC connection.
     * 
     */
    @Import(name="vpcConnectionId", required=true)
    private Output<String> vpcConnectionId;

    /**
     * @return The ID of the VPC connection.
     * 
     */
    public Output<String> vpcConnectionId() {
        return this.vpcConnectionId;
    }

    private VpcConnectionArgs() {}

    private VpcConnectionArgs(VpcConnectionArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.dnsResolvers = $.dnsResolvers;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.timeouts = $.timeouts;
        this.vpcConnectionId = $.vpcConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcConnectionArgs $;

        public Builder() {
            $ = new VpcConnectionArgs();
        }

        public Builder(VpcConnectionArgs defaults) {
            $ = new VpcConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccountId AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolvers(@Nullable Output<List<String>> dnsResolvers) {
            $.dnsResolvers = dnsResolvers;
            return this;
        }

        /**
         * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolvers(List<String> dnsResolvers) {
            return dnsResolvers(Output.of(dnsResolvers));
        }

        /**
         * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolvers(String... dnsResolvers) {
            return dnsResolvers(List.of(dnsResolvers));
        }

        /**
         * @param name The display name for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The display name for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleArn The IAM role to associate with the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The IAM role to associate with the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param securityGroupIds A list of security group IDs for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of security group IDs for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of security group IDs for the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds A list of subnet IDs for the VPC connection.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of subnet IDs for the VPC connection.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of subnet IDs for the VPC connection.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
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

        public Builder timeouts(@Nullable Output<VpcConnectionTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(VpcConnectionTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param vpcConnectionId The ID of the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectionId(Output<String> vpcConnectionId) {
            $.vpcConnectionId = vpcConnectionId;
            return this;
        }

        /**
         * @param vpcConnectionId The ID of the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectionId(String vpcConnectionId) {
            return vpcConnectionId(Output.of(vpcConnectionId));
        }

        public VpcConnectionArgs build() {
            if ($.roleArn == null) {
                throw new MissingRequiredPropertyException("VpcConnectionArgs", "roleArn");
            }
            if ($.securityGroupIds == null) {
                throw new MissingRequiredPropertyException("VpcConnectionArgs", "securityGroupIds");
            }
            if ($.subnetIds == null) {
                throw new MissingRequiredPropertyException("VpcConnectionArgs", "subnetIds");
            }
            if ($.vpcConnectionId == null) {
                throw new MissingRequiredPropertyException("VpcConnectionArgs", "vpcConnectionId");
            }
            return $;
        }
    }

}
