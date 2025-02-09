// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ElastiCache.Outputs
{

    [OutputType]
    public sealed class ServerlessCacheCacheUsageLimitsEcpuPerSecond
    {
        /// <summary>
        /// The upper limit for data storage the cache is set to use. Must be between 1 and 5,000.
        /// </summary>
        public readonly int Maximum;

        [OutputConstructor]
        private ServerlessCacheCacheUsageLimitsEcpuPerSecond(int maximum)
        {
            Maximum = maximum;
        }
    }
}
