import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PhaseService {

  URL = 'http://localhost:8080/apiPhase'

  constructor() { }
}
