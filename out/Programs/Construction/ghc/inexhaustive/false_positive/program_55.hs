module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B | C_C | C_D ((Bool,Int)) (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D _ (C_A _) -> 3 
  C_D _ (C_B) -> 4 
  C_D _ (C_C) -> 5 
  C_D _ (C_D ((_,_)) (C_A _)) -> 6 
  C_D _ (C_D ((_,_)) (C_C)) -> 7 
  C_D _ (C_D ((_,_)) (C_D _ _)) -> 8 
