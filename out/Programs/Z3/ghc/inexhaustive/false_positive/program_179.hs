module Program_26 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B ((Char,Int)) | C_C (B_A a) ((Int,Bool)) | C_D

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((_,_)) -> 0 
  C_A (C_C (C_A _) _) -> 1 
  C_A (C_B _) -> 2 
  C_A (C_C (C_C _ _) ((_,_))) -> 3 
  C_A _ -> 4 
  C_C (C_A (C_B _)) ((_,_)) -> 5 
  C_C (C_C (C_C _ _) ((_,_))) ((_,_)) -> 6 
  C_C (C_A (C_C _ _)) ((_,_)) -> 7 
  C_C (C_B ((_,_))) _ -> 8 
  C_C (C_A (C_B _)) _ -> 9 
  C_C (C_C (C_A _) ((_,_))) ((_,_)) -> 10 
  C_C (C_C (C_A _) _) ((_,_)) -> 11 
  C_C (C_A _) ((_,_)) -> 12 
  C_C (C_C (C_A _) _) _ -> 13 
  C_C (C_C (C_B _) ((_,_))) _ -> 14 
  C_C (C_C _ _) _ -> 15 
  C_C _ _ -> 16 
  C_C (C_A (C_C _ _)) _ -> 17 
  C_C (C_D) _ -> 18 
  C_C (C_C (C_D) ((_,_))) _ -> 19 
  C_C (C_C _ _) ((_,_)) -> 20 
  C_C (C_C (C_D) _) ((_,_)) -> 21 
  C_C (C_A (C_D)) _ -> 22 
  C_C (C_C (C_B _) _) _ -> 23 
  C_C (C_A (C_A _)) _ -> 24 
  C_C (C_C (C_B _) _) ((_,_)) -> 25 
  C_C (C_C (C_D) _) _ -> 26 
  C_C (C_C (C_B _) ((_,_))) ((_,_)) -> 27 
  C_C (C_C _ ((_,_))) ((_,_)) -> 28 
