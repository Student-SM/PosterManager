package ru.netology.afisha;


public class Afisha {
    protected String[] movies = new String[0];//создаем массив
    protected int limit;//заводим поле лимита фильмов

    public Afisha() {
        limit = 10;
    }

    public Afisha(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {  //метод добавления фильмов
        String[] tmp = new String[movies.length + 1];//создаем новый массив,который на оду ячейку больше старого
        for (int i = 0; i < movies.length; i++) { //копируем всю информацию из старого массива в новый
            tmp[i] = movies[i];

            // for(int i = 0; i < movies.length; i++) { //копируем всю информацию из старого массива в новый
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;// в tmp лежит старый массив,но на еденицу больше
        movies = tmp;

    }

    public String[] findAll() { //метод показать все
        return movies;

    }

    public String[] findLast() { //метод показать последний добавленый постер

        int lengthMovies = Math.min(movies.length, limit);//заводим переменную длины афиши(кол-во фильмов)

//        int lengthMovies;//заводим переменную длины афиши(кол-во фильмов)
//        if (movies.length < limit) { //если фильмов меньше лимита 10,то
//            lengthMovies = movies.length;//,то выводим количество фильмов
//        } else {
//            lengthMovies = limit;}//иначе выводим десять фильмов


        String[] tmp = new String[lengthMovies]; //создаем массив на кол-во  фильмов
        for (int i = 0; i < tmp.length; i++) { //проходим по массиву
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }
}



