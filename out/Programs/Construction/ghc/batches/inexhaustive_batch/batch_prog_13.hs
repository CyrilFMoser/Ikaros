module Program_13 () where 

 main = print $ show v_b
data B_C = C_I
data B_A a b = C_A (B_D B_C b) b | C_B | C_C (B_A a ((Char,Char)))
data B_B = C_D (((Bool,Char),B_C)) Int | C_E Char (B_A B_B B_B) | C_F ((Int,(Bool,Int))) | C_G B_C | C_H
data B_D c d = C_J | C_K (B_A c d) B_B | C_L B_B | C_M d

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C _ -> 1 
