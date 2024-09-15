
public class AngleRotator {
    public static Vector3D rotateX(Vector3D vector3d, double rad){
        double[][] vector = new double[3][1];
        vector[0][0] = vector3d.x; 
        vector[1][0] = vector3d.y; 
        vector[2][0] = vector3d.z;
        
        double[][] rotateMatrix = new double[3][3];
        rotateMatrix[0][0] = 1; rotateMatrix[0][1] = 0;             rotateMatrix[0][2] = 0;
        rotateMatrix[1][0] = 0; rotateMatrix[1][1] = Math.cos(rad); rotateMatrix[1][2] = -Math.sin(rad);
        rotateMatrix[2][0] = 0; rotateMatrix[2][1] = Math.sin(rad); rotateMatrix[2][2] = Math.cos(rad);

        double[][] result = MatrixCalculator.multiply(rotateMatrix, vector);

        return new Vector3D(result[0][0], result[1][0], result[2][0]);
    }

    public static Vector3D rotateY(Vector3D vector3d, double rad){
        double[][] vector = new double[3][1];
        vector[0][0] = vector3d.x; 
        vector[1][0] = vector3d.y; 
        vector[2][0] = vector3d.z;
        
        double[][] rotateMatrix = new double[3][3];
        rotateMatrix[0][0] = Math.cos(rad);  rotateMatrix[0][1] = 0; rotateMatrix[0][2] = Math.sin(rad);
        rotateMatrix[1][0] = 0;              rotateMatrix[1][1] = 1; rotateMatrix[1][2] = 0;
        rotateMatrix[2][0] = -Math.sin(rad); rotateMatrix[2][1] = 0; rotateMatrix[2][2] = Math.cos(rad);

        double[][] result = MatrixCalculator.multiply(rotateMatrix, vector);

        return new Vector3D(result[0][0], result[1][0], result[2][0]);
    }

    public static Vector3D rotateZ(Vector3D vector3d, double rad){
        double[][] vector = new double[3][1];
        vector[0][0] = vector3d.x; 
        vector[1][0] = vector3d.y; 
        vector[2][0] = vector3d.z;
        
        double[][] rotateMatrix = new double[3][3];
        rotateMatrix[0][0] = Math.cos(rad); rotateMatrix[0][1] = -Math.sin(rad); rotateMatrix[0][2] = 0;
        rotateMatrix[1][0] = Math.sin(rad); rotateMatrix[1][1] = Math.cos(rad);  rotateMatrix[1][2] = 0;
        rotateMatrix[2][0] = 0;             rotateMatrix[2][1] = 0;              rotateMatrix[2][2] = 1;

        double[][] result = MatrixCalculator.multiply(rotateMatrix, vector);

        return new Vector3D(result[0][0], result[1][0], result[2][0]);
    }
}
