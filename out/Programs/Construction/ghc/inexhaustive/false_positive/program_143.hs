module Program_22 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (B_B a) (B_B a) | C_C | C_D (B_A a) | C_E Bool a
data B_B b = C_F (B_B ((Char,Bool))) | C_G ((Bool,Bool)) Bool

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ _ -> 1 
  C_D _ -> 2 
  C_E _ _ -> 3 
