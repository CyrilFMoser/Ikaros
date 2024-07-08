module Program_30 () where 

 main = print $ show v_b
data B_A = C_A Int | C_B B_A B_A | C_C B_A B_A | C_D ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_A _) _ -> 1 
  C_B (C_B _ _) _ -> 2 
  C_B (C_C (C_A _) (C_A _)) _ -> 3 
  C_B (C_C (C_A _) (C_B _ _)) _ -> 4 
  C_B (C_C (C_A _) (C_C _ _)) _ -> 5 
  C_B (C_C (C_A _) (C_D _)) _ -> 6 
  C_B (C_C (C_B _ _) (C_A _)) _ -> 7 
  C_B (C_C (C_B _ _) (C_B _ _)) _ -> 8 
  C_B (C_C (C_B _ _) (C_C _ _)) _ -> 9 
  C_B (C_C (C_B _ _) (C_D _)) _ -> 10 
  C_B (C_C (C_C _ _) (C_A _)) _ -> 11 
  C_B (C_C (C_C _ _) (C_B _ _)) _ -> 12 
  C_B (C_C (C_C _ _) (C_D _)) _ -> 13 
  C_B (C_C (C_D _) (C_A _)) _ -> 14 
  C_B (C_C (C_D _) (C_B _ _)) _ -> 15 
  C_B (C_C (C_D _) (C_C _ _)) _ -> 16 
  C_B (C_C (C_D _) (C_D _)) _ -> 17 
  C_B (C_D _) _ -> 18 
  C_C _ _ -> 19 
  C_D _ -> 20 
