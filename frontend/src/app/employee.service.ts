import {Injectable} from '@angular/core';
// This will be automatically replaced with production if we execute the `ng serve` command with `--environment prod`.
import {environment} from '../environments/environment';
import {Observable, of} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {HttpClient} from '@angular/common/http';
import {Employee} from './domain/Employee';


const API_URL = environment.apiUrl;

@Injectable({providedIn: 'root'})
export class EmployeeService {

  constructor(
    private http: HttpClient,
  ) {
  }

  public getAllEmployees(): Observable<Employee[]> {

    return this.http
      .get<Employee[]>(API_URL + '/employees')
      .pipe(catchError(this.handleError('getAllEmployees', [])));

  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  private log(s: string) {
    console.log(`${this}: ${s}`);
  }
}
