module Program_13 () where 

main = print $ show v_b
data B_B = C_B | C_C ((B_B,B_A)) B_A
data B_A = C_A ((Int,(Int,Int))) ((B_A,B_A))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C ((C_C ((_,_)) _,C_A ((_,_)) _)) (C_A ((_,(_,_))) _) -> 1 
  C_C ((C_C _ _,C_A ((_,_)) _)) (C_A _ ((C_A _ _,C_A _ _))) -> 2 
  C_C ((C_C ((_,_)) _,C_A _ ((_,_)))) (C_A _ _) -> 3 
  C_C ((C_C _ (C_A _ _),C_A _ ((_,_)))) (C_A _ ((C_A _ _,C_A _ _))) -> 4 
  C_C ((C_C _ _,C_A ((_,_)) _)) (C_A ((_,(_,_))) _) -> 5 
  C_C ((C_C ((_,_)) _,C_A _ _)) (C_A _ _) -> 6 
  C_C ((C_C ((_,_)) (C_A _ _),C_A ((_,_)) ((_,_)))) (C_A _ _) -> 7 
  C_C ((C_C _ _,C_A ((_,_)) _)) _ -> 8 
  C_C ((C_B,C_A _ _)) (C_A _ _) -> 9 
  C_C ((C_C _ (C_A _ _),C_A ((_,_)) _)) _ -> 10 
  C_C ((C_C ((_,_)) (C_A _ _),C_A _ _)) (C_A ((_,(_,_))) _) -> 11 
