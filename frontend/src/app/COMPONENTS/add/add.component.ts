import { Component, OnInit } from '@angular/core';
import { Task, TaskService } from 'src/app/SERVICE/task.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  newTask: Task={id: ', task: '', done: false};
  constructor(private taskService: TaskService) { }

  ngOnInit(): void {
  }

}
