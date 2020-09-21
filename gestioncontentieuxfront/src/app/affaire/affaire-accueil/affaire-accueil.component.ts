import { Component, OnInit } from '@angular/core';
import { AffaireService } from 'src/service/affaire.service';

@Component({
  selector: 'app-affaire-accueil',
  templateUrl: './affaire-accueil.component.html',
  styleUrls: ['./affaire-accueil.component.css']
})
export class AffaireAccueilComponent implements OnInit {

  affairesList: any[] = [];
  constructor(private affaireService : AffaireService) { }

  ngOnInit(): void {
    this.findAll();
  }

  findAll() {

    this.affaireService.findAll().subscribe(data => {
      this.affairesList = data as [];
    });
  }

}
