package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.code.add response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:12
 */
public class AlipayPassCodeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4412873252699819415L;

	/** 
	 * 成功时返回业务参数
	 */
	@ApiListField("biz_result")
	@ApiField("string")
	private List<String> bizResult;

	/** 
	 * 返回码.
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否发码成功的标识。
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets biz result.
     *
     * @param bizResult the biz result
     */
    public void setBizResult(List<String> bizResult) {
		this.bizResult = bizResult;
	}

    /**
     * Gets biz result.
     *
     * @return the biz result
     */
    public List<String> getBizResult( ) {
		return this.bizResult;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
