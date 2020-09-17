import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-affaire-recherche',
  templateUrl: './affaire-recherche.component.html',
  styleUrls: ['./affaire-recherche.component.css']
})
export class AffaireRechercheComponent implements OnInit {

  form: FormGroup;

  constructor() { }

  ngOnInit(): void {

    this.form = new FormGroup({
      refAffaire: new FormControl(null, Validators.required)
    })
  

}}
