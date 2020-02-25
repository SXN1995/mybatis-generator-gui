package com.entity4;

import java.io.Serializable;
import java.util.Date;

/**
 * psn_info_b
 * @author 
 */
public class PsnInfoB implements Serializable {
    /**
     * 人员编号
     */
    private String psn_no;

    /**
     * 人员管理码
     */
    private String psn_mgtcode;

    /**
     * 姓名
     */
    private String name;

    /**
     * 曾用名
     */
    private String alis;

    /**
     * 性别
     */
    private String gend;

    /**
     * 出生日期
     */
    private Date brdy;

    /**
     * 证件类型
     */
    private String cert_type;

    /**
     * 证件号码
     */
    private String cert_no;

    /**
     * 电子凭证码
     */
    private String hsecfc_codg;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 手机号码
     */
    private String mob;

    /**
     * 民族
     */
    private String naty;

    /**
     * 国家地区代码
     */
    private String nat_regn_code;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 政治面貌
     */
    private String polstas;

    /**
     * 参加工作日期
     */
    private Date patc_job_date;

    /**
     * 户口性质
     */
    private String resd_nat;

    /**
     * 户口所在地行政区代码值
     */
    private String resd_loc_admdvs;

    /**
     * 户口所在地址
     */
    private String resd_addr;

    /**
     * 户口所在地邮政编码
     */
    private String resd_addr_poscode;

    /**
     * 居住地行政区代码值
     */
    private String live_admdvs;

    /**
     * 居住地(联系)地址
     */
    private String live_addr;

    /**
     * 居住地邮政编码
     */
    private String live_addr_poscode;

    /**
     * 户口簿编号
     */
    private String resdbook_no;

    /**
     * 婚姻状况
     */
    private String mrg_stas;

    /**
     * 健康状况
     */
    private String hlcon;

    /**
     * 备注
     */
    private String memo;

    /**
     * 生存状态
     */
    private String surv_stas;

    /**
     * 多省维护标志用于标记是否多地维护
     */
    private String mul_prov_mnt_flag;

    /**
     * 行政职务
     */
    private String admdut;

    /**
     * 就业状态
     */
    private String emp_stas;

    /**
     * 离退休类型
     */
    private String retr_type;

    /**
     * 毕业院校
     */
    private String grad_schl;

    /**
     * 学历
     */
    private String educ;

    /**
     * 专业技术职务等级
     */
    private String pro_tech_duty_lv;

    /**
     * 国家职业资格等级（工人技术等级）
     */
    private String nat_prof_qua_lv;

    /**
     * 唯一记录号
     */
    private String rid;

    /**
     * 创建人
     */
    private String crter;

    /**
     * 创建人姓名
     */
    private String crter_name;

    /**
     * 创建时间
     */
    private Date crte_time;

    /**
     * 创建机构
     */
    private String crte_optins;

    /**
     * 经办人
     */
    private String opter;

    /**
     * 经办人姓名
     */
    private String opter_name;

    /**
     * 经办时间
     */
    private Date opt_time;

    /**
     * 经办机构
     */
    private String optins;

    /**
     * 版本号
     */
    private String ver;

    private static final long serialVersionUID = 1L;

    public String getPsn_no() {
        return psn_no;
    }

    public void setPsn_no(String psn_no) {
        this.psn_no = psn_no;
    }

    public String getPsn_mgtcode() {
        return psn_mgtcode;
    }

