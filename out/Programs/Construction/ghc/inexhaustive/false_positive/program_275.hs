module Program_26 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B B_A B_A | C_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _ _) _ -> 0 
  C_A (C_B (C_A _ _) (C_A _ _)) _ -> 1 
  C_A (C_B C_C (C_A _ _)) _ -> 2 
  C_A (C_B (C_A _ _) (C_B _ _)) _ -> 3 
  C_A (C_B (C_B _ _) (C_B _ _)) _ -> 4 
  C_A (C_B C_C (C_B _ _)) _ -> 5 
  C_A (C_B (C_A _ _) C_C) _ -> 6 
  C_A (C_B (C_B _ _) C_C) _ -> 7 
  C_A (C_B C_C C_C) _ -> 8 
  C_A C_C _ -> 9 
  C_B _ _ -> 10 
  C_C -> 11 
