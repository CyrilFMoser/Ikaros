module Program_23 () where 

 main = print $ show v_b
data B_A a = C_A Bool | C_B | C_C (B_B a a) (B_B a a) | C_D
data B_B b c = C_E c | C_F (B_B B_C B_C)
data B_C = C_G

v_a :: B_A B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_C _ (C_E _) -> 1 
  C_C _ (C_F (C_E _)) -> 2 
  C_C _ (C_F (C_F _)) -> 3 
  C_D -> 4 
