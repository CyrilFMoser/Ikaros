module Program_2 () where 

main = print $ show v_b
data B_A a b = C_A | C_B (B_A Bool a) | C_C | C_D (B_A a a)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_B (C_A)) -> 0 
  C_D (C_D (C_C)) -> 1 
  C_D (C_B (C_B _)) -> 2 
  C_B (C_B (C_D _)) -> 3 
