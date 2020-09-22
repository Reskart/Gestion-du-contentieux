import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
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

  constructor(private userservice: UserService, private roleservice:RoleService,private router:Router) { }

  form:FormGroup;
  roles:any[]=[];
  rolesToAdd:any[]=[];


  ngOnInit(): void {

    this.roleservice.findAll().subscribe(data=>{
      this.roles = data as []; });


    this.form=new FormGroup({

      email : new FormControl(null,Validators.required),
      nomUtilisateur : new FormControl(null, Validators.required),
      prenomUtilisateur: new FormControl(null, Validators.required),
      role0:new FormControl(null, Validators.required),
      role1:new FormControl(null, Validators.required),
      role2:new FormControl(null, Validators.required),
      role3:new FormControl(null, Validators.required),
      role4:new FormControl(null, Validators.required)

    })


  }

  addUser(){

    for(let i=0;i<this.rolesToAdd.length;i++){
      if(document.getElementById("role"+i)){
        
      }
    }

    

    this.userservice.add(this.form.value).subscribe(response=>
      this.userservice.utilisateurs.push(response.body));
  }

}
