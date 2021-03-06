package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动创建接口
 *
 * @author auto create
 * @since 1.0, 2018-04-16 17:12:31
 */
public class KoubeiMarketingCampaignActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2783591828158365267L;

	/**
	 * 是否自动续期活动，默认为N,只有当对应营销工具券有效期为相对有效期时才能设置成Y
	 */
	@ApiField("auto_delay_flag")
	private String autoDelayFlag;

	/**
	 * 活动预算（当活动类型为GUESS_SEND且营销工具PromoTool的数量大于1时，即口令随机送活动，活动预算为空，每张券的预算数量落在SendRule里的send_budget）
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 活动限制信息
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 活动详细说明
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动的扩展信息，无需设置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部批次ID，同一owner创建活动需要换out_biz_no，控制幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 营销工具集
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道集，当活动类型为DIRECT_SEND或者REAL_TIME_SEND时必填，当活动类型为CONSUME_SEND时必须为空，当活动类型为GUESS_SEND时，投放渠道只能有一个且type只能为MERCHANT_CROWD
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 招商工具信息
	 */
	@ApiField("recruit_tool")
	private RecruitTool recruitTool;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动类型，目前支持以下类型：
CONSUME_SEND：消费送活动
DIRECT_SEND：直发奖活动
REAL_TIME_SEND：实时立减类活动
GUESS_SEND：口令送
RECHARGE_SEND：充值送
POINT_SEND：集点卡活动
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets auto delay flag.
     *
     * @return the auto delay flag
     */
    public String getAutoDelayFlag() {
		return this.autoDelayFlag;
	}

    /**
     * Sets auto delay flag.
     *
     * @param autoDelayFlag the auto delay flag
     */
    public void setAutoDelayFlag(String autoDelayFlag) {
		this.autoDelayFlag = autoDelayFlag;
	}

    /**
     * Gets budget info.
     *
     * @return the budget info
     */
    public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}

    /**
     * Sets budget info.
     *
     * @param budgetInfo the budget info
     */
    public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

    /**
     * Gets constraint info.
     *
     * @return the constraint info
     */
    public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}

    /**
     * Sets constraint info.
     *
     * @param constraintInfo the constraint info
     */
    public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets promo tools.
     *
     * @return the promo tools
     */
    public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}

    /**
     * Sets promo tools.
     *
     * @param promoTools the promo tools
     */
    public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

    /**
     * Gets publish channels.
     *
     * @return the publish channels
     */
    public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}

    /**
     * Sets publish channels.
     *
     * @param publishChannels the publish channels
     */
    public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}

    /**
     * Gets recruit tool.
     *
     * @return the recruit tool
     */
    public RecruitTool getRecruitTool() {
		return this.recruitTool;
	}

    /**
     * Sets recruit tool.
     *
     * @param recruitTool the recruit tool
     */
    public void setRecruitTool(RecruitTool recruitTool) {
		this.recruitTool = recruitTool;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
