import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AffaireService } from 'src/service/affaire.service';

@Component({
  selector: 'app-affaire-accueil',
  templateUrl: './affaire-accueil.component.html',
  styleUrls: ['./affaire-accueil.component.css']
})
export class AffaireAccueilComponent implements OnInit {

  affairesList: any[] = [];
  constructor(private affaireService : AffaireService, private router : Router) { }

  ngOnInit(): void {
    this.findAll();
  }

  findAll() {

    this.affaireService.findAll().subscribe(data => {
      this.affairesList = data as [];
    });
  }

  edit(idAffaire){

    this.router.navigate(['/affaire/edit', idAffaire]);
    this.affaireService.editMode = true;

  }

  ajoutDoc(idAffaire){

    this.router.navigate(['/document', idAffaire]);
  }

}
