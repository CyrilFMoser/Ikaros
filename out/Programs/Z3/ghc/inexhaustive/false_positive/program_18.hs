module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_B | C_C (B_A b b) b
data B_B = C_D | C_E ((B_B,B_B)) | C_F (B_A Bool B_B)

v_a :: B_A Char B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_E ((C_E _,C_F _))) -> 0 
  C_B _ -> 1 
  C_B (C_F (C_A)) -> 2 
  C_B (C_F _) -> 3 
  C_C (C_C _ (C_E _)) (C_E _) -> 4 
  C_C (C_C (C_B _) C_D) (C_F (C_A)) -> 5 
  C_C (C_B (C_F _)) (C_F (C_C _ _)) -> 6 