    public void setPsn_mgtcode(String psn_mgtcode) {
        this.psn_mgtcode = psn_mgtcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlis() {
        return alis;
    }

    public void setAlis(String alis) {
        this.alis = alis;
    }

    public String getGend() {
        return gend;
    }

    public void setGend(String gend) {
        this.gend = gend;
    }

    public Date getBrdy() {
        return brdy;
    }

    public void setBrdy(Date brdy) {
        this.brdy = brdy;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getHsecfc_codg() {
        return hsecfc_codg;
    }

    public void setHsecfc_codg(String hsecfc_codg) {
        this.hsecfc_codg = hsecfc_codg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getNaty() {
        return naty;
    }

    public void setNaty(String naty) {
        this.naty = naty;
    }

    public String getNat_regn_code() {
        return nat_regn_code;
    }

    public void setNat_regn_code(String nat_regn_code) {
        this.nat_regn_code = nat_regn_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPolstas() {
        return polstas;
    }

    public void setPolstas(String polstas) {
        this.polstas = polstas;
    }

    public Date getPatc_job_date() {
        return patc_job_date;
    }

    public void setPatc_job_date(Date patc_job_date) {
        this.patc_job_date = patc_job_date;
    }

    public String getResd_nat() {
        return resd_nat;
    }

    public void setResd_nat(String resd_nat) {
        this.resd_nat = resd_nat;
    }

    public String getResd_loc_admdvs() {
        return resd_loc_admdvs;
    }

    public void setResd_loc_admdvs(String resd_loc_admdvs) {
        this.resd_loc_admdvs = resd_loc_admdvs;
    }

    public String getResd_addr() {
        return resd_addr;
    }

    public void setResd_addr(String resd_addr) {
        this.resd_addr = resd_addr;
    }

    public String getResd_addr_poscode() {
        return resd_addr_poscode;
    }

    public void setResd_addr_poscode(String resd_addr_poscode) {
        this.resd_addr_poscode = resd_addr_poscode;
    }

    public String getLive_admdvs() {
        return live_admdvs;
    }

    public void setLive_admdvs(String live_admdvs) {
        this.live_admdvs = live_admdvs;
    }

    public String getLive_addr() {
        return live_addr;
    }

    public void setLive_addr(String live_addr) {
        this.live_addr = live_addr;
    }

    public String getLive_addr_poscode() {
        return live_addr_poscode;
    }

    public void setLive_addr_poscode(String live_addr_poscode) {
        this.live_addr_poscode = live_addr_poscode;
    }

    public String getResdbook_no() {
        return resdbook_no;
    }

    public void setResdbook_no(String resdbook_no) {
        this.resdbook_no = resdbook_no;
    }

    public String getMrg_stas() {
        return mrg_stas;
    }

    public void setMrg_stas(String mrg_stas) {
        this.mrg_stas = mrg_stas;
    }

    public String getHlcon() {
        return hlcon;
    }

    public void setHlcon(String hlcon) {
        this.hlcon = hlcon;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getSurv_stas() {
        return surv_stas;
    }

    public void setSurv_stas(String surv_stas) {
        this.surv_stas = surv_stas;
    }

    public String getMul_prov_mnt_flag() {
        return mul_prov_mnt_flag;
    }

    public void setMul_prov_mnt_flag(String mul_prov_mnt_flag) {
        this.mul_prov_mnt_flag = mul_prov_mnt_flag;
    }

    public String getAdmdut() {
        return admdut;
    }

    public void setAdmdut(String admdut) {
        this.admdut = admdut;
    }

    public String getEmp_stas() {
        return emp_stas;
    }

    public void setEmp_stas(String emp_stas) {
        this.emp_stas = emp_stas;
    }

    public String getRetr_type() {
        return retr_type;
    }

    public void setRetr_type(String retr_type) {
        this.retr_type = retr_type;
    }

    public String getGrad_schl() {
        return grad_schl;
    }

    public void setGrad_schl(String grad_schl) {
        this.grad_schl = grad_schl;
    }

    public String getEduc() {
        return educ;
    }

    public void setEduc(String educ) {
        this.educ = educ;
    }

    public String getPro_tech_duty_lv() {
        return pro_tech_duty_lv;
    }

    public void setPro_tech_duty_lv(String pro_tech_duty_lv) {
        this.pro_tech_duty_lv = pro_tech_duty_lv;
    }

    public String getNat_prof_qua_lv() {
        return nat_prof_qua_lv;
    }

    public void setNat_prof_qua_lv(String nat_prof_qua_lv) {
        this.nat_prof_qua_lv = nat_prof_qua_lv;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getCrter() {
        return crter;
    }

    public void setCrter(String crter) {
        this.crter = crter;
    }

    public String getCrter_name() {
        return crter_name;
    }

    public void setCrter_name(String crter_name) {
        this.crter_name = crter_name;
    }

    public Date getCrte_time() {
        return crte_time;
    }

    public void setCrte_time(Date crte_time) {
        this.crte_time = crte_time;
    }

    public String getCrte_optins() {
        return crte_optins;
    }

    public void setCrte_optins(String crte_optins) {
        this.crte_optins = crte_optins;
    }

    public String getOpter() {
        return opter;
    }

    public void setOpter(String opter) {
        this.opter = opter;
    }

    public String getOpter_name() {
        return opter_name;
    }

    public void setOpter_name(String opter_name) {
        this.opter_name = opter_name;
    }

    public Date getOpt_time() {
        return opt_time;
    }

    public void setOpt_time(Date opt_time) {
        this.opt_time = opt_time;
    }

    public String getOptins() {
        return optins;
    }

    public void setOptins(String optins) {
        this.optins = optins;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PsnInfoB other = (PsnInfoB) that;
        return (this.getPsn_no() == null ? other.getPsn_no() == null : this.getPsn_no().equals(other.getPsn_no()))
            && (this.getPsn_mgtcode() == null ? other.getPsn_mgtcode() == null : this.getPsn_mgtcode().equals(other.getPsn_mgtcode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAlis() == null ? other.getAlis() == null : this.getAlis().equals(other.getAlis()))
            && (this.getGend() == null ? other.getGend() == null : this.getGend().equals(other.getGend()))
            && (this.getBrdy() == null ? other.getBrdy() == null : this.getBrdy().equals(other.getBrdy()))
            && (this.getCert_type() == null ? other.getCert_type() == null : this.getCert_type().equals(other.getCert_type()))
            && (this.getCert_no() == null ? other.getCert_no() == null : this.getCert_no().equals(other.getCert_no()))
            && (this.getHsecfc_codg() == null ? other.getHsecfc_codg() == null : this.getHsecfc_codg().equals(other.getHsecfc_codg()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getMob() == null ? other.getMob() == null : this.getMob().equals(other.getMob()))
            && (this.getNaty() == null ? other.getNaty() == null : this.getNaty().equals(other.getNaty()))
            && (this.getNat_regn_code() == null ? other.getNat_regn_code() == null : this.getNat_regn_code().equals(other.getNat_regn_code()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPolstas() == null ? other.getPolstas() == null : this.getPolstas().equals(other.getPolstas()))
            && (this.getPatc_job_date() == null ? other.getPatc_job_date() == null : this.getPatc_job_date().equals(other.getPatc_job_date()))
            && (this.getResd_nat() == null ? other.getResd_nat() == null : this.getResd_nat().equals(other.getResd_nat()))
            && (this.getResd_loc_admdvs() == null ? other.getResd_loc_admdvs() == null : this.getResd_loc_admdvs().equals(other.getResd_loc_admdvs()))
            && (this.getResd_addr() == null ? other.getResd_addr() == null : this.getResd_addr().equals(other.getResd_addr()))
            && (this.getResd_addr_poscode() == null ? other.getResd_addr_poscode() == null : this.getResd_addr_poscode().equals(other.getResd_addr_poscode()))
            && (this.getLive_admdvs() == null ? other.getLive_admdvs() == null : this.getLive_admdvs().equals(other.getLive_admdvs()))
            && (this.getLive_addr() == null ? other.getLive_addr() == null : this.getLive_addr().equals(other.getLive_addr()))
            && (this.getLive_addr_poscode() == null ? other.getLive_addr_poscode() == null : this.getLive_addr_poscode().equals(other.getLive_addr_poscode()))
            && (this.getResdbook_no() == null ? other.getResdbook_no() == null : this.getResdbook_no().equals(other.getResdbook_no()))
            && (this.getMrg_stas() == null ? other.getMrg_stas() == null : this.getMrg_stas().equals(other.getMrg_stas()))
            && (this.getHlcon() == null ? other.getHlcon() == null : this.getHlcon().equals(other.getHlcon()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getSurv_stas() == null ? other.getSurv_stas() == null : this.getSurv_stas().equals(other.getSurv_stas()))
            && (this.getMul_prov_mnt_flag() == null ? other.getMul_prov_mnt_flag() == null : this.getMul_prov_mnt_flag().equals(other.getMul_prov_mnt_flag()))
            && (this.getAdmdut() == null ? other.getAdmdut() == null : this.getAdmdut().equals(other.getAdmdut()))
            && (this.getEmp_stas() == null ? other.getEmp_stas() == null : this.getEmp_stas().equals(other.getEmp_stas()))
            && (this.getRetr_type() == null ? other.getRetr_type() == null : this.getRetr_type().equals(other.getRetr_type()))
            && (this.getGrad_schl() == null ? other.getGrad_schl() == null : this.getGrad_schl().equals(other.getGrad_schl()))
            && (this.getEduc() == null ? other.getEduc() == null : this.getEduc().equals(other.getEduc()))
            && (this.getPro_tech_duty_lv() == null ? other.getPro_tech_duty_lv() == null : this.getPro_tech_duty_lv().equals(other.getPro_tech_duty_lv()))
            && (this.getNat_prof_qua_lv() == null ? other.getNat_prof_qua_lv() == null : this.getNat_prof_qua_lv().equals(other.getNat_prof_qua_lv()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getCrter() == null ? other.getCrter() == null : this.getCrter().equals(other.getCrter()))
            && (this.getCrter_name() == null ? other.getCrter_name() == null : this.getCrter_name().equals(other.getCrter_name()))
            && (this.getCrte_time() == null ? other.getCrte_time() == null : this.getCrte_time().equals(other.getCrte_time()))
            && (this.getCrte_optins() == null ? other.getCrte_optins() == null : this.getCrte_optins().equals(other.getCrte_optins()))
            && (this.getOpter() == null ? other.getOpter() == null : this.getOpter().equals(other.getOpter()))
            && (this.getOpter_name() == null ? other.getOpter_name() == null : this.getOpter_name().equals(other.getOpter_name()))
            && (this.getOpt_time() == null ? other.getOpt_time() == null : this.getOpt_time().equals(other.getOpt_time()))
            && (this.getOptins() == null ? other.getOptins() == null : this.getOptins().equals(other.getOptins()))
            && (this.getVer() == null ? other.getVer() == null : this.getVer().equals(other.getVer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPsn_no() == null) ? 0 : getPsn_no().hashCode());
        result = prime * result + ((getPsn_mgtcode() == null) ? 0 : getPsn_mgtcode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAlis() == null) ? 0 : getAlis().hashCode());
        result = prime * result + ((getGend() == null) ? 0 : getGend().hashCode());
        result = prime * result + ((getBrdy() == null) ? 0 : getBrdy().hashCode());
        result = prime * result + ((getCert_type() == null) ? 0 : getCert_type().hashCode());
        result = prime * result + ((getCert_no() == null) ? 0 : getCert_no().hashCode());
        result = prime * result + ((getHsecfc_codg() == null) ? 0 : getHsecfc_codg().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getMob() == null) ? 0 : getMob().hashCode());
        result = prime * result + ((getNaty() == null) ? 0 : getNaty().hashCode());
        result = prime * result + ((getNat_regn_code() == null) ? 0 : getNat_regn_code().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPolstas() == null) ? 0 : getPolstas().hashCode());
        result = prime * result + ((getPatc_job_date() == null) ? 0 : getPatc_job_date().hashCode());
        result = prime * result + ((getResd_nat() == null) ? 0 : getResd_nat().hashCode());
        result = prime * result + ((getResd_loc_admdvs() == null) ? 0 : getResd_loc_admdvs().hashCode());
        result = prime * result + ((getResd_addr() == null) ? 0 : getResd_addr().hashCode());
        result = prime * result + ((getResd_addr_poscode() == null) ? 0 : getResd_addr_poscode().hashCode());
        result = prime * result + ((getLive_admdvs() == null) ? 0 : getLive_admdvs().hashCode());
        result = prime * result + ((getLive_addr() == null) ? 0 : getLive_addr().hashCode());
        result = prime * result + ((getLive_addr_poscode() == null) ? 0 : getLive_addr_poscode().hashCode());
        result = prime * result + ((getResdbook_no() == null) ? 0 : getResdbook_no().hashCode());
        result = prime * result + ((getMrg_stas() == null) ? 0 : getMrg_stas().hashCode());
        result = prime * result + ((getHlcon() == null) ? 0 : getHlcon().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getSurv_stas() == null) ? 0 : getSurv_stas().hashCode());
        result = prime * result + ((getMul_prov_mnt_flag() == null) ? 0 : getMul_prov_mnt_flag().hashCode());
        result = prime * result + ((getAdmdut() == null) ? 0 : getAdmdut().hashCode());
        result = prime * result + ((getEmp_stas() == null) ? 0 : getEmp_stas().hashCode());
        result = prime * result + ((getRetr_type() == null) ? 0 : getRetr_type().hashCode());
        result = prime * result + ((getGrad_schl() == null) ? 0 : getGrad_schl().hashCode());
        result = prime * result + ((getEduc() == null) ? 0 : getEduc().hashCode());
        result = prime * result + ((getPro_tech_duty_lv() == null) ? 0 : getPro_tech_duty_lv().hashCode());
        result = prime * result + ((getNat_prof_qua_lv() == null) ? 0 : getNat_prof_qua_lv().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getCrter() == null) ? 0 : getCrter().hashCode());
        result = prime * result + ((getCrter_name() == null) ? 0 : getCrter_name().hashCode());
        result = prime * result + ((getCrte_time() == null) ? 0 : getCrte_time().hashCode());
        result = prime * result + ((getCrte_optins() == null) ? 0 : getCrte_optins().hashCode());
        result = prime * result + ((getOpter() == null) ? 0 : getOpter().hashCode());
        result = prime * result + ((getOpter_name() == null) ? 0 : getOpter_name().hashCode());
        result = prime * result + ((getOpt_time() == null) ? 0 : getOpt_time().hashCode());
        result = prime * result + ((getOptins() == null) ? 0 : getOptins().hashCode());
        result = prime * result + ((getVer() == null) ? 0 : getVer().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psn_no=").append(psn_no);
        sb.append(", psn_mgtcode=").append(psn_mgtcode);
        sb.append(", name=").append(name);
        sb.append(", alis=").append(alis);
        sb.append(", gend=").append(gend);
        sb.append(", brdy=").append(brdy);
        sb.append(", cert_type=").append(cert_type);
        sb.append(", cert_no=").append(cert_no);
        sb.append(", hsecfc_codg=").append(hsecfc_codg);
        sb.append(", tel=").append(tel);
        sb.append(", mob=").append(mob);
        sb.append(", naty=").append(naty);
        sb.append(", nat_regn_code=").append(nat_regn_code);
        sb.append(", email=").append(email);
        sb.append(", polstas=").append(polstas);
        sb.append(", patc_job_date=").append(patc_job_date);
        sb.append(", resd_nat=").append(resd_nat);
        sb.append(", resd_loc_admdvs=").append(resd_loc_admdvs);
        sb.append(", resd_addr=").append(resd_addr);
        sb.append(", resd_addr_poscode=").append(resd_addr_poscode);
        sb.append(", live_admdvs=").append(live_admdvs);
        sb.append(", live_addr=").append(live_addr);
        sb.append(", live_addr_poscode=").append(live_addr_poscode);
        sb.append(", resdbook_no=").append(resdbook_no);
        sb.append(", mrg_stas=").append(mrg_stas);
        sb.append(", hlcon=").append(hlcon);
        sb.append(", memo=").append(memo);
        sb.append(", surv_stas=").append(surv_stas);
        sb.append(", mul_prov_mnt_flag=").append(mul_prov_mnt_flag);
        sb.append(", admdut=").append(admdut);
        sb.append(", emp_stas=").append(emp_stas);
        sb.append(", retr_type=").append(retr_type);
        sb.append(", grad_schl=").append(grad_schl);
        sb.append(", educ=").append(educ);
        sb.append(", pro_tech_duty_lv=").append(pro_tech_duty_lv);
        sb.append(", nat_prof_qua_lv=").append(nat_prof_qua_lv);
        sb.append(", rid=").append(rid);
        sb.append(", crter=").append(crter);
        sb.append(", crter_name=").append(crter_name);
        sb.append(", crte_time=").append(crte_time);
        sb.append(", crte_optins=").append(crte_optins);
        sb.append(", opter=").append(opter);
        sb.append(", opter_name=").append(opter_name);
        sb.append(", opt_time=").append(opt_time);
        sb.append(", optins=").append(optins);
        sb.append(", ver=").append(ver);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}