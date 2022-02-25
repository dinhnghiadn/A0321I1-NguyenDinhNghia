import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {ListCustomerComponent} from "./customer/list-customer/list-customer.component";
import {EditCustomerComponent} from "./customer/edit-customer/edit-customer.component";
import {CreateCustomerComponent} from "./customer/create-customer/create-customer.component";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'list-customer', component: ListCustomerComponent},
  {path: 'edit-customer/:id', component: EditCustomerComponent},
  {path: 'create-customer', component: CreateCustomerComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
