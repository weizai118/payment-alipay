package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国家制裁数据受理接口
 *
 * @author auto create
 * @since 1.0, 2017-11-28 21:58:58
 */
public class AlipayAccountExrateSentimentDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 4538719865317932495L;

	/**
	 * 国家制裁提交数据内容
	 */
	@ApiField("content")
	private String content;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

}
