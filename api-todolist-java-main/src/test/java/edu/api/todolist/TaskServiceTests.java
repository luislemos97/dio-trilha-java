package edu.api.todolist;

import edu.api.todolist.model.Task;
import edu.api.todolist.repository.TaskRepository;
import edu.api.todolist.service.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TaskServiceTests {

    @Mock
    private TaskRepository taskRepository;
    @InjectMocks
    private TaskService taskService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        List<Task> tasks = List.of(new Task(1L, "Task 1", false));
        when(taskRepository.findAll()).thenReturn(tasks);

        List<Task> result = taskService.findAll();
        assertEquals(1, result.size());
        assertEquals("Task 1", result.getFirst().getTitle());
    }

    @Test
    void testSaveTask() {
        Task task = new Task(null, "New Task", false);
        when(taskRepository.save(task)).thenReturn(new Task(1L, "New Task", false));

        Task result = taskService.save(task);
        assertEquals(1L, result.getId());
        assertEquals("New Task", result.getTitle());
    }

    @Test
    void testDeleteTask() {
        taskService.deleteById(1L);
        verify(taskRepository).deleteById(1L);
    }
}
