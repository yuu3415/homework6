package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")

    public static List<Anime> getAnimes() {

        List<Anime> animelist = List.of(
                new Anime(1, "鬼滅の刃", "バトル"),
                new Anime(2, "こち亀", "コメディ"),
                new Anime(3, "ニセコイ", "恋愛"));

        return animelist;
    }
}
