import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AffaireService } from 'src/service/affaire.service';

@Component({
  selector: 'app-affaire-ajout',
  templateUrl: './affaire-ajout.component.html',
  styleUrls: ['./affaire-ajout.component.css']
})
export class AffaireAjoutComponent implements OnInit {

  form: FormGroup;

  constructor(private affaireService: AffaireService) { }

  ngOnInit(): void {
    this.form = new FormGroup({
      reference : new FormControl(null, Validators.required),
      titre : new FormControl(null, Validators.required),
      description : new FormControl(null, Validators.required),
      statut : new FormControl(null, [Validators.min(0), Validators.max(2)])

    });
  }

  addAffaire() {
    this.affaireService.addAffaire(this.form.value).subscribe(response => {
      this.affaireService.affaires.push(response.body);
      this.form.reset();
    });
  }

}
