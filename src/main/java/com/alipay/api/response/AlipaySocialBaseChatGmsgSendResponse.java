package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gmsg.send response.
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:16:27
 */
public class AlipaySocialBaseChatGmsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2185343758926698872L;

	/** 
	 * 消息索引号 会话ID_消息ID
	 */
	@ApiField("msg_index")
	private String msgIndex;

    /**
     * Sets msg index.
     *
     * @param msgIndex the msg index
     */
    public void setMsgIndex(String msgIndex) {
		this.msgIndex = msgIndex;
	}

    /**
     * Gets msg index.
     *
     * @return the msg index
     */
    public String getMsgIndex( ) {
		return this.msgIndex;
	}

}
