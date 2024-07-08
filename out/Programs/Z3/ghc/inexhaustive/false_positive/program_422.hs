module Program_14 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B (((Int,Int),B_A)) | C_C B_A Char

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_B (((_,_),C_A _ _))) (C_A (C_C _ _) (C_C _ _)) -> 0 
  C_A (C_B (((_,_),C_B _))) (C_A (C_C _ _) (C_A _ _)) -> 1 
  C_A (C_A (C_B _) (C_A _ _)) (C_A _ (C_C _ _)) -> 2 
  C_A (C_B (((_,_),C_B _))) (C_A (C_B _) _) -> 3 
  C_A (C_C _ _) (C_A (C_C _ _) (C_B _)) -> 4 
  C_A (C_C (C_B _) _) (C_A (C_B _) (C_A _ _)) -> 5 
  C_A (C_A (C_C _ _) (C_B _)) (C_A _ _) -> 6 
  C_A (C_A (C_B _) _) (C_C _ _) -> 7 
  C_A (C_B _) (C_B (((_,_),C_A _ _))) -> 8 
  C_A (C_A _ _) (C_A _ (C_C _ _)) -> 9 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_C (C_B _) _) -> 10 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_A _ _) (C_C _ _)) -> 11 
  C_A (C_A (C_C _ _) (C_B _)) (C_C _ _) -> 12 
  C_A (C_A (C_B _) (C_C _ _)) (C_A (C_B _) (C_C _ _)) -> 13 
  C_A (C_A (C_C _ _) (C_B _)) (C_C (C_B _) _) -> 14 
  C_A (C_B (((_,_),C_B _))) (C_A (C_C _ _) _) -> 15 
  C_A (C_A _ _) (C_A (C_C _ _) _) -> 16 
  C_A (C_A (C_B _) (C_B _)) (C_A (C_B _) (C_A _ _)) -> 17 
  C_A (C_C (C_A _ _) _) (C_A (C_B _) _) -> 18 
  C_A _ (C_A (C_A _ _) (C_C _ _)) -> 19 
  C_A (C_A (C_B _) (C_B _)) (C_A (C_C _ _) (C_C _ _)) -> 20 
  C_A (C_C _ _) (C_B _) -> 21 
  C_A (C_A _ _) (C_C (C_C _ _) _) -> 22 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_C _ _) (C_A _ _)) -> 23 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 24 
  C_A _ (C_C (C_A _ _) _) -> 25 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _) (C_C _ _)) -> 26 
  C_A (C_B (((_,_),C_C _ _))) (C_C (C_C _ _) _) -> 27 
  C_A (C_A (C_B _) _) (C_A _ (C_C _ _)) -> 28 
  C_A _ (C_C (C_B _) _) -> 29 
  C_A _ (C_A (C_A _ _) (C_A _ _)) -> 30 
  C_A (C_B (((_,_),C_C _ _))) (C_C _ _) -> 31 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_B (((_,_),C_C _ _))) -> 32 
  C_A (C_C (C_A _ _) _) _ -> 33 
  C_A (C_A _ _) (C_B (((_,_),C_B _))) -> 34 
  C_A (C_B (((_,_),C_A _ _))) (C_B (((_,_),C_A _ _))) -> 35 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_B _) (C_A _ _)) -> 36 
  C_A (C_B (((_,_),C_B _))) (C_A (C_A _ _) (C_B _)) -> 37 
  C_A (C_B (((_,_),C_A _ _))) (C_A (C_A _ _) _) -> 38 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _) (C_C _ _)) -> 39 
  C_A (C_A _ (C_C _ _)) (C_A (C_A _ _) _) -> 40 
  C_A (C_A (C_B _) (C_A _ _)) (C_A _ (C_B _)) -> 41 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _) _) -> 42 
