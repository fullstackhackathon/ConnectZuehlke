import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../employee.service';
import {Employee} from '../domain/Employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.scss']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];

  constructor(
    private employeeService: EmployeeService
  ) {
  }

  ngOnInit() {
    this.getEmployees();
  }

  private getEmployees() {
    this.employeeService
      .getAllEmployees()
      .subscribe(employees => this.employees = employees);
  }
}
