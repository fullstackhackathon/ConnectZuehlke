import {Component, Input} from '@angular/core';
import {Employee} from '../../domain/Employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss']
})
export class EmployeeComponent {
  @Input() employee: Employee;
}
