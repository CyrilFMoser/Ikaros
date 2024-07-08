module Program_5 () where 

 main = print $ show v_b
data B_A = C_A ((Int,Bool)) Char | C_B B_A | C_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_A _ _ -> 1 
  C_B (C_A _ _) -> 2 
  C_B (C_B (C_A _ _)) -> 3 
