module Program_4 () where 

 main = print $ show v_b
data B_B a b = C_D B_A | C_E B_A B_A
data B_A = C_A B_A | C_B (B_B B_A B_A) (B_B Bool ((Int,Int))) | C_C B_A B_A

v_a :: B_B B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_E _ (C_A (C_A _)) -> 1 
  C_E _ (C_A (C_B _ _)) -> 2 
  C_E _ (C_A (C_C _ _)) -> 3 
  C_E _ (C_B (C_D _) (C_D _)) -> 4 
  C_E _ (C_B (C_D _) (C_E _ _)) -> 5 
  C_E _ (C_B (C_E _ _) (C_E _ _)) -> 6 
  C_E _ (C_C _ (C_A _)) -> 7 
  C_E _ (C_C _ (C_B _ _)) -> 8 
  C_E _ (C_C _ (C_C _ _)) -> 9 
