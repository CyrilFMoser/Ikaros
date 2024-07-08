module Program_12 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_A B_A) | C_B B_A | C_C (((Int,Int),B_A)) B_A
data B_B a b = C_D

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_C (((_,_),C_A _)) (C_B _)) -> 0 
  C_C (((_,_),C_C ((_,_)) _)) (C_C (((_,_),C_B _)) (C_C _ _)) -> 1 
  C_C _ (C_C (((_,_),C_A _)) (C_C _ _)) -> 2 
  C_C (((_,_),C_B (C_B _))) (C_C (((_,_),C_A _)) (C_C _ _)) -> 3 
  C_C (((_,_),C_A (C_D))) (C_C (((_,_),C_B _)) (C_C _ _)) -> 4 
  C_C _ (C_C _ (C_A _)) -> 5 
  C_C (((_,_),C_B _)) (C_B (C_B _)) -> 6 
  C_C (((_,_),C_B (C_B _))) (C_C (((_,_),C_C _ _)) (C_B _)) -> 7 
  C_C (((_,_),C_C ((_,_)) _)) (C_C _ (C_B _)) -> 8 
