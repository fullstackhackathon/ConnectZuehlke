import {Component, OnInit} from '@angular/core';
import {GeocodeService} from '../core/services/geocode.service';

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
  ngOnInit(): void {
    const adressLookup = 'Schlieren';
    this.geocodeService.geocodeFirst(adressLookup)
      .then(location => {
        this.lat = location.geometry.location.lat();
        this.lng = location.geometry.location.lng();
      });
  }
}
