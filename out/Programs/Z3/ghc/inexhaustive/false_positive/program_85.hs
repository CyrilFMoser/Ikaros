module Program_28 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_B b | C_C ((B_B,B_B)) (B_A B_B b)
data B_B = C_D | C_E B_B | C_F ((B_B,B_B))

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((C_E C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) (C_A)) -> 0 
  C_C ((C_F _,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 1 
  C_C _ (C_C ((C_F _,C_F _)) (C_A)) -> 2 
  C_C ((C_E (C_F _),C_D)) (C_C ((C_F _,C_E _)) _) -> 3 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 4 
  C_C ((C_E C_D,C_D)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 5 
