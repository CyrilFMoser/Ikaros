module Program_1 () where 

main = print $ show v_b
data B_A = C_A B_A | C_B B_A B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_A _)) -> 0 
  C_A (C_A (C_B _ _ _)) -> 1 
  C_A (C_B _ _ _) -> 2 
  C_B (C_A _) _ _ -> 3 
  C_B (C_B _ (C_A _) (C_A _)) _ _ -> 4 
  C_B (C_B _ (C_A _) (C_B _ _ _)) _ _ -> 5 
  C_B (C_B _ (C_B _ _ _) (C_A _)) _ _ -> 6 
  C_B (C_B _ (C_B _ _ _) (C_B _ _ _)) _ _ -> 7 
