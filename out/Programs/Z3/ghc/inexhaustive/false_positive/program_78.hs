module Program_21 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B a Bool
data B_B b c = C_C Char (B_B b c) | C_D | C_E (B_B c c) (B_A c)

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ (C_E _ (C_A _)) -> 0 
  C_C _ (C_E (C_C _ _) (C_B _ _)) -> 1 
  C_C _ (C_E (C_C _ _) (C_A _)) -> 2 
  C_E (C_E (C_E _ _) _) (C_A (C_B _ _)) -> 3 
  C_E (C_E (C_D) (C_B _ _)) (C_B _ _) -> 4 
  C_E (C_E (C_E _ _) (C_A _)) _ -> 5 
  C_E (C_E (C_E _ _) _) (C_A _) -> 6 
  C_E (C_E (C_C _ _) (C_A _)) (C_A _) -> 7 
  C_E (C_E (C_E _ _) (C_B _ _)) (C_A _) -> 8 
