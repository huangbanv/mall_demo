package controller;

import domain.Result;
import domain.vos.UserPurseRefundVo;
import domain.vos.UserPurseVo;
import org.springframework.web.bind.annotation.*;
import service.PurseService;

import javax.annotation.Resource;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:03
 */
@RequestMapping
@RestController
public class PurseController {

	@Resource
	private PurseService purseService;

	@GetMapping
	public Result<?> getUserPurse(){
		return Result.success(purseService.getUserPurse());
	}

	@PutMapping
	public Result<?> changeUserPurse(@RequestBody UserPurseVo userPurseVo){
		purseService.changeUserPurse(userPurseVo);
		return Result.ok();
	}

	@PutMapping("refund")
	public Result<?> handleUserRefund(@RequestBody UserPurseRefundVo userPurseRefundVo){
		purseService.handleUserRefund(userPurseRefundVo);
		return Result.ok();
	}

}
