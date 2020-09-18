import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DocumentService {

  URL = 'http:localhost:8080/apiDocument';

  constructor() { }
}
