package practice3.service;

import org.springframework.web.multipart.MultipartFile;
import practice3.pojo.UrlAddress;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 蟹蟹
* @description 针对表【url_address】的数据库操作Service
* @createDate 2025-07-26 15:52:14
*/
public interface UrlAddressService extends IService<UrlAddress> {

    String store(MultipartFile file);
}
