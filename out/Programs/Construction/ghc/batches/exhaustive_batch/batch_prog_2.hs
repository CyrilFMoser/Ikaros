module Program_2 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _) -> 0 
  C_A (C_B (C_A _)) -> 1 
  C_A (C_B (C_B _)) -> 2 
  C_B _ -> 3 