module Program_22 () where 

 main = print $ show v_b
data B_A a = C_A a | C_B a (B_A a) | C_C | C_D
data B_D = C_N B_C | C_O Bool B_C
data B_C = C_I B_D (B_A Char) | C_J B_D | C_K ((Char,B_C)) B_D | C_L | C_M B_C
data B_B b = C_E | C_F | C_G | C_H

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_C -> 1 
  C_D -> 2 
