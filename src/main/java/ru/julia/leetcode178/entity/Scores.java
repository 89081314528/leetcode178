package ru.julia.leetcode178.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scores")
public class Scores {
    @Column(name = "id")
    @Id
    Long id;
    @Column(name = "score")
    Double score;

    public Scores() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public Double getScore() {
        return score;
    }

    public Scores(Long id, Double score) {
        this.id = id;
        this.score = score;
    }
}
