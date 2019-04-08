package com.ziadsyahrul.learningmapsdirection

import android.location.Location

class PojoDirection {

    var routes = ArrayList<Routes>()
}

class Routes {
    var legs = ArrayList<Legs>()
}

class Legs {
    var distance = Distance()
    var duration = Duration()
    var end_address = ""
    var end_location = Location()
    var start_address = ""
    var start_location = Location()
    var steps = ArrayList<Steps>()

}

class Steps {
    var distance = Distance()
    var duration = Duration()
    var end_location = Location()
    var polyline = PolyLine()
    var start_location = Location()
    var travel_mode = ""
    var maneuver = ""

}

class Duration {
    var text = ""
    var value = 0
}

class Distance {
    var text = ""
    var value = 0
}

class Location {
    var lat = ""
    var lng = ""
}

class PolyLine {
    var points = ""
}

