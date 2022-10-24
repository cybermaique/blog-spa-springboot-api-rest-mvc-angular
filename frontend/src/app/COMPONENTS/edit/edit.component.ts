import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Task, TaskService } from 'src/app/SERVICE/task.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css'],
})
export class EditComponent implements OnInit {
  id: string = '';

  currentTask: Task = {
    id: '',
    task: '',
    done: false,
  };

  constructor(
    private taskService: TaskService,
    private activatedRouter: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    //recuperar id
    this.id = this.activatedRouter.snapshot.params['id'];
    this.taskService.getTaskById(this.id).subscribe(
      (res) => {
        this.currentTask = res;
      },
      (err) => console.log(err)
    );
  }

  saveChanges() {
    this.taskService.editTask(this.id, this.currentTask).subscribe(
      (res) => {
        this.router.navigate(['/start']);
      },
      (err) => console.log(err)
    );
  }
}
