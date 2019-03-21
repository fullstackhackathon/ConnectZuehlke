import {Injectable} from '@angular/core';
import {Observable, of} from 'rxjs';
import {Project} from '../../shared/domain/Project';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  public getProjects(): Observable<Project[]> {
    return of<Project[]>(
      [
        {
          id: 1,
          name: 'Project 1'
        },
        {
          id: 2,
          name: 'Test 2'
        },
        {
          id: 3,
          name: 'Amazing 3'
        },
        {
          id: 4,
          name: 'Beer 4'
        },
        {
          id: 5,
          name: 'Pizza 5'
        }
      ]
    );
  }
}
