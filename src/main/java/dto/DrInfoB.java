package dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * dr_info_b
 * @author 
 */
@Data
public class DrInfoB implements Serializable {
    /**
     * 医师代码
     */
    private String drCode;

    /**
     * 人员编号
     */
    private String psnNo;

    /**
     * 医师姓名
     */
    private String drName;

    /**
     * 个人能力简介
     */
    private String psnItro;

    /**
     * 医师执业类别名称
     */
    private String drPracTypeName;

    /**
     * 医师执业类别
     */
    private String drPracType;

    /**
     * 医师执业范围代码
     */
    private String drPracScpCode;

    /**
     * 医师执业范围名称
     */
    private String drPracScpName;

    /**
     * 执业地区
     */
    private String pracRegn;

    /**
     * 多点执业标志
     */
    private String mulPracFlag;

    /**
     * 主执业机构编号
     */
    private String mainPracinsNo;

    /**
     * 主执业机构名称
     */
    private String mainPracinsName;

    /**
     * 主执业机构地址
     */
    private String mainPracinsAddr;

    /**
     * 离职时间
     */
    private Date nempTime;

    /**
     * 有效标志
     */
    private String valiFlag;

    /**
     * 拥有处方权标志
     */
    private String rxPermFlag;

    /**
     * 医师专业技术职务
     */
    private String drProTechDuty;

    /**
     * 医师专业技术职务名称
     */
    private String drProTechDutyName;

    /**
     * 唯一记录号
     */
    private String rid;

    /**
     * 数据创建时间
     */
    private Date crteTime;

    /**
     * 数据更新时间
     */
    private Date updtTime;

    /**
     * 创建人
     */
    private String crter;

    /**
     * 创建人姓名
     */
    private String crterName;

    /**
     * 创建经办机构
     */
    private String crteOptins;

    /**
     * 经办人
     */
    private String opter;

    /**
     * 经办人姓名
     */
    private String opterName;

    /**
     * 经办时间
     */
    private Date optTime;

    /**
     * 经办机构
     */
    private String optins;

    /**
     * 版本号
     */
    private String ver;

    private static final long serialVersionUID = 1L;
}