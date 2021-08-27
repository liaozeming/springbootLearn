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
 * 支付渠道表
 * </p>
 *
 * @author nd
 * @since 2021-08-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="NvPayChannel对象", description="支付渠道表")
public class NvPayChannel extends Model<NvPayChannel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "渠道标识")
    private String name;

    @ApiModelProperty(value = "渠道名")
    private String title;

    @ApiModelProperty(value = "回调URL")
    private String callback;

    @ApiModelProperty(value = "渠道密钥")
    private String secret;

    @ApiModelProperty(value = "允许转账")
    private Integer allowTransfer;

    @ApiModelProperty(value = "允许收款")
    private Integer allowPay;

    @ApiModelProperty(value = "商户号")
    private String partnerId;

    @ApiModelProperty(value = "应用")
    private String appid;

    @ApiModelProperty(value = "状态 ")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
