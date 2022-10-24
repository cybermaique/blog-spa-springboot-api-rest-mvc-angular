import { Component, OnInit } from '@angular/core';
import { TaskService } from 'src/app/SERVICE/task.service';

@Component({
  selector: 'app-start',
  templateUrl: './start.component.html',
  styleUrls: ['./start.component.css'],
})
export class StartComponent implements OnInit {
  constructor(private taskService: TaskService) {}

  ngOnInit(): void {
    this.listTasks();
  }

  listTasks() {
    this.taskService.getTasks().subscribe(
      (res) => {
        console.log(res);
      },
      (err) => console.log(err)
    );
  }
}
