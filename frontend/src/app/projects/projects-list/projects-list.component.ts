import {Component, OnInit} from '@angular/core';
import {ProjectService} from '../../core/services/project.service';
import {Observable} from 'rxjs';
import {Project} from '../../shared/domain/Project';

@Component({
  selector: 'app-projects-list',
  templateUrl: './projects-list.component.html',
  styleUrls: ['./projects-list.component.scss']
})
export class ProjectsListComponent implements OnInit {
  public projects: Observable<Project[]>;
  public searchQuery: string;

  constructor(private projectService: ProjectService) {
  }

  ngOnInit() {
    this.projects = this.projectService.getAllProjects();
  }
}
