module Program_13 () where 

 main = print $ show v_b
data B_A = C_A (((Int,Bool),B_A)) B_A | C_B | C_C Int | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (((_,_),C_D (C_C _) (C_C _))) (C_D _ C_B) -> 0 
  C_A (((_,_),C_D (C_C _) C_B)) (C_D (C_D _ _) C_B) -> 1 
  C_A (((_,_),C_D C_B _)) (C_A (((_,_),C_C _)) (C_C _)) -> 2 
  C_A (((_,_),C_A ((_,_)) _)) (C_A (((_,_),C_D _ _)) _) -> 3 
  C_A (((_,_),C_D (C_A _ _) _)) (C_D (C_A _ _) (C_D _ _)) -> 4 
  C_A (((_,_),C_A ((_,_)) (C_D _ _))) (C_A (((_,_),C_C _)) (C_A _ _)) -> 5 
  C_A (((_,_),C_D (C_A _ _) _)) (C_D (C_A _ _) _) -> 6 
  C_D (C_A (((_,_),C_A _ _)) (C_A _ _)) (C_A (((_,_),C_D _ _)) (C_D _ _)) -> 7 
  C_D (C_D _ (C_C _)) (C_A (((_,_),C_C _)) (C_A _ _)) -> 8 
  C_D (C_D _ C_B) _ -> 9 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D C_B (C_D _ _)) -> 10 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_A _ _) -> 11 
  C_D (C_A _ C_B) (C_D (C_A _ _) (C_A _ _)) -> 12 
  C_D (C_A (((_,_),C_D _ _)) _) (C_A (((_,_),C_C _)) (C_A _ _)) -> 13 
  C_D (C_D (C_C _) _) (C_D C_B (C_D _ _)) -> 14 
  C_D (C_D C_B _) (C_D C_B _) -> 15 
  C_D (C_D (C_C _) (C_D _ _)) (C_D _ (C_D _ _)) -> 16 
  C_D (C_A (((_,_),C_D _ _)) C_B) (C_A (((_,_),C_A _ _)) (C_C _)) -> 17 
  C_D (C_D _ (C_C _)) (C_D (C_D _ _) (C_C _)) -> 18 
  C_D (C_A (((_,_),C_A _ _)) (C_A _ _)) (C_A (((_,_),C_B)) (C_D _ _)) -> 19 
  C_D (C_D C_B (C_D _ _)) (C_A (((_,_),C_A _ _)) (C_C _)) -> 20 
  C_D (C_A _ (C_C _)) (C_D (C_C _) (C_C _)) -> 21 
  C_D (C_A (((_,_),C_D _ _)) (C_C _)) (C_D (C_A _ _) C_B) -> 22 
  C_D (C_D (C_C _) (C_A _ _)) (C_A (((_,_),C_B)) (C_A _ _)) -> 23 
  C_D (C_A (((_,_),C_C _)) (C_A _ _)) (C_D (C_D _ _) _) -> 24 
  C_D (C_C _) (C_A (((_,_),C_B)) (C_C _)) -> 25 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D C_B (C_C _)) -> 26 
  C_D (C_A _ C_B) (C_D C_B _) -> 27 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 28 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D C_B C_B) -> 29 
  C_D _ (C_A _ (C_A _ _)) -> 30 
  C_D (C_D (C_A _ _) (C_D _ _)) (C_D (C_D _ _) (C_A _ _)) -> 31 
  C_D (C_A _ (C_D _ _)) (C_A (((_,_),C_D _ _)) (C_C _)) -> 32 
  C_D (C_A _ (C_C _)) (C_A _ C_B) -> 33 
  C_D C_B (C_D (C_D _ _) (C_C _)) -> 34 
  C_D (C_A (((_,_),C_B)) (C_C _)) (C_A (((_,_),C_C _)) _) -> 35 
  C_D (C_D (C_C _) (C_C _)) (C_D (C_A _ _) (C_D _ _)) -> 36 
  C_D (C_D (C_C _) (C_D _ _)) (C_A (((_,_),C_C _)) _) -> 37 
  C_D (C_A (((_,_),C_C _)) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 38 
  C_D (C_A _ (C_A _ _)) (C_A (((_,_),C_A _ _)) _) -> 39 
