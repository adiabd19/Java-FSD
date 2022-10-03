import { Login } from './login';

describe('Login', () => {
  it('should create an instance', () => {
    expect(new Login()).toBeTruthy();
  });
});


login.ts:
export class Login {
    constructor(public email:string,public pass:string){}
}

