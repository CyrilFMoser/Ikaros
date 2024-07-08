module Program_25 () where 

 main = print $ show v_b
data B_B a b = C_B B_A Char | C_C | C_D (B_B a b)
data B_A = C_A (B_B B_A ((Char,Int))) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_A _ _) -> 0 
