module Program_16 () where 

 main = print $ show v_b
data B_C = C_H (B_A Int) | C_I (B_D Bool) | C_J (B_B B_C ((Int,Char))) | C_K (B_A B_C)
data B_A a = C_A a (B_B a B_C) | C_B
data B_B b c = C_C Char | C_D B_C | C_E | C_F | C_G
data B_D d = C_L | C_M (B_B d d) | C_N | C_O | C_P d ((B_C,B_C))

v_a :: B_B Int B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
  C_D _ -> 1 
  C_E -> 2 
  C_G -> 3 
