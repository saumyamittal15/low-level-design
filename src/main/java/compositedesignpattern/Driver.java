package compositedesignpattern;



public class Driver {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        FileSystem yjhd = new File("yjhd");
        movieDirectory.add(yjhd);

        Directory comedyMovieDirectory = new Directory("Comedy Movie");
        FileSystem hungama = new File("hungama");
        comedyMovieDirectory.add(hungama);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
