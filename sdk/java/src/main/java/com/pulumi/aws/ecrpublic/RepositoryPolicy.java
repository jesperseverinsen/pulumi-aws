// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecrpublic;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecrpublic.RepositoryPolicyArgs;
import com.pulumi.aws.ecrpublic.inputs.RepositoryPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Container Registry Public Repository Policy.
 * 
 * Note that currently only one policy may be applied to a repository.
 * 
 * &gt; **NOTE:** This resource can only be used in the `us-east-1` region.
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
 * import com.pulumi.aws.ecrpublic.Repository;
 * import com.pulumi.aws.ecrpublic.RepositoryArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.ecrpublic.RepositoryPolicy;
 * import com.pulumi.aws.ecrpublic.RepositoryPolicyArgs;
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
 *         var exampleRepository = new Repository(&#34;exampleRepository&#34;, RepositoryArgs.builder()        
 *             .repositoryName(&#34;example&#34;)
 *             .build());
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;new policy&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;123456789012&#34;)
 *                     .build())
 *                 .actions(                
 *                     &#34;ecr:GetDownloadUrlForLayer&#34;,
 *                     &#34;ecr:BatchGetImage&#34;,
 *                     &#34;ecr:BatchCheckLayerAvailability&#34;,
 *                     &#34;ecr:PutImage&#34;,
 *                     &#34;ecr:InitiateLayerUpload&#34;,
 *                     &#34;ecr:UploadLayerPart&#34;,
 *                     &#34;ecr:CompleteLayerUpload&#34;,
 *                     &#34;ecr:DescribeRepositories&#34;,
 *                     &#34;ecr:GetRepositoryPolicy&#34;,
 *                     &#34;ecr:ListImages&#34;,
 *                     &#34;ecr:DeleteRepository&#34;,
 *                     &#34;ecr:BatchDeleteImage&#34;,
 *                     &#34;ecr:SetRepositoryPolicy&#34;,
 *                     &#34;ecr:DeleteRepositoryPolicy&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleRepositoryPolicy = new RepositoryPolicy(&#34;exampleRepositoryPolicy&#34;, RepositoryPolicyArgs.builder()        
 *             .repositoryName(exampleRepository.repositoryName())
 *             .policy(example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import ECR Public Repository Policy using the repository name. For example:
 * 
 * ```sh
 * $ pulumi import aws:ecrpublic/repositoryPolicy:RepositoryPolicy example example
 * ```
 * 
 */
@ResourceType(type="aws:ecrpublic/repositoryPolicy:RepositoryPolicy")
public class RepositoryPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The registry ID where the repository was created.
     * 
     */
    @Export(name="registryId", refs={String.class}, tree="[0]")
    private Output<String> registryId;

    /**
     * @return The registry ID where the repository was created.
     * 
     */
    public Output<String> registryId() {
        return this.registryId;
    }
    /**
     * Name of the repository to apply the policy.
     * 
     */
    @Export(name="repositoryName", refs={String.class}, tree="[0]")
    private Output<String> repositoryName;

    /**
     * @return Name of the repository to apply the policy.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepositoryPolicy(String name) {
        this(name, RepositoryPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepositoryPolicy(String name, RepositoryPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryPolicy(String name, RepositoryPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecrpublic/repositoryPolicy:RepositoryPolicy", name, args == null ? RepositoryPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RepositoryPolicy(String name, Output<String> id, @Nullable RepositoryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecrpublic/repositoryPolicy:RepositoryPolicy", name, state, makeResourceOptions(options, id));
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
    public static RepositoryPolicy get(String name, Output<String> id, @Nullable RepositoryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryPolicy(name, id, state, options);
    }
}
