import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/service/user.service';
import { Router } from '@angular/router';
import { ngModuleJitUrl } from '@angular/compiler';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  constructor(private userservice: UserService, private Router: Router) { }

  utilisateurs:any[]=[];
  id;

  ngOnInit(): void {
    this.userservice.findAll().subscribe(data=>{
      this.utilisateurs = data as []; });

  }

  finduser(){
    this.userservice.getOne(this.id);
  }

}
