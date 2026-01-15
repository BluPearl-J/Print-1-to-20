package org.example.data.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "todos")
public class tasksToDo {
    @Id
    public String id;
    public String title;
    public boolean completed;
    public LocalDateTime deadline;
}
