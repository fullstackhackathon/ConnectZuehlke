import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-hackathon-headline',
  templateUrl: './hackathon-headline.component.html',
  styleUrls: ['./hackathon-headline.component.scss']
})
export class HackathonHeadlineComponent implements OnInit {
  private title: string;

  constructor() {
  }

  ngOnInit() {
    this.title = 'Zühlke Connect';
  }

}
