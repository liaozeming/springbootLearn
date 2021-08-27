package com.lzm.springbootlearn.Test;

/**
 * @author hejinwu
 */

public enum ErrorConfig implements ErrorConfigInterface {
    SYS_NOT_LOGIN(401,"您未登录"),
    FORBIDDEN(403,"无权访问"),
    NOT_FOUND(404, "NOT FOUND"),

    //  100xx - 系统
    PARAM_MISS(10000, "缺少必要参数"),

    //  101xx - 登录注册
    USER_LOGIN_OTHER_DEVICE(10100, "你的账号已在其他设备登录，如需继续操作，请重新登录。如非本人操作，则密码可能已泄露，建议登录后修改密码"),
    LOGIN_FAILED(10101, "登录失败"),
    MOBILE_ERROR(10102, "手机号格式不正确"),
    MOBILE_PWD_NULL(10103, "用户名或密码必填"),
    NEED_USERNAME(10104, "需要补全用户名"),
    OPENID_NOT_EXIST(10105, "授权失败"),
    DEVICE_ID_NULL(10106, "设备信息获取失败,请稍后重试"),
    USER_NAME_EXIST(10107, "用户名已存在"),
    USER_NAME_PWD_EXIST(10108, "手机号或密码有误"),
    LOGIN_FAILED_WAIT(10109, "密码输入错误次数过多，请在3小时后重试"),
    USER_NOT_LOGIN(401, "用户未登录"),

    //  102xx - 用户信息/设置
    NICKNAME_NULL(10200, "昵称不可为空"),
    USER_MOBILE_EXIST(10201, "手机号已被使用"),
    RE_PWD_DIFFERENT(10202, "两次密码输入不相同"),
    MOBILE_NOT_MATCH(10203, "手机号不匹配"),
    USER_NOT_EXIST(10204, "用户不存在"),
    USER_ARE_BANNED(10205, "该用户已被封禁"),
    USER_NOT_USE(10206, "账号异常"),
    USERNAME_NULL(10207, "用户名不可为空"),

    //  103xx - 上传下载
    UPLOAD_FAILED(10300, "上传失败"),

    //  104xx - 付款相关
    PAY_FAILED(10400, "支付失败"),
    PAY_MONEY_ERROR(10401, "金额有误"),
    PAY_ORDER_ERROR(10402, "订单号必填"),
    PAY_CHANNEL_ERROR(10403, "渠道不可用"),
    PAY_ORDER_EXIST(10404, "订单已存在！"),
    PAY_DATA_ERROR(10405, "数据校验失败"),


    //  105xx - 稿件相关
    DOC_NOT_EXIST(10500, "文档不存在"),


    //  消息提醒，互动相关
    MESSAGE_NOT_EXIXT(10600, "参数有误"),
    MESSAGE_FAILED(10601, "失败,请稍后重试！"),
    PAGE_NOT_EXIXT(10602, "没有该页"),
    WECHAT_NOT_EXIXT(10603, "未绑定微信号"),
    USER_WECHAT_EXIST(10604, "微信号已被绑定"),
    WECHAT_FAILED(10605, "绑定微信失败"),
    EMOJI_NOT_NULL(10606, "暂不支持表情"),
    MOBILE_NOT_EXIXT(10607, "未绑定手机号"),


    //  107xx - 搜索相关
    SEARCH_KEYWORD_NULL(10700, "搜索关键词不可为空"),

    //  108xx - 拍客相关
    PROCAMERA_UPLOAD_INFO_NULL(10800, "视频信息必填"),
    PROCAMERA_VIDEO_ID_EXIST(10801, "视频已上传"),


    //  200xx - 零散常用
    CREATE_FAILED(20001, "生成失败，请稍后再试"),

    //  205xx - 短信相关
    SMS_SEND_FAILED(20500, "短信发送失败,请稍后重试！"),
    SMS_SEND_LIMIT(20501, "短信发送过于频繁，请稍后再试"),
    SMS_ACTION_ERROR(20502, "发送渠道不存在"),
    SMS_MOBILE_ERROR(20503, "手机号格式不正确"),
    SMS_VERIFY_CODE_ERROR(20504, "验证码错误"),
    SMS_VERIFY_CODE_UN_SEND(20505, "验证码未获取"),


    //  207xx - 拍客相关
    PK_CREATE_FAILED(20700, "拍客记录创建失败，请稍后再试"),
    PK_NOT_EXIST(20701, "拍客记录不存在"),
    PK_NOT_ALLOW_SUBMIT(20702, "不可修改"),
    PK_CREATE_NAME_NULL(20703, "文件名不能为空"),
    PK_CREATE_MD5_NULL(20704, "文件校验值不能为空"),
    PK_CREATE_SIZE_NULL(20705, "文件大小不能为空"),
    PK_CREATE_TYPE_NULL(20706, "文件类型不能为空"),
    PK_ALREADY_EXIST(20707, "视频已存在"),
    PK_CREATE_COVER_NULL(20708, "封面图不能为空"),
    PK_CREATE_SIZE_FAILED(20709, "文件过大"),
    PK_CREATE_TYPE_FAILED(20710, "文件类型错误"),

    //视频相关
    VIDEO_GET_INFO_FAILED(60500,"获取视频信息错误"),
    VIDEO_NOT_FIND(60501,"视频不存在"),
    VIDEO_EXIST(60502,"视频已存在"),

    //日期时间相关
    TIME_DURATION_ERROR(60600,"开始时间需早于结束时间"),

    //  301xx - 投票相关
    VOTE_NOT_EXIST(30100, "投票不存在"),
    VOTE_STATUS_ERROR(30101, "当前状态不可提审"),

