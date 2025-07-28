package practice3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.minio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import practice3.mapper.UrlAddressMapper;
import practice3.minio.MinioProperties;
import practice3.pojo.UrlAddress;
import practice3.service.UrlAddressService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
* @author 蟹蟹
* @description 针对表【url_address】的数据库操作Service实现
* @createDate 2025-07-26 15:52:14
*/
@Service
public class UrlAddressServiceImpl extends ServiceImpl<UrlAddressMapper, UrlAddress>
    implements UrlAddressService{
    @Autowired
    MinioClient minioClient;
    @Autowired
    MinioProperties properties;
    @Override
    public String store(MultipartFile file) {
        String bucketName = properties.getBucketName();
        String policyJson = "{\n" +
                "  \"Version\":\"2012-10-17\",\n" +
                "  \"Statement\":[\n" +
                "    {\n" +
                "      \"Effect\":\"Allow\",\n" +
                "      \"Principal\":\"*\",\n" +
                "      \"Action\":\"s3:GetObject\",\n" +
                "      \"Resource\":\"arn:aws:s3:::" + bucketName + "/*\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        try {
         boolean exist=   minioClient.bucketExists(BucketExistsArgs.builder().bucket(properties.getBucketName()).build());
            if(!exist){
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(properties.getBucketName()).build());
                minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().bucket(properties.getBucketName())
                        .config(policyJson).build());
            }
            //SimpleDateformate 日期的格式化器 UUID.radomUUID随机生成ID,保证ID的随机性
            String filename=new SimpleDateFormat("yyyyMMdd").format(new Date())+"/"+ UUID.randomUUID() +"-"
                    +file.getOriginalFilename();
            minioClient.putObject(PutObjectArgs.builder().bucket(properties.getBucketName()).stream(file.getInputStream(),file.getSize(),-1)
                    .object(filename).contentType(file.getContentType()).build());
            String url=String.join("/",properties.getBucketName(),filename);
            //拼接字符串，先传分隔符
            return url;
        } catch (Exception e) {
            e.printStackTrace();
        };

        return null;
    }

}




