module Program_28 () where 

 main = print $ show v_b
data B_B = C_B B_A | C_C | C_D B_A ((B_A,B_A))
data B_A = C_A B_A B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ ((C_A (C_A _ _) C_C,C_A _ C_C)) -> 0 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 1 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ C_C,C_A _ (C_D _ _))) -> 2 
  C_D (C_A (C_A _ _) _) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 3 
  C_D (C_A _ _) ((C_A _ (C_D _ _),C_A (C_A _ _) _)) -> 4 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_B _))) -> 5 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 6 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 7 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 8 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 9 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 10 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) (C_D _ _))) -> 11 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) (C_B _),C_A _ _)) -> 12 
  C_D (C_A (C_A _ _) _) ((C_A _ C_C,C_A _ (C_D _ _))) -> 13 
  C_D (C_A (C_A _ _) _) ((C_A _ (C_B _),C_A (C_A _ _) (C_B _))) -> 14 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 15 
  C_D (C_A (C_A _ _) C_C) ((C_A _ C_C,C_A _ C_C)) -> 16 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 17 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 18 
  C_D (C_A (C_A _ _) C_C) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 19 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ C_C,C_A (C_A _ _) C_C)) -> 20 
  C_D (C_A _ (C_D _ _)) ((C_A _ C_C,C_A _ _)) -> 21 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) _,C_A _ (C_B _))) -> 22 
  C_D _ _ -> 23 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_D _ _),C_A _ _)) -> 24 
  C_D (C_A _ C_C) ((C_A _ _,C_A _ _)) -> 25 
  C_D (C_A _ _) ((C_A (C_A _ _) C_C,C_A _ _)) -> 26 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ (C_B _),C_A (C_A _ _) C_C)) -> 27 
  C_D (C_A _ (C_D _ _)) ((C_A _ (C_D _ _),C_A (C_A _ _) (C_B _))) -> 28 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 29 
  C_D (C_A _ _) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 30 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ _)) -> 31 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 32 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) _)) -> 33 
  C_D (C_A _ _) ((C_A _ (C_B _),C_A (C_A _ _) (C_D _ _))) -> 34 
  C_D (C_A _ (C_B _)) ((C_A _ _,C_A (C_A _ _) _)) -> 35 
  C_D (C_A _ _) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 36 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A (C_A _ _) (C_B _))) -> 37 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A _ (C_D _ _))) -> 38 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 39 
  C_D (C_A (C_A _ _) C_C) ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 40 
  C_D (C_A _ (C_B _)) ((C_A _ (C_B _),C_A (C_A _ _) _)) -> 41 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) _)) -> 42 
  C_D _ ((C_A (C_A _ _) (C_B _),C_A (C_A _ _) C_C)) -> 43 
