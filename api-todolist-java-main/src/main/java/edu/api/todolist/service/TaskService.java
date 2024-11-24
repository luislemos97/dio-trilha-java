package edu.api.todolist.service;

import edu.api.todolist.model.Task;
import edu.api.todolist.model.User;
import edu.api.todolist.repository.TaskRepository;
import edu.api.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    private User getAuthenticatedUser() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    }

    public List<Task> findAll() {
        User user = getAuthenticatedUser();
        return taskRepository.findByUser(user);
    }

    public Optional<Task> findById(Long id) {
        User user = getAuthenticatedUser();
        Optional<Task> task = taskRepository.findById(id);
        return task.filter(t -> t.getUser().getId().equals(user.getId()));
    }

    public Task save(Task task) {
        User user = getAuthenticatedUser();
        task.setUser(user);
        return taskRepository.save(task);
    }

    public void deleteById(Long id) {
        User user = getAuthenticatedUser();
        Optional<Task> task = taskRepository.findById(id);
        task.filter(t -> t.getUser().getId().equals(user.getId()))
                .ifPresent(t -> taskRepository.deleteById(id));
    }
}
