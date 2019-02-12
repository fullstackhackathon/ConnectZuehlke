import {Pipe, PipeTransform} from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  private static parseAttributes(attributesAsConcatinatedString: string, arrayOfElements: any[]) {
    let attributesAsArray: string[];
    if (attributesAsConcatinatedString === '*') {
      attributesAsArray = SearchPipe.getAllKnownAttributesOfElements(arrayOfElements);
    }
    else {
      attributesAsArray = attributesAsConcatinatedString.split(',');
    }
    return attributesAsArray;
  }

  private static getAllKnownAttributesOfElements(arrayOfElements: any[]) {
    return arrayOfElements.reduce((array, el) => {
      Object.keys(el).forEach(key => SearchPipe.pushIfNotExists(array, key));
      return array;
    }, []);
  }

  private static pushIfNotExists(array, key) {
    if (array.indexOf(key) === -1) {
      array.push(key);
    }
  }

  transform(arrayOfElements: any[], attributesAsConcatinatedString: string, term: string): any {
    if (!term) return arrayOfElements;

    let attributesAsArray = SearchPipe.parseAttributes(attributesAsConcatinatedString, arrayOfElements);

    return (arrayOfElements || [])
      .filter(item => attributesAsArray
        .some(key => item.hasOwnProperty(key) && new RegExp(term, 'gi').test(item[key])));
  }
}
