module Program_23 () where 

 main = print $ show v_b
data B_A a b = C_A
data B_B c = C_B Char Char | C_C c (B_B c) | C_D (B_B Bool) | C_E c | C_F (B_B c)

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C _ (C_B _ _) -> 1 
  C_C _ (C_C _ _) -> 2 
  C_C _ (C_D _) -> 3 
  C_C _ (C_E _) -> 4 
  C_C _ (C_F (C_B _ _)) -> 5 
  C_C _ (C_F (C_C _ _)) -> 6 
  C_C _ (C_F (C_D _)) -> 7 
  C_C _ (C_F (C_F _)) -> 8 
  C_D (C_B _ _) -> 9 
  C_D (C_C _ _) -> 10 
  C_D (C_D _) -> 11 
  C_D (C_E _) -> 12 
  C_D (C_F _) -> 13 
  C_E _ -> 14 
  C_F (C_B _ _) -> 15 
  C_F (C_C _ _) -> 16 
  C_F (C_D _) -> 17 
  C_F (C_E _) -> 18 
  C_F (C_F (C_B _ _)) -> 19 
  C_F (C_F (C_C _ _)) -> 20 
  C_F (C_F (C_D _)) -> 21 
  C_F (C_F (C_E _)) -> 22 
  C_F (C_F (C_F _)) -> 23 
