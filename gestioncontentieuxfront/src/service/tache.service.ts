import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class TacheService {

  URL = 'http://localhost:8080/apiTache';
  taches: any [] = [];
  editMode: any;

  constructor( private http:HttpClient) { }

  findall(){
    return this.http.get<any[]>(this.URL+'/taches').pipe(map(value =>this.taches=value))
  }

  add(tache){
    return this.http.post(this.URL+'/add',tache,{observe:'response'});
  }
}
