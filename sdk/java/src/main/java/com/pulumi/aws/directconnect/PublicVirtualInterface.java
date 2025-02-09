// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directconnect.PublicVirtualInterfaceArgs;
import com.pulumi.aws.directconnect.inputs.PublicVirtualInterfaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect public virtual interface resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.directconnect.PublicVirtualInterface;
 * import com.pulumi.aws.directconnect.PublicVirtualInterfaceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new PublicVirtualInterface(&#34;foo&#34;, PublicVirtualInterfaceArgs.builder()        
 *             .connectionId(&#34;dxcon-zzzzzzzz&#34;)
 *             .name(&#34;vif-foo&#34;)
 *             .vlan(4094)
 *             .addressFamily(&#34;ipv4&#34;)
 *             .bgpAsn(65352)
 *             .customerAddress(&#34;175.45.176.1/30&#34;)
 *             .amazonAddress(&#34;175.45.176.2/30&#34;)
 *             .routeFilterPrefixes(            
 *                 &#34;210.52.109.0/24&#34;,
 *                 &#34;175.45.176.0/22&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Direct Connect public virtual interfaces using the VIF `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:directconnect/publicVirtualInterface:PublicVirtualInterface test dxvif-33cc44dd
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/publicVirtualInterface:PublicVirtualInterface")
public class PublicVirtualInterface extends com.pulumi.resources.CustomResource {
    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @Export(name="addressFamily", refs={String.class}, tree="[0]")
    private Output<String> addressFamily;

    /**
     * @return The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }
    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @Export(name="amazonAddress", refs={String.class}, tree="[0]")
    private Output<String> amazonAddress;

    /**
     * @return The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> amazonAddress() {
        return this.amazonAddress;
    }
    @Export(name="amazonSideAsn", refs={String.class}, tree="[0]")
    private Output<String> amazonSideAsn;

    public Output<String> amazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * The ARN of the virtual interface.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the virtual interface.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @Export(name="awsDevice", refs={String.class}, tree="[0]")
    private Output<String> awsDevice;

    /**
     * @return The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    public Output<String> awsDevice() {
        return this.awsDevice;
    }
    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @Export(name="bgpAsn", refs={Integer.class}, tree="[0]")
    private Output<Integer> bgpAsn;

    /**
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    public Output<Integer> bgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The authentication key for BGP configuration.
     * 
     */
    @Export(name="bgpAuthKey", refs={String.class}, tree="[0]")
    private Output<String> bgpAuthKey;

    /**
     * @return The authentication key for BGP configuration.
     * 
     */
    public Output<String> bgpAuthKey() {
        return this.bgpAuthKey;
    }
    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @Export(name="customerAddress", refs={String.class}, tree="[0]")
    private Output<String> customerAddress;

    /**
     * @return The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> customerAddress() {
        return this.customerAddress;
    }
    /**
     * The name for the virtual interface.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the virtual interface.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of routes to be advertised to the AWS network in this region.
     * 
     */
    @Export(name="routeFilterPrefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> routeFilterPrefixes;

    /**
     * @return A list of routes to be advertised to the AWS network in this region.
     * 
     */
    public Output<List<String>> routeFilterPrefixes() {
        return this.routeFilterPrefixes;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The VLAN ID.
     * 
     */
    @Export(name="vlan", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlan;

    /**
     * @return The VLAN ID.
     * 
     */
    public Output<Integer> vlan() {
        return this.vlan;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicVirtualInterface(String name) {
        this(name, PublicVirtualInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicVirtualInterface(String name, PublicVirtualInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicVirtualInterface(String name, PublicVirtualInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/publicVirtualInterface:PublicVirtualInterface", name, args == null ? PublicVirtualInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublicVirtualInterface(String name, Output<String> id, @Nullable PublicVirtualInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/publicVirtualInterface:PublicVirtualInterface", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PublicVirtualInterface get(String name, Output<String> id, @Nullable PublicVirtualInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublicVirtualInterface(name, id, state, options);
    }
}
