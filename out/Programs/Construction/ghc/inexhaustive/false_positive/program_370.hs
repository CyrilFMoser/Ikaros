module Program_25 () where 

 main = print $ show v_b
data B_B = C_F B_B | C_G (B_A B_B ((Char,Char))) (B_A B_B B_C) | C_H
data B_C = C_I Bool | C_J B_C | C_K
data B_A a b = C_A | C_B ((B_C,B_C)) | C_C (B_A a a) | C_D b b | C_E Bool

v_a :: B_A B_B B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B ((C_I _,C_I _)) -> 1 
  C_B ((C_I _,C_J _)) -> 2 
  C_B ((C_I _,C_K)) -> 3 
  C_B ((C_J _,C_I _)) -> 4 
  C_B ((C_J _,C_J _)) -> 5 
  C_B ((C_J _,C_K)) -> 6 
  C_B ((C_K,C_I _)) -> 7 
  C_B ((C_K,C_J _)) -> 8 
  C_B ((C_K,C_K)) -> 9 
  C_C (C_A) -> 10 
  C_C (C_B ((_,_))) -> 11 
  C_C (C_C (C_A)) -> 12 
  C_C (C_C (C_B _)) -> 13 
  C_C (C_C (C_C _)) -> 14 
  C_C (C_C (C_D _ _)) -> 15 
  C_C (C_C (C_E _)) -> 16 
  C_C (C_D _ (C_F _)) -> 17 
  C_C (C_D _ (C_G _ _)) -> 18 
  C_C (C_D _ C_H) -> 19 
  C_C (C_E _) -> 20 
  C_D (C_I _) (C_I _) -> 21 
  C_D (C_J (C_I _)) (C_I _) -> 22 
  C_D (C_J (C_J _)) (C_I _) -> 23 
  C_D (C_J C_K) (C_I _) -> 24 
  C_D C_K (C_I _) -> 25 
  C_D (C_I _) (C_J (C_I _)) -> 26 
  C_D (C_J (C_I _)) (C_J (C_I _)) -> 27 
  C_D (C_J (C_J _)) (C_J (C_I _)) -> 28 
  C_D (C_J C_K) (C_J (C_I _)) -> 29 
  C_D C_K (C_J (C_I _)) -> 30 
  C_D (C_I _) (C_J (C_J _)) -> 31 
  C_D (C_J (C_I _)) (C_J (C_J _)) -> 32 
  C_D (C_J (C_J _)) (C_J (C_J _)) -> 33 
  C_D (C_J C_K) (C_J (C_J _)) -> 34 
  C_D C_K (C_J (C_J _)) -> 35 
  C_D (C_I _) (C_J C_K) -> 36 
  C_D (C_J (C_I _)) (C_J C_K) -> 37 
  C_D (C_J (C_J _)) (C_J C_K) -> 38 
  C_D (C_J C_K) (C_J C_K) -> 39 
  C_D C_K (C_J C_K) -> 40 
  C_D (C_I _) C_K -> 41 
  C_D (C_J (C_I _)) C_K -> 42 
  C_D (C_J (C_J _)) C_K -> 43 
  C_D (C_J C_K) C_K -> 44 
  C_E _ -> 45 
