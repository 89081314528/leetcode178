package ru.julia.leetcode178.service;

import org.springframework.stereotype.Service;
import ru.julia.leetcode178.dto.RankScore;
import ru.julia.leetcode178.entity.Scores;

import java.util.List;

public interface ScoreService {
    public List<RankScore> rankScore();
}
