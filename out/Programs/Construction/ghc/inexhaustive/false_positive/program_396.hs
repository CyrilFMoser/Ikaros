module Program_2 () where 

 main = print $ show v_b
data B_B = C_B | C_C (B_A Char B_B) | C_D B_B | C_E Char (B_A B_B B_B)
data B_A a b = C_A ((Char,Bool)) b

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C (C_A _ _) -> 1 
  C_D C_B -> 2 
  C_D (C_C (C_A _ _)) -> 3 
  C_D (C_D C_B) -> 4 
  C_D (C_D (C_C _)) -> 5 
  C_D (C_D (C_D _)) -> 6 
  C_D (C_E _ (C_A _ _)) -> 7 
  C_E _ _ -> 8 
