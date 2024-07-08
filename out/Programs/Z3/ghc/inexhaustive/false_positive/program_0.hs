module Program_0 () where 

 main = print $ show v_b
data B_A a = C_A a (B_A a) | C_B a

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_A _ (C_B _)) -> 0 
  C_A _ (C_B _) -> 1 
