import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AvenirComponent } from './avenir.component';

describe('AvenirComponent', () => {
  let component: AvenirComponent;
  let fixture: ComponentFixture<AvenirComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AvenirComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AvenirComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
