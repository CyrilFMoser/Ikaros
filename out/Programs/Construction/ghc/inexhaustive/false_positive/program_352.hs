module Program_0 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_C b ((Int,Int))) | C_C Int
data B_D = C_J | C_K | C_L ((B_D,B_D)) | C_M B_D (B_A Char B_D)
data B_C d e = C_I (B_A e e)
data B_B c = C_D ((B_D,(Char,Int))) | C_E | C_F | C_G (B_C c c) | C_H

v_a :: B_A Int B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C _ -> 1 
