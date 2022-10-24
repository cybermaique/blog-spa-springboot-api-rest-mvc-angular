import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class TaskService {
  url = 'http://localhost:8080/api/tarefas';

  constructor(private http: HttpClient) {}

  getTasks(): Observable<any> {
    return this.http.get(this.url);
  }

  getTaskById(id: string): Observable<any> {
    return this.http.get(this.url + '/' + id);
  }

  saveTask(tarefa: Tarefa): Observable<any> {
    return this.http.post(this.url, tarefa);
  }

  editTask(id: string, tarefa: Tarefa): Observable<any> {
    return this.http.put(this.url + '/' + id, tarefa);
  }

  deleteTask(id: string): Observable<any> {
    return this.http.delete(this.url + '/' + id);
  }
}

//db data
export interface Tarefa {
  id: string;
  tarefa: string;
  concluida: boolean;
}
