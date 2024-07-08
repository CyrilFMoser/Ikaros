module Program_16 () where 

 main = print $ show v_b
data B_A = C_A (((Int,Bool),B_A)) B_A | C_B | C_C Int | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (((_,_),C_C _)) (C_A _ (C_A _ _)) -> 0 
  C_D (C_C _) (C_D (C_C _) C_B) -> 1 
  C_D (C_D (C_A _ _) C_B) (C_A (((_,_),C_B)) (C_A _ _)) -> 2 
  C_D (C_A _ _) (C_D _ (C_A _ _)) -> 3 
  C_D (C_D _ C_B) (C_D _ _) -> 4 
  C_D _ (C_C _) -> 5 
  C_D (C_D C_B C_B) (C_A (((_,_),C_A _ _)) (C_A _ _)) -> 6 
  C_D (C_A (((_,_),C_A _ _)) (C_D _ _)) (C_A (((_,_),C_B)) (C_C _)) -> 7 
  C_D (C_A (((_,_),C_B)) C_B) _ -> 8 
  C_D (C_D _ (C_C _)) (C_A (((_,_),C_C _)) _) -> 9 
  C_D (C_A (((_,_),C_B)) (C_D _ _)) (C_A (((_,_),C_D _ _)) (C_A _ _)) -> 10 
  C_D (C_D _ (C_C _)) (C_A (((_,_),C_C _)) (C_C _)) -> 11 
  C_D (C_D C_B _) (C_D _ (C_C _)) -> 12 
