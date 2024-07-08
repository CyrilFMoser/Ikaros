module Program_7 () where 

 main = print $ show v_b
data B_C = C_H Bool | C_I B_D B_D | C_J | C_K | C_L Int
data B_D = C_M B_D | C_N | C_O
data B_A a b = C_A B_D | C_B a B_C | C_C (B_A a a)
data B_B c d = C_D | C_E d (B_B c d) | C_F c | C_G B_D

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H _ -> 0 
  C_I _ _ -> 1 
  C_J -> 2 
  C_L _ -> 3 
