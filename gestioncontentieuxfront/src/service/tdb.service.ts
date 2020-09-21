import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class TDBService {

  URL = 'http://localhost:8080/apiAffaire'
affaires: any[]=[];

  constructor(private http:HttpClient) { }
  findAll() {
    return this.http.get<any[]>(this.URL+'/affaires').pipe(map(value => this.affaires=value));
  }

  getStatut(statut) {

    return this.http.get<any>(this.URL+'/affaireStatut/'+statut);
}


}
