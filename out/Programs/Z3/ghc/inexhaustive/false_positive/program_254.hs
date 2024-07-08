module Program_8 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B ((B_A,B_A)) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_B ((C_B _ _,C_A _)) _) -> 0 
  C_A (C_B ((C_B _ _,C_B _ _)) _) -> 1 
  C_A (C_B ((C_B _ _,C_B _ _)) (C_B _ _)) -> 2 
  C_A (C_A _) -> 3 
  C_B ((C_B ((_,_)) (C_B _ _),C_B ((_,_)) _)) (C_B ((C_B _ _,C_A _)) (C_A _)) -> 4 
  C_B ((C_B _ _,C_B _ _)) (C_B ((C_B _ _,C_B _ _)) (C_A _)) -> 5 
  C_B ((C_A (C_A _),C_B ((_,_)) (C_B _ _))) (C_B _ (C_A _)) -> 6 
  C_B ((C_B ((_,_)) (C_A _),C_B _ (C_A _))) (C_B ((C_B _ _,C_B _ _)) _) -> 7 
  C_B ((C_B _ _,C_B _ (C_B _ _))) (C_B ((C_A _,C_A _)) (C_A _)) -> 8 
  C_B ((C_A _,C_B ((_,_)) _)) (C_B ((C_B _ _,C_B _ _)) (C_B _ _)) -> 9 
  C_B ((C_A (C_A _),C_B ((_,_)) (C_B _ _))) (C_B ((C_A _,C_B _ _)) (C_A _)) -> 10 
  C_B ((C_B _ (C_A _),C_B _ (C_A _))) (C_B ((C_A _,C_B _ _)) (C_B _ _)) -> 11 
  C_B ((C_A (C_A _),C_B ((_,_)) _)) (C_B ((C_B _ _,C_A _)) (C_A _)) -> 12 
