module Program_16 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A Bool
data B_C a b = C_H a | C_I B_D
data B_D = C_J B_A | C_K (B_C Char Char) | C_L | C_M
data B_B = C_C ((B_A,B_D)) Int | C_D (B_C ((Int,Char)) B_D) | C_E ((B_A,B_A)) | C_F B_D | C_G Char B_D

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
  C_K _ -> 1 
  C_L -> 2 
