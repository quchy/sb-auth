import { SbAuthUiPage } from './app.po';

describe('sb-auth-ui App', () => {
  let page: SbAuthUiPage;

  beforeEach(() => {
    page = new SbAuthUiPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
