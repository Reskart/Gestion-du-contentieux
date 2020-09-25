import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AffaireService {

  affaires: any[] = [];
  editMode = false;

  URL = 'http://localhost:8080/apiAffaire';

  constructor(private http:HttpClient) { }

  getAffaire(ref) {
    return this.http.get<any>(this.URL+'/affaireRef/'+ref);
  }

  findAll() {
    return this.http.get<any>(this.URL+'/affaires').pipe(map(value=>this.affaires=value));
  }

  addAffaire(affaire) {
    return this.http.post(this.URL+'/add', affaire, { observe: 'response'} );
  }

  updateAffaire(affaire) {
    return this.http.put(this.URL+'/update', affaire, { observe : 'response'});
  }

  getOne(id){
    return this.http.get<any>(this.URL+'/affaire/'+id);
  }

  getDoc(id){
    return this.http.get<any>(this.URL+'/document/'+id);
  }

}
