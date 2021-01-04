package ru.julia.leetcode178.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.leetcode178.entity.Score;

import java.util.List;

public interface ScoresRepository extends JpaRepository<Score,Long> {
//    List<Score> findAllOrderByScore(); неверно назван метод
}
