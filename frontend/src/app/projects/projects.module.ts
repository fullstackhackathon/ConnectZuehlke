import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ProjectsRoutingModule} from './projects-routing.module';
import {ProjectsListComponent} from './projects-list/projects-list.component';
import { ProjectCardsComponent } from './projects-cards/project-cards.component';
import {MatCardModule} from '@angular/material/card';

@NgModule({
  declarations: [
    ProjectsListComponent,
    ProjectCardsComponent
  ],
  imports: [
    CommonModule,
    ProjectsRoutingModule,
    MatCardModule
  ]
})
export class ProjectsModule {
}
