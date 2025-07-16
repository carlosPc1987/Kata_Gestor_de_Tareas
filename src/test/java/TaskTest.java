import org.example.application.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {

    @Test
    public void givenTitle_whenCreatingTask_thenTitleIsSet() {
        Task myFirstTask = new Task("Push Commits");
        assertEquals("Push Commits", myFirstTask.getTitle());
    }

    @Test
    public void givenTask_whenMarkAsCompleted_thenIsCompletedTrue() {
        Task completedTask = new Task("Completar Tarea");
        completedTask.markAsCompleted();
        assertTrue(completedTask.isCompleted());
    }
}