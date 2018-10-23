package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道修改入参
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:56
 */
public class KbAdvertModifyChannelRequest extends AlipayObject {

	private static final long serialVersionUID = 8737282669141344156L;

	/**
	 * 渠道ID（渠道创建接口中，返回的channelID）
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

}
