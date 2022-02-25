import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CustomerServiceService} from "../service/customer-service.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../model/customer";
import {CustomerType} from "../model/customer-type";

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  formEdit: FormGroup;
  customer: Customer;
  listCustomerType: CustomerType[];

  constructor(private activeRouter: ActivatedRoute,
              private customerServiceService: CustomerServiceService,
              private fb: FormBuilder,
              private router: Router
  ) {
  }

  ngOnInit(): void {
    this.createForm();
    this.getAllCustomerType();
    // Lấy id bằng paramMap từ url về và gán customer theo id
    this.activeRouter.paramMap.subscribe(
      (param: ParamMap) => {
        const id = param.get('id');
        this.customerServiceService.findById(id).subscribe(
          data => {
            this.customer = data;
            this.formEdit.setValue(this.customer);
            console.log(data);
          }
        );
      }
    )
  }

  createForm() {
    this.formEdit = this.fb.group({
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
    this.customerServiceService.getAllCustomerType().subscribe(
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
    if (this.formEdit.valid){
      this.customerServiceService.updateCustomer(this.formEdit.value).subscribe(
        () => {
          this.router.navigateByUrl('/list-customer');
        }
      );
    }
  }

}
