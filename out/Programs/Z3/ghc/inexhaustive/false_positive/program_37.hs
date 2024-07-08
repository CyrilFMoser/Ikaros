module Program_13 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B C_A _) C_F -> 0 
  C_E (C_B C_A C_A) (C_E _ (C_G _)) -> 1 
  C_E (C_C ((C_D,_)) (C_G _)) _ -> 2 
  C_E (C_C ((C_D,_)) (C_E _ _)) _ -> 3 
  C_E (C_C _ (C_E _ _)) (C_G (C_E _ _)) -> 4 
  C_E (C_B (C_C _ _) C_A) (C_E C_A C_D) -> 5 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_C _ _) C_F) -> 6 
  C_E (C_C ((C_E _ _,_)) C_F) C_F -> 7 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_G (C_G _)) -> 8 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_C _ _) C_D) -> 9 
  C_E _ (C_E _ _) -> 10 
  C_E (C_B (C_B _ _) _) C_F -> 11 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_C _ _) C_D) -> 12 
  C_E (C_C ((C_D,_)) _) (C_G _) -> 13 
  C_E (C_C ((C_E _ _,_)) C_F) (C_E _ C_F) -> 14 
  C_E (C_B _ _) (C_E (C_B _ _) C_D) -> 15 
  C_E (C_C ((C_E _ _,_)) _) (C_E C_A C_F) -> 16 
  C_E (C_B C_A (C_B _ _)) C_D -> 17 
