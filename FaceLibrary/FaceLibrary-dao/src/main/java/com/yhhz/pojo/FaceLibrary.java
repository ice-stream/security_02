package com.yhhz.pojo;

import java.util.Date;

public class FaceLibrary {
	/*图片id*/
    private Long flId;

/*    图片时间*/
    private Date flDate;

/*    用户id*/
    private Long userId;

/*    人脸图像*/
    private String flFacegraphics;

  /*  用户名*/
    private String userName;

    public Long getFlId() {
        return flId;
    }

    public void setFlId(Long flId) {
        this.flId = flId;
    }

    public Date getFlDate() {
        return flDate;
    }

    public void setFlDate(Date flDate) {
        this.flDate = flDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFlFacegraphics() {
        return flFacegraphics;
    }

    public void setFlFacegraphics(String flFacegraphics) {
        this.flFacegraphics = flFacegraphics == null ? null : flFacegraphics.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

	@Override
	public String toString() {
		return "FaceLibrary [flId=" + flId + ", flDate=" + flDate + ", userId=" + userId + ", flFacegraphics="
				+ flFacegraphics + ", userName=" + userName + "]";
	}
    
    
}