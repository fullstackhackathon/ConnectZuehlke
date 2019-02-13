import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-topbar',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.scss']
})
export class TopbarComponent implements OnInit {
  @Output() toggleSidbar = new EventEmitter();

  constructor() {
  }

  ngOnInit() {
  }

  toggle() {
    this.toggleSidbar.emit();
  }
}
