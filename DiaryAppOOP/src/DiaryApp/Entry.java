package DiaryApp;
import java.time.LocalDateTime;


public class Entry {

        private int id;
        private String title;
        private String body;
        private LocalDateTime dateCreated;

        public Entry(int id, String title, String body) {
            this.id = id;
            this.title = title;
            this.body = body;
            this.dateCreated = java.time.LocalDateTime.now();
        }

        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
        public void  setBody(String body) {
            this.body = body;
        }
        public String getBody() {
            return body;
        }
        public void     setDateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
        }
        public LocalDateTime getDateCreated() {
            return dateCreated;

        }
    }


