describe('Mobile App Test', () => {
    it('Opens App', () => {
        expect($$('~test-Login').length).toEqual(
            1,
            'App Not Opened',
        );
    });
});
