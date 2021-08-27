package org.jeecg.modules.pay.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author nd
 * @since 2021-08-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="NvPayOrder对象", description="订单表")
public class NvPayOrder extends Model<NvPayOrder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "第三方订单号")
    private String thirdOrderId;

    @ApiModelProperty(value = "订单号")
    private String orderId;

    @ApiModelProperty(value = "支付方订单号")
    private String outOrderId;

    @ApiModelProperty(value = "支付金额 单位为分")
    private Integer totalFee;

    @ApiModelProperty(value = "来源渠道")
    private String channel;

    @ApiModelProperty(value = "支付账号")
    private String payAccount;

    @ApiModelProperty(value = "支付类型.默认为收款")
    private String payType;

    @ApiModelProperty(value = "支付渠道")
    private String payChannel;

    @ApiModelProperty(value = "交易类型")
    private String tradeType;

    @ApiModelProperty(value = "回调地址")
    private String callback;

    @ApiModelProperty(value = "回调数据")
    private String callbackData;

    @ApiModelProperty(value = "回调时间")
    private Date callbackTime;

    @ApiModelProperty(value = "描述")
    private String body;

    @ApiModelProperty(value = "附加数据")
    private String attach;

    @ApiModelProperty(value = "回跳地址")
    private String redirectUrl;

    @ApiModelProperty(value = "商品详情")
    private String detail;

    @ApiModelProperty(value = "错误代码")
    private String errCode;

    @ApiModelProperty(value = "IP")
    private String ip;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "状态 0-待支付 1-成功 2-失败")
    private Integer status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
