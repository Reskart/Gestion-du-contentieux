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

import { CalendrierComponent } from './tache/calendrier/calendrier.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CommonModule } from '@angular/common';
import { FlatpickrModule } from 'angularx-flatpickr';
import { CalendarModule, DateAdapter } from 'angular-calendar';
import { adapterFactory } from 'angular-calendar/date-adapters/date-fns';
import { NgbModalModule, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AffaireAjoutComponent } from './affaire/affaire-ajout/affaire-ajout.component';
import { EncoursComponent } from './tableaubord/encours/encours.component';
import { AvenirComponent } from './tableaubord/avenir/avenir.component';
import { ArchiveComponent } from './tableaubord/archive/archive.component';
import { ConsultationComponent } from './document/consultation/consultation.component';


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
    CalendrierComponent,
    AffaireAjoutComponent,
    EncoursComponent,
    AvenirComponent,
    ArchiveComponent,
    ConsultationComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,

    CommonModule,
    FormsModule,
    NgbModalModule,
    BrowserAnimationsModule,
    FlatpickrModule.forRoot(),
    CalendarModule.forRoot({
      provide: DateAdapter,
      useFactory: adapterFactory,
    }),
    NgbModule,


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

platformBrowserDynamic().bootstrapModule(AppModule).then(ref => {
  // Ensure Angular destroys itself on hot reloads.
  if (window['ngRef']) {
    window['ngRef'].destroy();
  }
  window['ngRef'] = ref;

  // Otherwise, log the boot error
}).catch(err => console.error(err));