module Program_23 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (B_A a) | C_B (B_A a) a | C_C | C_D Char

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_B _ _) _) _ -> 0 
  C_A (C_A (C_D _) (C_B _ _)) (C_A (C_D _) (C_D _)) -> 1 
  C_A (C_B _ _) (C_A (C_D _) (C_D _)) -> 2 
  C_A (C_A (C_D _) _) (C_A (C_A _ _) (C_C)) -> 3 
  C_A (C_A (C_C) _) (C_A (C_D _) _) -> 4 
  C_A (C_A (C_B _ _) _) (C_A (C_B _ _) (C_A _ _)) -> 5 
  C_A (C_A _ (C_D _)) (C_A (C_C) (C_A _ _)) -> 6 
  C_A (C_A (C_B _ _) _) (C_A (C_D _) (C_A _ _)) -> 7 
