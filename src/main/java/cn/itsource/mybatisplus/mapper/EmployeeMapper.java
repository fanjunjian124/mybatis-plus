package cn.itsource.mybatisplus.mapper;

import cn.itsource.mybatisplus.domain.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author solargen
 * @since 2019-05-14
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
