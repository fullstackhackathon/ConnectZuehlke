import {Component, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-topbar',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.scss']
})
export class TopbarComponent {
  @Output() toggleSidbar = new EventEmitter();

  toggle() {
    this.toggleSidbar.emit();
  }
}