    //  208xx - 断点续传 业务错误
    //  209xx - 断点续传 上传错误

    //  210xx - 机构号相关
    AUTHOR_UID_NULL(21000, "关注作者uid为空"),
    CREATOR_NOT_EXISTS(21001, "您关联的机构号不存在"),

    //  220xx -反馈相关
    FEEDBACK_DOC_EXIST(22001, "您已举报过该视频"),
    FEEDBACK_ORGANIZATION_EXIST(22002, "您已举报过该视频号"),
    FEEDBACK_TYPE_NOT_EXIST(22003, "举报原因必须"),

    // 230xx -屏蔽相关
    BLOCK_ORGANIZATION_EXIST(23001, "您已屏蔽过该视频号"),
    BLOCK_ORGANIZATION_NOT_EXIST(23002, "您未举屏蔽过该视频号"),

    //  500xx - 系统
    NO_PERMISSION(50001, "无权限"),

    //  501xx - 登录注册
    VERIFY_ERROR(50105, "验证码错误"),
    FORBID_USER(50106, "该用户禁止登陆"),
    LOGIN_FAILED_TOO_MANY(50107, "登录错误过多，请15分钟后再尝试"),
    NO_PERMISSION_TO_LOGIN(50108, "无权限登录南都号"),
    PWD_ERROR(50109, "用户名或密码错误"),
    NOT_LOGIN(50110, "未登录"),

    //  600xx - 稿件相关
    DOC_TITLE_NULL(60001, "标题内容为空"),
    DOC_SUMMARY_NULL(60002, "摘要内容为空"),
    DOC_SUMMARY_MAYBE_NULL(60003, "摘要内容为空，可能存在特殊字符请先格式化"),
    DOC_SOURCETYPE_NULL(60004, "类型不能为空"),
    DOC_SOURCE_NULL(60005, "作者项不能为空"),
    DOC_VIDEOSOURCE_NULL(60006, "视频作者项不能为空"),
    DOC_VIDEO_FLAGID_NULL(60007, "请选择视频"),
    DOC_EDIT_STATUS_ERROR(60009, "稿件状态错误"),
    DOC_IMPORTANCE_NULL(60010, "稿件重要性提交非法"),
    DOC_AUDIT_TYPE_NULL(60011, "审核方式有误"),
    DOC_DRAFT_NULL(60015, "审核记录不能为空"),
    DOC_EDIT_EXIST(60012, "已提交稿件无法修改"),
    DOC_TYPE_NOT_EXIST(60013, "提审信息未完善"),
    DOC_CALLBACK_FAILED(60014, "回调失败"),


    //  601xx - 账号相关
    ACCOUNT_EXAMINE_CHECK(60101, "账户信息修改，审核中"),
    ACCOUNT_MEMBER_UID_NULL(60102, "所添加的用户不存在"),
    ACCOUNT_MEMBER_MOBILE_NULL(60103, "所添加的用户手机号为空"),
    ACCOUNT_MEMBER_EXIST(60104, "该用户已是您的运营者账号"),
    ACCOUNT_MEMBER_ONESELF(60105, "不能设置自己为运营者账号"),
    ACCOUNT_MEMBER_NOT_EXIST(60106, "所添加的用户不存在"),
    ACCOUNT_SWITCH_FAILED(60107, "切换账号失败"),
    ACCOUNT_PWD_LEN_EDOC_DRAFT_NULLRROR(60108, "密码长度应为6-12"),
    ACCOUNT_PWD_FORMAT_ERROR(60109, "密码应为大小写字母数字组合"),
    ACCOUNT_NOT_CREATOR_OPERATOR(60110, "您未开通权限，请联系管理员"),

    //  602xx - 审稿相关
    CHECK_DOC_STATUS_ERROR(60200, "审核稿件状态错误"),

    //  604xx - 标签相关
    TAG_EXIST(60400, "标签已存在"),
    TAG_ID_NULL(60401, "标签id空"),
    TAG_NO_PERMISSION(60402, "无权限操作"),
    TAG_DOC_NOT_PUBLISH(60403, "文章非发布状态"),
    TAG_DOC_NOT_EXIST(60404, "文章不存在"),

    //  606xx - 专题相关
    SAPECIAL_TOPIC_TITLE_NEED(60600, "标题必填"),
    SAPECIAL_TOPIC_TMP_TITLEIMG_NEED(60601, "标题图必填"),
    SAPECIAL_TOPIC_TMP_HEADIMG_NEED(60602, "头图必填"),
    SAPECIAL_TOPIC_NOT_FIND(60603, "专题不存在"),
    SAPECIAL_TOPIC_COLUMN_NOT_FIND(60604, "专题栏目不存在"),
    SAPECIAL_TOPIC_COLUMN_SAVE_ERR(60605, "栏目保存失败"),
    SAPECIAL_TOPIC_CONTENT_SAVE_ERR(60606, "内容保存失败"),

    /**
     * 错误码枚举
     */
    FAIL(1, "系统异常"),
    SUCCESS(0, "成功"),
    UNKNOWN_ERROR(-1, "未知错误"),
    APP_LOGIN_ERROR(10110, "用户未登录"),
    /**
     * 小程序用户未登录
     */
    WX_LOGIN_ERROR(80110, "未登录"),
    /**
     * 发稿平台用户未登录
     */
    PC_LOGIN_ERROR(50110, "未登录"),


    /**
     * 905xx - 短信相关
     */
    SMS_MOBILE_NOT_EXIST(90505, "该手机号暂时不能进行实名认证");

    private final String msg;
    private final int code;

    ErrorConfig(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
