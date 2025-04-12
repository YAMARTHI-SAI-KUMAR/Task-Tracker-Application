package TaskTracker.TaskTracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import TaskTracker.TaskTracker.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
