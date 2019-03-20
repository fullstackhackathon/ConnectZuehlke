import {HttpErrorResponse, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';
import {Injectable} from "@angular/core"
import {Observable, of} from "rxjs";
import {catchError} from "rxjs/operators";

import {MatSnackBar} from '@angular/material';

@Injectable()
export class ErrorRequestInterceptor implements HttpInterceptor {
  private MAX_DURATION_FOR_ERROR_MESSAGE_MS: 5000;

  constructor(private snackBar: MatSnackBar) {
  }

  intercept(
    req: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {

    return next.handle(req).pipe(
      catchError((err: any) => {
        if (err instanceof HttpErrorResponse) {
          try {
            this.snackBar.open(err.error.title + ": " + err.error.detail, 'close', {
              duration: this.MAX_DURATION_FOR_ERROR_MESSAGE_MS
            });
          } catch (e) {
            this.snackBar.open('An error occurred', 'close', {
              duration: this.MAX_DURATION_FOR_ERROR_MESSAGE_MS
            });
          }
          //log error
        }
        return of(err);
      }));

  }

}
