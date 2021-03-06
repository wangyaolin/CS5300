package driver;

public class ConfigurationParameter {
	public static final int EVENTUAL_CONSISTENCY_WAIT_TIME = 15;
	public static final double RESIDUAL_ERROR_ACCURACY = 1e6;

	public static final String NODE_NUMBER_DIR = "NodeNum";
	public static final String OUTPUT_DIR = "PageRankOutput";
	private static final String PR_ITERATION_BASE_DIR = "Iteration";

	public static String getPageRankIterationDirectory(int iter) {
		if (iter < 10) {
			return PR_ITERATION_BASE_DIR + "00" + iter;
		} else if (iter < 100) {
			return PR_ITERATION_BASE_DIR + "0" + iter;
		} else {
			return PR_ITERATION_BASE_DIR + iter;
		}
	}
}
