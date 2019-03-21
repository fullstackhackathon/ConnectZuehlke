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
          code: 'c1234',
          name: 'Project 1',
          description: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt' +
            ' ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et' +
            ' ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum' +
            ' dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore' +
            ' magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet' +
            ' clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.',
          teamSize: 3
        },
        {
          code: 'c4554',
          name: 'Test 2',
          description: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt' +
            ' ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et' +
            ' ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum' +
            ' dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore' +
            ' magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet' +
            ' clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.',
          teamSize: 2
        },
        {
          code: 'c23134',
          name: 'Amazing 3',
          description: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt' +
            ' ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et' +
            ' ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum' +
            ' dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore' +
            ' magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet' +
            ' clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.',
          teamSize: 10
        },
        {
          code: 'q1234',
          name: 'Beer 4',
          description: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt' +
            ' ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et' +
            ' ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum' +
            ' dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore' +
            ' magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet' +
            ' clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.',
          teamSize: 6
        },
        {
          code: 'q123456',
          name: 'Pizza 5',
          description: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt' +
            ' ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et' +
            ' ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum' +
            ' dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore' +
            ' magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet' +
            ' clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.',
          teamSize: 8
        }
      ]
    );
  }
}
