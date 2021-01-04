package ru.julia.leetcode178.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scores")
public class Score { // в единственном числе так как одна оценка
    @Column(name = "id") // score_id
    @Id
    Long id;
    @Column(name = "score")
    Double score;
    // дабл нельзя использовать при суммировании, умножении и т. д. Надо BigDecimal
// таблицу и колонки нельзя называть одинаково
    public Score() {
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

    public Score(Long id, Double score) {
        this.id = id;
        this.score = score;
    }
}
