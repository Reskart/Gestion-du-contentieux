import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { TacheService } from './../../../service/tache.service';
import { ActivatedRoute, Router, Params } from '@angular/router';

@Component({
  selector: 'app-ajout-tache',
  templateUrl: './ajout-tache.component.html',
  styleUrls: ['./ajout-tache.component.css']
})
export class AjoutTacheComponent implements OnInit {

  tache: Tache;
  form: FormGroup;
  mode: any;
  activatedRoute: any;
  index: any;
  userService: any;

  constructor(private tacheService: TacheService, private Router: Router) { }

  ngOnInit(): void {
    this.mode = this.tacheService.editMode;
    this.form = new FormGroup({
      dateDreation : new FormControl(null),
      titre : new FormControl(null),
      description : new FormControl(null),
      statutAudience : new FormControl(null)
      })

      this.activatedRoute.params.subscribe ((param: Params) => {
        this.index = param['index'];

        if(this.index) {
          this.form.setValue(this.tacheService.taches [this.index]);
          }
      })

    //this.mode = this.UserService.editMode;
    }

    addTache() {
      this.tacheService.add(this.form.value).subscribe(response =>{
      this.tacheService.taches.push(response.body);
      console.log(this.tacheService.taches);
      this.form.reset();
    });
  }
}
