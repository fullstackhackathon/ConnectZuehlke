import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {SearchPipe} from './pipes/search.pipe';

@NgModule({
  declarations: [
    SearchPipe
  ],
  exports: [
    SearchPipe
  ],
  imports: [
    CommonModule
  ]
})
export class SharedModule {
}
