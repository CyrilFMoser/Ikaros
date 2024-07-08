module Program_20 () where 

 main = print $ show v_b
data B_A a = C_A (B_A Char) | C_B | C_C | C_D (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_A (C_C) -> 1 
  C_D (C_D (C_D _)) -> 2 
  C_D (C_A (C_C)) -> 3 
  C_D (C_A _) -> 4 
  C_D (C_D (C_A _)) -> 5 
  C_D (C_C) -> 6 
