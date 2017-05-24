
# UserDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**identity** | **String** | The identity of the tenant. |  [optional]
**userGroups** | [**List&lt;TenantEntity&gt;**](TenantEntity.md) | The groups to which the user belongs. This field is read only and it provided for convenience. |  [optional]
**accessPolicies** | [**List&lt;AccessPolicySummaryEntity&gt;**](AccessPolicySummaryEntity.md) | The access policies this user belongs to. |  [optional]


