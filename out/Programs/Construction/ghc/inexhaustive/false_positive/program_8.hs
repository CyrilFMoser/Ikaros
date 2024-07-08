module Program_16 () where 

 main = print $ show v_b
data B_A a = C_A Int (B_B a a) | C_B Char (B_A a) | C_C | C_D (B_B a a) | C_E
data B_B b c = C_F (B_A b) ((Int,Int))

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ (C_A _ (C_F _ _)) -> 1 
  C_B _ (C_B 'x' (C_A _ _)) -> 2 
  C_B _ (C_B 'x' (C_B _ _)) -> 3 
  C_B _ (C_B 'x' (C_C)) -> 4 
  C_B _ (C_B 'x' (C_D _)) -> 5 
  C_B _ (C_B 'x' (C_E)) -> 6 
  C_B _ (C_B _ (C_A _ _)) -> 7 
  C_B _ (C_B _ (C_B _ _)) -> 8 
  C_B _ (C_B _ (C_C)) -> 9 
  C_B _ (C_B _ (C_E)) -> 10 
  C_B _ (C_C) -> 11 
  C_B _ (C_D (C_F _ _)) -> 12 
  C_B _ (C_E) -> 13 
  C_C -> 14 
  C_D (C_F _ _) -> 15 
  C_E -> 16 
