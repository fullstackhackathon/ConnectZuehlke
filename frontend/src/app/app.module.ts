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
import {EmployeeComponent} from './employee/employee.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HttpClientModule} from '@angular/common/http';
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
  MatToolbarModule
} from '@angular/material';
import {NavigationComponent} from './navigation/navigation.component';
import {LayoutModule} from '@angular/cdk/layout';
import {HackathonHeadlineComponent} from './hackathon-headline/hackathon-headline.component';
import {SidebarComponent} from './navigation/sidebar/sidebar.component';
import {TopbarComponent} from './navigation/topbar/topbar.component';


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
    TopbarComponent
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
    LayoutModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
