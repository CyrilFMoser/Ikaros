module Program_14 () where 

 main = print $ show v_b
data B_A = C_A (((Int,Bool),B_A)) B_A | C_B | C_C Int | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (((_,_),C_A _ (C_A _ _))) (C_A (((_,_),C_D _ _)) C_B) -> 0 
  C_A (((_,_),C_C _)) (C_D (C_A _ _) C_B) -> 1 
  C_D (C_A (((_,_),C_D _ _)) (C_D _ _)) (C_A (((_,_),C_C _)) C_B) -> 2 
  C_D (C_D _ _) (C_D _ C_B) -> 3 
  C_D (C_A (((_,_),C_C _)) (C_D _ _)) (C_D (C_C _) (C_D _ _)) -> 4 
  C_D (C_D (C_C _) (C_C _)) (C_A (((_,_),C_A _ _)) C_B) -> 5 
  C_D (C_D (C_D _ _) C_B) (C_D (C_A _ _) (C_A _ _)) -> 6 
  C_D (C_A (((_,_),C_D _ _)) _) (C_D (C_D _ _) (C_A _ _)) -> 7 
  C_D (C_A (((_,_),C_D _ _)) (C_D _ _)) (C_A (((_,_),C_C _)) _) -> 8 
  C_D (C_D _ (C_C _)) _ -> 9 
  C_D (C_D (C_C _) C_B) (C_D (C_A _ _) (C_A _ _)) -> 10 
  C_D (C_A (((_,_),C_D _ _)) (C_A _ _)) (C_D (C_C _) C_B) -> 11 
  C_D (C_D C_B C_B) (C_D (C_C _) (C_D _ _)) -> 12 
  C_D (C_A (((_,_),C_B)) (C_A _ _)) (C_A (((_,_),C_C _)) _) -> 13 
  C_D (C_D _ C_B) (C_A _ (C_C _)) -> 14 
  C_D (C_A (((_,_),C_C _)) (C_A _ _)) (C_D (C_C _) _) -> 15 
  C_D (C_D C_B C_B) (C_D (C_A _ _) C_B) -> 16 
  C_D (C_A (((_,_),C_B)) _) C_B -> 17 
  C_D (C_D _ C_B) (C_A (((_,_),C_D _ _)) (C_C _)) -> 18 
  C_D (C_D C_B _) (C_A (((_,_),C_A _ _)) (C_A _ _)) -> 19 
  C_D (C_D C_B (C_A _ _)) (C_D (C_D _ _) (C_A _ _)) -> 20 
  C_D (C_D (C_A _ _) _) (C_D _ (C_D _ _)) -> 21 
  C_D (C_A _ (C_D _ _)) (C_D _ (C_D _ _)) -> 22 
  C_D (C_D (C_C _) _) C_B -> 23 
  C_D (C_D (C_A _ _) (C_C _)) (C_D C_B (C_D _ _)) -> 24 
  C_D (C_D (C_C _) (C_A _ _)) _ -> 25 
  C_D (C_A (((_,_),C_C _)) (C_D _ _)) (C_D (C_C _) C_B) -> 26 
  C_D (C_A (((_,_),C_A _ _)) (C_C _)) (C_D (C_A _ _) (C_A _ _)) -> 27 
  C_D (C_D (C_D _ _) (C_A _ _)) (C_D (C_C _) _) -> 28 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_A (((_,_),C_C _)) C_B) -> 29 
  C_D (C_A (((_,_),C_C _)) (C_C _)) (C_D _ (C_D _ _)) -> 30 
  C_D (C_A (((_,_),C_A _ _)) _) (C_D (C_A _ _) C_B) -> 31 
  C_D (C_A (((_,_),C_D _ _)) (C_C _)) (C_A (((_,_),C_D _ _)) (C_D _ _)) -> 32 
  C_D (C_A (((_,_),C_B)) _) (C_A (((_,_),C_D _ _)) _) -> 33 
  C_D (C_D (C_D _ _) C_B) (C_A (((_,_),C_A _ _)) (C_C _)) -> 34 
  C_D (C_A (((_,_),C_C _)) (C_C _)) (C_A _ C_B) -> 35 
  C_D (C_A (((_,_),C_B)) (C_C _)) (C_D (C_D _ _) (C_A _ _)) -> 36 
