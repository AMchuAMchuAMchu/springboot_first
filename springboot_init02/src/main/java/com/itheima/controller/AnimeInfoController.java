package com.itheima.controller;

import com.alibaba.fastjson2.JSON;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.domain.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.metrics.StartupStep;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_first
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-16 08:17:09
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@RestController
public class AnimeInfoController {

    @Autowired
    private AnimeInfoDao animeInfoDao;

    @GetMapping
    public String getInfo(){

        List<AnimeInfo> animeInfos = animeInfoDao.selectList(null);

        animeInfos.forEach(System.out::println);

        String s = JSON.toJSON(animeInfos).toString();

        return s;


    }

}
