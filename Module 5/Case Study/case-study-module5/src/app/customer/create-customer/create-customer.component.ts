import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../model/customer";
import {CustomerType} from "../model/customer-type";
import {CustomerServiceService} from "../service/customer-service.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  formCreate: FormGroup;
  customer: Customer;
  listCustomerType: CustomerType[];
  constructor( private fb : FormBuilder,
               private customerService : CustomerServiceService,
               public router : Router

  ) { }

  ngOnInit(): void {
    this.createForm();
    this.getAllCustomerType();
  }

  createForm() {
    this.formCreate = this.fb.group({
      id: [''],
      name: ['',[Validators.required]],
      birthday: ['',[Validators.required]],
      gender: ['',[Validators.required]],
      idCard: ['',[Validators.required,Validators.pattern('^[0-9]{9}$|^[0-9]{12}$')]],
      phone: ['',[Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      email: ['',[Validators.required,Validators.email]],
      customerType: ['',[Validators.required]],
      address: ['',[Validators.required]],
    })
  }
  getAllCustomerType() {
    this.customerService.getAllCustomerType().subscribe(
      data => {
        this.listCustomerType = data;
        console.log(data);
      }
    )
  }
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  onSubmit(){
    if (this.formCreate.valid){
      this.customerService.createCustomer(this.formCreate.value).subscribe(
        () => {
          this.router.navigateByUrl('/list-customer');
        }
      );
    }
  }

}
