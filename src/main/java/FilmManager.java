public class FilmManager {

    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    //Добавление фильма
    public void addFilm(String film) {
        String[] result = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            result[i] = films[i];
        }
        result[result.length - 1] = film;
        films = result;
    }

    //Вывод всех добавленных фильмов
    public String[] findAll() {
        return films;
    }

    //Вывод последних добавленных фильмов
    public String[] findLast() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = limit;
        }
        String[] find = new String[resultLenght];
        for (int i = 0; i < find.length; i++) {
            find[i] = films[films.length - 1 - i];
        }
        return find;
    }
}
