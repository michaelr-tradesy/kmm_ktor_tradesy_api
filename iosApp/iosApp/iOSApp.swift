import SwiftUI
import shared

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
    
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        // Override point for customization after application launch.

        ApiClient().tradesyHomePage { (response, error) in
                                if let response = response {
                                    print("response = \(response)")
                                }
                                if let error = error {
                                    print("error = \(error)")
                                }
                            }

        return true
    }
}
