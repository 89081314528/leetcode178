package ru.julia.leetcode178.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.leetcode178.dto.RankScore;
import ru.julia.leetcode178.service.ScoreService;

import java.util.List;

/**
 * 178. Rank Score
 * Write a SQL query to rank scores. If there is a tie between two scores, both should have the same ranking.
 * Note that after a tie, the next ranking number should be the next consecutive integer value.
 * In other words, there should be no "holes" between ranks.
 * <p>
 * +----+-------+
 * | Id | Score |
 * +----+-------+
 * | 1  | 3.50  |
 * | 2  | 3.65  |
 * | 3  | 4.00  |
 * | 4  | 3.85  |
 * | 5  | 4.00  |
 * | 6  | 3.65  |
 * +----+-------+
 * For example, given the above Score table, your query should generate the following report
 * (order by highest score):
 * <p>
 * +-------+---------+
 * | score | Rank    |
 * +-------+---------+
 * | 4.00  | 1       |
 * | 4.00  | 1       |
 * | 3.85  | 2       |
 * | 3.65  | 3       |
 * | 3.65  | 3       |
 * | 3.50  | 4       |
 * +-------+---------+
 */
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
        return scoreService.rankScores();
    }
}
