module Program_8 () where 

 main = print $ show v_b
data B_C = C_H ((B_A,B_C)) | C_I (B_B B_A) (B_D Int Bool) | C_J B_C ((B_C,B_C)) | C_K (B_B B_C)
data B_D b c = C_L | C_M Int
data B_B a = C_E (((Int,Int),Bool)) B_A | C_F Char Char | C_G B_A
data B_A = C_A B_C | C_B Bool | C_C ((B_C,B_C)) | C_D

v_a :: B_B B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_G _ -> 1 
