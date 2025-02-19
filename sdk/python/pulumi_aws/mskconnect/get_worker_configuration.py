# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetWorkerConfigurationResult',
    'AwaitableGetWorkerConfigurationResult',
    'get_worker_configuration',
    'get_worker_configuration_output',
]

@pulumi.output_type
class GetWorkerConfigurationResult:
    """
    A collection of values returned by getWorkerConfiguration.
    """
    def __init__(__self__, arn=None, description=None, id=None, latest_revision=None, name=None, properties_file_content=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if latest_revision and not isinstance(latest_revision, int):
            raise TypeError("Expected argument 'latest_revision' to be a int")
        pulumi.set(__self__, "latest_revision", latest_revision)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if properties_file_content and not isinstance(properties_file_content, str):
            raise TypeError("Expected argument 'properties_file_content' to be a str")
        pulumi.set(__self__, "properties_file_content", properties_file_content)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        the ARN of the worker configuration.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        a summary description of the worker configuration.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="latestRevision")
    def latest_revision(self) -> int:
        """
        an ID of the latest successfully created revision of the worker configuration.
        """
        return pulumi.get(self, "latest_revision")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="propertiesFileContent")
    def properties_file_content(self) -> str:
        """
        contents of connect-distributed.properties file.
        """
        return pulumi.get(self, "properties_file_content")


class AwaitableGetWorkerConfigurationResult(GetWorkerConfigurationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkerConfigurationResult(
            arn=self.arn,
            description=self.description,
            id=self.id,
            latest_revision=self.latest_revision,
            name=self.name,
            properties_file_content=self.properties_file_content)


def get_worker_configuration(name: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkerConfigurationResult:
    """
    Get information on an Amazon MSK Connect Worker Configuration.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.mskconnect.get_worker_configuration(name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the worker configuration.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:mskconnect/getWorkerConfiguration:getWorkerConfiguration', __args__, opts=opts, typ=GetWorkerConfigurationResult).value

    return AwaitableGetWorkerConfigurationResult(
        arn=pulumi.get(__ret__, 'arn'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        latest_revision=pulumi.get(__ret__, 'latest_revision'),
        name=pulumi.get(__ret__, 'name'),
        properties_file_content=pulumi.get(__ret__, 'properties_file_content'))


@_utilities.lift_output_func(get_worker_configuration)
def get_worker_configuration_output(name: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWorkerConfigurationResult]:
    """
    Get information on an Amazon MSK Connect Worker Configuration.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.mskconnect.get_worker_configuration(name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the worker configuration.
    """
    ...
