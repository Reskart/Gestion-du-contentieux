import { TestBed } from '@angular/core/testing';

import { TribunauxService } from './tribunaux.service';

describe('TribunauxService', () => {
  let service: TribunauxService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TribunauxService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
