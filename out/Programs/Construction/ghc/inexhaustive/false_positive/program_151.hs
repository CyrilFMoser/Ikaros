module Program_3 () where 

 main = print $ show v_b
data B_A = C_A | C_B | C_C (((Int,Int),B_A)) | C_D (B_B ((Char,Int)) Bool) Bool
data B_B a b = C_E B_A a | C_F | C_G ((B_A,B_A)) (B_B b b) | C_H (B_B a a) a
data B_C c = C_I (B_C c) B_A | C_J Char

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C (((_,_),C_A)) -> 2 
  C_C (((_,_),C_B)) -> 3 
  C_C (((_,_),C_C _)) -> 4 
  C_D _ _ -> 5 
