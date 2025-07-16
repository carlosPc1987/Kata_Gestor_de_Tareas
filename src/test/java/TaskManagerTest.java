import org.example.application.Task;
import org.example.application.TaskManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class TaskManagerTest {

    @Test
    public void givenMultipleTasks_whenGettingPendingTasks_thenOnlyPendingReturned() {
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Estudiar para el test"));
        Task tarea2 = new Task("Enviar proyecto");
        tarea2.markAsCompleted();
        manager.addTask(tarea2);

        List<Task> pendents = manager.getPendingTasks();

        assertEquals(1, pendents.size());
        assertEquals("Estudiar para el test", pendents.get(0).getTitle());

    }
    @Test
    public void givenMultipleTasks_whenGettingCompletedCount_thenReturnsCorrectNumber() {
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Estudiar"));
        Task tarea2 = new Task("Practicar JUnit");
        tarea2.markAsCompleted();
        manager.addTask(tarea2);

        int totalCompletable = manager.getCompletedCount();

        assertEquals(1, totalCompletable);
    }
}