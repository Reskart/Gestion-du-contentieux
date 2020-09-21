import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { UserService } from 'src/service/user.service';
import { ActivatedRoute, Params, Router } from '@angular/router';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  constructor(private userservice: UserService, private router:Router) { }

  form:FormGroup;

  ngOnInit(): void {
    this.form=new FormGroup({
      email : new FormControl(null,Validators.required),
      nomUtilisateur : new FormControl(null, Validators.required),
      prenomUtilisateur: new FormControl(null, Validators.required)

    })
  }

  addUser(){
    this.userservice.add(this.form.value).subscribe(response=>
      this.userservice.utilisateurs.push(response.body));
  }

}
