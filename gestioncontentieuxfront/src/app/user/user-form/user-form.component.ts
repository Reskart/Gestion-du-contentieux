import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, ReactiveFormsModule, FormArray, FormBuilder } from '@angular/forms';
import { UserService } from 'src/service/user.service';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { RoleService } from 'src/service/role.service';
import { BrowserModule } from '@angular/platform-browser'

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  constructor(private userservice: UserService, private roleservice:RoleService,private router:Router, private fb:FormBuilder) { }

  form:FormGroup;
  roles:any[]=[];
  rolesToAdd:any[]=[];
  marked = false;
  theCheckbox = false;
  index:any;
  listRoles:FormArray;

  ngOnInit(): void {

    this.roleservice.findAll().subscribe(data=>{
      this.roles = data as [];
    this.listRoles=this.form.get('listRoles') as FormArray });

    this.form=new FormGroup({
      email : new FormControl(null,Validators.required),
      nomUtilisateur : new FormControl(null, Validators.required),
      prenomUtilisateur: new FormControl(null, Validators.required),
      // role0:new FormControl(null, Validators.required),
      // role1:new FormControl(null, Validators.required),
      // role2:new FormControl(null, Validators.required),
      // role3:new FormControl(null, Validators.required),
      // role4:new FormControl(null, Validators.required),
      listRoles:new FormArray([new FormControl(null, Validators.required)])

    })

    this.addRoles()
  }

  toggleVisibility(e){
    this.marked= e.target.checked;
  }

  addRoles(){
    for(let k=0;k<=this.roles.length;k++){
      this.form.addControl("role"+k, new FormControl(null, Validators.required));
    }
  }

  addUser(){
   

    this.userservice.add(this.form.value).subscribe(response=>
      this.userservice.utilisateurs.push(response.body));
  }

}
