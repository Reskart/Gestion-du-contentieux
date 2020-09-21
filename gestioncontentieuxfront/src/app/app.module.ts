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
import { AffaireAccueilComponent } from './affaire/affaire-accueil/affaire-accueil.component';
import { HttpClientModule } from '@angular/common/http';
import { UserFormComponent } from './user/user-form/user-form.component';
import { UserUpdateComponent } from './user/user-list/user-update/user-update.component';
import { UserListComponent } from './user/user-list/user-list.component';
import { RoleComponent } from './role/role.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AjoutTacheComponent } from './tache/ajout-tache/ajout-tache.component';
import { AffaireRechercheComponent } from './affaire/affaire-recherche/affaire-recherche.component';
import { AffaireAjoutComponent } from './affaire/affaire-ajout/affaire-ajout.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AffaireComponent,
    TacheComponent,
    TribunauxComponent,
    TableaubordComponent,
    AccueilComponent,
    AjoutTacheComponent,
    DocumentComponent,
    AffaireRechercheComponent,
    AffaireAccueilComponent,
    UserFormComponent,
    UserUpdateComponent,
    UserListComponent,
    RoleComponent,
    AffaireAjoutComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
