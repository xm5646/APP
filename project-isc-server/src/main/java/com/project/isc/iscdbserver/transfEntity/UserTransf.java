package com.project.isc.iscdbserver.transfEntity;

import com.project.isc.iscdbserver.entity.User;
import com.project.isc.iscdbserver.util.StringUtils;
import com.project.isc.iscdbserver.viewentity.UserVO;

public class UserTransf{
	public static UserVO transfToVO(User u) {
		UserVO uvo = new UserVO();
		uvo.setUserId(u.getUserId());
		uvo.setAccount(u.getAccount());
		uvo.setCreateTime(u.getCreateTime());
		uvo.setNickName(StringUtils.getStringHide(u.getNickName()));
		uvo.setInvitationCode(u.getInvitationCode());
		uvo.setIscCoin(u.getIscCoin());
		uvo.setCalculateValue(u.getCalculateValue());
		uvo.setUserPhone(u.getUserPhone());
		//这个表示是不是已经身份证新认证了
		uvo.setUserStatus(u.getUserStatus());
		return uvo;
	}
	
	public static User transfToPO(UserVO uvo) {
		return null;
	}
}
