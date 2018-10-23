package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料删除接口
 *
 * @author auto create
 * @since 1.0, 2018-09-02 19:50:44
 */
public class KoubeiCateringDishMaterialDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1264465195597798757L;

	/**
	 * 菜品加料入参
	 */
	@ApiField("kb_dish_material_info")
	private KbdishMaterialInfo kbDishMaterialInfo;

    /**
     * Gets kb dish material info.
     *
     * @return the kb dish material info
     */
    public KbdishMaterialInfo getKbDishMaterialInfo() {
		return this.kbDishMaterialInfo;
	}

    /**
     * Sets kb dish material info.
     *
     * @param kbDishMaterialInfo the kb dish material info
     */
    public void setKbDishMaterialInfo(KbdishMaterialInfo kbDishMaterialInfo) {
		this.kbDishMaterialInfo = kbDishMaterialInfo;
	}

}
