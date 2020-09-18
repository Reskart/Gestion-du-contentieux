import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/service/user.service';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { ngModuleJitUrl } from '@angular/compiler';
import { element } from 'protractor';
import { FormControl, FormGroup , Validators, ReactiveFormsModule, FormsModule} from '@angular/forms';


@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})


export class UserListComponent implements OnInit {

  constructor(private userservice: UserService, private Router: Router, private activatedRoute: ActivatedRoute) { }

  
  utilisateurs:any[]=[];


  
  form: FormGroup;
  formValue:any;
  id:any;

  user:any;
  userS;
  userA;
  
 

  ngOnInit(): void {
    this.userservice.findAll().subscribe(data=>{
      this.utilisateurs = data as []; });
      this.form=new FormGroup({
        id:new FormControl(null, Validators.required)
      })

  }

  finduser(){
    this.formValue=this.form.value;
    this.id=this.formValue['id'];


    this.userservice.getOne(this.id).subscribe(data=>{
      this.user=data;    });

      this.userS = JSON.stringify(this.user);
  }

}
