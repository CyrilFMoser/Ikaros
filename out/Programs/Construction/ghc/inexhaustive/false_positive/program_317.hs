module Program_7 () where 

 main = print $ show v_b
data B_A = C_A B_D | C_B ((B_D,B_D)) ((B_D,B_D)) | C_C B_D | C_D ((Int,Int)) Int
data B_B a = C_E (B_C a a) | C_F B_D B_D | C_G ((B_A,B_D)) B_D
data B_D = C_L
data B_C b c = C_H | C_I (B_C b b) B_A | C_J (((Bool,Int),B_A)) (B_C c c) | C_K

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_L -> 0 
