module Program_25 () where 

 main = print $ show v_b
data B_B = C_F ((B_C,B_C)) B_B | C_G (B_D Int)
data B_A a = C_A B_C | C_B B_B (B_A a) | C_C a | C_D (B_A a) | C_E
data B_D b = C_K (B_A b) b | C_L ((B_B,B_C)) b
data B_C = C_H Int | C_I Bool (B_A B_B) | C_J ((B_B,B_C))

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_H _) -> 0 
  C_A (C_I _ (C_A _)) -> 1 
  C_A (C_I _ (C_B _ _)) -> 2 
  C_A (C_I _ (C_C _)) -> 3 
  C_A (C_I _ (C_D _)) -> 4 
  C_A (C_I _ (C_E)) -> 5 
  C_A (C_J _) -> 6 
  C_B _ _ -> 7 
  C_C _ -> 8 
  C_D (C_A _) -> 9 
  C_D (C_B _ _) -> 10 
  C_D (C_C _) -> 11 
  C_D (C_D _) -> 12 
  C_D (C_E) -> 13 
  C_E -> 14 
