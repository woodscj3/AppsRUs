USE CSE201;

-- Application
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('AliExpress', 
				'AliExpress is an online global retail marketplace where sellers are located in China.', 
                'Alibaba Group', 'App Store, Google Play', '8.37.0', 'https://www.aliexpress.com/', 0);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Amazon', 
				'Amazon is an American international electronic commerce platform that allows companies and individuals to buy and sell goods and services online', 
                'Amazon', 'App Store, Google Play', '22.21.2', 'https://www.amazon.com/', 0);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Bloons TD 6', 
				'Bloons Tower Defense (also known as Bloons TD) is a series of tower defense games under the Bloons series',
                'Amazon', 'App Store, Google Play', '28.3', 'https://ninjakiwi.com/Games/Mobile/Bloons-TD-6.html', 4.99);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Facebook', 
				'Facebook is an American online social media and social networking service', 
                'Meta Platforms', 'App Store, Google Play', '345.0', 'https://www.facebook.com/', 0);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Instagram', 
				'Instagram is an American photo and video sharing social networking service founded by Kevin Systrom and Mike Krieger', 
                'Meta Platforms', 'App Store, Google Play', '214.0', 'https://www.instagram.com/', 0);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Minecraft', 
				'Minecraft is a sandbox video game developed by the Swedish video game developer Mojang Studios',
                'Microsoft', 'App Store, Google Play', '1.17.1', 'https://www.minecraft.net/en-us', 6.99);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Spotify', 
				'Spotify is a Swedish audio streaming and media services provider. It is the world\'s largest music streaming service provider', 
                'Spotify Technology', 'App Store, Google Play', '8.6.70', 'https://www.spotify.com/us/', 0);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('TikTok', 
				'TikTok is a video-focused social networking service',
                'ByteDance', 'App Store, Google Play', '22.0.4', 'https://www.tiktok.com/business/en-US', 0);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Uber', 
				'Uber is a platform where those who drive and deliver can connect with riders, eaters, and restaurants',
                'Uber Technologies', 'App Store, Google Play', '4.394', 'https://www.uber.com/', 0);
insert into AppInfo (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('YouTube', 
				'YouTube is an American online video-sharing and social media platform',
                'Google', 'App Store, Google Play', '12.13', 'https://www.youtube.com/', 0);
                
-- User
insert into UserInfo(username, userPassword, userType) values ('doantx', 'group11pass', 'Administrator');
insert into UserInfo(username, userPassword, userType) values ('ahyiya', 'group11pass', 'Administrator');
insert into UserInfo(username, userPassword, userType) values ('woodscj3', 'group11pass', 'User');
insert into UserInfo(username, userPassword, userType) values ('benckock', 'group11pass', 'Moderator');

-- App Request
insert into AppRequest (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Messenger', 
				'Messenger, orginally developed as Facebook Chat, is an instant messaging app and platform',
                'Meta Platforms', 'App Store, Google Play', '337.1', 'https://www.messenger.com/', 0);
insert into AppRequest (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Zoom', 
				'Zoom is a cloud-based video conferencing service you can use to virtually meet with others', 
                'Zoom Video Communications', 'App Store, Google Play', '5.8.4', 'https://www.zoom.us/', 0);
insert into AppRequest (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('WhatsApp', 
				'WhatsApp is a free, multiplatform messaging app that lets you make video and voice calls, send text messages,... all with just a Wi-Fi connection', 
                'Meta Platforms', 'App Store, Google Play', '2.21.24.14', 'https://www.whatsapp.com/', 0);
insert into AppRequest (appName, appDescription, appOrganization, appPlatform, appVersion, appLink, appPrice)
		values ('Gmail', 
				'Gmail is a free email service used to exchanging digital messages over a communication network',
                'Google', 'App Store, Google Play', '2021.10.31.408626191', 'https://mail.google.com/', 0);
                
-- App Comment
insert into AppComment(appName, appComment) values ('Spotify', 'Spotify is old. I prefer Apple Music');
insert into AppComment(appName, appComment) values ('TikTok', 'TikTok is sooo addicting');