// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeBuild.Outputs
{

    [OutputType]
    public sealed class ProjectEnvironment
    {
        /// <summary>
        /// ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
        /// </summary>
        public readonly string? Certificate;
        /// <summary>
        /// Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`, `BUILD_LAMBDA_1GB`, `BUILD_LAMBDA_2GB`, `BUILD_LAMBDA_4GB`, `BUILD_LAMBDA_8GB`, `BUILD_LAMBDA_10GB`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`. When `type` is set to `LINUX_LAMBDA_CONTAINER` or `ARM_LAMBDA_CONTAINER`, `compute_type` must be `BUILD_LAMBDA_XGB`.`
        /// </summary>
        public readonly string ComputeType;
        /// <summary>
        /// Configuration block. Detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectEnvironmentEnvironmentVariable> EnvironmentVariables;
        /// <summary>
        /// Docker image to use for this build project. Valid values include Docker images provided by CodeBuild, and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
        /// </summary>
        public readonly string Image;
        /// <summary>
        /// Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
        /// </summary>
        public readonly string? ImagePullCredentialsType;
        /// <summary>
        /// Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
        /// </summary>
        public readonly bool? PrivilegedMode;
        /// <summary>
        /// Configuration block. Detailed below.
        /// </summary>
        public readonly Outputs.ProjectEnvironmentRegistryCredential? RegistryCredential;
        /// <summary>
        /// Type of environment variable. Valid values: `PARAMETER_STORE`, `PLAINTEXT`, `SECRETS_MANAGER`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ProjectEnvironment(
            string? certificate,

            string computeType,

            ImmutableArray<Outputs.ProjectEnvironmentEnvironmentVariable> environmentVariables,

            string image,

            string? imagePullCredentialsType,

            bool? privilegedMode,

            Outputs.ProjectEnvironmentRegistryCredential? registryCredential,

            string type)
        {
            Certificate = certificate;
            ComputeType = computeType;
            EnvironmentVariables = environmentVariables;
            Image = image;
            ImagePullCredentialsType = imagePullCredentialsType;
            PrivilegedMode = privilegedMode;
            RegistryCredential = registryCredential;
            Type = type;
        }
    }
}
