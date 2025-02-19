// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.TrafficMirrorSessionArgs;
import com.pulumi.aws.ec2.inputs.TrafficMirrorSessionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Traffic mirror session.\
 * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
 * 
 * ## Example Usage
 * 
 * To create a basic traffic mirror session
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.TrafficMirrorFilter;
 * import com.pulumi.aws.ec2.TrafficMirrorFilterArgs;
 * import com.pulumi.aws.ec2.TrafficMirrorTarget;
 * import com.pulumi.aws.ec2.TrafficMirrorTargetArgs;
 * import com.pulumi.aws.ec2.TrafficMirrorSession;
 * import com.pulumi.aws.ec2.TrafficMirrorSessionArgs;
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
 *         var filter = new TrafficMirrorFilter(&#34;filter&#34;, TrafficMirrorFilterArgs.builder()        
 *             .description(&#34;traffic mirror filter - example&#34;)
 *             .networkServices(&#34;amazon-dns&#34;)
 *             .build());
 * 
 *         var target = new TrafficMirrorTarget(&#34;target&#34;, TrafficMirrorTargetArgs.builder()        
 *             .networkLoadBalancerArn(lb.arn())
 *             .build());
 * 
 *         var session = new TrafficMirrorSession(&#34;session&#34;, TrafficMirrorSessionArgs.builder()        
 *             .description(&#34;traffic mirror session - example&#34;)
 *             .networkInterfaceId(test.primaryNetworkInterfaceId())
 *             .sessionNumber(1)
 *             .trafficMirrorFilterId(filter.id())
 *             .trafficMirrorTargetId(target.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import traffic mirror sessions using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/trafficMirrorSession:TrafficMirrorSession session tms-0d8aa3ca35897b82e
 * ```
 * 
 */
@ResourceType(type="aws:ec2/trafficMirrorSession:TrafficMirrorSession")
public class TrafficMirrorSession extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the traffic mirror session.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the traffic mirror session.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description of the traffic mirror session.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the traffic mirror session.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    @Export(name="networkInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> networkInterfaceId;

    /**
     * @return ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The AWS account ID of the session owner.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the session owner.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    @Export(name="packetLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> packetLength;

    /**
     * @return The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    public Output<Optional<Integer>> packetLength() {
        return Codegen.optional(this.packetLength);
    }
    /**
     * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    @Export(name="sessionNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> sessionNumber;

    /**
     * @return The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    public Output<Integer> sessionNumber() {
        return this.sessionNumber;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * ID of the traffic mirror filter to be used
     * 
     */
    @Export(name="trafficMirrorFilterId", refs={String.class}, tree="[0]")
    private Output<String> trafficMirrorFilterId;

    /**
     * @return ID of the traffic mirror filter to be used
     * 
     */
    public Output<String> trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }
    /**
     * ID of the traffic mirror target to be used
     * 
     */
    @Export(name="trafficMirrorTargetId", refs={String.class}, tree="[0]")
    private Output<String> trafficMirrorTargetId;

    /**
     * @return ID of the traffic mirror target to be used
     * 
     */
    public Output<String> trafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }
    /**
     * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    @Export(name="virtualNetworkId", refs={Integer.class}, tree="[0]")
    private Output<Integer> virtualNetworkId;

    /**
     * @return The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    public Output<Integer> virtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficMirrorSession(String name) {
        this(name, TrafficMirrorSessionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficMirrorSession(String name, TrafficMirrorSessionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficMirrorSession(String name, TrafficMirrorSessionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorSession:TrafficMirrorSession", name, args == null ? TrafficMirrorSessionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficMirrorSession(String name, Output<String> id, @Nullable TrafficMirrorSessionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorSession:TrafficMirrorSession", name, state, makeResourceOptions(options, id));
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
    public static TrafficMirrorSession get(String name, Output<String> id, @Nullable TrafficMirrorSessionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficMirrorSession(name, id, state, options);
    }
}
