//
//  ImageLoaderService.swift
//  iosApp
//
//  Created by Michael Roebuck on 3/18/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import UIKit
import Combine


class ImageLoaderService: ObservableObject {
    var didChange = PassthroughSubject<Data, Never>()
    var data = Data() {
        didSet {
            didChange.send(data)
        }
    }

    init(urlString:String) {
        guard let url = URL(string: urlString) else { return }
        let task = URLSession.shared.dataTask(with: url) { data, response, error in
            guard let data = data else { return }
            DispatchQueue.main.async {
                self.data = data
            }
        }
        task.resume()
    }
}

