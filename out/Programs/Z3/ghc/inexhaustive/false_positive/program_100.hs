module Program_12 () where 

 main = print $ show v_b
data B_A = C_A | C_B ((B_A,B_B))
data B_B = C_C B_B | C_D Int | C_E B_B B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_E (C_E _ _) (C_C _)) -> 0 
  C_C (C_E (C_D _) (C_D _)) -> 1 
  C_C (C_C (C_D _)) -> 2 
  C_C (C_E (C_D _) (C_C _)) -> 3 
  C_C (C_E _ (C_E _ _)) -> 4 
  C_C (C_E (C_C _) (C_D _)) -> 5 
  C_C (C_E (C_D _) _) -> 6 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_D _) (C_D _)) -> 7 
  C_E (C_E _ (C_C _)) (C_E (C_E _ _) (C_C _)) -> 8 
  C_E (C_E (C_D _) _) (C_D _) -> 9 
  C_E (C_C _) (C_E (C_D _) (C_E _ _)) -> 10 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_C _) (C_D _)) -> 11 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_D _) (C_D _)) -> 12 
