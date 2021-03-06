package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认证初始化
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:53:20
 */
public class ZhimaCustomerCertificationInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5767828823441124297L;

	/**
	 * 认证场景码，常用的场景码有：FACE：人脸认证。入参支持的认证场景码和商户签约的认证场景相关，详见芝麻认证快速接入文档
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 扩展业务参数，暂时没有用到，接口预留
	 */
	@ApiField("ext_biz_param")
	private String extBizParam;

	/**
	 * 自定义人脸比对图片的base64编码格式的string字符串
	 */
	@ApiField("face_contrast_picture")
	private String faceContrastPicture;

	/**
	 * "identity_type":”CERT_INFO”，是指入参类型为证件信息。芝麻认证有很多认证场景（biz_code），不同认证认证场景（biz_code）支持的入参类型不同，详细请见芝麻认证快速接入文档里面的表格
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * 芝麻平台服务商模式下的二级商户标识，如果是直连商户调用该接口，不需要设置
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/**
	 * 商户可选的一些设置
	 */
	@ApiField("merchant_config")
	private String merchantConfig;

	/**
	 * 芝麻认证产品码，示例值为真实的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，商户要保证其唯一性。值为32位长度的字母数字下划线组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段日期，结尾可以使用一个序列
	 */
	@ApiField("transaction_id")
	private String transactionId;

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode() {
		return this.bizCode;
	}

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets ext biz param.
     *
     * @return the ext biz param
     */
    public String getExtBizParam() {
		return this.extBizParam;
	}

    /**
     * Sets ext biz param.
     *
     * @param extBizParam the ext biz param
     */
    public void setExtBizParam(String extBizParam) {
		this.extBizParam = extBizParam;
	}

    /**
     * Gets face contrast picture.
     *
     * @return the face contrast picture
     */
    public String getFaceContrastPicture() {
		return this.faceContrastPicture;
	}

    /**
     * Sets face contrast picture.
     *
     * @param faceContrastPicture the face contrast picture
     */
    public void setFaceContrastPicture(String faceContrastPicture) {
		this.faceContrastPicture = faceContrastPicture;
	}

    /**
     * Gets identity param.
     *
     * @return the identity param
     */
    public String getIdentityParam() {
		return this.identityParam;
	}

    /**
     * Sets identity param.
     *
     * @param identityParam the identity param
     */
    public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

    /**
     * Gets linked merchant id.
     *
     * @return the linked merchant id
     */
    public String getLinkedMerchantId() {
		return this.linkedMerchantId;
	}

    /**
     * Sets linked merchant id.
     *
     * @param linkedMerchantId the linked merchant id
     */
    public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}

    /**
     * Gets merchant config.
     *
     * @return the merchant config
     */
    public String getMerchantConfig() {
		return this.merchantConfig;
	}

    /**
     * Sets merchant config.
     *
     * @param merchantConfig the merchant config
     */
    public void setMerchantConfig(String merchantConfig) {
		this.merchantConfig = merchantConfig;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
		return this.transactionId;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
