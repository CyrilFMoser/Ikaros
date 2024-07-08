module Program_30 () where 

 main = print $ show v_b
data B_B a = C_E (B_B a) | C_F B_A | C_G (B_B a) a
data B_A = C_A B_A | C_B | C_C B_A B_A | C_D (B_B B_A) (B_B B_A)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C _ (C_A (C_A _)) -> 2 
  C_C _ (C_A C_B) -> 3 
  C_C _ (C_A (C_C _ _)) -> 4 
  C_C _ (C_A (C_D _ _)) -> 5 
  C_C _ C_B -> 6 
  C_C _ (C_C _ _) -> 7 
  C_C _ (C_D (C_F _) _) -> 8 
  C_C _ (C_D (C_G _ _) _) -> 9 
  C_D _ _ -> 10 
