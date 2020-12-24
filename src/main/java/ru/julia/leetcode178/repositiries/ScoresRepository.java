package ru.julia.leetcode178.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.leetcode178.entity.Scores;

public interface ScoresRepository extends JpaRepository<Scores,Long> {
}
