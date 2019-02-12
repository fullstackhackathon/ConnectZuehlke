import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {EmployeeListComponent} from './employee-list.component';
import {FormsModule} from '@angular/forms';
import {SearchPipe} from '../search.pipe';
import {EmployeeService} from '../employee.service';
import {EmployeeServiceMock} from './employee.service-mock';
import {By} from '@angular/platform-browser';
import {DebugElement} from '@angular/core';

describe('EmployeeListComponent', () => {
  let component: EmployeeListComponent;
  let fixture: ComponentFixture<EmployeeListComponent>;
  let searchEl: DebugElement;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        FormsModule,
      ],
      declarations: [
        EmployeeListComponent,
        SearchPipe,
      ],
      providers: [
        {provide: EmployeeService, useClass: EmployeeServiceMock}
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    searchEl = fixture.debugElement.query(By.css('input'));
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should have two employees', () => {
    expect(component.employees.length).toBe(2);
  });

  it('should render two employees', () => {
    const listEl = fixture.debugElement.query(By.css('ul'));
    expect(listEl.children.length).toBe(2);
  });

  function searchList() {
    const inputElement = searchEl.nativeElement;

    inputElement.value = 'John';
    inputElement.dispatchEvent(new Event('input'));
    fixture.detectChanges();
  }

  it('should filter one employees', () => {
    searchList();
    const listEl = fixture.debugElement.query(By.css('ul'));
    expect(listEl.children.length).toBe(1);
  });
});
