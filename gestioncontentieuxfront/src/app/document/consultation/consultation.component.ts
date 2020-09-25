import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { AffaireService } from 'src/service/affaire.service';
import { DocumentService } from 'src/service/document.service';

@Component({
  selector: 'app-consultation',
  templateUrl: './consultation.component.html',
  styleUrls: ['./consultation.component.css']
})
export class ConsultationComponent implements OnInit {

  documentsList: any[] = [];
  idAffaire : any;
  
  constructor(private documentService : DocumentService, private activatedRoute: ActivatedRoute, private affaireService: AffaireService) { }

  ngOnInit(): void {
    this.findDoc();
  }

  

  findDoc() {

    this.activatedRoute.params.subscribe((param: Params) => {
      this.idAffaire = param['id'];

      this.affaireService.getDoc(this.idAffaire).subscribe(data => {
        this.documentsList = data as [];
      });

  });
}

}
