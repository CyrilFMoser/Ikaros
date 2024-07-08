module Program_19 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A | C_C B_A B_A | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C (C_D _ _) (C_D _ _)) (C_D (C_D _ _) (C_C _ _)) -> 0 
