class public Temperature {
    // Start Class Properties
    public double Current_Temperature = 0; // Sets the current temperature to the temperature the sensor reports
    public double Target_Temperature = self.getTemperature(); // Sets the  temperature target to what the current temperature is.
    public double Temperature_Change_Value = 0.1; // This value is used to add or subtract from the temperature per cycle.
    
    // Start Class Methods
    public double getTemperature() {
        if (Current_Temperature == 0) { 
        // If we haven't set the Current_Temperature yet, then for this easy example we will hardcode it to 61.2, if we had a sensor we would ask it for the current temperature to update. 
            Current_Temperature = 61.2;
        };  
        // Typically there would be a sensor getMethod here.
        return Current_Temperature;
        };
    }; 
    
    public void setTemperature(double Input_Temperature) {
        if (Input_Temperature != Target_Temperature) { // Make sure the temperature needs to change.
            Target_Temperature = Input_Temperature; // update the Target to the Input value
        };
        if (Current_Temperature != Target_Temperature) { // Make sure the temp needs to actually change.
            while (Current_Temperature != Target_Temperature {
                // Here we check if the target value is higher than the current value
                if ( Target_Temperature > Current_Temperature) {
                    Current_Temperature = Current_Temperature + Temperature_Change_Value;
                } else { // If it isn't higher then it is lower
                    Current_Temperature = Current_Temperature - Temperature_Change_Value;
                }; 
             System.out.println(Current_Temperature); // Print out the temperature when it changes. We would use another method to update the display elsewhere in the system.
            };
        };
    };
};