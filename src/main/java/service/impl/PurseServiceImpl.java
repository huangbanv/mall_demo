package service.impl;

import domain.vos.PurseChangeHistoryVo;
import domain.vos.PurseVo;
import domain.vos.UserPurseRefundVo;
import domain.vos.UserPurseVo;
import mapper.PurseMapper;
import mapstruct.PurseMappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.PurseChangeHistoryService;
import service.PurseService;
import utils.SecurityUtils;

import javax.annotation.Resource;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:03
 */
@Service
public class PurseServiceImpl implements PurseService {

	@Resource
	private PurseMapper purseMapper;

	@Resource
	private PurseChangeHistoryService purseChangeHistoryService;

	@Override
	public PurseVo getUserPurse() {
		return PurseMappers.PURSE_MAPPER.PurseToPurseVo(purseMapper.getUserPurse(SecurityUtils.getUserId()));
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void handleUserRefund(UserPurseRefundVo userPurseRefundVo) {
		purseMapper.handleUserRefund(userPurseRefundVo);
		purseChangeHistoryService.insertPurseChangeHistory(new PurseChangeHistoryVo());
	}

	@Override
	public void changeUserPurse(UserPurseVo userPurseVo) {
		purseMapper.changeUserPurse(userPurseVo,SecurityUtils.getUserId());
		purseChangeHistoryService.insertPurseChangeHistory(new PurseChangeHistoryVo());
	}
}
