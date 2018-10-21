'''
    File name: main.py
    Author: Cesar Cruz
    Date created: 15 OCT 2018    
    Python Version: 2.7
'''
import zeep
from Tkinter import *
import tkMessageBox

def suma(x, y, servicio):
	resultado = servicio.sumar(x, y)
	tkMessageBox.showinfo("Resultado", resultado)

def resta(x, y, servicio):
	resultado = servicio.restar(x, y)
	tkMessageBox.showinfo("Resultado", resultado)

def multi(x, y, servicio):
	resultado = servicio.multiplicar(x, y)
	tkMessageBox.showinfo("Resultado", resultado)

def div(x, y, servicio):
	resultado = servicio.dividir(x, y)
	tkMessageBox.showinfo("Resultado", resultado)

def factorial(x, servicio):
	resultado = servicio.factorial(x)
	tkMessageBox.showinfo("Resultado", resultado)

def fibo(x, servicio):
	resultado = servicio.fibonacci(x)
	tkMessageBox.showinfo("Resultado", resultado)

def promedio(datos, servicio):
	datos = datos.split(',')
	resultado = servicio.promedio(datos)
	tkMessageBox.showinfo("Resultado", resultado)

def desvE(datos, servicio):
	datos = datos.split(',')
	resultado = servicio.desvEstandar(datos)
	tkMessageBox.showinfo("Resultado", resultado)

def desvM(datos, servicio):
	datos = datos.split(',')
	resultado = servicio.desvMedia(datos)
	tkMessageBox.showinfo("Resultado", resultado)

# Configuracion del servicio web 
wsdl = 'http://localhost:8084/TareaWS_Operaciones/WS_Operaciones?wsdl'
client = zeep.Client(wsdl=wsdl)
servicio = client.service

# Se dibuja la interfaz
root = Tk()
root.title('Operaciones basicas')
root.geometry('400x400')

l_x = Label(root, text='Primer numero')
n1 = Entry()
l_x.pack()
n1.pack()

l_y = Label(root, text='Segundo numero')
n2 = Entry()
l_y.pack()
n2.pack()

btn_Suma = Button(root, text='Sumar', command=lambda: \
	suma(n1.get(), n2.get(), servicio))
btn_Resta = Button(root, text='Restar', command=lambda: \
	resta(n1.get(), n2.get(), servicio))
btn_Mult = Button(root, text='Multiplicar', command=lambda: \
	multi(n1.get(), n2.get(), servicio))
btn_Div = Button(root, text='Dividir', command=lambda: \
	div(n1.get(), n2.get(), servicio))
btn_Fac = Button(root, text='Factorial (numero 1)', command=lambda: \
	factorial(n1.get(), servicio))
btn_Fib = Button(root, text='Fibonacci (numero 1)', command=lambda: \
	fibo(n1.get(), servicio))
btn_Prom = Button(root, text='Promedio (serie 1)', command=lambda: \
	promedio(n1.get(), servicio))
btn_DE = Button(root, text='Desviacion Estandar (serie 1)', command=lambda: \
	desvE(n1.get(), servicio))
btn_DM = Button(root, text='Desviacion Media (serie 1)', command=lambda: \
	desvM(n1.get(), servicio))

btn_Suma.pack()
btn_Resta.pack()
btn_Mult.pack()
btn_Div.pack()
btn_Fac.pack()
btn_Fib.pack()
btn_Prom.pack()
btn_DE.pack()
btn_DM.pack()

root.mainloop()