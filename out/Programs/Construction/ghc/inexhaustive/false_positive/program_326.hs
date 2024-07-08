module Program_14 () where 

 main = print $ show v_b
data B_B b = C_B | C_C
data B_C = C_D (((Char,Char),B_C)) | C_E (B_D B_C) | C_F B_C | C_G (B_D B_C) Int | C_H B_C (B_B B_C)
data B_A a = C_A
data B_D c = C_I (B_A c) | C_J | C_K

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
