import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CustomerRoutingModule } from './customer-routing.module';
import {CustomerServiceService} from "./service/customer-service.service";
import { ListCustomerComponent } from './list-customer/list-customer.component';
import {MatButtonModule} from "@angular/material/button";
import { EditCustomerComponent } from './edit-customer/edit-customer.component';
import {ReactiveFormsModule} from "@angular/forms";
import { DeleteCustomerComponent } from './delete-customer/delete-customer.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';


@NgModule({
  declarations: [ListCustomerComponent, EditCustomerComponent, DeleteCustomerComponent, CreateCustomerComponent],
  imports: [
    CommonModule,
    CustomerRoutingModule,
    MatButtonModule,
    ReactiveFormsModule
  ],
  providers: []
})
export class CustomerModule { }
