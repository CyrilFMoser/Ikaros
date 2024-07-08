module Program_15 () where 

 main = print $ show v_b
data B_B a b = C_D
data B_A = C_A (B_B B_A B_A) | C_B B_A | C_C (((Int,Int),B_A)) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (((_,_),C_C ((_,_)) _)) (C_C _ (C_A _)) -> 0 
