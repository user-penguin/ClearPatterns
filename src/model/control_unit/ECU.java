package model.control_unit;

import model.engine.CarEngine;
import model.engine.Engine;

public class ECU implements ControlUnit {
    private CarEngine carEngine;

    public ECU (CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    public ECU() {
    }

    public void setCarEngine (Engine engine) {
        this.carEngine = (CarEngine) engine;
    }

    public String startEngine () {
        if (!carEngine.startEngine()) {
            if (carEngine.isBroken()) {
                return "Двигатель сломан";
            }
            if (carEngine.isStarted()) {
                return "Двигатель уже запущен";
            }
        }
        return "Двигатель успешно запущен";
    }

    public String stopEngine () {
        carEngine.stopEngine();
        return "Двигатель успешно заглушен";
    }

    public String setRPM (int RPM) {
        if (!carEngine.setRPM(RPM)) {
            if (carEngine.isBroken()) {
                return "Вы положили мотор, слишком большие обороты";
            }
            if (!carEngine.isBroken() && !carEngine.isStarted()) {
                return "Мотор заглох, слишком маленькие обороты";
            }
        }
        return "Обороты успешно установены на " + RPM;
    }

    @Override
    public String getStateInfo() {
        String info = "";
        if (carEngine.isBroken()) {
            info.concat("Двигатель исправен. ");
        } else {
            info.concat(info.concat("Двигатель неисправен! "));
        }
        if (carEngine.isStarted()) {
            info.concat("Двигатеь работает. ");
        } else {
            info.concat("Двигатель заглушен. ");
        }
        info.concat("Текущие обороты: " + carEngine.getRPM());
        return info;
    }
}
