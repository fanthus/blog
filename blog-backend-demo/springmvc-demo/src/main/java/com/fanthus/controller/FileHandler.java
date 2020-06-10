package com.fanthus.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/file")
public class FileHandler {
    @PostMapping("/upload")
    public String upload(MultipartFile img, HttpServletRequest request) {
        if (img.getSize()>0) {
            //获取保存上传文件的 file路径
            String path = request.getServletContext().getRealPath("file");
            //获取上传文件名
            String name = img.getOriginalFilename();
            //创建一个同名空文件
            File file = new File(path,name);
            //将文件
            try {
                img.transferTo(file);
                //保存上传之后的文件路径
                request.setAttribute("path","/file/"+name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "upload";
    }

    @GetMapping("/{name}")
    public void download(@PathVariable("name") String name, HttpServletRequest request, HttpServletResponse response) {
        if (name != null) {
            String path = request.getServletContext().getRealPath("file");
            name = name + "jpg";
            File file = new File(path,name);
            OutputStream outputStream = null;
            if (file.exists()) {
                response.setContentType("application/forc-download");
                response.setHeader("Content-Disposition", "attachment;filename="+name);
                try {
                    outputStream = response.getOutputStream();
                    outputStream.write(FileUtils.readFileToByteArray(file));
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}

