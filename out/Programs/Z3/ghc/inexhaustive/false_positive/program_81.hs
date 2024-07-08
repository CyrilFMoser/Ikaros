module Program_24 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_B b | C_C ((B_B,B_B)) (B_A B_B b)
data B_B = C_D | C_E B_B | C_F ((B_B,B_B))

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 0 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_B _ _)) -> 1 
  C_C ((C_D,C_E (C_E _))) (C_C ((C_F _,C_D)) (C_A)) -> 2 
  C_C ((C_E (C_E _),C_E C_D)) (C_C ((C_D,C_D)) (C_A)) -> 3 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 4 
  C_C ((C_E (C_E _),C_D)) (C_C ((C_E _,C_E _)) _) -> 5 
  C_C ((C_D,C_E C_D)) (C_C ((C_D,C_F _)) _) -> 6 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_D,C_D)) (C_B _ _)) -> 7 
  C_C ((C_F _,C_F _)) (C_C ((C_F _,C_E _)) (C_B _ _)) -> 8 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_D,C_D)) (C_C _ _)) -> 9 
  C_C ((C_D,C_E C_D)) _ -> 10 
  C_C ((C_E _,C_F ((_,_)))) (C_C ((C_F _,C_D)) _) -> 11 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_D,C_F _)) _) -> 12 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_D)) (C_A)) -> 13 
  C_C _ (C_C ((C_F _,C_D)) (C_A)) -> 14 
  C_C ((C_F ((_,_)),C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 15 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 16 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_D,C_D)) (C_A)) -> 17 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_F _,C_E _)) (C_A)) -> 18 
  C_C ((C_D,C_F _)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 19 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_D)) (C_A)) -> 20 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_C _ _)) -> 21 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 22 
  C_C ((C_E _,C_D)) (C_C ((C_E _,C_F _)) _) -> 23 
  C_C ((C_E C_D,C_E C_D)) (C_C ((C_F _,C_F _)) (C_C _ _)) -> 24 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_F _,C_D)) _) -> 25 
  C_C ((C_F ((_,_)),C_F _)) (C_C ((C_F _,C_D)) (C_B _ _)) -> 26 
  C_C ((C_D,C_E C_D)) (C_C ((C_E _,C_E _)) (C_B _ _)) -> 27 
  C_C _ (C_C ((C_F _,C_D)) (C_C _ _)) -> 28 
  C_C ((C_E C_D,C_E _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 29 
  C_C ((C_F ((_,_)),C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 30 
  C_C ((C_F ((_,_)),C_E _)) (C_C _ (C_B _ _)) -> 31 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_F _)) _) -> 32 
  C_C ((C_E (C_F _),C_E (C_F _))) (C_C ((C_E _,C_D)) _) -> 33 
  C_C ((C_E (C_E _),C_F _)) (C_C ((C_E _,C_D)) _) -> 34 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C ((C_E _,C_F _)) (C_C _ _)) -> 35 
  C_C ((C_E (C_E _),C_E (C_F _))) (C_C ((C_F _,C_E _)) _) -> 36 
  C_C ((C_E (C_E _),C_E (C_F _))) _ -> 37 
  C_C ((C_E _,C_E (C_E _))) (C_B (C_F _) _) -> 38 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_F _)) _) -> 39 
  C_C ((C_F _,C_D)) (C_C ((C_F _,C_D)) _) -> 40 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_D)) _) -> 41 
  C_C _ (C_A) -> 42 
  C_C ((C_D,C_E (C_E _))) (C_C _ _) -> 43 
  C_C ((C_E (C_E _),C_F ((_,_)))) (C_C ((C_D,C_D)) (C_C _ _)) -> 44 
  C_C ((C_D,C_D)) (C_C ((C_E _,C_E _)) _) -> 45 
  C_C ((C_D,C_F _)) (C_C ((C_F _,C_D)) (C_A)) -> 46 
  C_C ((C_F _,C_F ((_,_)))) _ -> 47 
  C_C ((C_D,C_F ((_,_)))) (C_C ((C_E _,C_D)) (C_B _ _)) -> 48 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_B C_D _) -> 49 
  C_C ((C_E (C_E _),C_E _)) (C_C ((C_F _,C_E _)) _) -> 50 
  C_C ((C_E (C_E _),C_E (C_E _))) (C_C ((C_D,C_D)) _) -> 51 
  C_C ((C_E (C_F _),C_E (C_E _))) (C_C ((C_F _,C_F _)) (C_B _ _)) -> 52 
  C_C ((C_F ((_,_)),C_D)) (C_C ((C_E _,C_D)) _) -> 53 
  C_C ((C_E _,C_E _)) (C_C ((C_E _,C_D)) (C_B _ _)) -> 54 
  C_C ((C_E (C_E _),C_F _)) (C_B (C_E _) _) -> 55 
  C_C ((C_E C_D,C_F _)) (C_C ((C_D,C_E _)) _) -> 56 
  C_C ((C_F _,C_E (C_E _))) (C_C ((C_E _,C_D)) _) -> 57 
  C_C ((C_E _,C_E (C_F _))) (C_C ((C_D,C_E _)) (C_C _ _)) -> 58 
  C_C ((C_E C_D,C_D)) (C_C ((C_D,C_F _)) _) -> 59 
  C_C ((C_E _,C_E (C_E _))) (C_C ((C_F _,C_E _)) (C_C _ _)) -> 60 
  C_C ((C_E (C_F _),C_F ((_,_)))) (C_C _ _) -> 61 
  C_C ((C_F ((_,_)),C_F ((_,_)))) (C_C ((C_E _,C_F _)) _) -> 62 
  C_C ((C_E C_D,C_E _)) (C_C ((C_D,C_E _)) (C_B _ _)) -> 63 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 64 
  C_C ((C_E C_D,C_E (C_E _))) (C_C ((C_D,C_F _)) (C_B _ _)) -> 65 
  C_C ((C_D,C_E (C_F _))) (C_C ((C_E _,C_F _)) (C_B _ _)) -> 66 
  C_C ((C_E C_D,C_E _)) (C_C _ (C_C _ _)) -> 67 
  C_C ((C_F _,C_E _)) (C_C ((C_E _,C_E _)) (C_C _ _)) -> 68 
