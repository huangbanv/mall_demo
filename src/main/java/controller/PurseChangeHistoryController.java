package controller;

import domain.Result;
import domain.dos.PurseChangeHistory;
import domain.queries.PurseChangeHistoryQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PurseChangeHistoryService;

import javax.annotation.Resource;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:03
 */
@RequestMapping
@RestController
public class PurseChangeHistoryController {

	@Resource
	private PurseChangeHistoryService purseChangeHistoryService;

	@GetMapping
	public Result<?> getPurseChangeHistory(PurseChangeHistoryQuery<PurseChangeHistory> page){
		return Result.success(purseChangeHistoryService.getPurseChangeHistory(page));
	}

}
