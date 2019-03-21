import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ProjectsRoutingModule} from './projects-routing.module';
import {ProjectsListComponent} from './projects-list/projects-list.component';
import {MatFormFieldModule, MatInputModule, MatListModule} from '@angular/material';
import {FormsModule} from '@angular/forms';
import {SharedModule} from '../shared/shared.module';
import {ProjectCardsComponent} from './projects-cards/project-cards.component';
import {MatCardModule} from '@angular/material/card';

@NgModule({
  declarations: [
    ProjectsListComponent,
    ProjectCardsComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    ProjectsRoutingModule,
    FormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatListModule,
    MatCardModule
  ]
})
export class ProjectsModule {
}
