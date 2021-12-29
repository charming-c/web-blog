package com.charming.blog.controller;

import com.charming.blog.entity.Type;
import com.charming.blog.queryvo.DetailBlog;
import com.charming.blog.queryvo.FirstPageBlog;
import com.charming.blog.queryvo.TypeInfo;
import com.charming.blog.queryvo.UserInfo;
import com.charming.blog.service.FirstPageService;
import com.charming.blog.utils.MarkdownUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        List<FirstPageBlog> blogTotal = firstPageService.getBlogTotal();
        List<TypeInfo> typeInfoList = firstPageService.getTypeList();
        model.addAttribute("blogCount",blogCount);
        model.addAttribute("typeCount",typeCount);
        model.addAttribute(userInfo);
        model.addAttribute("firstPageBlogList",firstPageBlogList);
        model.addAttribute("blogTotal",blogTotal);
        model.addAttribute("typeList",typeInfoList);
        return "index";
    }

    @GetMapping("index")
    public String loaded(Model model){
        int blogCount = firstPageService.getBlogCount();
        int typeCount = firstPageService.getTypeCount();
        UserInfo userInfo = firstPageService.getUserInfo();
        List<FirstPageBlog> firstPageBlogList = firstPageService.getFirstPageBlog();
        List<FirstPageBlog> blogTotal = firstPageService.getBlogTotal();
        List<TypeInfo> typeInfoList = firstPageService.getTypeList();
        model.addAttribute("blogCount",blogCount);
        model.addAttribute("typeCount",typeCount);
        model.addAttribute(userInfo);
        model.addAttribute("firstPageBlogList",firstPageBlogList);
        model.addAttribute("blogTotal",blogTotal);
        model.addAttribute("typeList",typeInfoList);
        return "index";
    }

    @GetMapping("detail/{id}")
    public String detailBlog(@PathVariable long id, Model model){
        DetailBlog detailBlog = firstPageService.getDetailBlog(id);
        String content = detailBlog.getContent();
        detailBlog.setContent(MarkdownUtils.markdownToHtmlExtensions(content));
        model.addAttribute("blog", detailBlog);
        model.addAttribute("content",detailBlog.getContent());
        return "detail";
    }
}
