//
//  AsyncImageView.swift
//  iosApp
//
//  Created by Michael Roebuck on 3/18/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import UIKit


struct AsyncImageView: View {
    @ObservedObject var imageLoader:ImageLoaderService
    @State var image:UIImage = UIImage()

    init(withURL url:String) {
        imageLoader = ImageLoaderService(urlString:url)
    }

    var body: some View {
        
            Image(uiImage: image)
                .resizable()
                .aspectRatio(contentMode: .fit)
                .frame(width:100, height:100)
                .onReceive(imageLoader.didChange) { data in
                self.image = UIImage(data: data) ?? UIImage()
        }
    }
}
