package ru.julia.leetcode178.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.leetcode178.dto.RankScore;
import ru.julia.leetcode178.entity.Scores;
import ru.julia.leetcode178.service.ScoreService;

import java.util.List;

@RestController
public class Leetcode178Controller {
    @RequestMapping("/")
    public String welcome() {
        return "hi";
    }
private final ScoreService scoreService;

    public Leetcode178Controller(ScoreService scoreService) {
        this.scoreService = scoreService;
    }
    @RequestMapping("/rankScore")
    public List<RankScore> rankScore() {
        return scoreService.rankScore();
    }
}
