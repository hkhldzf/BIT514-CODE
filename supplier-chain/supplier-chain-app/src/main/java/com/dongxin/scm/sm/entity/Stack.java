package com.dongxin.scm.sm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.jeecg.common.aspect.annotation.Dict;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 装车单主表
 * @Author: jeecg-boot
 * @Date: 2020-12-01
 * @Version: V1.0
 */
@ApiModel(value = "sm_stack对象", description = "装车单主表")
@Data
@TableName("sm_stack")
public class Stack implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键")
    private String id;
    /**
     * 创建人
     */
//    @Excel(name = "创建人", width = 15, dictTable = "sys_user", dicText = "realname", dicCode = "username")
    @Dict(  dictTable = "sys_user", dicText = "realname", dicCode = "username")
    @ApiModelProperty(value = "创建人")
    private String createBy;
    /**
     * 创建日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建日期")
    private Date createTime;
    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private String updateBy;
    /**
     * 更新日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新日期")
    private Date updateTime;
    /**
     * 所属部门
     */
    @ApiModelProperty(value = "所属部门")
    private String sysOrgCode;
    /**
     * 装车单号
     */
    @Excel(name = "装车单号", width = 15)
    @ApiModelProperty(value = "装车单号")
    private String stackingNo;
    /**
     * 销售单号
     */
    @Excel(name = "提单号", width = 15)
    @ApiModelProperty(value = "提单号")
    private String saleBillNo;
    /**
     * 合同编号
     */
    @Excel(name = "合同编号", width = 15)
    @ApiModelProperty(value = "合同编号")
    private String contractNo;
    /**
     * 订单编号
     */
    @Excel(name = "订单编号", width = 15)
    @ApiModelProperty(value = "订单编号")
    private String orderNo;
    /**
     * 重量
     */
    @Excel(name = "重量", width = 15)
    @ApiModelProperty(value = "重量")
    private Double weight;
    /**
     * 数量
     */
    @Excel(name = "数量", width = 15)
    @ApiModelProperty(value = "数量")
    private Double qty;
    /**
     * 顾客
     */
    @Excel(name = "顾客", width = 15)
    @Dict(dictTable = "cm_customer_profile", dicText = "company_name", dicCode = "id")
    @ApiModelProperty(value = "顾客")
    private String customerId;
    /**
     * 顾客名称
     */
    @Excel(name = "顾客", width = 15)
    @ApiModelProperty(value = "顾客")
    private String customerName;
    /**
     * 助记码
     */
    @Excel(name = "助记码", width = 15)
    @ApiModelProperty(value = "助记码")
    private java.lang.String alias;
    /**
     * 仓储
     */
    @Excel(name = "仓储", width = 15)
    @Dict(dictTable = "sm_stock", dicText = "name", dicCode = "id")
    @ApiModelProperty(value = "仓储")
    private String stockNoClass;
    /**
     * 车号
     */
    @Excel(name = "车号", width = 15)
    @ApiModelProperty(value = "车号")
    private String carNo;
    /**
     * 提货人手机号
     */
    @Excel(name = "提货人手机号", width = 15)
    @ApiModelProperty(value = "提货人手机号")
    private String phone;
    /**
     * 船号
     */
    @Excel(name = "船号", width = 15)
    @ApiModelProperty(value = "船号")
    private String shipNo;
    /**
     * 备注
     */
    @Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
    private String remark;
    /**
     * 租户id
     */

    @ApiModelProperty(value = "租户id")
    private String tenantId;
    /**
     * 运输方式
     */
    @Excel(name = "运输方式", width = 15)
    @ApiModelProperty(value = "运输方式")
    private String trnpModeCode;
    /**
     * 业务人员
     */
    @Excel(name = "业务人员", width = 15)
    @Dict(dictTable = "cm_salesman_info", dicText = "name", dicCode = "id")
    @ApiModelProperty(value = "业务人员")
    private String salesMan;
    /**
     * 提货人
     */
    @Excel(name = "提货人", width = 15)
    @ApiModelProperty(value = "提货人")
    private String consigneeName;
    /**
     * 身份证
     */
    @Excel(name = "身份证", width = 15)
    @ApiModelProperty(value = "身份证")
    private String idCard;
    /**
     * 到站
     */
    @Excel(name = "到站", width = 15)
    @ApiModelProperty(value = "到站")
    private String stationCode;
    /**
     * 专用线
     */
    @Excel(name = "专用线", width = 15)
    @ApiModelProperty(value = "专用线")
    private String routeCode;
    /**
     * 目的地
     */
    @Excel(name = "目的地", width = 15)
    @ApiModelProperty(value = "目的地")
    private String destination;
    /**
     * 金额
     */
    @Excel(name = "折扣金额", width = 15)
    @ApiModelProperty(value = "金额")
    private java.math.BigDecimal reducedAmount;
    /**
     * 是否结算
     */
    @Excel(name = "是否结算", width = 15)
    @ApiModelProperty(value = "是否结算")
    private String settled;
    /**
     * 结算id
     */
    @Excel(name = "结算id", width = 15)
    @ApiModelProperty(value = "结算id")
    @TableField(updateStrategy= FieldStrategy.IGNORED)
    private String settledId;
    /**
     * 总金额
     */
    @Excel(name = "总金额", width = 15)
    @ApiModelProperty(value = "总金额")
    private java.math.BigDecimal totalAmount;
    /**
     * 逻辑删除
     */
    @Excel(name = "逻辑删除", width = 15)
    @ApiModelProperty(value = "逻辑删除")
    private Integer delFlag;
    /**
     * 结算金额
     */
    @Excel(name = "结算金额", width = 15)
    @ApiModelProperty(value = "结算金额")
    @TableField(updateStrategy= FieldStrategy.IGNORED)
    private java.math.BigDecimal settledTotalPrice;
    /**
     * 每吨优惠
     */
    @Excel(name = "每吨优惠", width = 15)
    @ApiModelProperty(value = "每吨优惠")
    @TableField(updateStrategy= FieldStrategy.IGNORED)
    private java.math.BigDecimal discount;
    /**
     * 发货时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "发货时间")
    private Date shipDate;


    /**
     * 旧系统销售单号
     */
    @Excel(name = "旧系统装车单号", width = 15)
    @ApiModelProperty(value = "旧系统装车单号")
    private String oldStackNo;
    /**
     * 收料人
     */
    @Excel(name = "收料人", width = 15)
    @ApiModelProperty(value = "收料人")
    private String receivingName;
    /**
     * 收料人电话
     */
    @Excel(name = "收料人电话", width = 15)
    @ApiModelProperty(value = "收料人电话")
    private String receivingPhone;
    /**
     * 收料地址
     */
    @Excel(name = "收料地址", width = 15)
    @ApiModelProperty(value = "收料地址")
    private String receivingAddress;

    /**
     * 删除标记
     */
    private String modifyFlag;

    /**
     * 提单id
     */
    private String salesOrderId;

    /**
     * 装车单状态
     */
    private String status;
    /**
     * 装货人
     */
    @Excel(name = "装货人", width = 15)
    @ApiModelProperty(value = "装货人")
    private String shipperName;
    /**
     * 制单时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "制单时间")
    private Date orderTime;
    /**
     * 装车单页面修改
     */
    @TableField(exist = false)
    private String stackPageUpdate;
   

}
