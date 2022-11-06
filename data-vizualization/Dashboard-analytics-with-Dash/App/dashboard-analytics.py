#Analytics Dashboard part of studies from Data Academy Science "Visualização de Dados e Design de Dashboards"
#www.dataacademyscience.com.br

#Importing the packages
import dash
import plotly
import locale
import numpy as np
import pandas as pd
import dash_core_components as dcc
import dash_html_components as html
import dash_bootstrap_components as dbc
import plotly.express as px
import plotly.graph_objects as go
from plotly.subplots import make_subplots
from dash.dependencies import Input, Output, State
import warnings
warnings.filterwarnings("ignore")

# Loading the data
df = pd.read_csv('data/dataset.csv')

# Calculating the gross profit margin
df ['Margem_Lucro'] = np.multiply(np.divide(df['Lucro'], df['Venda']), 100).round(2)

#
#
#
#
#
#
#
#
#
#