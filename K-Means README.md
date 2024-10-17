# K-Means Clustering Algorithm Implementation

## Overview
This project implements the K-Means clustering algorithm from scratch, with additional features like:
- **K-Means++ initialization**.
- **Handling for empty clusters**.
- **Elbow method** to determine the optimal number of clusters.
- **Support for custom distance metrics** (Euclidean and Manhattan distances).

You can visualize the clustering process, calculate performance metrics, and compare your implementation to `sklearn`'s version.

## Features
- **K-Means++ Initialization**: Improves centroid initialization for faster convergence.
- **Empty Cluster Handling**: Handles cases where no data points are assigned to a cluster by re-initializing the centroid.
- **Elbow Method**: Determines the optimal number of clusters (`k`) based on the inertia.
- **Custom Distance Metrics**: Supports both Euclidean and Manhattan distances for flexibility in distance calculations.

## Setup Instructions

### Prerequisites
Ensure you have the following installed:
- Python 3.x
- Virtual environment tool (optional but recommended)

### Libraries Required
You can install the necessary dependencies using the following:

```bash
pip install -r requirements.txt
```

If `requirements.txt` is not provided, you can manually install these packages:

```bash
pip install numpy matplotlib scikit-learn
```

## Running the Code

### Running in Google Colab
1. Upload the `notebook.ipynb` to your Google Colab.
2. Ensure you execute the notebook step-by-step, following the in-cell comments and visualizations.

### Running Locally
1. Activate your Python environment:
    ```bash
    python3 -m venv env
    source env/bin/activate  # For Linux/Mac
    env\Scripts\activate      # For Windows
    ```
2. Run the K-Means algorithm:
    ```bash
    python KMeans.py
    ```

## Using Custom Features

- **K-Means++ Initialization**: This is automatically applied when using the `initialize_centroids_kmeans_pp` function.
- **Empty Cluster Handling**: Automatically handles empty clusters in the K-Means algorithm.
- **Elbow Method**: Use `elbow_method(X, max_k=10)` to find the optimal number of clusters.
- **Custom Distance Metrics**: Pass the `metric` argument (either `'euclidean'` or `'manhattan'`) when initializing the `KMeansWithCustomDistance` class:
    ```python
    kmeans = KMeansWithCustomDistance(k=4, metric='manhattan')
    ```

## Testing

You can run tests using synthetic datasets (e.g., using `sklearn.datasets.make_blobs`), or real-world datasets. We also provide comparisons with scikit-learn’s K-Means implementation.

## Link to the Colab Notebook

You can explore the implementation and run the code interactively on Google Colab using this link:  
[Colab Notebook Link](https://colab.research.google.com/drive/1Zs3KTJBlyauRjWEUwd3qyu3yv8AmHUxZ#scrollTo=uyPkwMwEqF1g)
