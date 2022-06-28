package ru.netology.domain;

public class MoviesManager {

    private int managerLimit = 10;
    private Movies[] moviesList = new Movies[0];

    public MoviesManager() {
    }

    public MoviesManager(int managerLimit) {
        this.managerLimit = managerLimit;
    }

    public Movies[] getMoviesList(){
        return moviesList;
    }

    public void setMoviesList(Movies[] moviesList) {
        this.moviesList = moviesList;
    }

    public int getManagerLimit() {
        return managerLimit;
    }

    public void setManagerLimit(int managerLimit) {
        this.managerLimit = managerLimit;
    }

    public void addMovie(Movies movieAdd){
        int lenght = moviesList.length + 1;
        Movies[] tmp = new Movies[lenght];
        System.arraycopy(moviesList, 0, tmp, 0, moviesList.length);
        int addFilm = tmp.length - 1;
        tmp[addFilm] = movieAdd;
        moviesList = tmp;
    }

    public Movies[] findLast(){
        int resultLenght;
        if (moviesList.length <= managerLimit) {
            resultLenght = moviesList.length;
        } else {
            resultLenght = managerLimit;
        }
        Movies[] result = new Movies[resultLenght];
        for (int i = 0; i < resultLenght; i++){
            int index = moviesList.length - i - 1;
            result[i] = moviesList[index];
        }
        return result;
    }

    public Movies[] findAll(){
        Movies[] result = new Movies[moviesList.length];
        System.arraycopy(moviesList,0, result, 0, result.length);
        return result;
    }
}

