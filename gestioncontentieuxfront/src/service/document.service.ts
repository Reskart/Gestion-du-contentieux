import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DocumentService {

  documents: any[] = [];

  URL = 'http://localhost:8080/apiDocument';

  constructor(private http:HttpClient) { }

  addDocument(document) {
    return this.http.post(this.URL+'/add', document, {observe : 'response'});
  }

  findAll() {
    return this.http.get<any>(this.URL+'/documents').pipe(map(value=>this.documents=value));
  }
}
