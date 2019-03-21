import {Component, OnInit} from '@angular/core';
import {CustomerService} from './customer.service';
import {Customer} from '../shared/domain/Customer';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[];
  searchQuery: string;

  constructor(
    private customerService: CustomerService
  ) {
  }

  ngOnInit() {
    this.getCustomers();
  }

  private getCustomers() {
    this.customerService
      .getAllCustomers()
      .subscribe(customers => this.customers = customers);
  }

}
