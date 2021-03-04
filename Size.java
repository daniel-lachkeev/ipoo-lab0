/**
 * Size - classe que representa o tamanho de uma chávena
 */
public enum Size {
    SMALL(32, 36, "Pequeno", 'S'),
    MEDIUM(37, 44, "Médio", 'M'),
    LARGE(45, 52, "Grande", 'L');
    
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    
    /**
     * Objeto Size
     * @param minValue valor mínimo
     * @param maxValue valor máximo
     * @param description descrição da chávena
     * @param code código
     */
    private Size(int minValue, int maxValue, String description, char code) {
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.code = code;
    }
    
    @Override
    public String toString() {
        return this.description;    
    }
    
    public String getDescription() {
        return description;    
    }
    
    public int getMinValue() {
        return minValue;
    }
    
    public int getMaxValue() {
        return maxValue;
    }
    
    public char getCode() {
        return code;    
    }
}