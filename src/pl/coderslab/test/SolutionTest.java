package pl.coderslab.test;

import pl.coderslab.Dao.SolutionDao;
import pl.coderslab.model.Solution;

import java.sql.Timestamp;

public class SolutionTest {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SolutionDao solutionDao = new SolutionDao();
        Solution solution1 = new Solution(1,timestamp, timestamp, "Wykonanie cwiczenia 1", 15, 1);
        Solution solution2 = new Solution(2,timestamp, null, "Wykonanie cwiczenia 1", 16, 1);
        Solution solution3 = new Solution(3,timestamp, null, "Wykonanie cwiczenia 4", 19, 4);
        Solution solution4 = new Solution(4,timestamp, null, "Wykonanie cwiczenia 4", 20, 4);
        Solution solution5 = new Solution(5,timestamp, null, "Wykonanie cwiczenia 7", 21, 7);
        Solution solution6 = new Solution(6,timestamp, null, "Wykonanie cwiczenia 8", 22, 8);

//        solutionDao.create(solution1);
//        solutionDao.create(solution2);
//        solutionDao.create(solution3);
//        solutionDao.create(solution4);
//        solutionDao.create(solution5);
//        solutionDao.create(solution6);
//        solutionDao.update(solution1);

        Solution[] solutions = solutionDao.findAll();

//        for (int i = 0; i < solutions.length; i++) {
//            solutionDao.printSolution(solutions[i]);
//        }

//        for (int i = 0; i <solutionDao.findAll().length ; i++) {
//            solutionDao.printSolution(solutionDao.findAll()[i]);
//        }

//        for (int i = 0; i < solutionDao.findAllByUserId(15).length; i++) {
//            solutionDao.printSolution(solutionDao.findAllByUserId(15)[i]);
//        }

//        for (int i = 0; i < solutionDao.findAllByExerciseId(4).length; i++) {
//            solutionDao.printSolution(solutionDao.findAllByExerciseId(4)[i]);
//        }

    }
}
