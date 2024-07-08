module Program_23 () where 

 main = print $ show v_b
data B_B a b = C_F (B_B a a)
data B_A = C_A (B_B B_A ((Bool,Int))) (B_B ((Bool,Int)) ((Char,Bool))) | C_B | C_C (B_B ((Char,Int)) B_A) | C_D (B_B Bool Int) B_A | C_E (B_B B_A Char)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_C _ -> 1 
  C_D (C_F _) _ -> 2 
  C_E _ -> 3 
