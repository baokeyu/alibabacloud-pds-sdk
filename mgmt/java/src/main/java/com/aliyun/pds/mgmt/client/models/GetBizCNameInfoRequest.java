// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class GetBizCNameInfoRequest extends TeaModel {
    @NameInMap("httpheaders")
    public java.util.Map<String, String> httpheaders;

    // cname type
    @NameInMap("cname_type")
    @Validation(required = true)
    public String cnameType;

    // domain ID
    @NameInMap("domain_id")
    @Validation(required = true)
    public String domainId;

    // is vpc
    @NameInMap("is_vpc")
    public Boolean isVpc;

    public static GetBizCNameInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBizCNameInfoRequest self = new GetBizCNameInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBizCNameInfoRequest setHttpheaders(java.util.Map<String, String> httpheaders) {
        this.httpheaders = httpheaders;
        return this;
    }
    public java.util.Map<String, String> getHttpheaders() {
        return this.httpheaders;
    }

    public GetBizCNameInfoRequest setCnameType(String cnameType) {
        this.cnameType = cnameType;
        return this;
    }
    public String getCnameType() {
        return this.cnameType;
    }

    public GetBizCNameInfoRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetBizCNameInfoRequest setIsVpc(Boolean isVpc) {
        this.isVpc = isVpc;
        return this;
    }
    public Boolean getIsVpc() {
        return this.isVpc;
    }

}
