module Program_31 () where 

 main = print $ show v_b
data B_D c d = C_L (B_B c) ((Int,B_A)) | C_M ((B_A,(Char,Bool))) ((B_A,(Bool,Char)))
data B_A = C_A ((B_A,Char)) | C_B B_A | C_C | C_D
data B_B a = C_E Char | C_F Char | C_G | C_H ((B_A,(Int,Int))) ((Char,(Int,Int)))
data B_C b = C_I B_A b | C_J | C_K

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J -> 0 
  C_K -> 1 
