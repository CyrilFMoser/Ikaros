module Program_14 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B (B_C ((Int,Char)))
data B_C a = C_D
data B_B = C_C B_D ((B_A,Char))
data B_D = C_E | C_F Int | C_G ((B_A,Int)) | C_H

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_D) -> 0 
