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
 * 拍客-订单表
 * </p>
 *
 * @author nd
 * @since 2021-08-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="NvProcameraOrder对象", description="拍客-订单表")
public class NvProcameraOrder extends Model<NvProcameraOrder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "拍客id")
    private Long procameraId;

    @ApiModelProperty(value = "订单号")
    private String orderId;

    @ApiModelProperty(value = "支付渠道")
    private String payChannel;

    @ApiModelProperty(value = "会员用户id")
    private Long memberId;

    @ApiModelProperty(value = "金额，单位元")
    private Double money;

    @ApiModelProperty(value = "IP")
    private String ip;

    @ApiModelProperty(value = "openid")
    private String openid;

    @ApiModelProperty(value = "0未支付；1成功；2失败")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
