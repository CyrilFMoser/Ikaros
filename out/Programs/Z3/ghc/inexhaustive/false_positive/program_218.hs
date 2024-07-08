module Program_4 () where 

 main = print $ show v_b
data B_B = C_D (B_A ((Bool,Bool)) B_B) (B_A B_B B_B)
data B_A a b = C_A Int | C_B Bool B_B | C_C

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C) (C_B _ (C_D _ _)) -> 0 
  C_D (C_B _ (C_D _ _)) _ -> 1 
  C_D _ (C_B _ _) -> 2 
