module Program_14 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (B_A a) | C_C (B_A Int) | C_D (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C _) -> 0 
  C_C _ -> 1 
  C_B (C_D (C_A)) -> 2 
  C_B (C_B (C_A)) -> 3 
  C_B (C_B (C_C _)) -> 4 
  C_B (C_D _) -> 5 
  C_B (C_D (C_B _)) -> 6 
  C_B (C_C (C_B _)) -> 7 
