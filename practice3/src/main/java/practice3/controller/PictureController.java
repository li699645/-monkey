package practice3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import practice3.service.UrlAddressService;

@RestController
@RequestMapping("picture")
public class PictureController {
    @Autowired
    UrlAddressService service;

    @PostMapping("UpDate")
    public String upDateUrl(@RequestParam MultipartFile file){
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        String url =service.store(file);
        return url;


    }

}
