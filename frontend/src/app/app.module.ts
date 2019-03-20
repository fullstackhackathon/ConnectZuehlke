import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import {faHeart} from '@fortawesome/free-solid-svg-icons';
import {faAngular, faJava} from '@fortawesome/free-brands-svg-icons';
import {intersectionObserverPreset, LazyLoadImageModule} from 'ng-lazyload-image';


import {library} from '@fortawesome/fontawesome-svg-core';
import {EmployeeListComponent} from './employee-list/employee-list.component';
import {EmployeeComponent} from './employee-list/employee/employee.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import {SearchPipe} from './search.pipe';
import {FormsModule} from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {
  MatButtonModule,
  MatIconModule,
  MatInputModule,
  MatListModule,
  MatSelectModule,
  MatSidenavModule,
  MatSnackBarModule,
  MatToolbarModule
} from '@angular/material';
import {NavigationComponent} from './navigation/navigation.component';
import {LayoutModule} from '@angular/cdk/layout';
import {HackathonHeadlineComponent} from './hackathon-headline/hackathon-headline.component';
import {SidebarComponent} from './navigation/sidebar/sidebar.component';
import {TopbarComponent} from './navigation/topbar/topbar.component';
import {EmployeeDetailComponent} from './employee-detail/employee-detail.component';
import {MapComponent} from './map/map.component';
import {AgmCoreModule} from '@agm/core';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerComponent} from './customer-list/customer/customer.component';
import {ErrorRequestInterceptor} from './common/error-request-interceptor';


// For more icons, please checkout https://fontawesome.com/icons?d=gallery
library.add(faHeart);
library.add(faJava);
library.add(faAngular);


@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmployeeListComponent,
    PageNotFoundComponent,
    SearchPipe,
    NavigationComponent,
    HackathonHeadlineComponent,
    SidebarComponent,
    TopbarComponent,
    EmployeeDetailComponent,
    MapComponent,
    CustomerListComponent,
    CustomerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    FontAwesomeModule,
    LazyLoadImageModule.forRoot({
      preset: intersectionObserverPreset
    }),
    HttpClientModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatButtonModule,
    MatSelectModule,
    MatIconModule,
    MatSnackBarModule,
    LayoutModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    AgmCoreModule.forRoot({apiKey: 'AIzaSyBrgp24CvFV3M0PZGByVDVEG0qn56k8Y-g'})
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS, useClass: ErrorRequestInterceptor, multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
