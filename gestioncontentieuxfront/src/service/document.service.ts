import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DocumentService {

  URL = 'http:localhost:8080/apiDocument';

  constructor(private http:HttpClient) { }

  addDocument(document) {
    return this.http.post(this.URL+'/add', document, {observe : 'response'});
  }
}
