module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_B b | C_C ((B_B,B_B)) (B_A B_B b)
data B_B = C_D | C_E B_B | C_F ((B_B,B_B))

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_B (C_F ((C_D,C_F _))) _ -> 1 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 2 
  C_C ((C_E (C_F _),C_E _)) (C_A) -> 3 
  C_C ((C_D,C_E _)) (C_C ((C_E _,C_D)) _) -> 4 
  C_C ((C_E C_D,C_F _)) _ -> 5 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 6 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 7 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_D,C_E _)) (C_C _ _)) -> 8 
  C_C ((C_E (C_E _),C_F ((_,_)))) _ -> 9 
  C_C ((C_D,C_F ((_,_)))) _ -> 10 
  C_C ((C_D,C_D)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 11 
  C_C _ (C_C ((C_F _,C_E _)) (C_B _ _)) -> 12 
  C_C ((C_E _,C_D)) (C_B (C_E _) _) -> 13 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 14 
  C_C ((C_F _,C_E _)) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 15 
  C_C ((C_F _,C_E _)) _ -> 16 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 17 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_F _)) (C_C _ _)) -> 18 
  C_C ((C_F _,C_E (C_E _))) _ -> 19 
  C_C ((C_E (C_F _),C_E _)) (C_C ((C_E _,C_D)) (C_C _ _)) -> 20 
  C_C ((C_E C_D,C_F _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 21 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C _ (C_B _ _)) -> 22 
  C_C _ (C_C ((C_E _,C_E _)) (C_B _ _)) -> 23 
  C_C ((C_E (C_F _),C_D)) (C_C _ (C_A)) -> 24 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_B (C_E _) _) -> 25 
  C_C ((C_D,C_F ((_,_)))) (C_C _ (C_C _ _)) -> 26 
  C_C ((C_F _,C_E C_D)) (C_C ((C_D,C_D)) (C_B _ _)) -> 27 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C _ (C_A)) -> 28 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 29 
