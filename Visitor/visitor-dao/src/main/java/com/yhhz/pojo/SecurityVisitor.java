package com.yhhz.pojo;

import java.util.Date;

public class SecurityVisitor {
    
	
	/*访客id*/
	private Long vtId;

	/* 访客名*/
    private String vtName;

	 /*访客日期*/
    private Date vtDate;

	 /*电话*/
    private String vtPhone;

	 /*进入时间*/
    private Date vtBegindat;

	/* 离开时间*/
    private Date vtLeavedate;

	/*  黑名单*/
    private Integer vtBlacklist;

	 /* 图片*/
    private String vtImage;

	  /*会见人*/
    private String vtMeet;

	 /* 版本*/
    private Long vVersions;

    public Long getVtId() {
        return vtId;
    }

    public void setVtId(Long vtId) {
        this.vtId = vtId;
    }

    public String getVtName() {
        return vtName;
    }

    public void setVtName(String vtName) {
        this.vtName = vtName == null ? null : vtName.trim();
    }

    public Date getVtDate() {
        return vtDate;
    }

    public void setVtDate(Date vtDate) {
        this.vtDate = vtDate;
    }

    public String getVtPhone() {
        return vtPhone;
    }

    public void setVtPhone(String vtPhone) {
        this.vtPhone = vtPhone == null ? null : vtPhone.trim();
    }

    public Date getVtBegindat() {
        return vtBegindat;
    }

    public void setVtBegindat(Date vtBegindat) {
        this.vtBegindat = vtBegindat;
    }

    public Date getVtLeavedate() {
        return vtLeavedate;
    }

    public void setVtLeavedate(Date vtLeavedate) {
        this.vtLeavedate = vtLeavedate;
    }

    public Integer getVtBlacklist() {
        return vtBlacklist;
    }

    public void setVtBlacklist(Integer vtBlacklist) {
        this.vtBlacklist = vtBlacklist;
    }

    public String getVtImage() {
        return vtImage;
    }

    public void setVtImage(String vtImage) {
        this.vtImage = vtImage == null ? null : vtImage.trim();
    }

    public String getVtMeet() {
        return vtMeet;
    }

    public void setVtMeet(String vtMeet) {
        this.vtMeet = vtMeet == null ? null : vtMeet.trim();
    }

    public Long getvVersions() {
        return vVersions;
    }

    public void setvVersions(Long vVersions) {
        this.vVersions = vVersions;
    }

	@Override
	public String toString() {
		return "SecurityVisitor [vtId=" + vtId + ", vtName=" + vtName + ", vtDate=" + vtDate + ", vtPhone=" + vtPhone
				+ ", vtBegindat=" + vtBegindat + ", vtLeavedate=" + vtLeavedate + ", vtBlacklist=" + vtBlacklist
				+ ", vtImage=" + vtImage + ", vtMeet=" + vtMeet + ", vVersions=" + vVersions + "]";
	}
    
    
    
}