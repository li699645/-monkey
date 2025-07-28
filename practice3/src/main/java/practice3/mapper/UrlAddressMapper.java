package practice3.mapper;

import org.apache.ibatis.annotations.Mapper;
import practice3.pojo.UrlAddress;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 蟹蟹
* @description 针对表【url_address】的数据库操作Mapper
* @createDate 2025-07-26 15:52:14
* @Entity practice3.pojo.UrlAddress
*/
@Mapper
public interface UrlAddressMapper extends BaseMapper<UrlAddress> {

}




