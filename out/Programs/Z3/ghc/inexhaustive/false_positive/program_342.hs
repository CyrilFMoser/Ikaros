module Program_29 () where 

 main = print $ show v_b
data B_A = C_A ((Bool,Bool)) B_A | C_B Int Int | C_C Int ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A ((_,_)) (C_C _ ((C_C _ _,C_B _ _))) -> 0 
  C_A _ (C_A _ _) -> 1 
  C_A _ (C_C _ ((C_C _ _,C_B _ _))) -> 2 
  C_C _ ((C_A ((_,_)) (C_C _ _),C_C _ ((_,_)))) -> 3 
  C_C _ ((C_A _ _,C_C _ ((_,_)))) -> 4 
  C_C _ ((C_A ((_,_)) (C_A _ _),C_C _ _)) -> 5 
  C_C _ ((C_A ((_,_)) _,C_A ((_,_)) (C_B _ _))) -> 6 
