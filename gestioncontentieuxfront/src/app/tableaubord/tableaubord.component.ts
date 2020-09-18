import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TDBService } from 'src/service/tdb.service';

@Component({
  selector: 'app-tableaubord',
  templateUrl: './tableaubord.component.html',
  styleUrls: ['./tableaubord.component.css']
})
export class TableaubordComponent implements OnInit {

  constructor(private tdbservice : TDBService, private Router : Router) { }
  affaires:any[]=[];

  ngOnInit(): void {
    this.tdbservice.findAll().subscribe(data =>{
      this.affaires = data as []; });
  }

}
