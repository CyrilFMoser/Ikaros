module Program_11 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B ((B_A,B_A)) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B ((C_B ((_,_)) (C_A _),C_B _ _)) (C_B ((C_B _ _,C_B _ _)) _) -> 1 
  C_B ((C_B ((_,_)) (C_B _ _),C_B _ _)) (C_B ((C_B _ _,C_A _)) (C_A _)) -> 2 
