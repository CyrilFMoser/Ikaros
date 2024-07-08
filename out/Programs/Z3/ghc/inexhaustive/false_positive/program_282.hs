module Program_4 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) B_B | C_B B_B B_B | C_C (B_A a) ((B_B,B_B)) | C_D (B_A a)
data B_B = C_E B_B | C_F Int (B_A Char) | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ (C_C (C_A _ _) ((C_G,C_F _ _))) -> 0 
  C_F _ (C_C (C_B _ _) ((C_E _,C_F _ _))) -> 1 
  C_F _ (C_C (C_D _) ((C_F _ _,C_G))) -> 2 
  C_F _ (C_C (C_C _ _) ((C_G,C_E _))) -> 3 
  C_F _ (C_C _ ((C_G,C_F _ _))) -> 4 
  C_F _ (C_D (C_C _ _)) -> 5 
  C_F _ (C_C _ ((C_F _ _,C_G))) -> 6 
  C_F _ (C_B (C_E _) (C_F _ _)) -> 7 
  C_F _ (C_C (C_A _ _) ((C_F _ _,C_G))) -> 8 
  C_F _ (C_C _ ((C_G,C_G))) -> 9 
  C_F _ (C_A _ (C_F _ _)) -> 10 
  C_F _ (C_C (C_C _ _) ((C_E _,C_F _ _))) -> 11 
  C_F _ (C_C (C_B _ _) ((C_E _,C_E _))) -> 12 
  C_F _ (C_C (C_C _ _) ((C_F _ _,C_G))) -> 13 
  C_F _ (C_A (C_B _ _) (C_F _ _)) -> 14 
  C_F _ (C_C (C_C _ _) ((C_E _,C_G))) -> 15 
  C_F _ (C_A (C_C _ _) (C_E _)) -> 16 
  C_F _ (C_A (C_C _ _) C_G) -> 17 
  C_F _ (C_C (C_C _ _) _) -> 18 
  C_F _ (C_C (C_C _ _) ((C_F _ _,C_F _ _))) -> 19 
  C_F _ (C_C (C_B _ _) ((C_G,C_E _))) -> 20 
  C_F _ (C_C (C_D _) ((C_G,C_G))) -> 21 
  C_F _ (C_B C_G _) -> 22 
  C_F _ (C_B (C_F _ _) (C_F _ _)) -> 23 
  C_F _ (C_D (C_A _ _)) -> 24 
  C_F _ (C_B (C_E _) _) -> 25 
  C_F _ (C_A (C_C _ _) _) -> 26 
  C_F _ (C_A (C_A _ _) _) -> 27 
  C_F _ (C_C (C_A _ _) ((C_G,C_G))) -> 28 
  C_F _ (C_A _ C_G) -> 29 
  C_F _ (C_A (C_A _ _) (C_E _)) -> 30 
  C_F _ (C_A (C_B _ _) C_G) -> 31 
