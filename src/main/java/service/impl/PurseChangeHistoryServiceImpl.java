package service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import domain.dos.PurseChangeHistory;
import domain.queries.PurseChangeHistoryQuery;
import domain.vos.PurseChangeHistoryVo;
import mapper.PurseChangeHistoryMapper;
import mapstruct.PageMappers;
import mapstruct.PurseChangeHistoryMappers;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.PurseChangeHistoryService;
import utils.SecurityUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:16
 */
@Service
public class PurseChangeHistoryServiceImpl implements PurseChangeHistoryService {

	@Resource
	private PurseChangeHistoryMapper purseChangeHistoryMapper;

	@Override
	public Page<PurseChangeHistoryVo> getPurseChangeHistory(PurseChangeHistoryQuery<PurseChangeHistory> page) {
		Page<PurseChangeHistory> purseChangeHistoryPage = purseChangeHistoryMapper.selectUserPurseChangeHistoryPage(page, SecurityUtils.getUserId());
		if (purseChangeHistoryPage != null) {
			List<PurseChangeHistory> purseChangeHistoryList = purseChangeHistoryPage.getRecords();
			if (!CollectionUtils.isEmpty(purseChangeHistoryList)) {
				List<PurseChangeHistoryVo> purseChangeHistoryVoList = new ArrayList<>(purseChangeHistoryList.size());
				purseChangeHistoryList.forEach(purseChangeHistory -> purseChangeHistoryVoList.add(PurseChangeHistoryMappers.PURSE_CHANGE_HISTORY_MAPPER.PurseChangeHistoryToPurseChangeHistoryVo(purseChangeHistory)));
				Page<PurseChangeHistoryVo> purseChangeHistoryVoPage = PageMappers.PAGE_MAPPER.PageTToPageV(purseChangeHistoryPage);
				return purseChangeHistoryVoPage.setRecords(purseChangeHistoryVoList);
			}
		}
		return null;
	}
}
