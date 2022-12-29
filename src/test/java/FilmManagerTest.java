import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    //Без выставленного лимита
    //Добавление фильма
    @Test
    public void addFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод всех фильмов
    @Test
    public void viewAllFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //ВЫВОД БЕЗ ЛИМИТА
    //Вывод последнего фильма пустой библиотеки
    @Test
    public void findLastNullFilms() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последнего фильма с 1 фильмом в библиотеке
    @Test
    public void findLastOneFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 2 фильмами в библиотеке
    @Test
    public void findLastTwoFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");

        String[] expected = {"Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 5 фильмами в библиотеке
    @Test
    public void findLastFiveFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 9 фильмами в библиотеке
    @Test
    public void findLastNineFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");

        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод послежних фильмов с 10 фильмами в библиотеке
    @Test
    public void findLastTenFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод послежних фильмов с 11 фильмами в библиотеке
    @Test
    public void findLastElevenFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");

        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    //С ВЫСТАВЛЕННЫМ ЛИМИТОМ 5 ФИЛЬМОВ
    //Вывод последних фильмов с 0 фильмов в библиотеке
    @Test
    public void findLastNullLimitFilm() {
        FilmManager manager = new FilmManager(5);

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 1 фильмом в библиотеке
    @Test
    public void findLastOneLimitFilm() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 2 фильмами в библиотеке
    @Test
    public void findLastTwoLimitFilm() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");

        String[] expected = {"Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 9 фильмами в библиотеке
    @Test
    public void findLastNineLimitFilm() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");

        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 10 фильмами в библиотеке
    @Test
    public void findLastTenLimitFilm() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод последних фильмов с 11 фильмами в библиотеке
    @Test
    public void findLastElevenLimitFilm() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");

        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
