const {config} = require('./wdio.shared.conf');

// =========================
// Sauce RDC specific config
// =========================
config.user = process.env.SAUCE_USERNAME;
config.key = process.env.SAUCE_ACCESS_KEY;
// If you run your tests on Sauce Labs you can specify the region you want to run your tests
// in via the `region` property. Available short handles for regions are `us` (default) and `eu`.
// These regions are used for the Sauce Labs VM cloud and the Sauce Labs Real Device Cloud.
// If you don't provide the region, it defaults to `us`.
config.region = process.env.REGION || 'us';

// ============
// Capabilities
// ============
caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 10';
caps['version'] = 'latest';
chromeLatestWin10 = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 10';
caps['version'] = '92';
chromeLateWin10 = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 10';
caps['version'] = '26';
chromeEarlyWin10 = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'Windows 10';
caps['version'] = 'latest';
edgeLatestWin10 = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'Windows 10';
caps['version'] = '92';
edgeLateWin10 = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'Windows 10';
caps['version'] = '13';
edgeEarlyWin10 = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 10';
caps['version'] = 'latest';
firefoxLatestWin10 = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 10';
caps['version'] = '91';
firefoxLateWin10 = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 10';
caps['version'] = '32'; // This should be '4'
firefoxEarlyWin10 = caps;

caps = {};
caps['browserName'] = 'internet explorer';
caps['platform'] = 'Windows 10';
caps['version'] = '11';
ieWin10 = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 7';
caps['version'] = 'latest';
chromeLatestWin7 = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 7';
caps['version'] = '92';
chromeLateWin7 = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 7';
caps['version'] = '26';
chromeEarlyWin7 = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 7';
caps['version'] = 'latest';
firefoxLatestWin7 = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 7';
caps['version'] = '91';
firefoxLateWin7 = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 7';
caps['version'] = '32'; // This should be '4'
firefoxEarlyWin7 = caps;

caps = {};
caps['browserName'] = 'internet explorer';
caps['platform'] = 'Windows 7';
caps['version'] = '11';
ieLateWin7 = caps;

caps = {};
caps['browserName'] = 'internet explorer';
caps['platform'] = 'Windows 7';
caps['version'] = '9';
ieEarlyWin7 = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Linux';
caps['version'] = '48';
chromeLateLinux = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Linux';
caps['version'] = '26';
chromeEarlyLinux = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Linux';
caps['version'] = '45';
firefoxLateLinux = caps;

// For some reason Firefox + Linux w/JWP only works > v31 /shrug
caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Linux';
caps['version'] = '32'; // should be 4
firefoxEarlyLinux = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'OS X 10.10';
caps['version'] = '87';
chromeLateYosemite = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'OS X 10.10';
caps['version'] = '37';
chromeEarlyYosemite = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'OS X 10.10';
caps['version'] = '81';
edgeLateYosemite = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'OS X 10.10';
caps['version'] = '79';
edgeEarlyYosemite = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'OS X 10.10';
caps['version'] = '47';
firefoxLateYosemite = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'OS X 10.10';
caps['version'] = '32';
firefoxEarlyYosemite = caps;

caps = {};
caps['browserName'] = 'safari';
caps['platform'] = 'OS X 10.10';
caps['version'] = '8';
safariYosemite = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'macOS 11.00';
caps['version'] = 'latest';
chromeLatestBigSur = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'macOS 11.00';
caps['version'] = '92';
chromeLateBigSur = caps;

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'macOS 11.00';
caps['version'] = '69';
chromeEarlyBigSur = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'macOS 11.00';
caps['version'] = 'latest';
edgeLatestBigSur = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'macOS 11.00';
caps['version'] = '92';
edgeLateBigSur = caps;

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'macOS 11.00';
caps['version'] = '79';
edgeEarlyBigSur = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'macOS 11.00';
caps['version'] = 'latest';
firefoxLatestBigSur = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'macOS 11.00';
caps['version'] = '91';
firefoxLateBigSur = caps;

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'macOS 11.00';
caps['version'] = '60';
firefoxEarlyBigSur = caps;

caps = {};
caps['browserName'] = 'safari';
caps['platform'] = 'macOS 11.00';
caps['version'] = '14';
safariBigSur = caps;

config.capabilities = [
    chromeLatestWin10,
    chromeLateWin10,
    chromeEarlyWin10,
    edgeLatestWin10,
    edgeLateWin10,
    edgeEarlyWin10,
    firefoxLatestWin10,
    firefoxLateWin10,
    firefoxEarlyWin10,
    ieWin10,
    chromeLatestWin7,
    chromeLateWin7,
    chromeEarlyWin7,
    firefoxLatestWin7,
    firefoxLateWin7,
    firefoxEarlyWin7,
    ieLateWin7,
    ieEarlyWin7,
    chromeLateLinux,
    chromeEarlyLinux,
    firefoxLateLinux,
    firefoxEarlyLinux,
    chromeLateYosemite,
    chromeEarlyYosemite,
    edgeLateYosemite,
    edgeEarlyYosemite,
    firefoxLateYosemite,
    firefoxEarlyYosemite,
    safariYosemite,
    chromeLatestBigSur,
    chromeLateBigSur,
    chromeEarlyBigSur,
    edgeLatestBigSur,
    edgeLateBigSur,
    edgeEarlyBigSur,
    firefoxLatestBigSur,
    firefoxLateBigSur,
    firefoxEarlyBigSur,
    safariBigSur
];

config.services = config.services.concat('sauce');

exports.config = config;
