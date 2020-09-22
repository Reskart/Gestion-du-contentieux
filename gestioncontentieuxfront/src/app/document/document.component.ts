import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.css']
})
export class DocumentComponent implements OnInit {

  form : FormGroup;

  constructor() { }

  ngOnInit(): void {
    this.form = new FormGroup({
      dateCreation : new FormControl(null, Validators.required),
      nom : new FormControl(null, Validators.required),
      description: new FormControl(null, Validators.required)
    }
    );
  }

}
