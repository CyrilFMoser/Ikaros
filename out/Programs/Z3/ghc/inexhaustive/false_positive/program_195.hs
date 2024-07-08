module Program_11 () where 

 main = print $ show v_b
data B_B c = C_D c (((Int,Int),(Int,Int))) | C_E (B_A Bool c)
data B_A a b = C_A | C_B (B_B b) Int | C_C (B_B a) (B_A a a)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ (C_C (C_D _ _) (C_B _ _)) -> 0 
  C_C (C_E (C_C _ _)) (C_C (C_D _ _) _) -> 1 
