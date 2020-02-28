package com.niu.springbootmybatis.controller.param;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-08 17:47
 * @Version 1.0
 */
@Data
public class DataParam {

	@NotBlank
	@Pattern(regexp = "days|weeks|months", message = "取值范围是days, weeks, months")
	private String timeType;

	@NotNull
	private Date startTime;

	@NotNull
	private Date endTime;

	@NotBlank
	@Pattern(regexp = "1|2", message = "取值范围是1,2")
	private String taskType;

}
