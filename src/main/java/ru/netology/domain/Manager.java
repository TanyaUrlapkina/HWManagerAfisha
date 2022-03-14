package ru.netology.domain;

public class Manager {

    public Manager manager;
    public int managerLimit = 10;

    public Movies[] movies = new Movies[0];

    public Manager(int managerLimit) {
        this.managerLimit = managerLimit;
    }

    public Manager() {
    }

    public void addNew (Movies movie) {
        save(movie);
    }

    public void save(Movies movie) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movies[] findAll() {
        return movies;
    }

    public Movies[] getAll() {
        Movies[] movies = manager.findAll();
        Movies[] total = new Movies[movies.length];
        for (int i = 0; i < total.length; i++) {
            int index = movies.length - i - 1;
            total[i] = movies[index];
        }
        return total;
    }

    public void removeId(int id) {
        int length = movies.length - 1;
        Movies[] tmp = new Movies[length];
        int index = 0;
        for (Movies movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
            movies = tmp;
        }
    }

    public Movies[] findLast() {
        Movies[] movies = findAll();
        Movies[] total = new Movies[movies.length];
        for (int i = 0; i < total.length; i++) {
            int index = movies.length -i -1;
            total[i] = movies [index];
        }
        return total;

    }

    public Movies[] getMax(int managerLimit){
        Movies[] movies = findLast();
        Movies[] total =new Movies[managerLimit];
        for (int i = 0; i < managerLimit; i++) {
            total[i] = movies[i];
        }

        return total;
    }
}


