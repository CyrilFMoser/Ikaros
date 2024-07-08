module Program_0 () where 

 main = print $ show v_b
data B_C = C_I | C_J | C_K B_D | C_L Int B_D
data B_A = C_A (((Char,Char),B_C)) | C_B Char | C_C B_C
data B_B a = C_D a ((Bool,B_C)) | C_E ((B_A,(Char,Int))) B_C | C_F | C_G ((B_A,B_D)) ((B_C,B_D)) | C_H Char (B_B a)
data B_D = C_M | C_N Int | C_O B_A

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_M -> 0 
  C_O _ -> 1 
