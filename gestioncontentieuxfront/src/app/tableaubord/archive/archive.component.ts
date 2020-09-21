import { Component, OnInit } from '@angular/core';
import { TDBService } from 'src/service/tdb.service';

@Component({
  selector: 'app-archive',
  templateUrl: './archive.component.html',
  styleUrls: ['./archive.component.css']
})
export class ArchiveComponent implements OnInit {

  constructor(private tdbservice : TDBService) { }
  affaires:any[]=[];
  ngOnInit(): void {
    this.tdbservice.getStatut(2).subscribe(data => {
      this.affaires = data;}
    );
  }

}
