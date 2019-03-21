import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../core/services/employee.service';
import {Employee} from '../shared/domain/Employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.scss']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];
  searchQuery: string;

  constructor(private employeeService: EmployeeService) {
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
