// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
 * See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getLogDeliveryCanonicalUserId({});
 * const exampleBucketV2 = new aws.s3.BucketV2("example", {bucket: "example"});
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("example", {
 *     bucket: exampleBucketV2.id,
 *     accessControlPolicy: {
 *         grants: [{
 *             grantee: {
 *                 id: example.then(example => example.id),
 *                 type: "CanonicalUser",
 *             },
 *             permission: "FULL_CONTROL",
 *         }],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getLogDeliveryCanonicalUserId(args?: GetLogDeliveryCanonicalUserIdArgs, opts?: pulumi.InvokeOptions): Promise<GetLogDeliveryCanonicalUserIdResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:cloudfront/getLogDeliveryCanonicalUserId:getLogDeliveryCanonicalUserId", {
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getLogDeliveryCanonicalUserId.
 */
export interface GetLogDeliveryCanonicalUserIdArgs {
    /**
     * Region you'd like the zone for. By default, fetches the current region.
     */
    region?: string;
}

/**
 * A collection of values returned by getLogDeliveryCanonicalUserId.
 */
export interface GetLogDeliveryCanonicalUserIdResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly region?: string;
}
/**
 * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
 * See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getLogDeliveryCanonicalUserId({});
 * const exampleBucketV2 = new aws.s3.BucketV2("example", {bucket: "example"});
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("example", {
 *     bucket: exampleBucketV2.id,
 *     accessControlPolicy: {
 *         grants: [{
 *             grantee: {
 *                 id: example.then(example => example.id),
 *                 type: "CanonicalUser",
 *             },
 *             permission: "FULL_CONTROL",
 *         }],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getLogDeliveryCanonicalUserIdOutput(args?: GetLogDeliveryCanonicalUserIdOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLogDeliveryCanonicalUserIdResult> {
    return pulumi.output(args).apply((a: any) => getLogDeliveryCanonicalUserId(a, opts))
}

/**
 * A collection of arguments for invoking getLogDeliveryCanonicalUserId.
 */
export interface GetLogDeliveryCanonicalUserIdOutputArgs {
    /**
     * Region you'd like the zone for. By default, fetches the current region.
     */
    region?: pulumi.Input<string>;
}
