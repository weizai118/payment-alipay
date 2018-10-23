package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.sign.query response.
 *
 * @author auto create
 * @since 1.0, 2016-12-29 17:49:07
 */
public class AlipayInsSceneProductSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3554134459722252891L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_no")
	private String agreementNo;

    /**
     * Sets agreement no.
     *
     * @param agreementNo the agreement no
     */
    public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

    /**
     * Gets agreement no.
     *
     * @return the agreement no
     */
    public String getAgreementNo( ) {
		return this.agreementNo;
	}

}
