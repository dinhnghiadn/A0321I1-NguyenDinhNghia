import { Component, OnInit } from '@angular/core';
import {CustomerServiceService} from "../service/customer-service.service";
import {Customer} from "../model/customer";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customerList: Customer[];
  page = 1;
  formSearch: FormGroup;
  name:string;
  id:number;
  constructor (private customerService: CustomerServiceService,
               private fb: FormBuilder
  ) { }

  ngOnInit(): void {
    this.createForm();
    this.customerService.getAllCustomer().subscribe(
      data => {
        this.customerList = data;
        console.log(this.customerList);
      }
    )
  }


  search() {
    this.customerService.searchCustomer(this.formSearch.value).subscribe(
      data => {
        this.page= 1;
        this.customerList = data;
      }
    );

  }
  createForm(){
    this.formSearch = this.fb.group(
      {
        name: [''],
        email: [''],
        customerType: ['']
      }
    )
  }

  getCustomerName(id: number) {
    this.customerService.findById(id).subscribe(
      data => {
        this.name = data.name;
        this.id = data.id;
      }
    )

  }

  deleteCustomer(id: any) {
    this.customerService.delete(id).subscribe(
      data =>{
        this.ngOnInit();
        this.page = 1;
      }
    )

  }
}
