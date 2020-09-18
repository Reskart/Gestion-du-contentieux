import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AffaireAccueilComponent } from './affaire-accueil.component';

describe('AffaireAccueilComponent', () => {
  let component: AffaireAccueilComponent;
  let fixture: ComponentFixture<AffaireAccueilComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AffaireAccueilComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AffaireAccueilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
