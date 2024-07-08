module Program_15 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (B_A a) | C_C (B_A Int) | C_D (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_D (C_A)) -> 0 
  C_C (C_C (C_B _)) -> 1 
  C_C (C_B (C_A)) -> 2 
  C_C (C_D (C_C _)) -> 3 
  C_B (C_D (C_C _)) -> 4 
  C_B (C_D (C_D _)) -> 5 
  C_B (C_A) -> 6 
  C_B _ -> 7 
  C_B (C_C (C_D _)) -> 8 
  C_B (C_C _) -> 9 
  C_B (C_B _) -> 10 
  C_D (C_C (C_A)) -> 11 
  C_D (C_B (C_D _)) -> 12 
  C_D (C_C (C_B _)) -> 13 
  C_D (C_D (C_C _)) -> 14 
  C_D (C_D (C_D _)) -> 15 
  C_D (C_B (C_A)) -> 16 
  C_D (C_C _) -> 17 
  C_D (C_C (C_C _)) -> 18 
