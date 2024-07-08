module Program_15 () where 

 main = print $ show v_b
data B_B = C_E ((B_C,B_C)) (B_A B_C)
data B_C = C_F Int (B_A B_C) | C_G ((Char,Char)) | C_H | C_I (B_A ((Int,Char)))
data B_A a = C_A | C_B ((B_B,(Bool,Bool))) | C_C Char | C_D ((B_C,Bool)) B_D
data B_D = C_J B_B | C_K B_D | C_L ((B_C,(Bool,Int))) | C_M Char

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
  C_K _ -> 1 
  C_M _ -> 2 
