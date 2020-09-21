import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup , Validators, ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ActivatedRoute, Router, Params } from '@angular/router';
import { TacheService } from 'src/service/tache.service';

@Component({
  selector: 'app-ajout-tache',
  templateUrl: './ajout-tache.component.html',
  styleUrls: ['./ajout-tache.component.css']
})

export class AjoutTacheComponent implements OnInit {

  form: FormGroup;
  mode: any;
  index: any;
  userService: any;

  constructor(private tacheService: TacheService, private activatedRoute: ActivatedRoute, private Router: Router) { }

  ngOnInit(): void {
    this.mode = this.tacheService.editMode;
    this.form = new FormGroup({
      dateDreation : new FormControl(null),
      titre : new FormControl(null,[Validators.required]),
      description : new FormControl(null,[Validators.required]),
      statutAudience : new FormControl(null,[Validators.required])
    })

    this.activatedRoute.params.subscribe ((param: Params) => {
      this.index = param['index'];

      if(this.index) {
        this.tacheService.getOne(this.index).subscribe((response:any) =>
        this.form.setValue(response));
      }
    }) 
  }

  addTache() {
    this.tacheService.add(this.form.value).subscribe(response =>{
      this.tacheService.taches.push(response.body);
      console.log(this.tacheService.taches);
      this.form.reset();
    });
  }
}
