import { TestBed } from '@angular/core/testing';

import { TDBService } from './tdb.service';

describe('TDBService', () => {
  let service: TDBService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TDBService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
