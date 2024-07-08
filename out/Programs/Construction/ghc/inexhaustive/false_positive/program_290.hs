module Program_10 () where 

 main = print $ show v_b
data B_A a = C_A ((Bool,Bool)) (B_A a) | C_B (B_A a) | C_C | C_D

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_C -> 1 
  C_D -> 2 
