import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { UserService } from 'src/service/user.service';
import { Router } from '@angular/router';
import { RoleService } from 'src/service/role.service';


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
  selectRoles: any[]=[];

  ngOnInit(): void {

    this.roleservice.findAll().subscribe(data=>{
      this.roles = data as [];


    this.form=new FormGroup({
      email : new FormControl(null,Validators.required),
      nomUtilisateur : new FormControl(null, Validators.required),
      prenomUtilisateur: new FormControl(null, Validators.required),
    })
    this.addRoles()
    })
  }

  toggleVisibility(e){
    this.marked= e.target.checked;
  }

  addRoles(){
    for(let k=0;k<=this.roles.length;k++){
      this.form.addControl("roles", new FormControl(null, Validators.required));
    }
  }

  addRole(r){
    this.marked=r.target.checked;
  }

  addUser(){
    //this.form.value.roles = this.selectRoles;
    this.userservice.add(this.form.value).subscribe(response=>
      this.userservice.utilisateurs.push(response.body));
      this.form.reset;
  }
  
  changeSelection(event){
    let index = this.selectRoles.indexOf(event.target.value);
    if(index == -1){
      this.selectRoles.push(event.target.value);
    }else{
      this.selectRoles.splice(index,1);
    }
  }
}