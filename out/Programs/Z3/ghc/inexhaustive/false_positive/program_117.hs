module Program_28 () where 

 main = print $ show v_b
data B_B = C_E B_B | C_F (B_A ((Bool,Int)) B_B) | C_G
data B_A a b = C_A | C_B | C_C | C_D B_B a

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_E C_G) -> 0 
  C_F (C_B) -> 1 
