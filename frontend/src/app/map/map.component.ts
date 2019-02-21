import {Component, OnInit} from '@angular/core';
import {GeocodeService} from '../geocode.service';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.scss']
})
export class MapComponent implements OnInit {
  lat: number;
  lng: number;

  constructor(public geocodeService: GeocodeService) {
  }

  ready() {

  }

  ngOnInit(): void {
    let add = "Schlieren";
    this.geocodeService.geocodeFirst(add)
      .then(location => {
        console.log(`${add} was found: ${JSON.stringify(location)}`)
        this.lat = location.geometry.location.lat();
        this.lng = location.geometry.location.lng();
      });
  }
}
