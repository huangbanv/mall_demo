package mapstruct;

import domain.dos.Purse;
import domain.vos.PurseChangeHistoryVo;
import domain.vos.PurseVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-19 上午 10:07
 */
@Mapper
public interface PurseMappers {

	PurseMappers PURSE_MAPPER = Mappers.getMapper(PurseMappers.class);

	PurseVo PurseToPurseVo(Purse purse);
}
