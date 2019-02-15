import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {EmployeeComponent} from './employee.component';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {MatListModule} from '@angular/material';
import {LazyLoadImageModule} from 'ng-lazyload-image';
import {RouterTestingModule} from '@angular/router/testing';

describe('EmployeeComponent', () => {
  let component: EmployeeComponent;
  let fixture: ComponentFixture<EmployeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [EmployeeComponent],
      imports: [
        NoopAnimationsModule,
        MatListModule,
        LazyLoadImageModule,
        RouterTestingModule,
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeComponent);
    component = fixture.componentInstance;
    component.employee = {firstName: 'Max', lastName: 'Mustermann', id: 2, code: 'mmu'};
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
