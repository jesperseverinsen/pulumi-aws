// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ZoneAssociationArgs;
import com.pulumi.aws.route53.inputs.ZoneAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Route53 Hosted Zone VPC association. VPC associations can only be made on private zones. See the `aws.route53.VpcAssociationAuthorization` resource for setting up cross-account associations.
 * 
 * &gt; **NOTE:** Unless explicit association ordering is required (e.g., a separate cross-account association authorization), usage of this resource is not recommended. Use the `vpc` configuration blocks available within the `aws.route53.Zone` resource instead.
 * 
 * &gt; **NOTE:** This provider provides both this standalone Zone VPC Association resource and exclusive VPC associations defined in-line in the `aws.route53.Zone` resource via `vpc` configuration blocks. At this time, you cannot use those in-line VPC associations in conjunction with this resource and the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) in the `aws.route53.Zone` resource to manage additional associations via this resource.
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
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.route53.Zone;
 * import com.pulumi.aws.route53.ZoneArgs;
 * import com.pulumi.aws.route53.inputs.ZoneVpcArgs;
 * import com.pulumi.aws.route53.ZoneAssociation;
 * import com.pulumi.aws.route53.ZoneAssociationArgs;
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
 *         var primary = new Vpc(&#34;primary&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.6.0.0/16&#34;)
 *             .enableDnsHostnames(true)
 *             .enableDnsSupport(true)
 *             .build());
 * 
 *         var secondary = new Vpc(&#34;secondary&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.7.0.0/16&#34;)
 *             .enableDnsHostnames(true)
 *             .enableDnsSupport(true)
 *             .build());
 * 
 *         var example = new Zone(&#34;example&#34;, ZoneArgs.builder()        
 *             .name(&#34;example.com&#34;)
 *             .vpcs(ZoneVpcArgs.builder()
 *                 .vpcId(primary.id())
 *                 .build())
 *             .build());
 * 
 *         var secondaryZoneAssociation = new ZoneAssociation(&#34;secondaryZoneAssociation&#34;, ZoneAssociationArgs.builder()        
 *             .zoneId(example.zoneId())
 *             .vpcId(secondary.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The VPC is _not_ in the same region where you have configured the AWS Provider:
 * 
 * __Using `pulumi import` to import__ Route 53 Hosted Zone Associations using the Hosted Zone ID and VPC ID, separated by a colon (`:`). For example:
 * 
 * The VPC is in the same region where you have configured the AWS Provider:
 * 
 * ```sh
 * $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678
 * ```
 * The VPC is _not_ in the same region where you have configured the AWS Provider:
 * 
 * ```sh
 * $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678:us-east-2
 * ```
 * 
 */
@ResourceType(type="aws:route53/zoneAssociation:ZoneAssociation")
public class ZoneAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The account ID of the account that created the hosted zone.
     * 
     */
    @Export(name="owningAccount", refs={String.class}, tree="[0]")
    private Output<String> owningAccount;

    /**
     * @return The account ID of the account that created the hosted zone.
     * 
     */
    public Output<String> owningAccount() {
        return this.owningAccount;
    }
    /**
     * The VPC to associate with the private hosted zone.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPC to associate with the private hosted zone.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The VPC&#39;s region. Defaults to the region of the AWS provider.
     * 
     */
    @Export(name="vpcRegion", refs={String.class}, tree="[0]")
    private Output<String> vpcRegion;

    /**
     * @return The VPC&#39;s region. Defaults to the region of the AWS provider.
     * 
     */
    public Output<String> vpcRegion() {
        return this.vpcRegion;
    }
    /**
     * The private hosted zone to associate.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The private hosted zone to associate.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZoneAssociation(String name) {
        this(name, ZoneAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZoneAssociation(String name, ZoneAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZoneAssociation(String name, ZoneAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zoneAssociation:ZoneAssociation", name, args == null ? ZoneAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ZoneAssociation(String name, Output<String> id, @Nullable ZoneAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zoneAssociation:ZoneAssociation", name, state, makeResourceOptions(options, id));
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
    public static ZoneAssociation get(String name, Output<String> id, @Nullable ZoneAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZoneAssociation(name, id, state, options);
    }
}
