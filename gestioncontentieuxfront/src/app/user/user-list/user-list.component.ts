import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/service/user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormControl, FormGroup , Validators} from '@angular/forms';


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
  name:any;
<<<<<<< HEAD

  user:any;
=======
>>>>>>> 0eb8542014f01943a51bd3f610b90a3069eae25a
  userSS:any[]=[];
  
 

  ngOnInit(): void {
    this.userservice.findAll().subscribe(data=>{
      this.utilisateurs = data as []; });
      this.form=new FormGroup({
        name:new FormControl(null, Validators.required)
      })

  }

  // finduser(){
  //   this.formValue=this.form.value;
  //   this.id=this.formValue['id'];




  //   this.userservice.getOne(this.id).subscribe(data=>{
  //     this.user=data;    });
      

  //     this.userS = JSON.parse(JSON.stringify(this.user));
  // }

  finduserName(){
<<<<<<< HEAD
    

    this.userservice.getName(this.form.value['name']).subscribe(data=>{
      this.userSS=data;    });

      
      

      // this.userS = JSON.stringify(this.user);
=======
    this.formValue=this.form.value;
    this.name=this.formValue['name'];
    this.userservice.getName(this.name).subscribe(data=>{
      this.userSS=data;});
>>>>>>> 0eb8542014f01943a51bd3f610b90a3069eae25a
  }

}
