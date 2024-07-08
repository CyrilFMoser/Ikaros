module Program_6 () where 

 main = print $ show v_b
data B_D b c = C_L (B_D c c) | C_M B_A B_A
data B_A = C_A (((Char,Bool),B_A)) (B_C B_B) | C_B (((Char,Int),B_A)) B_A | C_C (B_C Char) | C_D
data B_B = C_E B_A | C_F
data B_C a = C_G a | C_H ((B_A,(Int,Bool))) (B_D a a) | C_I Int | C_J ((B_B,Bool)) (B_C a) | C_K

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
