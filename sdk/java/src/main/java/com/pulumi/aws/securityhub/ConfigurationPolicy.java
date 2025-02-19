// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securityhub.ConfigurationPolicyArgs;
import com.pulumi.aws.securityhub.inputs.ConfigurationPolicyState;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages Security Hub configuration policy
 * 
 * &gt; **NOTE:** This resource requires `aws.securityhub.OrganizationConfiguration` to be configured of type `CENTRAL`. More information about Security Hub central configuration and configuration policies can be found in the [How Security Hub configuration policies work](https://docs.aws.amazon.com/securityhub/latest/userguide/configuration-policies-overview.html) documentation.
 * 
 * ## Example Usage
 * 
 * ### Default standards enabled
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.FindingAggregator;
 * import com.pulumi.aws.securityhub.FindingAggregatorArgs;
 * import com.pulumi.aws.securityhub.OrganizationConfiguration;
 * import com.pulumi.aws.securityhub.OrganizationConfigurationArgs;
 * import com.pulumi.aws.securityhub.inputs.OrganizationConfigurationOrganizationConfigurationArgs;
 * import com.pulumi.aws.securityhub.ConfigurationPolicy;
 * import com.pulumi.aws.securityhub.ConfigurationPolicyArgs;
 * import com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs;
 * import com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs;
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
 *         var example = new FindingAggregator(&#34;example&#34;, FindingAggregatorArgs.builder()        
 *             .linkingMode(&#34;ALL_REGIONS&#34;)
 *             .build());
 * 
 *         var exampleOrganizationConfiguration = new OrganizationConfiguration(&#34;exampleOrganizationConfiguration&#34;, OrganizationConfigurationArgs.builder()        
 *             .autoEnable(false)
 *             .autoEnableStandards(&#34;NONE&#34;)
 *             .organizationConfiguration(OrganizationConfigurationOrganizationConfigurationArgs.builder()
 *                 .configurationType(&#34;CENTRAL&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(example)
 *                 .build());
 * 
 *         var exampleConfigurationPolicy = new ConfigurationPolicy(&#34;exampleConfigurationPolicy&#34;, ConfigurationPolicyArgs.builder()        
 *             .name(&#34;Example&#34;)
 *             .description(&#34;This is an example configuration policy&#34;)
 *             .configurationPolicy(ConfigurationPolicyConfigurationPolicyArgs.builder()
 *                 .serviceEnabled(true)
 *                 .enabledStandardArns(                
 *                     &#34;arn:aws:securityhub:us-east-1::standards/aws-foundational-security-best-practices/v/1.0.0&#34;,
 *                     &#34;arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0&#34;)
 *                 .securityControlsConfiguration(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs.builder()
 *                     .disabledControlIdentifiers()
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleOrganizationConfiguration)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Disabled Policy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.ConfigurationPolicy;
 * import com.pulumi.aws.securityhub.ConfigurationPolicyArgs;
 * import com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs;
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
 *         var disabled = new ConfigurationPolicy(&#34;disabled&#34;, ConfigurationPolicyArgs.builder()        
 *             .name(&#34;Disabled&#34;)
 *             .description(&#34;This is an example of disabled configuration policy&#34;)
 *             .configurationPolicy(ConfigurationPolicyConfigurationPolicyArgs.builder()
 *                 .serviceEnabled(false)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(example)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Custom Control Configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.ConfigurationPolicy;
 * import com.pulumi.aws.securityhub.ConfigurationPolicyArgs;
 * import com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs;
 * import com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs;
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
 *         var disabled = new ConfigurationPolicy(&#34;disabled&#34;, ConfigurationPolicyArgs.builder()        
 *             .name(&#34;Custom Controls&#34;)
 *             .description(&#34;This is an example of configuration policy with custom control settings&#34;)
 *             .configurationPolicy(ConfigurationPolicyConfigurationPolicyArgs.builder()
 *                 .serviceEnabled(true)
 *                 .enabledStandardArns(                
 *                     &#34;arn:aws:securityhub:us-east-1::standards/aws-foundational-security-best-practices/v/1.0.0&#34;,
 *                     &#34;arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0&#34;)
 *                 .securityControlsConfiguration(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs.builder()
 *                     .enabledControlIdentifiers(                    
 *                         &#34;APIGateway.1&#34;,
 *                         &#34;IAM.7&#34;)
 *                     .securityControlCustomParameters(                    
 *                         ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterArgs.builder()
 *                             .securityControlId(&#34;APIGateway.1&#34;)
 *                             .parameters(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.builder()
 *                                 .name(&#34;loggingLevel&#34;)
 *                                 .valueType(&#34;CUSTOM&#34;)
 *                                 .enum_(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumArgs.builder()
 *                                     .value(&#34;INFO&#34;)
 *                                     .build())
 *                                 .build())
 *                             .build(),
 *                         ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterArgs.builder()
 *                             .securityControlId(&#34;IAM.7&#34;)
 *                             .parameters(                            
 *                                 ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.builder()
 *                                     .name(&#34;RequireLowercaseCharacters&#34;)
 *                                     .valueType(&#34;CUSTOM&#34;)
 *                                     .bool(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBoolArgs.builder()
 *                                         .value(false)
 *                                         .build())
 *                                     .build(),
 *                                 ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.builder()
 *                                     .name(&#34;MaxPasswordAge&#34;)
 *                                     .valueType(&#34;CUSTOM&#34;)
 *                                     .int_(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntArgs.builder()
 *                                         .value(60)
 *                                         .build())
 *                                     .build())
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(example)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an existing Security Hub enabled account using the universally unique identifier (UUID) of the policy. For example:
 * 
 * ```sh
 * $ pulumi import aws:securityhub/configurationPolicy:ConfigurationPolicy example &#34;00000000-1111-2222-3333-444444444444&#34;
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/configurationPolicy:ConfigurationPolicy")
public class ConfigurationPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Defines how Security Hub is configured. See below.
     * 
     */
    @Export(name="configurationPolicy", refs={ConfigurationPolicyConfigurationPolicy.class}, tree="[0]")
    private Output<ConfigurationPolicyConfigurationPolicy> configurationPolicy;

    /**
     * @return Defines how Security Hub is configured. See below.
     * 
     */
    public Output<ConfigurationPolicyConfigurationPolicy> configurationPolicy() {
        return this.configurationPolicy;
    }
    /**
     * The description of the configuration policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the configuration policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the configuration policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the configuration policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationPolicy(String name) {
        this(name, ConfigurationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationPolicy(String name, ConfigurationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationPolicy(String name, ConfigurationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/configurationPolicy:ConfigurationPolicy", name, args == null ? ConfigurationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationPolicy(String name, Output<String> id, @Nullable ConfigurationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/configurationPolicy:ConfigurationPolicy", name, state, makeResourceOptions(options, id));
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
    public static ConfigurationPolicy get(String name, Output<String> id, @Nullable ConfigurationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationPolicy(name, id, state, options);
    }
}
