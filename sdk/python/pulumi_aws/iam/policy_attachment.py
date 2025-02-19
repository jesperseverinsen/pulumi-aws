# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PolicyAttachmentArgs', 'PolicyAttachment']

@pulumi.input_type
class PolicyAttachmentArgs:
    def __init__(__self__, *,
                 policy_arn: pulumi.Input[str],
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a PolicyAttachment resource.
        :param pulumi.Input[str] policy_arn: ARN of the policy you want to apply. Typically this should be a reference to the ARN of another resource to ensure dependency ordering, such as `aws_iam_policy.example.arn`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Group(s) the policy should be applied to.
        :param pulumi.Input[str] name: Name of the attachment. This cannot be an empty string.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Role(s) the policy should be applied to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: User(s) the policy should be applied to.
        """
        pulumi.set(__self__, "policy_arn", policy_arn)
        if groups is not None:
            pulumi.set(__self__, "groups", groups)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if users is not None:
            pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter(name="policyArn")
    def policy_arn(self) -> pulumi.Input[str]:
        """
        ARN of the policy you want to apply. Typically this should be a reference to the ARN of another resource to ensure dependency ordering, such as `aws_iam_policy.example.arn`.
        """
        return pulumi.get(self, "policy_arn")

    @policy_arn.setter
    def policy_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_arn", value)

    @property
    @pulumi.getter
    def groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Group(s) the policy should be applied to.
        """
        return pulumi.get(self, "groups")

    @groups.setter
    def groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "groups", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the attachment. This cannot be an empty string.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Role(s) the policy should be applied to.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        User(s) the policy should be applied to.
        """
        return pulumi.get(self, "users")

    @users.setter
    def users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "users", value)


@pulumi.input_type
class _PolicyAttachmentState:
    def __init__(__self__, *,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_arn: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering PolicyAttachment resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Group(s) the policy should be applied to.
        :param pulumi.Input[str] name: Name of the attachment. This cannot be an empty string.
        :param pulumi.Input[str] policy_arn: ARN of the policy you want to apply. Typically this should be a reference to the ARN of another resource to ensure dependency ordering, such as `aws_iam_policy.example.arn`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Role(s) the policy should be applied to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: User(s) the policy should be applied to.
        """
        if groups is not None:
            pulumi.set(__self__, "groups", groups)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy_arn is not None:
            pulumi.set(__self__, "policy_arn", policy_arn)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if users is not None:
            pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Group(s) the policy should be applied to.
        """
        return pulumi.get(self, "groups")

    @groups.setter
    def groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "groups", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the attachment. This cannot be an empty string.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="policyArn")
    def policy_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the policy you want to apply. Typically this should be a reference to the ARN of another resource to ensure dependency ordering, such as `aws_iam_policy.example.arn`.
        """
        return pulumi.get(self, "policy_arn")

    @policy_arn.setter
    def policy_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_arn", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Role(s) the policy should be applied to.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        User(s) the policy should be applied to.
        """
        return pulumi.get(self, "users")

    @users.setter
    def users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "users", value)


class PolicyAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_arn: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        user = aws.iam.User("user", name="test-user")
        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["ec2.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        role = aws.iam.Role("role",
            name="test-role",
            assume_role_policy=assume_role.json)
        group = aws.iam.Group("group", name="test-group")
        policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["ec2:Describe*"],
            resources=["*"],
        )])
        policy_policy = aws.iam.Policy("policy",
            name="test-policy",
            description="A test policy",
            policy=policy.json)
        test_attach = aws.iam.PolicyAttachment("test-attach",
            name="test-attachment",
            users=[user.name],
            roles=[role.name],
            groups=[group.name],
            policy_arn=policy_policy.arn)
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Group(s) the policy should be applied to.
        :param pulumi.Input[str] name: Name of the attachment. This cannot be an empty string.
        :param pulumi.Input[str] policy_arn: ARN of the policy you want to apply. Typically this should be a reference to the ARN of another resource to ensure dependency ordering, such as `aws_iam_policy.example.arn`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Role(s) the policy should be applied to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: User(s) the policy should be applied to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolicyAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        user = aws.iam.User("user", name="test-user")
        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["ec2.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        role = aws.iam.Role("role",
            name="test-role",
            assume_role_policy=assume_role.json)
        group = aws.iam.Group("group", name="test-group")
        policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["ec2:Describe*"],
            resources=["*"],
        )])
        policy_policy = aws.iam.Policy("policy",
            name="test-policy",
            description="A test policy",
            policy=policy.json)
        test_attach = aws.iam.PolicyAttachment("test-attach",
            name="test-attachment",
            users=[user.name],
            roles=[role.name],
            groups=[group.name],
            policy_arn=policy_policy.arn)
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param PolicyAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_arn: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyAttachmentArgs.__new__(PolicyAttachmentArgs)

            __props__.__dict__["groups"] = groups
            __props__.__dict__["name"] = name
            if policy_arn is None and not opts.urn:
                raise TypeError("Missing required property 'policy_arn'")
            __props__.__dict__["policy_arn"] = policy_arn
            __props__.__dict__["roles"] = roles
            __props__.__dict__["users"] = users
        super(PolicyAttachment, __self__).__init__(
            'aws:iam/policyAttachment:PolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_arn: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'PolicyAttachment':
        """
        Get an existing PolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Group(s) the policy should be applied to.
        :param pulumi.Input[str] name: Name of the attachment. This cannot be an empty string.
        :param pulumi.Input[str] policy_arn: ARN of the policy you want to apply. Typically this should be a reference to the ARN of another resource to ensure dependency ordering, such as `aws_iam_policy.example.arn`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Role(s) the policy should be applied to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: User(s) the policy should be applied to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyAttachmentState.__new__(_PolicyAttachmentState)

        __props__.__dict__["groups"] = groups
        __props__.__dict__["name"] = name
        __props__.__dict__["policy_arn"] = policy_arn
        __props__.__dict__["roles"] = roles
        __props__.__dict__["users"] = users
        return PolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def groups(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Group(s) the policy should be applied to.
        """
        return pulumi.get(self, "groups")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the attachment. This cannot be an empty string.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyArn")
    def policy_arn(self) -> pulumi.Output[str]:
        """
        ARN of the policy you want to apply. Typically this should be a reference to the ARN of another resource to ensure dependency ordering, such as `aws_iam_policy.example.arn`.
        """
        return pulumi.get(self, "policy_arn")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Role(s) the policy should be applied to.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter
    def users(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        User(s) the policy should be applied to.
        """
        return pulumi.get(self, "users")

