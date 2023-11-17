package com.acc.jobradar.controller;

import com.acc.jobradar.crawler.IndeedCrawler;
import com.acc.jobradar.crawler.LinkedinCrawler;
import com.acc.jobradar.crawler.WorkopolisCrawler;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CrawlerController {
    private LinkedinCrawler linkedinCrawler;
    private IndeedCrawler indeedCrawler;
    private WorkopolisCrawler workopolisCrawler;
    @GetMapping("/crawlLinkedin")
    public void crawlLinkedin() throws InterruptedException {
        linkedinCrawler.getJobPosting("co-op","Canada");
    }
    @GetMapping("/crawlIndeed")
    public void crawlIndeed() throws InterruptedException {
        indeedCrawler.getJobPosting("co-op","Canada");
    }
    @GetMapping("/crawlWorkopolis")
    public void crawlWorkopolis() throws InterruptedException {
        workopolisCrawler.getJobPosting("co-op","Canada");
    }
}
