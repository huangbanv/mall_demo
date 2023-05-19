package mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import domain.dos.PurseChangeHistory;
import domain.queries.PurseChangeHistoryQuery;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:04
 */
public interface PurseChangeHistoryMapper {
	Page<PurseChangeHistory> selectUserPurseChangeHistoryPage(PurseChangeHistoryQuery<PurseChangeHistory> page, Long userId);

	void insertPurseChangeHistory(PurseChangeHistory purseChangeHistoryVoToPurseChangeHistory);
}
