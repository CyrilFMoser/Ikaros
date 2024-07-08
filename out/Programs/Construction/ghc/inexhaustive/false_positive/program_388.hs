module Program_12 () where 

 main = print $ show v_b
data B_B = C_B ((B_B,B_A)) | C_C B_A ((B_B,Int)) | C_D Char (((Bool,Bool),B_B)) | C_E | C_F
data B_A = C_A ((B_B,(Char,Int))) B_A
data B_D c = C_J (B_D c) ((B_A,B_A)) | C_K
data B_C a b = C_G (B_D a) | C_H b | C_I

v_a :: B_C Int B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
  C_I -> 1 
