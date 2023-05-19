package mapstruct;

import domain.dos.PurseChangeHistory;
import domain.vos.PurseChangeHistoryVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-19 上午 10:07
 */
@Mapper
public interface PurseChangeHistoryMappers {

	PurseChangeHistoryMappers PURSE_CHANGE_HISTORY_MAPPER = Mappers.getMapper(PurseChangeHistoryMappers.class);

	PurseChangeHistoryVo PurseChangeHistoryToPurseChangeHistoryVo(PurseChangeHistory purseChangeHistory);
}
