module Program_18 () where 

 main = print $ show v_b
data B_B a b = C_B (((Char,Char),B_A)) | C_C B_A | C_D (B_B a b) b | C_E a B_A
data B_A = C_A

v_a :: B_B B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (((_,_),C_A)) -> 0 
