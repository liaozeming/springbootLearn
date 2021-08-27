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
 * 拍客
 * </p>
 *
 * @author nd
 * @since 2021-08-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="NvProcamera对象", description="拍客")
public class NvProcamera extends Model<NvProcamera> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "拍客uid")
    private Long memberId;

    @ApiModelProperty(value = "稿件唯一ID")
    private String spm;

    @ApiModelProperty(value = "引用文章地址")
    private String linkUrl;

    @ApiModelProperty(value = "文章标题")
    private String title;

    private Long adminId;

    @ApiModelProperty(value = "采纳意见")
    private String reason;

    @ApiModelProperty(value = "采纳状态 0未采纳；1已采纳；-1删除")
    private Integer status;

    @ApiModelProperty(value = "税前金额")
    private Double taxMoney;

    @ApiModelProperty(value = "税后金额")
    private Double money;

    @ApiModelProperty(value = "0未审核；1通过；2未通过")
    private Integer checkStatus;

    @ApiModelProperty(value = "审核时间")
    private Date checkTime;

    @ApiModelProperty(value = "稿酬发放状态 0未发放；1到账成功；2到账失败；")
    private Integer grantStatus;

    @ApiModelProperty(value = "发放时间")
    private Date grantTime;

    @ApiModelProperty(value = "是否通知 0未通知；1已通知；2通知异常")
    private Integer messageStatus;

    @ApiModelProperty(value = "视拍客视频id")
    private Long flagId;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "最后操作时间")
    private Date modifyTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
