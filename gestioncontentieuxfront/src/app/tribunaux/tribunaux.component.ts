import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TribunauxService } from 'src/service/tribunaux.service';

@Component({
  selector: 'app-tribunaux',
  templateUrl: './tribunaux.component.html',
  styleUrls: ['./tribunaux.component.css']
})
export class TribunauxComponent implements OnInit {
  


  constructor( private tribunauxService: TribunauxService, private Router : Router) { }
  tribunaux:any[]=[];
  ngOnInit(): void {
    
    this.tribunauxService.findAll().subscribe(data =>{
    this.tribunaux = data as []; });
    }
  }  
