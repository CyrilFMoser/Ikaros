module Program_18 () where 

 main = print $ show v_b
data B_C d = C_G | C_H (B_A d d) (B_D d)
data B_D e = C_I (((Char,Int),Int)) (B_A e e) | C_J ((Char,Bool)) | C_K | C_L
data B_B c = C_D | C_E (B_D ((Char,Char))) | C_F
data B_A a b = C_A | C_B | C_C

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C -> 1 
