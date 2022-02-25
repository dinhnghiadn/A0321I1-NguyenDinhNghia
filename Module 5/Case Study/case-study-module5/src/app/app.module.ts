import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {HttpClientModule} from "@angular/common/http";
import { HomeComponent } from './home/home.component';
import {ListCustomerComponent} from "./customer/list-customer/list-customer.component";
import {NgxPaginationModule} from "ngx-pagination";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {CommonModule} from "@angular/common";
import {EditCustomerComponent} from "./customer/edit-customer/edit-customer.component";
import {CreateCustomerComponent} from "./customer/create-customer/create-customer.component";


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListCustomerComponent,
    EditCustomerComponent,
    CreateCustomerComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    NgxPaginationModule,
    FormsModule,
    ReactiveFormsModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
