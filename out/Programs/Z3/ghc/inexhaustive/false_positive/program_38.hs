module Program_14 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B _ C_A) (C_E (C_B _ _) (C_G _)) -> 0 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_B _ _) (C_G _)) -> 1 
  C_E (C_B _ C_A) (C_E (C_C _ _) _) -> 2 
  C_E (C_C ((C_E _ _,_)) C_D) C_F -> 3 
  C_E (C_B (C_C _ _) C_A) C_F -> 4 
  C_E (C_C _ _) (C_E (C_C _ _) _) -> 5 
  C_E (C_C ((C_D,_)) C_D) C_F -> 6 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_B _ _) _) -> 7 
  C_E (C_C _ (C_G _)) (C_E _ C_F) -> 8 
  C_E (C_C ((C_G _,_)) C_F) (C_E (C_B _ _) _) -> 9 
