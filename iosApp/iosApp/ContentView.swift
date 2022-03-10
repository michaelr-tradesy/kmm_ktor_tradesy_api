import SwiftUI
import shared

struct ContentView: View {
    
    var vm = ApiClient().tradesyHomePage {(response, error) in
        if let response = response {
                        print("response = \(response)")
                    }   
                    if let error = error {
                        print("error = \(error)")
                    }
    }
	let greet = Greeting().greeting()

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
