package com.charming.blog.controller.admin;

import com.charming.blog.queryvo.BlogInfo;
import com.charming.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/admin")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/postBlog")
    public String submit(@RequestParam String title,
                         @RequestParam String content,
                         @RequestParam String describe,
                         @RequestParam String type,
                         HttpSession session,
                         RedirectAttributes attributes) {

        BlogInfo blogInfo = new BlogInfo();
        blogInfo.setTitle(title);
        blogInfo.setContent(content);
        Date date = new Date();
        blogInfo.setCreateTime(date);
        blogInfo.setDescription(describe);
        blogInfo.setUpdateTime(date);
        int blogNum =  blogService.submit(blogInfo);
        return "redirect:/index";
    }
}
