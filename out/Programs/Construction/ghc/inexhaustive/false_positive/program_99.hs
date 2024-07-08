module Program_11 () where 

 main = print $ show v_b
data B_B = C_F (B_A B_B B_B) Char
data B_C c d = C_G Bool c | C_H (B_C c c) c
data B_A a b = C_A B_B | C_B | C_C B_B Int | C_D a ((B_B,(Int,Bool))) | C_E (B_C a b) ((B_B,B_B))

v_a :: B_A Int B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C _ _ -> 1 
  C_D _ _ -> 2 
  C_E _ ((C_F _ _,C_F _ _)) -> 3 
