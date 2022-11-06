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

#Function for grouping
def group_by(df, col):
    
    #Aggregation
    grouped = df.groupby(by = col, as_index = False).agg({'Venda':'sum',
                                                          'Lucro':'sum',
                                                          'Quantidade':'sum',
                                                          'Desconto':'mean',})
    
    #Calculating the profit margin
    grouped['Margem_Lucro'] = np.multiply(np.divide(df['Lucro'], df['Venda']), 100).round(2)

    return grouped

#Formatting variables
title_font = {'size':20, 'color':'black'}
legend_font = {'size':20, 'color':'grey'}
global_font = dict(family = 'Roboto')

#
#
#
#
##### App Dash #####

# Criando app dash
dashboard_analytics = dash.Dash(__name__, 
                external_stylesheets = [dbc.themes.YETI], 
                suppress_callback_exceptions = True, 
                meta_tags = [{'name': 'viewport', 'content': 'width=device-width, initial-scale=1.0'}])

server = dashboard_analytics.server
#
#
#
# App Executable
if __name__=='__main__':
    dashboard_analytics.run_server(debug = False, use_reloader = False)
