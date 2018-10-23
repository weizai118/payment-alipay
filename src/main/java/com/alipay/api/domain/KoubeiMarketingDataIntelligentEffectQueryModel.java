package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销活动效果预测
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:49
 */
public class KoubeiMarketingDataIntelligentEffectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3284141418483586996L;

	/**
	 * 操作人上下文信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，请保持足够复杂，方便排查数据来源
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动的详情，用于咨询的元数据
	 */
	@ApiField("promo")
	private IntelligentPromo promo;

    /**
     * Gets operator context.
     *
     * @return the operator context
     */
    public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}

    /**
     * Sets operator context.
     *
     * @param operatorContext the operator context
     */
    public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets promo.
     *
     * @return the promo
     */
    public IntelligentPromo getPromo() {
		return this.promo;
	}

    /**
     * Sets promo.
     *
     * @param promo the promo
     */
    public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}

}
