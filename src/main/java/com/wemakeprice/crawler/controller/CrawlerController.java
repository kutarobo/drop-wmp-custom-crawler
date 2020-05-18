package com.wemakeprice.crawler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CrawlerController {

    //    public ResponseEntity<*> getCrawling(@RequestBody CrawlingRequestDto) {}
    @GetMapping("")
    public String crawlingPage(Model model) {
        return "crawler";
    }
}
