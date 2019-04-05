const jsforce = require('jsforce');
const username = 'andrey.ryzhkov@ringcentral.com.box16';
const password = 'Lifeisgame{}1';
const securityToken = 'aE6iC5Yf1qmzPrYpyDtKXrmN';
const conn = new jsforce.Connection({
    loginUrl: "https://rc--box16.cs63.my.salesforce.com"
});
conn.login(username, password + securityToken, function(err, res) {
    if (err) {
        return console.error(err);
    }
    console.log('Authenticated');
    var records = [];
    conn.query("SELECT Id, Name FROM Account", function(err, result) {
        if (err) { return console.error(err); }
        console.log("total : " + result.totalSize);
        console.log("fetched : " + result.records.length);
    });

    // let statuses = [];
    // for (let i = 0; i < 1; i++) {
    //     statuses.push({ Name : "St1" });
    // }
    // conn.sobject("Status__c").create(statuses,
    // function(err, rets) {
    //     if (err) { return console.error(err); }
    //     for (var i=0; i < rets.length; i++) {
    //     if (rets[i].success) {
    //         console.log("Created record id : " + rets[i].id);
    //     }
    //     }
    // });
});