import java.util.Objects;

public class Moon {
    private Planet planet;
    private int orbitTime;
    private boolean atmosphere;
    private String designation;

    public Moon(Planet planet, int orbitTime, boolean atmosphere, String designation) {
        this.planet = planet;
        this.orbitTime = orbitTime;
        this.atmosphere = atmosphere;
        this.designation = designation;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Moon) {
            Moon other = (Moon) obj;
            if (this.designation.equals(other.designation)) {
                return true;
            }
        }
            return false;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "planet=" + planet +
                ", orbitTime=" + orbitTime +
                ", atmosphere=" + atmosphere +
                ", designation='" + designation + '\'' +
                '}';
    }
}
