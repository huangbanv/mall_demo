package service;

import domain.vos.PurseVo;
import domain.vos.UserPurseRefundVo;
import domain.vos.UserPurseVo;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:03
 */
public interface PurseService {
	PurseVo getUserPurse();

	void handleUserRefund(UserPurseRefundVo userPurseRefundVo);

	void changeUserPurse(UserPurseVo userPurseVo);
}
