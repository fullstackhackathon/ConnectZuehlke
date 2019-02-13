import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {EmployeeListComponent} from './employee-list/employee-list.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HackathonHeadlineComponent} from './hackathon-headline/hackathon-headline.component';

const routes: Routes = [
  {path: 'employees', component: EmployeeListComponent},
  {path: 'welcome', component: HackathonHeadlineComponent},

  {path: '', redirectTo: '/welcome', pathMatch: 'full'},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
