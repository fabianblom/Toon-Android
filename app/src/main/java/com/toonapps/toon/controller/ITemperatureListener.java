package com.toonapps.toon.controller;

import com.toonapps.toon.entity.ThermostatInfo;

public interface ITemperatureListener {

    void onTemperatureChanged(ThermostatInfo aThermostatInfo);
    void onTemperatureError(Exception e);
}