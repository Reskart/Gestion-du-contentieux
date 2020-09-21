import { Component, OnInit } from '@angular/core';
import { TDBService } from 'src/service/tdb.service';

@Component({
  selector: 'app-encours',
  templateUrl: './encours.component.html',
  styleUrls: ['./encours.component.css']
})
export class EncoursComponent implements OnInit {

  constructor(private tdbservice : TDBService) { }
  affaires:any[]=[];
  ngOnInit(): void {
      this.tdbservice.getStatut(0).subscribe(data => {
        this.affaires = data;}
      );
  }

}
