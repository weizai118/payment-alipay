package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 舆情数据通用搜索
 *
 * @author auto create
 * @since 1.0, 2018-08-01 12:18:33
 */
public class AlipayBossCsCssocialYqmessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7873699876756542349L;

	/**
	 * 搜索条件字符串：搜索请求的JSON字符串，JSON字符串中:
posKeyword: 正向关键词
associationKeyword：搭配关键词
negKeyword：排除关键词（负向关键词）
	 */
	@ApiField("search_criteria")
	private String searchCriteria;

    /**
     * Gets search criteria.
     *
     * @return the search criteria
     */
    public String getSearchCriteria() {
		return this.searchCriteria;
	}

    /**
     * Sets search criteria.
     *
     * @param searchCriteria the search criteria
     */
    public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

}