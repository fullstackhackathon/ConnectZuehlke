import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import {faHeart} from '@fortawesome/free-solid-svg-icons';
import {faAngular, faJava} from '@fortawesome/free-brands-svg-icons';

import {library} from '@fortawesome/fontawesome-svg-core';
import {EmployeeListComponent} from './employee-list/employee-list.component';
import {EmployeeComponent} from './employee/employee.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HttpClientModule} from '@angular/common/http';
import {SearchPipe} from './search.pipe';
import {FormsModule} from '@angular/forms';


// For more icons, please checkout https://fontawesome.com/icons?d=gallery
library.add(faHeart);
library.add(faJava);
library.add(faAngular);


@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    EmployeeComponent,
    PageNotFoundComponent,
    SearchPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    FontAwesomeModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
