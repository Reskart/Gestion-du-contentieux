import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AffaireService {

  URL = 'http://localhost:8080/apiAffaire';

  constructor(private http:HttpClient) { }

  getAffaire(ref) {
    return this.http.get<any>(this.URL+'/find/'+ref);
  }
}
