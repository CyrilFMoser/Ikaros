module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) B_B | C_B B_B B_B | C_C (B_A a) ((B_B,B_B)) | C_D (B_A a)
data B_B = C_E B_B | C_F Int (B_A Char) | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_E C_G) -> 0 
  C_E (C_F _ (C_B _ _)) -> 1 
  C_E (C_E _) -> 2 
  C_E (C_E (C_F _ _)) -> 3 
  C_F _ (C_C (C_D _) ((C_F _ _,C_E _))) -> 4 
  C_F _ (C_C (C_C _ _) ((C_E _,C_E _))) -> 5 
  C_F _ (C_C (C_B _ _) ((C_E _,C_G))) -> 6 
  C_F _ (C_C (C_B _ _) ((C_F _ _,C_F _ _))) -> 7 
  C_F _ (C_C (C_C _ _) ((C_G,C_G))) -> 8 
  C_F _ (C_B C_G (C_E _)) -> 9 
  C_F _ (C_C (C_A _ _) ((C_F _ _,C_E _))) -> 10 
  C_F _ (C_B _ (C_F _ _)) -> 11 
  C_F _ (C_B _ _) -> 12 
  C_F _ (C_C (C_D _) _) -> 13 
