// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Outputs
{

    [OutputType]
    public sealed class RouteSpecHttp2RouteMatchQueryParameter
    {
        /// <summary>
        /// Criteria for determining an gRPC request match.
        /// </summary>
        public readonly Outputs.RouteSpecHttp2RouteMatchQueryParameterMatch? Match;
        /// <summary>
        /// Name to use for the route. Must be between 1 and 255 characters in length.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private RouteSpecHttp2RouteMatchQueryParameter(
            Outputs.RouteSpecHttp2RouteMatchQueryParameterMatch? match,

            string name)
        {
            Match = match;
            Name = name;
        }
    }
}
