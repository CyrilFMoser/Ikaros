module Program_21 () where 

 main = print $ show v_b
data B_A a = C_A (B_A Char) | C_B | C_C | C_D (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_A (C_D (C_A _)) -> 1 
  C_A _ -> 2 
  C_A (C_D _) -> 3 
  C_A (C_D (C_B)) -> 4 
  C_A (C_D (C_C)) -> 5 
  C_D (C_D (C_C)) -> 6 
  C_D (C_A (C_D _)) -> 7 
  C_D (C_D _) -> 8 
  C_D _ -> 9 
  C_D (C_A (C_A _)) -> 10 
  C_D (C_B) -> 11 
