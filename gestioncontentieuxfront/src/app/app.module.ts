import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { AffaireComponent } from './affaire/affaire.component';
import { TacheComponent } from './tache/tache.component';
import { TribunauxComponent } from './tribunaux/tribunaux.component';
import { TableaubordComponent } from './tableaubord/tableaubord.component';
import { AccueilComponent } from './accueil/accueil.component';
import { DocumentComponent } from './document/document.component';
import { AffaireRechercheComponent } from './affaire/affaire-recherche/affaire-recherche.component';
import { AffaireAccueilComponent } from './affaire/affaire-accueil/affaire-accueil.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AffaireComponent,
    TacheComponent,
    TribunauxComponent,
    TableaubordComponent,
    AccueilComponent,
    DocumentComponent,
    AffaireRechercheComponent,
    AffaireAccueilComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
