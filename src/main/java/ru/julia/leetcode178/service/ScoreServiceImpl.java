package ru.julia.leetcode178.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.julia.leetcode178.dto.RankScore;
import ru.julia.leetcode178.entity.Score;
import ru.julia.leetcode178.repositories.ScoresRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
    private final ScoresRepository scoresRepository;

    public ScoreServiceImpl(ScoresRepository scoresRepository) {
        this.scoresRepository = scoresRepository;
    }

    @Override
    public List<RankScore> rankScores() {
//        List<Score> scores = scoresRepository.findAll();
        List<Score> scores = scoresRepository.findAll(Sort.by(Sort.Direction.DESC, "score"));
        List<Double> listScores = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            listScores.add(scores.get(i).getScore()); // вывести в переменную
        }
//        Collections.sort(listScores);
//        Collections.reverseOrder(listScores);
//        почему нельзя использовать этот метод?
//        Collections.reverse(listScores);
        List<RankScore> rankScores = new ArrayList<>();
        rankScores.add(new RankScore(listScores.get(0), (long) 1));
        int currentRank = 1;
        for (int i = 1; i < listScores.size(); i++) {
            if (!listScores.get(i).equals(listScores.get(i - 1))) {
                currentRank = currentRank + 1;
            }
            rankScores.add(new RankScore(listScores.get(i), (long) currentRank));
        }
        return rankScores;
    }
}
