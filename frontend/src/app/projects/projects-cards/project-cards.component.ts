import {Component, EventEmitter, Input, Output} from '@angular/core';
import {Project} from '../../shared/domain/Project';

@Component({
  selector: 'app-project-cards',
  templateUrl: './project-cards.component.html',
  styleUrls: ['./project-cards.component.scss']
})
export class ProjectCardsComponent {
  @Input() projects: Project[];
  @Output() projectClicked = new EventEmitter();

  public cardClicked(projectId: string): void {
    this.projectClicked.emit(projectId);
  }
}
