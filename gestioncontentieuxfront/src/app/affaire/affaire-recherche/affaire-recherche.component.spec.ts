import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AffaireRechercheComponent } from './affaire-recherche.component';

describe('AffaireRechercheComponent', () => {
  let component: AffaireRechercheComponent;
  let fixture: ComponentFixture<AffaireRechercheComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AffaireRechercheComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AffaireRechercheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
