import {Injectable} from '@angular/core';
import {MapsAPILoader} from '@agm/core';

@Injectable({
  providedIn: 'root'
})
export class GeocodeService {
  private geocoder$: Promise<google.maps.Geocoder>;

  constructor(private mapsApiLoader: MapsAPILoader) {
    // The Google Api is lazy loaded, thats why we need to do this hack.
    this.geocoder$ = new Promise<google.maps.Geocoder>(((resolve, reject) => {
      this.mapsApiLoader.load()
        .then(() => resolve(new google.maps.Geocoder()))
        .catch(reason => reject(reason));
    }));


  }

  geocodeFirst(address: string): Promise<google.maps.GeocoderResult> {
    return this.geocode(address)
      .then(locations => locations[0]);
  }

  geocode(address: string): Promise<google.maps.GeocoderResult[]> {
    return this.geocoder$.then(geocoder => {
      return new Promise<google.maps.GeocoderResult[]>((resolve, reject) => {
        geocoder.geocode({address}, (results: google.maps.GeocoderResult[], status: google.maps.GeocoderStatus) => {
          if (status === google.maps.GeocoderStatus.OK) {
            resolve(results);
          } else {
            reject(status);
          }
        });
      });
    });
  }
}
