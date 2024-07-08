module Program_16 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (B_A a) | C_C (B_A Int) | C_D (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_D _)) -> 0 
  C_C (C_B (C_D _)) -> 1 
  C_C (C_D (C_B _)) -> 2 
  C_C (C_C (C_A)) -> 3 
  C_C (C_D (C_D _)) -> 4 
  C_C (C_A) -> 5 
  C_C (C_B (C_B _)) -> 6 
  C_C (C_D _) -> 7 
  C_D (C_C (C_D _)) -> 8 
  C_D (C_D (C_B _)) -> 9 
