import {Observable, of} from 'rxjs';
import {Employee} from '../domain/Employee';

export const EMPLOYEES: Employee[] = [
  {firstName: 'John', lastName: 'Doe', id: 1},
  {firstName: 'Max', lastName: 'Mustermann', id: 2},
];

export class EmployeeServiceMock {
  getAllEmployees(): Observable<Employee[]> {
    return of(EMPLOYEES);
  }
}
