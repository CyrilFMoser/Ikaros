module Program_7 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) B_B | C_B B_B B_B | C_C (B_A a) ((B_B,B_B)) | C_D (B_A a)
data B_B = C_E B_B | C_F Int (B_A Char) | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_E (C_E _)) -> 0 
  C_E C_G -> 1 
  C_F _ (C_A (C_D _) _) -> 2 
  C_F _ (C_C (C_C _ _) ((C_G,C_F _ _))) -> 3 
  C_F _ (C_C _ ((C_F _ _,C_F _ _))) -> 4 
  C_F _ (C_C (C_A _ _) ((C_G,C_E _))) -> 5 
  C_F _ (C_A (C_B _ _) _) -> 6 
  C_F _ (C_C (C_D _) ((C_E _,C_F _ _))) -> 7 
  C_F _ (C_C (C_D _) ((C_F _ _,C_F _ _))) -> 8 
  C_F _ (C_A _ (C_E _)) -> 9 
  C_F _ (C_B C_G C_G) -> 10 
  C_F _ (C_C (C_A _ _) ((C_F _ _,C_F _ _))) -> 11 
  C_F _ (C_C (C_D _) ((C_E _,C_E _))) -> 12 
  C_F _ (C_C _ ((C_F _ _,C_E _))) -> 13 
  C_F _ (C_D (C_B _ _)) -> 14 
  C_F _ (C_C _ ((C_G,C_E _))) -> 15 
  C_F _ (C_A (C_C _ _) (C_F _ _)) -> 16 
  C_F _ (C_C _ ((C_E _,C_G))) -> 17 
  C_F _ _ -> 18 
  C_F _ (C_C (C_B _ _) ((C_F _ _,C_E _))) -> 19 
