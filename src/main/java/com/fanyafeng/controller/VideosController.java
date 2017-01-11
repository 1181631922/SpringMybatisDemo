package com.fanyafeng.controller;

import com.fanyafeng.interceptor.AccessRequired;
import com.fanyafeng.model.ItemsCustomModel;
import com.fanyafeng.model.ItemsQueryVo;
import com.fanyafeng.model.VideosModel;
import com.fanyafeng.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.*;

/**
 * Author： fanyafeng
 * Data： 17/1/4 10:48
 * Email: fanyafeng@live.cn
 */
@Controller
@RequestMapping(value = "/videos")
public class VideosController {

    @Autowired
    private VideoService videoService;

    @RequestMapping(value = "/videosList")
    public String videoList(Model model, VideosModel videosModel) {

//        List<ItemsCustomModel> itemsCustomModelList = itemsService.findItemsList(itemsQueryVo);
//        model.addAttribute("itemsList", itemsCustomModelList);

        List<VideosModel> videosModelList = videoService.findAllVideo();
        model.addAttribute("videoList", videosModelList);
        return "videos/videoList";
    }

    @AccessRequired(required = false)
    @RequestMapping(value = "/findVideoByPage", produces = "application/json")
    @ResponseBody
    public Map<String, Object> getVideoList(int page) {
        Map<String, Object> objectsMap = new HashMap<>();
        objectsMap.put("state", "ok");
        objectsMap.put("videoList", videoService.findVideoByPage(page));
        return objectsMap;
    }

    /**
     * 返回文件类的接口
     *
     * @return
     */
    @RequestMapping(value = "/getPic", produces = MediaType.IMAGE_JPEG_VALUE)//图片可以
    @ResponseBody
    public byte[] getPic() {
        File f = new File("/Users/fanyafeng/IntelliJProject/SpringMybatisDemo/src/main/resources/apk/9.jpg");
        return getByte(f);
    }


    public static byte[] getByte(File file) {
        byte[] bytes = null;
        if (file != null) {
            InputStream is = null;
            try {
                is = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int length = (int) file.length();
            if (length > Integer.MAX_VALUE)   //当文件的长度超过了int的最大值
            {
                System.out.println("this file is max ");
                return null;
            }
            bytes = new byte[length];
            int offset = 0;
            int numRead = 0;
            try {
                while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                    offset += numRead;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //如果得到的字节长度和file实际的长度不一致就可能出错了
            if (offset < bytes.length) {
                System.out.println("file length is error");
                return null;
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bytes;
    }

    @RequestMapping(value = "/insertVideo")
    public String insertVideo() {
        return "videos/insertVideo";
    }

    @RequestMapping(value = "/editVideo")
    public String editVide(Model model, Integer id) {
        VideosModel videosModel = videoService.findVideoById(id);
        if (videosModel != null) {
            model.addAttribute("video", videosModel);
        }
        return "videos/editVideo";
    }

    @RequestMapping(value = "/editVideoSubmit")
    public String insertVideoSubmit(HttpServletRequest httpServletRequest, @ModelAttribute("video") VideosModel videosModel) {

        if (videosModel.getId() == 0) {
            System.out.print("获取的id的数值:无");
            videoService.insertVideo(videosModel);
        } else {
            videoService.updateVideoById(videosModel);
        }
        return "redirect:videosList";
    }

}
