package ru.netology.afisha;



public class Afisha {

    private String[] movies= new String[0];//создаем массив
    private int limit;//заводим поле лимита фильмов

    public Afisha() {
        limit = 10;
    }

    public Afisha(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {  //метод добавления
        String[] tmp = new String[movies.length +1];//создаем новый массив,который на оду ячейку больше старого
        for (int i = 0; i < movies.length; i++) { //копируем всю информацию из старого массива в новый
            tmp[i] = movies[1];
        }
        tmp[tmp.length -1] = movie;// в tmp лежит старый массив,но на еденицу больше
        movies = tmp;

    }

    public String[] findAll() { //метод показать все
        return movies;

    }

    public String[] findLast() { //метод показать последний постер

        int length;//заводим переменную длины афиши
        if (movies.length < limit) {//если фильмов меньше 10,то
            length = movies.length;//,то выводим количество фильмов
        } else {
            length = limit;//иначе выводим десять фильмов
        }
        String[] tmp = new String[length]; //создаем массив на кол-во  фильмов
        for (int i = 0; i < tmp.length; i++) { //проходим по массиву
            tmp[i] = movies[movies.length -1 -i];}
        return tmp;

        }
}

