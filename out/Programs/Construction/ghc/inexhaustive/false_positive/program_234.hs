module Program_18 () where 

 main = print $ show v_b
data B_C = C_I B_A Char | C_J B_B B_B | C_K | C_L | C_M B_D B_A
data B_A = C_A | C_B | C_C B_D B_D | C_D | C_E
data B_D = C_N
data B_B = C_F B_B | C_G Bool | C_H B_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C C_N C_N -> 2 
  C_D -> 3 
