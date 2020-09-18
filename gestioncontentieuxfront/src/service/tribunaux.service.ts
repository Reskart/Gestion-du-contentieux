import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class TribunauxService {

  URL = 'http://localhost:8080/apiTribunal'
tribunaux: any []=[];
  constructor(private http:HttpClient) { }
  findAll() {
    return this.http.get<any[]>(this.URL+'/tribunaux').pipe(map(value => this.tribunaux=value));
  }
}
