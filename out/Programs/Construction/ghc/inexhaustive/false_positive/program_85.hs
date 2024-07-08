module Program_28 () where 

 main = print $ show v_b
data B_D d = C_K d | C_L | C_M | C_N | C_O
data B_B a b = C_F (B_D a) | C_G (B_D b) | C_H Bool
data B_C c = C_I | C_J c
data B_A = C_A (B_B ((Char,Int)) B_A) | C_B (B_C ((Bool,Bool))) (((Int,Bool),B_A)) | C_C B_A | C_D ((B_A,B_A)) ((B_A,B_A)) | C_E

v_a :: B_D Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_K _ -> 0 
  C_L -> 1 
  C_M -> 2 
  C_N -> 3 
