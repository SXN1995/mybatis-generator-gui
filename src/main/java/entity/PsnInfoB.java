package entity;

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
    private String psnNo;

    /**
     * 人员管理码
     */
    private String psnMgtcode;

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
    private String certType;

    /**
     * 证件号码
     */
    private String certNo;

    /**
     * 电子凭证码
     */
    private String hsecfcCodg;

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
    private String natRegnCode;

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
    private Date patcJobDate;

    /**
     * 户口性质
     */
    private String resdNat;

    /**
     * 户口所在地行政区代码值
     */
    private String resdLocAdmdvs;

    /**
     * 户口所在地址
     */
    private String resdAddr;

    /**
     * 户口所在地邮政编码
     */
    private String resdAddrPoscode;

    /**
     * 居住地行政区代码值
     */
    private String liveAdmdvs;

    /**
     * 居住地(联系)地址
     */
    private String liveAddr;

    /**
     * 居住地邮政编码
     */
    private String liveAddrPoscode;

    /**
     * 户口簿编号
     */
    private String resdbookNo;

    /**
     * 婚姻状况
     */
    private String mrgStas;

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
    private String survStas;

    /**
     * 多省维护标志用于标记是否多地维护
     */
    private String mulProvMntFlag;

    /**
     * 行政职务
     */
    private String admdut;

    /**
     * 就业状态
     */
    private String empStas;

    /**
     * 离退休类型
     */
    private String retrType;

    /**
     * 毕业院校
     */
    private String gradSchl;

    /**
     * 学历
     */
    private String educ;

    /**
     * 专业技术职务等级
     */
    private String proTechDutyLv;

    /**
     * 国家职业资格等级（工人技术等级）
     */
    private String natProfQuaLv;

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
    private String crterName;

    /**
     * 创建时间
     */
    private Date crteTime;

    /**
     * 创建机构
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

    public String getPsnNo() {
        return psnNo;
    }

    public void setPsnNo(String psnNo) {
        this.psnNo = psnNo;
    }

    public String getPsnMgtcode() {
        return psnMgtcode;
    }

    public void setPsnMgtcode(String psnMgtcode) {
        this.psnMgtcode = psnMgtcode;
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

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getHsecfcCodg() {
        return hsecfcCodg;
    }

    public void setHsecfcCodg(String hsecfcCodg) {
        this.hsecfcCodg = hsecfcCodg;
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

    public String getNatRegnCode() {
        return natRegnCode;
    }

    public void setNatRegnCode(String natRegnCode) {
        this.natRegnCode = natRegnCode;
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

    public Date getPatcJobDate() {
        return patcJobDate;
    }

    public void setPatcJobDate(Date patcJobDate) {
        this.patcJobDate = patcJobDate;
    }

    public String getResdNat() {
        return resdNat;
    }

    public void setResdNat(String resdNat) {
        this.resdNat = resdNat;
    }

    public String getResdLocAdmdvs() {
        return resdLocAdmdvs;
    }

    public void setResdLocAdmdvs(String resdLocAdmdvs) {
        this.resdLocAdmdvs = resdLocAdmdvs;
    }

    public String getResdAddr() {
        return resdAddr;
    }

    public void setResdAddr(String resdAddr) {
        this.resdAddr = resdAddr;
    }

    public String getResdAddrPoscode() {
        return resdAddrPoscode;
    }

    public void setResdAddrPoscode(String resdAddrPoscode) {
        this.resdAddrPoscode = resdAddrPoscode;
    }

    public String getLiveAdmdvs() {
        return liveAdmdvs;
    }

    public void setLiveAdmdvs(String liveAdmdvs) {
        this.liveAdmdvs = liveAdmdvs;
    }

    public String getLiveAddr() {
        return liveAddr;
    }

    public void setLiveAddr(String liveAddr) {
        this.liveAddr = liveAddr;
    }

    public String getLiveAddrPoscode() {
        return liveAddrPoscode;
    }

    public void setLiveAddrPoscode(String liveAddrPoscode) {
        this.liveAddrPoscode = liveAddrPoscode;
    }

    public String getResdbookNo() {
        return resdbookNo;
    }

    public void setResdbookNo(String resdbookNo) {
        this.resdbookNo = resdbookNo;
    }

    public String getMrgStas() {
        return mrgStas;
    }

    public void setMrgStas(String mrgStas) {
        this.mrgStas = mrgStas;
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

    public String getSurvStas() {
        return survStas;
    }

    public void setSurvStas(String survStas) {
        this.survStas = survStas;
    }

    public String getMulProvMntFlag() {
        return mulProvMntFlag;
    }

    public void setMulProvMntFlag(String mulProvMntFlag) {
        this.mulProvMntFlag = mulProvMntFlag;
    }

    public String getAdmdut() {
        return admdut;
    }

    public void setAdmdut(String admdut) {
        this.admdut = admdut;
    }

    public String getEmpStas() {
        return empStas;
    }

    public void setEmpStas(String empStas) {
        this.empStas = empStas;
    }

    public String getRetrType() {
        return retrType;
    }

    public void setRetrType(String retrType) {
        this.retrType = retrType;
    }

    public String getGradSchl() {
        return gradSchl;
    }

    public void setGradSchl(String gradSchl) {
        this.gradSchl = gradSchl;
    }

    public String getEduc() {
        return educ;
    }

    public void setEduc(String educ) {
        this.educ = educ;
    }

    public String getProTechDutyLv() {
        return proTechDutyLv;
    }

    public void setProTechDutyLv(String proTechDutyLv) {
        this.proTechDutyLv = proTechDutyLv;
    }

    public String getNatProfQuaLv() {
        return natProfQuaLv;
    }

    public void setNatProfQuaLv(String natProfQuaLv) {
        this.natProfQuaLv = natProfQuaLv;
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

    public String getCrterName() {
        return crterName;
    }

    public void setCrterName(String crterName) {
        this.crterName = crterName;
    }

    public Date getCrteTime() {
        return crteTime;
    }

    public void setCrteTime(Date crteTime) {
        this.crteTime = crteTime;
    }

    public String getCrteOptins() {
        return crteOptins;
    }

    public void setCrteOptins(String crteOptins) {
        this.crteOptins = crteOptins;
    }

    public String getOpter() {
        return opter;
    }

    public void setOpter(String opter) {
        this.opter = opter;
    }

    public String getOpterName() {
        return opterName;
    }

    public void setOpterName(String opterName) {
        this.opterName = opterName;
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
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
        return (this.getPsnNo() == null ? other.getPsnNo() == null : this.getPsnNo().equals(other.getPsnNo()))
            && (this.getPsnMgtcode() == null ? other.getPsnMgtcode() == null : this.getPsnMgtcode().equals(other.getPsnMgtcode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAlis() == null ? other.getAlis() == null : this.getAlis().equals(other.getAlis()))
            && (this.getGend() == null ? other.getGend() == null : this.getGend().equals(other.getGend()))
            && (this.getBrdy() == null ? other.getBrdy() == null : this.getBrdy().equals(other.getBrdy()))
            && (this.getCertType() == null ? other.getCertType() == null : this.getCertType().equals(other.getCertType()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getHsecfcCodg() == null ? other.getHsecfcCodg() == null : this.getHsecfcCodg().equals(other.getHsecfcCodg()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getMob() == null ? other.getMob() == null : this.getMob().equals(other.getMob()))
            && (this.getNaty() == null ? other.getNaty() == null : this.getNaty().equals(other.getNaty()))
            && (this.getNatRegnCode() == null ? other.getNatRegnCode() == null : this.getNatRegnCode().equals(other.getNatRegnCode()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPolstas() == null ? other.getPolstas() == null : this.getPolstas().equals(other.getPolstas()))
            && (this.getPatcJobDate() == null ? other.getPatcJobDate() == null : this.getPatcJobDate().equals(other.getPatcJobDate()))
            && (this.getResdNat() == null ? other.getResdNat() == null : this.getResdNat().equals(other.getResdNat()))
            && (this.getResdLocAdmdvs() == null ? other.getResdLocAdmdvs() == null : this.getResdLocAdmdvs().equals(other.getResdLocAdmdvs()))
            && (this.getResdAddr() == null ? other.getResdAddr() == null : this.getResdAddr().equals(other.getResdAddr()))
            && (this.getResdAddrPoscode() == null ? other.getResdAddrPoscode() == null : this.getResdAddrPoscode().equals(other.getResdAddrPoscode()))
            && (this.getLiveAdmdvs() == null ? other.getLiveAdmdvs() == null : this.getLiveAdmdvs().equals(other.getLiveAdmdvs()))
            && (this.getLiveAddr() == null ? other.getLiveAddr() == null : this.getLiveAddr().equals(other.getLiveAddr()))
            && (this.getLiveAddrPoscode() == null ? other.getLiveAddrPoscode() == null : this.getLiveAddrPoscode().equals(other.getLiveAddrPoscode()))
            && (this.getResdbookNo() == null ? other.getResdbookNo() == null : this.getResdbookNo().equals(other.getResdbookNo()))
            && (this.getMrgStas() == null ? other.getMrgStas() == null : this.getMrgStas().equals(other.getMrgStas()))
            && (this.getHlcon() == null ? other.getHlcon() == null : this.getHlcon().equals(other.getHlcon()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getSurvStas() == null ? other.getSurvStas() == null : this.getSurvStas().equals(other.getSurvStas()))
            && (this.getMulProvMntFlag() == null ? other.getMulProvMntFlag() == null : this.getMulProvMntFlag().equals(other.getMulProvMntFlag()))
            && (this.getAdmdut() == null ? other.getAdmdut() == null : this.getAdmdut().equals(other.getAdmdut()))
            && (this.getEmpStas() == null ? other.getEmpStas() == null : this.getEmpStas().equals(other.getEmpStas()))
            && (this.getRetrType() == null ? other.getRetrType() == null : this.getRetrType().equals(other.getRetrType()))
            && (this.getGradSchl() == null ? other.getGradSchl() == null : this.getGradSchl().equals(other.getGradSchl()))
            && (this.getEduc() == null ? other.getEduc() == null : this.getEduc().equals(other.getEduc()))
            && (this.getProTechDutyLv() == null ? other.getProTechDutyLv() == null : this.getProTechDutyLv().equals(other.getProTechDutyLv()))
            && (this.getNatProfQuaLv() == null ? other.getNatProfQuaLv() == null : this.getNatProfQuaLv().equals(other.getNatProfQuaLv()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getCrter() == null ? other.getCrter() == null : this.getCrter().equals(other.getCrter()))
            && (this.getCrterName() == null ? other.getCrterName() == null : this.getCrterName().equals(other.getCrterName()))
            && (this.getCrteTime() == null ? other.getCrteTime() == null : this.getCrteTime().equals(other.getCrteTime()))
            && (this.getCrteOptins() == null ? other.getCrteOptins() == null : this.getCrteOptins().equals(other.getCrteOptins()))
            && (this.getOpter() == null ? other.getOpter() == null : this.getOpter().equals(other.getOpter()))
            && (this.getOpterName() == null ? other.getOpterName() == null : this.getOpterName().equals(other.getOpterName()))
            && (this.getOptTime() == null ? other.getOptTime() == null : this.getOptTime().equals(other.getOptTime()))
            && (this.getOptins() == null ? other.getOptins() == null : this.getOptins().equals(other.getOptins()))
            && (this.getVer() == null ? other.getVer() == null : this.getVer().equals(other.getVer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPsnNo() == null) ? 0 : getPsnNo().hashCode());
        result = prime * result + ((getPsnMgtcode() == null) ? 0 : getPsnMgtcode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAlis() == null) ? 0 : getAlis().hashCode());
        result = prime * result + ((getGend() == null) ? 0 : getGend().hashCode());
        result = prime * result + ((getBrdy() == null) ? 0 : getBrdy().hashCode());
        result = prime * result + ((getCertType() == null) ? 0 : getCertType().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getHsecfcCodg() == null) ? 0 : getHsecfcCodg().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getMob() == null) ? 0 : getMob().hashCode());
        result = prime * result + ((getNaty() == null) ? 0 : getNaty().hashCode());
        result = prime * result + ((getNatRegnCode() == null) ? 0 : getNatRegnCode().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPolstas() == null) ? 0 : getPolstas().hashCode());
        result = prime * result + ((getPatcJobDate() == null) ? 0 : getPatcJobDate().hashCode());
        result = prime * result + ((getResdNat() == null) ? 0 : getResdNat().hashCode());
        result = prime * result + ((getResdLocAdmdvs() == null) ? 0 : getResdLocAdmdvs().hashCode());
        result = prime * result + ((getResdAddr() == null) ? 0 : getResdAddr().hashCode());
        result = prime * result + ((getResdAddrPoscode() == null) ? 0 : getResdAddrPoscode().hashCode());
        result = prime * result + ((getLiveAdmdvs() == null) ? 0 : getLiveAdmdvs().hashCode());
        result = prime * result + ((getLiveAddr() == null) ? 0 : getLiveAddr().hashCode());
        result = prime * result + ((getLiveAddrPoscode() == null) ? 0 : getLiveAddrPoscode().hashCode());
        result = prime * result + ((getResdbookNo() == null) ? 0 : getResdbookNo().hashCode());
        result = prime * result + ((getMrgStas() == null) ? 0 : getMrgStas().hashCode());
        result = prime * result + ((getHlcon() == null) ? 0 : getHlcon().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getSurvStas() == null) ? 0 : getSurvStas().hashCode());
        result = prime * result + ((getMulProvMntFlag() == null) ? 0 : getMulProvMntFlag().hashCode());
        result = prime * result + ((getAdmdut() == null) ? 0 : getAdmdut().hashCode());
        result = prime * result + ((getEmpStas() == null) ? 0 : getEmpStas().hashCode());
        result = prime * result + ((getRetrType() == null) ? 0 : getRetrType().hashCode());
        result = prime * result + ((getGradSchl() == null) ? 0 : getGradSchl().hashCode());
        result = prime * result + ((getEduc() == null) ? 0 : getEduc().hashCode());
        result = prime * result + ((getProTechDutyLv() == null) ? 0 : getProTechDutyLv().hashCode());
        result = prime * result + ((getNatProfQuaLv() == null) ? 0 : getNatProfQuaLv().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getCrter() == null) ? 0 : getCrter().hashCode());
        result = prime * result + ((getCrterName() == null) ? 0 : getCrterName().hashCode());
        result = prime * result + ((getCrteTime() == null) ? 0 : getCrteTime().hashCode());
        result = prime * result + ((getCrteOptins() == null) ? 0 : getCrteOptins().hashCode());
        result = prime * result + ((getOpter() == null) ? 0 : getOpter().hashCode());
        result = prime * result + ((getOpterName() == null) ? 0 : getOpterName().hashCode());
        result = prime * result + ((getOptTime() == null) ? 0 : getOptTime().hashCode());
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
        sb.append(", psnNo=").append(psnNo);
        sb.append(", psnMgtcode=").append(psnMgtcode);
        sb.append(", name=").append(name);
        sb.append(", alis=").append(alis);
        sb.append(", gend=").append(gend);
        sb.append(", brdy=").append(brdy);
        sb.append(", certType=").append(certType);
        sb.append(", certNo=").append(certNo);
        sb.append(", hsecfcCodg=").append(hsecfcCodg);
        sb.append(", tel=").append(tel);
        sb.append(", mob=").append(mob);
        sb.append(", naty=").append(naty);
        sb.append(", natRegnCode=").append(natRegnCode);
        sb.append(", email=").append(email);
        sb.append(", polstas=").append(polstas);
        sb.append(", patcJobDate=").append(patcJobDate);
        sb.append(", resdNat=").append(resdNat);
        sb.append(", resdLocAdmdvs=").append(resdLocAdmdvs);
        sb.append(", resdAddr=").append(resdAddr);
        sb.append(", resdAddrPoscode=").append(resdAddrPoscode);
        sb.append(", liveAdmdvs=").append(liveAdmdvs);
        sb.append(", liveAddr=").append(liveAddr);
        sb.append(", liveAddrPoscode=").append(liveAddrPoscode);
        sb.append(", resdbookNo=").append(resdbookNo);
        sb.append(", mrgStas=").append(mrgStas);
        sb.append(", hlcon=").append(hlcon);
        sb.append(", memo=").append(memo);
        sb.append(", survStas=").append(survStas);
        sb.append(", mulProvMntFlag=").append(mulProvMntFlag);
        sb.append(", admdut=").append(admdut);
        sb.append(", empStas=").append(empStas);
        sb.append(", retrType=").append(retrType);
        sb.append(", gradSchl=").append(gradSchl);
        sb.append(", educ=").append(educ);
        sb.append(", proTechDutyLv=").append(proTechDutyLv);
        sb.append(", natProfQuaLv=").append(natProfQuaLv);
        sb.append(", rid=").append(rid);
        sb.append(", crter=").append(crter);
        sb.append(", crterName=").append(crterName);
        sb.append(", crteTime=").append(crteTime);
        sb.append(", crteOptins=").append(crteOptins);
        sb.append(", opter=").append(opter);
        sb.append(", opterName=").append(opterName);
        sb.append(", optTime=").append(optTime);
        sb.append(", optins=").append(optins);
        sb.append(", ver=").append(ver);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}