module Program_28 () where 

main = print $ show v_b
data B_B = C_E (B_A B_B) B_B | C_F B_B | C_G
data B_A a = C_A | C_B (B_A a) (B_A ((Char,Int))) | C_C | C_D Char

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_E _ (C_E _ _)) -> 0 
  C_F (C_E _ _) -> 1 
  C_F (C_F (C_F _)) -> 2 
  C_F (C_E (C_D _) C_G) -> 3 
  C_F (C_E (C_C) (C_F _)) -> 4 
  C_F (C_E (C_D _) (C_E _ _)) -> 5 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_A) _) -> 6 
  C_E (C_B _ (C_B _ _)) (C_E (C_B _ _) (C_F _)) -> 7 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_C) _) -> 8 
  C_E (C_B (C_A) (C_D _)) (C_E (C_A) _) -> 9 
  C_E (C_B _ _) (C_F _) -> 10 
  C_E (C_B (C_D _) (C_A)) (C_E (C_B _ _) (C_F _)) -> 11 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_D _) _) -> 12 
  C_E (C_B (C_A) _) (C_E (C_B _ _) _) -> 13 
  C_E (C_B (C_C) _) (C_E (C_A) _) -> 14 
  C_E (C_B (C_B _ _) _) (C_E (C_C) (C_F _)) -> 15 
  C_E (C_B _ (C_A)) (C_F _) -> 16 
  C_E (C_B _ (C_C)) (C_E (C_C) (C_E _ _)) -> 17 
  C_E (C_B (C_A) _) (C_E (C_C) (C_F _)) -> 18 
  C_E (C_B (C_C) (C_A)) (C_E _ (C_E _ _)) -> 19 
  C_E (C_B (C_D _) (C_C)) (C_E (C_D _) (C_E _ _)) -> 20 
  C_E (C_B _ (C_D _)) C_G -> 21 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_B _ _) C_G) -> 22 
  C_E (C_B _ (C_C)) (C_E (C_A) (C_F _)) -> 23 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_B _ _) _) -> 24 
  C_E (C_B (C_D _) _) (C_E (C_B _ _) C_G) -> 25 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_C) C_G) -> 26 
  C_E (C_B _ (C_A)) (C_E (C_D _) (C_E _ _)) -> 27 
  C_E (C_B (C_D _) _) _ -> 28 
  C_E (C_D _) (C_E (C_B _ _) (C_F _)) -> 29 
  C_E (C_B (C_C) (C_C)) (C_E (C_B _ _) (C_F _)) -> 30 
