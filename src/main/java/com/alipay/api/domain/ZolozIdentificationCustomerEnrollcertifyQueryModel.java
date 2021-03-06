package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸注册或者认证的结果查询
 *
 * @author auto create
 * @since 1.0, 2018-04-03 16:46:06
 */
public class ZolozIdentificationCustomerEnrollcertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7826446578513782916L;

	/**
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 0：匿名注册  1：匿名认证   2：实名认证
	 */
	@ApiField("face_type")
	private Long faceType;

	/**
	 * zimId，用于查询认证结果
	 */
	@ApiField("zim_id")
	private String zimId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets face type.
     *
     * @return the face type
     */
    public Long getFaceType() {
		return this.faceType;
	}

    /**
     * Sets face type.
     *
     * @param faceType the face type
     */
    public void setFaceType(Long faceType) {
		this.faceType = faceType;
	}

    /**
     * Gets zim id.
     *
     * @return the zim id
     */
    public String getZimId() {
		return this.zimId;
	}

    /**
     * Sets zim id.
     *
     * @param zimId the zim id
     */
    public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
