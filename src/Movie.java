/**
 * Created by Rizwan on 7/7/2017.
 */


    public class Movie implements Comparable {
        private String title;
        private String genre;


        public Movie(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }


        @Override
        public int compareTo(Object o) {
            Movie m = (Movie) o;
            int titleCompare = this.getTitle().compareTo(m.getTitle());
            if (titleCompare != 0)
                return titleCompare;
            else
                return (this.getTitle().compareToIgnoreCase(m.getTitle()));
        }
    }
