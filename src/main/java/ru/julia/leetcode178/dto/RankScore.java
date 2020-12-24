package ru.julia.leetcode178.dto;

public class RankScore {
    Double score;
    Long rank;

    public Double getScore() {
        return score;
    }

    public Long getRank() {
        return rank;
    }

    public RankScore(Double score, Long rank) {
        this.score = score;
        this.rank = rank;
    }
}
