import SwiftUI
import shared

struct ContentView: View {

    @ObservedObject var viewModel = ContentViewModel()
    
	let greet = Greeting().greeting()

    init() {
        ApiClient().tradesyHomePage {(response, error) in
            if let response = response {
                print("response = \(response)")
            }
            if let error = error {
                print("error = \(error)")
            }
        }
    }
    
	
    var body: some View {
        GeometryReader { proxy in
            ScrollView {
                Text(greet)
                LazyVStack {
                    ForEach(viewModel.list, id: \.self) {
                        let nextObject = $0

                        if let header = nextObject.header {
                            Text(header)
                                .font(.title)
                        }

                        if let subtitle = nextObject.subtitle {
                            Text(subtitle)
                                .font(.subheadline)
                                .foregroundColor(.gray)
                                .frame(maxWidth: .infinity)
                                .foregroundColor(.gray)
                        }

                        if let url = nextObject.image {
                            AsyncImage(url: URL(string: url)!,
                                           placeholder: { Text("Loading ...") },
                                           image: { Image(uiImage: $0).resizable() })
                                   .frame(idealHeight: UIScreen.main.bounds.width / 2 * 3)
                        }
                        
                        Divider().border(Color.blue).padding()
                    }

                    //iOS 15 and above...
////                            AsyncImage(url: URL(string: url))
////                                .clipShape(Circle())
////                                .shadow(radius: 8)
//                    .onDelete { index in
//                        // delete item
//                    }
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
