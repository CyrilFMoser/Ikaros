module Program_23 () where 

 main = print $ show v_b
data B_C a = C_I B_A | C_J ((B_B,B_A)) | C_K a
data B_A = C_A Bool B_A | C_B | C_C B_B B_B | C_D (B_C B_A)
data B_B = C_E (B_C B_A) B_B | C_F (((Bool,Char),B_B)) ((B_B,(Int,Bool))) | C_G ((B_A,B_A)) B_A | C_H B_A

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I _ -> 0 
  C_J _ -> 1 
