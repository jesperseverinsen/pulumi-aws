// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource Id.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.wafregional.getRateBasedMod({
 *     name: "tfWAFRegionalRateBasedRule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRateBasedMod(args: GetRateBasedModArgs, opts?: pulumi.InvokeOptions): Promise<GetRateBasedModResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:wafregional/getRateBasedMod:getRateBasedMod", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRateBasedMod.
 */
export interface GetRateBasedModArgs {
    /**
     * Name of the WAF Regional rate based rule.
     */
    name: string;
}

/**
 * A collection of values returned by getRateBasedMod.
 */
export interface GetRateBasedModResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource Id.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.wafregional.getRateBasedMod({
 *     name: "tfWAFRegionalRateBasedRule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRateBasedModOutput(args: GetRateBasedModOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRateBasedModResult> {
    return pulumi.output(args).apply((a: any) => getRateBasedMod(a, opts))
}

/**
 * A collection of arguments for invoking getRateBasedMod.
 */
export interface GetRateBasedModOutputArgs {
    /**
     * Name of the WAF Regional rate based rule.
     */
    name: pulumi.Input<string>;
}
