package mapstruct;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-19 上午 10:10
 */
@Mapper
public interface PageMappers {

	PageMappers PAGE_MAPPER = Mappers.getMapper(PageMappers.class);

	@Mapping(source = "records",target = "records",ignore = true)
	<T,V> Page<V> PageTToPageV(Page<T> page);
}
