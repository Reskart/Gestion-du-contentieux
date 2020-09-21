import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { TDBService } from 'src/service/tdb.service';

@Component({
  selector: 'app-tableaubord',
  templateUrl: './tableaubord.component.html',
  styleUrls: ['./tableaubord.component.css']
})
export class TableaubordComponent implements OnInit {

  constructor(private tdbservice : TDBService, private Router: Router, private activatedRoute: ActivatedRoute) { }
  affaires:any[]=[];
  form: FormGroup;
  formValue:any;
 

  ngOnInit(): void {

    this.tdbservice.findAll().subscribe(data =>{
    this.affaires = data as []; });
  }
}
