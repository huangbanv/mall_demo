package mapper;

import domain.dos.Purse;
import domain.vos.UserPurseRefundVo;
import domain.vos.UserPurseVo;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:04
 */
public interface PurseMapper {
	Purse getUserPurse(Long userId);

	void handleUserRefund(UserPurseRefundVo userPurseRefundVo);

	void changeUserPurse(UserPurseVo userPurseVo, Long userId);
}
