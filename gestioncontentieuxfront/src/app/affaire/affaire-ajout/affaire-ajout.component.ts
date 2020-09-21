import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AffaireService } from 'src/service/affaire.service';
import { ActivatedRoute, Params, Router } from '@angular/router';


@Component({
  selector: 'app-affaire-ajout',
  templateUrl: './affaire-ajout.component.html',
  styleUrls: ['./affaire-ajout.component.css']
})
export class AffaireAjoutComponent implements OnInit {

  form: FormGroup;
  affaire: any;
  idAffaire: any;
  mode: boolean;
  affaireUp: any;

  constructor(private affaireService: AffaireService, private router : Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.mode = this.affaireService.editMode;
    this.form = new FormGroup({
      reference : new FormControl(null, Validators.required),
      titre : new FormControl(null, Validators.required),
      description : new FormControl(null, Validators.required),
      statut : new FormControl(null, [Validators.min(0), Validators.max(2), Validators.required])

    });

    this.activatedRoute.params.subscribe((param: Params) => {

      this.idAffaire = param['id'];
      if(this.idAffaire){

        this.affaireService.getOne(this.idAffaire).subscribe((response:any) =>
        
        this.form.setValue({reference: response.reference, titre: response.titre, description: response.description, statut : response.statut})
        
        );
      }
    }); 
  }

    

  addAffaire() {
    this.affaireService.addAffaire(this.form.value).subscribe(response => {
      this.affaireService.affaires.push(response.body);
      this.form.reset();
    });
  }

  updateAffaire() {

    this.activatedRoute.params.subscribe((param: Params) => {

      this.idAffaire = param['id'];
      this.affaireUp = this.form.value;
      this.affaireUp.idAffaire = this.idAffaire;

      this.affaireService.updateAffaire(this.affaireUp).subscribe((response: any) => {
        this.affaire = this.affaireService.affaires.find(this.findIndexToUpdate, response.body.idAffaire);
        const index = this.affaireService.affaires.indexOf(this.affaire);
        this.affaireService.affaires.splice(index,1,response.body);
        this.router.navigate(['/affaire/ajout']);
        this.affaireService.editMode = false;
      })
     
    }); 

  }

  findIndexToUpdate(item) {

    return item.idAffaire === this;
  }


}
