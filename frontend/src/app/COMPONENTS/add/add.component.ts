import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Task, TaskService } from 'src/app/SERVICE/task.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css'],
})
export class AddComponent implements OnInit {
  newTask: Task = {
    id: '',
    task: '',
    done: false,
  };
  constructor(private taskService: TaskService, private router: Router) {}

  ngOnInit(): void {}

  addTask() {
    this.taskService.saveTask(this.newTask).subscribe(
      (res) => {
        console.log(res);
        this.router.navigate(['/start']);
      },
      (err) => console.log(err)
    );
  }
}
