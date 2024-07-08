module Program_13 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B (((Int,Int),B_A)) | C_C B_A Char

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_A (C_C _ _) (C_A _ _)) _ -> 0 
  C_C (C_A (C_B _) _) _ -> 1 
  C_C (C_A (C_A _ _) (C_A _ _)) _ -> 2 
  C_C (C_A (C_B _) (C_B _)) _ -> 3 
  C_C (C_A (C_C _ _) (C_B _)) _ -> 4 
  C_C _ _ -> 5 
  C_C (C_A (C_B _) (C_A _ _)) _ -> 6 
  C_C (C_A (C_A _ _) (C_B _)) _ -> 7 
  C_C (C_A (C_B _) (C_C _ _)) _ -> 8 
  C_C (C_B (((_,_),C_B _))) _ -> 9 
  C_C (C_A _ _) _ -> 10 
  C_C (C_A _ (C_A _ _)) _ -> 11 
  C_C (C_A (C_A _ _) (C_C _ _)) _ -> 12 
  C_C (C_B (((_,_),C_A _ _))) _ -> 13 
  C_C (C_B _) _ -> 14 
  C_C (C_A (C_A _ _) _) _ -> 15 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_C _ _)) -> 16 
  C_A (C_B _) (C_A (C_B _) (C_B _)) -> 17 
  C_A (C_C (C_B _) _) (C_A (C_C _ _) (C_B _)) -> 18 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_C _ _) _) -> 19 
  C_A (C_A _ (C_A _ _)) (C_A _ _) -> 20 
  C_A (C_C (C_B _) _) (C_B (((_,_),C_A _ _))) -> 21 
  C_A (C_B (((_,_),C_A _ _))) (C_A _ _) -> 22 
  C_A (C_A (C_B _) (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 23 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _) (C_B _)) -> 24 
  C_A (C_A _ (C_A _ _)) (C_A (C_C _ _) (C_C _ _)) -> 25 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_C _ _) (C_B _)) -> 26 
  C_A _ (C_A (C_C _ _) _) -> 27 
  C_A (C_A _ (C_C _ _)) (C_C (C_A _ _) _) -> 28 
  C_A (C_C (C_C _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 29 
  C_A _ (C_A (C_B _) (C_A _ _)) -> 30 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 31 
  C_A (C_A (C_B _) _) (C_A (C_C _ _) _) -> 32 
  C_A (C_A (C_B _) (C_C _ _)) (C_C (C_C _ _) _) -> 33 
  C_A (C_B (((_,_),C_C _ _))) (C_A (C_B _) _) -> 34 
  C_A (C_A (C_C _ _) (C_B _)) (C_A (C_A _ _) (C_C _ _)) -> 35 
  C_A (C_A _ (C_A _ _)) (C_A _ (C_B _)) -> 36 
  C_A (C_A (C_B _) _) (C_B _) -> 37 
  C_A (C_A _ (C_C _ _)) (C_A (C_A _ _) (C_C _ _)) -> 38 
  C_A _ (C_B (((_,_),C_A _ _))) -> 39 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_C _ _) _) -> 40 
  C_A (C_A (C_C _ _) (C_B _)) _ -> 41 
  C_A (C_C (C_A _ _) _) (C_A (C_B _) (C_B _)) -> 42 
  C_A (C_A (C_B _) (C_A _ _)) (C_A (C_C _ _) (C_B _)) -> 43 
  C_A _ (C_B (((_,_),C_B _))) -> 44 
  C_A (C_A (C_A _ _) _) (C_A _ (C_C _ _)) -> 45 
  C_A (C_B (((_,_),C_A _ _))) (C_B _) -> 46 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_B _) (C_A _ _)) -> 47 
  C_A (C_A (C_B _) (C_B _)) (C_B (((_,_),C_B _))) -> 48 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_B _) (C_A _ _)) -> 49 
  C_A (C_C _ _) (C_A (C_B _) _) -> 50 
  C_A (C_A (C_B _) (C_A _ _)) (C_C _ _) -> 51 
  C_A (C_A _ (C_B _)) (C_A _ _) -> 52 
  C_A (C_A (C_B _) _) (C_A (C_A _ _) (C_B _)) -> 53 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_B (((_,_),C_B _))) -> 54 
  C_A (C_C _ _) (C_A (C_A _ _) (C_A _ _)) -> 55 
  C_A (C_C (C_B _) _) _ -> 56 
  C_A (C_A _ (C_B _)) (C_A (C_C _ _) (C_C _ _)) -> 57 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_C (C_C _ _) _) -> 58 
  C_A (C_A _ (C_A _ _)) (C_C (C_B _) _) -> 59 
  C_A (C_C _ _) (C_A _ _) -> 60 
  C_A _ (C_A (C_C _ _) (C_A _ _)) -> 61 
  C_A (C_C (C_A _ _) _) (C_A _ _) -> 62 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 63 
  C_A (C_A (C_B _) (C_B _)) (C_A (C_B _) (C_B _)) -> 64 
  C_A (C_A (C_B _) (C_C _ _)) (C_A (C_B _) (C_B _)) -> 65 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_B _) _) -> 66 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_B _) (C_C _ _)) -> 67 
  C_A (C_B (((_,_),C_B _))) (C_A _ (C_B _)) -> 68 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_B (((_,_),C_C _ _))) -> 69 
  C_A (C_A _ (C_B _)) (C_A _ (C_C _ _)) -> 70 
  C_A (C_A (C_C _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 71 
  C_A (C_A (C_C _ _) (C_B _)) (C_B (((_,_),C_A _ _))) -> 72 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A _ _) -> 73 
  C_A (C_B _) (C_A _ (C_B _)) -> 74 
  C_A (C_A (C_B _) (C_B _)) (C_A (C_B _) _) -> 75 
  C_A (C_A (C_A _ _) (C_B _)) (C_A _ (C_A _ _)) -> 76 
  C_A (C_A _ (C_A _ _)) (C_A (C_C _ _) _) -> 77 
  C_A (C_A (C_B _) (C_B _)) (C_A _ (C_B _)) -> 78 
