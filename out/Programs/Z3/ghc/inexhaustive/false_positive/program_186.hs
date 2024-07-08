module Program_4 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) | C_B (B_A Char Char) (B_A a ((Char,Char))) | C_C (((Bool,Int),Int)) (B_A a a)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B (C_C _ _) (C_A _)) (C_B (C_C _ _) (C_A _)) -> 0 
  C_B (C_A _) (C_B (C_C _ _) (C_A _)) -> 1 
