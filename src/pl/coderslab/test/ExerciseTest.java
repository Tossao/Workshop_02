package pl.coderslab.test;

import pl.coderslab.Dao.ExerciseDao;
import pl.coderslab.model.Exercise;

public class ExerciseTest {
    public static void main(String[] args) {
        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exercise1 = new Exercise(1, "zagrywka", "akcja siatkarska");
        Exercise exercise2 = new Exercise(2, "blok", "akcja siatkarska");
        Exercise exercise3 = new Exercise(3, "atak", "akcja siatkarska");
        Exercise exercise4 = new Exercise(4, "karny", "akcja pilkarska");
        Exercise exercise5 = new Exercise(5, "wolny", "akcja pilkarska");
        Exercise exercise6 = new Exercise(6, "spalony", "akcja pilkarska");
        Exercise exercise7 = new Exercise(7, "rzut za 3", "akcja koszykarska");
        Exercise exercise8 = new Exercise(8, "zbiorka", "akcja koszykarska");
        Exercise exercise9 = new Exercise(9, "osobisty", "akcja koszykarska");

//        exerciseDao.create(exercise1);
//        exerciseDao.create(exercise2);
//        exerciseDao.create(exercise3);
//        exerciseDao.create(exercise4);
//        exerciseDao.create(exercise5);
//        exerciseDao.create(exercise6);
//        exerciseDao.create(exercise7);
//        exerciseDao.create(exercise8);
//        exerciseDao.create(exercise9);

        for (int i = 0; i < exerciseDao.findAll().length; i++) {
            exerciseDao.printExercise(exerciseDao.findAll()[i]);
        }


    }
}
