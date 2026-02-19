public class Main {
    public static final int MAX_TEMP = 40;
    public static final int MIN_TEMP = 32;
    public static final float MIN_TEMP_CLIENT = 36.2f;
    public static final float MAX_TEMP_CLIENT = 36.9f;

    public static void main(String[] args) {
        float[] patients = generatePatientsTemperatures(30);


        System.out.println(getReport(patients));
    }

    public static float[] generatePatientsTemperatures(int number) {
        float[] client = new float[number];
        for (int i = 0; i < client.length; i++) {
            client[i] = (float) (MIN_TEMP + ((MAX_TEMP - MIN_TEMP) * Math.random()));
        }
        return client;
    }

    public static String getReport(float[] temperaPatients) {
        StringBuilder temperatureClientText = new StringBuilder();
        float averageTemperature = 0.0f;
        int healthyClient = 0;
        for (float temp : temperaPatients) {
            temperatureClientText.append(String.format("%.1f", temp)).append(" ");
            averageTemperature += temp;
            if (temp < MAX_TEMP_CLIENT && temp > MIN_TEMP_CLIENT) {
                healthyClient++;
            }
        }
        averageTemperature = averageTemperature / temperaPatients.length;

        return "Температура пациентов: " + temperatureClientText + "\n" +
                "Средняя температура: " + String.format("%.1f", averageTemperature) + "\n" +
                "Количество здоровых: " + healthyClient;
    }
}