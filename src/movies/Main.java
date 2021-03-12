package movies;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("a", 1);
        Movie movie2 = new Movie("b", 10);
        Movie movie3 = new Movie("c", 6);
        Movie movie4 = new Movie("d", 7);
        Movie movie5 = new Movie("e", 3);
        Movie movie6 = new Movie("f", 0);
        Movie movie7 = new Movie("g", 2);
        Movie movie8 = new Movie("h", 5);
        Movie movie9 = new Movie("i", 9);
        Movie movie10 = new Movie("j", 4);
        movie1.storeArray(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10);
    }
}
