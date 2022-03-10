import SwiftUI

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
			ContentView()
			ApiClient().tradesyHomePage { (response, error) in
                        if let response = response {
                            print("response = \(response)")
                        }
                        if let error = error {
                            print("error = \(error)")
                        }
                    }
		}
	}
}