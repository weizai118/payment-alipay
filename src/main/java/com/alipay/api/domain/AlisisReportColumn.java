package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表列对象
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:26:15
 */
public class AlisisReportColumn extends AlipayObject {

	private static final long serialVersionUID = 6338112993472163793L;

	/**
	 * 列别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 列值
	 */
	@ApiField("data")
	private String data;

    /**
     * Gets alias.
     *
     * @return the alias
     */
    public String getAlias() {
		return this.alias;
	}

    /**
     * Sets alias.
     *
     * @param alias the alias
     */
    public void setAlias(String alias) {
		this.alias = alias;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

}
