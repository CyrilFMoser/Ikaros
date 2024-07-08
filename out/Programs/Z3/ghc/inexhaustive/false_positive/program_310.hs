module Program_29 () where 

 main = print $ show v_b
data B_A = C_A B_A B_B
data B_B = C_B B_A | C_C | C_D B_A ((B_A,B_A))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_A _ _) -> 0 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) _)) -> 1 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) C_C)) -> 2 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 3 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 4 
  C_D (C_A _ C_C) ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 5 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 6 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 7 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A _ (C_B _))) -> 8 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) C_C)) -> 9 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 10 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 11 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A (C_A _ _) _)) -> 12 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 13 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ C_C,C_A _ _)) -> 14 
  C_D (C_A _ _) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_D _ _))) -> 15 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 16 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ (C_D _ _))) -> 17 
  C_D (C_A _ C_C) ((C_A _ _,C_A _ (C_D _ _))) -> 18 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 19 
  C_D (C_A _ (C_B _)) ((C_A _ (C_D _ _),C_A _ _)) -> 20 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 21 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 22 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A (C_A _ _) _)) -> 23 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ (C_B _),C_A _ (C_D _ _))) -> 24 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_B _),C_A _ _)) -> 25 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 26 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) (C_D _ _))) -> 27 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 28 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 29 
