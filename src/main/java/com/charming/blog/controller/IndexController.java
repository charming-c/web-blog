package com.charming.blog.controller;

import com.charming.blog.queryvo.FirstPageBlog;
import com.charming.blog.queryvo.UserInfo;
import com.charming.blog.service.FirstPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    FirstPageService firstPageService;

    @GetMapping
    public String loadPage(Model model, RedirectAttributes attributes) {
        int blogCount = firstPageService.getBlogCount();
        int typeCount = firstPageService.getTypeCount();
        UserInfo userInfo = firstPageService.getUserInfo();
        List<FirstPageBlog> firstPageBlogList = firstPageService.getFirstPageBlog();
        model.addAttribute("blogCount",blogCount);
        model.addAttribute("typeCount",typeCount);
        model.addAttribute(userInfo);
        model.addAttribute("firstPageBlogList",firstPageBlogList);
        return "index";
    }

    @GetMapping("index")
    public String loaded(){
        return "index";
    }
}
