import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators, ReactiveFormsModule, FormsModule } from '@angular/forms';
import { AffaireService } from 'src/service/affaire.service';

@Component({
  selector: 'app-affaire-recherche',
  templateUrl: './affaire-recherche.component.html',
  styleUrls: ['./affaire-recherche.component.css']
})
export class AffaireRechercheComponent implements OnInit {

  form: FormGroup;
  Affaire: any;

  constructor(private affaireService: AffaireService) { }

  ngOnInit(): void {

    this.form = new FormGroup({
      refAffaire: new FormControl(null, Validators.required)
    })


}

  findByRef() {

    this.affaireService.getAffaire(this.form.value['refAffaire']).subscribe(data => {
    this.Affaire = data;}
    );

  }


}
