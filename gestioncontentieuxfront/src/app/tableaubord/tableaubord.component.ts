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
  statut:any;
  ngOnInit(): void {
    const myVar = false;

    this.tdbservice.findAll().subscribe(data =>{
      this.affaires = data as []; });
  }
  findaffairebystatut(){
    this.formValue=this.form.value;
    this.statut=this.formValue['statut'];




    this.tdbservice.getStatut(this.statut).subscribe(data=>{
      this.statut=data;    });

      this.affaires=JSON.parse(JSON.stringify(this.statut));
  }
}
