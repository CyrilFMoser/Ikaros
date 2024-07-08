module Program_30 () where 

 main = print $ show v_b
data B_A = C_A B_A B_B
data B_B = C_B B_A | C_C | C_D B_A ((B_A,B_A))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) (C_B _),C_A _ C_C)) -> 0 
  C_D _ ((C_A _ (C_D _ _),C_A _ _)) -> 1 
  C_D (C_A _ C_C) ((C_A (C_A _ _) C_C,C_A (C_A _ _) _)) -> 2 
  C_D (C_A (C_A _ _) _) ((C_A _ C_C,C_A (C_A _ _) (C_B _))) -> 3 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A _ _,C_A (C_A _ _) _)) -> 4 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) _,C_A _ _)) -> 5 
  C_D (C_A (C_A _ _) C_C) ((C_A _ _,C_A _ _)) -> 6 
  C_D (C_A (C_A _ _) (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ C_C)) -> 7 
  C_D (C_A (C_A _ _) C_C) ((C_A _ _,C_A (C_A _ _) (C_B _))) -> 8 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A (C_A _ _) (C_B _))) -> 9 
  C_D (C_A _ C_C) ((C_A (C_A _ _) _,C_A _ (C_D _ _))) -> 10 
  C_D (C_A _ (C_B _)) ((C_A (C_A _ _) C_C,C_A _ (C_D _ _))) -> 11 
  C_D (C_A _ _) ((C_A (C_A _ _) (C_D _ _),C_A _ _)) -> 12 
  C_D (C_A _ _) ((C_A _ _,C_A (C_A _ _) (C_D _ _))) -> 13 
  C_D (C_A _ C_C) ((C_A _ _,C_A (C_A _ _) C_C)) -> 14 
  C_D (C_A (C_A _ _) C_C) ((C_A _ (C_D _ _),C_A _ (C_B _))) -> 15 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A _ C_C,C_A (C_A _ _) (C_D _ _))) -> 16 
  C_D _ ((C_A (C_A _ _) (C_D _ _),C_A _ C_C)) -> 17 
  C_D (C_A (C_A _ _) (C_B _)) ((C_A (C_A _ _) C_C,C_A _ C_C)) -> 18 
