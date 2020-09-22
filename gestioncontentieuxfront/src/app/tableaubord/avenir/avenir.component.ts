import { Component, OnInit } from '@angular/core';
import { TDBService } from 'src/service/tdb.service';

@Component({
  selector: 'app-avenir',
  templateUrl: './avenir.component.html',
  styleUrls: ['./avenir.component.css']
})
export class AvenirComponent implements OnInit {

  constructor(private tdbservice : TDBService) { }
  affaires:any[]=[];
  ngOnInit(): void {
      this.tdbservice.getStatut(1).subscribe(data => {
        this.affaires = data;}
      );
    }
  }

