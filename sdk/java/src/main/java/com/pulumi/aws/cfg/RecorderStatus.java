// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cfg.RecorderStatusArgs;
import com.pulumi.aws.cfg.inputs.RecorderStatusState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages status (recording / stopped) of an AWS Config Configuration Recorder.
 * 
 * &gt; **Note:** Starting Configuration Recorder requires a Delivery Channel to be present. Use of `depends_on` (as shown below) is recommended to avoid race conditions.
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
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.cfg.DeliveryChannel;
 * import com.pulumi.aws.cfg.DeliveryChannelArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.cfg.Recorder;
 * import com.pulumi.aws.cfg.RecorderArgs;
 * import com.pulumi.aws.cfg.RecorderStatus;
 * import com.pulumi.aws.cfg.RecorderStatusArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var b = new BucketV2(&#34;b&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;awsconfig-example&#34;)
 *             .build());
 * 
 *         var fooDeliveryChannel = new DeliveryChannel(&#34;fooDeliveryChannel&#34;, DeliveryChannelArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .s3BucketName(b.bucket())
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;config.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var r = new Role(&#34;r&#34;, RoleArgs.builder()        
 *             .name(&#34;example-awsconfig&#34;)
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var fooRecorder = new Recorder(&#34;fooRecorder&#34;, RecorderArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .roleArn(r.arn())
 *             .build());
 * 
 *         var foo = new RecorderStatus(&#34;foo&#34;, RecorderStatusArgs.builder()        
 *             .name(fooRecorder.name())
 *             .isEnabled(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(fooDeliveryChannel)
 *                 .build());
 * 
 *         var a = new RolePolicyAttachment(&#34;a&#34;, RolePolicyAttachmentArgs.builder()        
 *             .role(r.name())
 *             .policyArn(&#34;arn:aws:iam::aws:policy/service-role/AWS_ConfigRole&#34;)
 *             .build());
 * 
 *         final var p = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;s3:*&#34;)
 *                 .resources(                
 *                     b.arn(),
 *                     b.arn().applyValue(arn -&gt; String.format(&#34;%s/*&#34;, arn)))
 *                 .build())
 *             .build());
 * 
 *         var pRolePolicy = new RolePolicy(&#34;pRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .name(&#34;awsconfig-example&#34;)
 *             .role(r.id())
 *             .policy(p.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(p -&gt; p.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Configuration Recorder Status using the name of the Configuration Recorder. For example:
 * 
 * ```sh
 * $ pulumi import aws:cfg/recorderStatus:RecorderStatus foo example
 * ```
 * 
 */
@ResourceType(type="aws:cfg/recorderStatus:RecorderStatus")
public class RecorderStatus extends com.pulumi.resources.CustomResource {
    /**
     * Whether the configuration recorder should be enabled or disabled.
     * 
     */
    @Export(name="isEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isEnabled;

    /**
     * @return Whether the configuration recorder should be enabled or disabled.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }
    /**
     * The name of the recorder
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the recorder
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RecorderStatus(String name) {
        this(name, RecorderStatusArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RecorderStatus(String name, RecorderStatusArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecorderStatus(String name, RecorderStatusArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/recorderStatus:RecorderStatus", name, args == null ? RecorderStatusArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RecorderStatus(String name, Output<String> id, @Nullable RecorderStatusState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/recorderStatus:RecorderStatus", name, state, makeResourceOptions(options, id));
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
    public static RecorderStatus get(String name, Output<String> id, @Nullable RecorderStatusState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RecorderStatus(name, id, state, options);
    }
}
