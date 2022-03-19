//
//  ContentViewModel.swift
//  iosApp
//
//  Created by Michael Roebuck on 3/18/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared


class ContentViewModel : ObservableObject {
    
    @Published private(set) var list: [HomePagePromotion] = []
    
    init() {
        ApiClient().tradesyHomePage {(response, error) in
            if let response = response {
                if let homePageData = response.homepage?.homePageData {
                    if !homePageData.isEmpty {
                        self.list = Array(homePageData.values)
                    }
                }
            }
        }
    }
}
