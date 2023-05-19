package service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import domain.dos.PurseChangeHistory;
import domain.queries.PurseChangeHistoryQuery;
import domain.vos.PurseChangeHistoryVo;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:16
 */
public interface PurseChangeHistoryService {
	Page<PurseChangeHistoryVo> getPurseChangeHistory(PurseChangeHistoryQuery<PurseChangeHistory> page);

	void insertPurseChangeHistory(PurseChangeHistoryVo purseChangeHistoryVo);
}
