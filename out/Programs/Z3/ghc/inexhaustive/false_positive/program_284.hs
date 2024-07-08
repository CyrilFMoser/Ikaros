module Program_6 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) B_B | C_B B_B B_B | C_C (B_A a) ((B_B,B_B)) | C_D (B_A a)
data B_B = C_E B_B | C_F Int (B_A Char) | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_F _ (C_D _)) -> 0 
  C_E _ -> 1 
  C_F _ (C_A (C_D _) (C_F _ _)) -> 2 
  C_F _ (C_C (C_A _ _) ((C_E _,C_E _))) -> 3 
  C_F _ (C_B (C_E _) C_G) -> 4 
  C_F _ (C_C _ ((C_E _,C_F _ _))) -> 5 
