import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ProjectsRoutingModule} from './projects-routing.module';
import {ProjectsListComponent} from './projects-list/projects-list.component';
import {MatChipsModule, MatFormFieldModule, MatIconModule, MatInputModule, MatListModule} from '@angular/material';
import {FormsModule} from '@angular/forms';
import {SharedModule} from '../shared/shared.module';
import {ProjectCardsComponent} from './projects-cards/project-cards.component';
import {MatCardModule} from '@angular/material/card';
import {intersectionObserverPreset, LazyLoadImageModule} from 'ng-lazyload-image';

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
    MatCardModule,
    MatChipsModule,
    MatIconModule,
    LazyLoadImageModule.forRoot({
      preset: intersectionObserverPreset
    }),
  ]
})
export class ProjectsModule {
}
