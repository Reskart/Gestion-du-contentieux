import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { AffaireService } from 'src/service/affaire.service';
import { DocumentService } from 'src/service/document.service';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.css']
})
export class DocumentComponent implements OnInit {

  form : FormGroup;
  idAffaire : any;
  affaire : any;

  constructor(private affaireService: AffaireService, private documentService: DocumentService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.form = new FormGroup({
      dateCreation : new FormControl(null, Validators.required),
      nom : new FormControl(null, Validators.required),
      description: new FormControl(null, Validators.required)
    }
    );
  }

  addDocument() {
    
    this.activatedRoute.params.subscribe((param: Params) => {
      this.idAffaire = param['id'];
    });

    this.affaireService.getOne(this.idAffaire).subscribe((data: any) => {
      this.affaire = data;

    })
  }
  
  }
