package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProducerVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.producer.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 10:38:14
 */
public class KoubeiRetailWmsProducerBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3554588976255676379L;

	/** 
	 * 生产厂商信息
	 */
	@ApiListField("producers")
	@ApiField("producer_v_o")
	private List<ProducerVO> producers;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets producers.
     *
     * @param producers the producers
     */
    public void setProducers(List<ProducerVO> producers) {
		this.producers = producers;
	}

    /**
     * Gets producers.
     *
     * @return the producers
     */
    public List<ProducerVO> getProducers( ) {
		return this.producers;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

}
