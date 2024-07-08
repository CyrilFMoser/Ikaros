module Program_30 () where 

 main = print $ show v_b
data B_C = C_I B_B | C_J B_C Bool | C_K B_B B_C
data B_B = C_F B_B B_B | C_G | C_H Bool
data B_A a = C_A (B_A a) B_C | C_B | C_C | C_D a B_B | C_E Char B_C

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I _ -> 0 
  C_J (C_I (C_F _ _)) True -> 1 
  C_J (C_I (C_F _ _)) False -> 2 
  C_J (C_I C_G) True -> 3 
  C_J (C_I C_G) False -> 4 
  C_J (C_I (C_H _)) True -> 5 
  C_J (C_I (C_H _)) False -> 6 
  C_J (C_J (C_I _) _) True -> 7 
  C_J (C_J (C_I _) _) False -> 8 
  C_J (C_J (C_J _ _) _) True -> 9 
  C_J (C_J (C_J _ _) _) False -> 10 
  C_J (C_J (C_K _ _) _) True -> 11 
  C_J (C_J (C_K _ _) _) False -> 12 
  C_J (C_K _ (C_I _)) True -> 13 
  C_J (C_K _ (C_I _)) False -> 14 
  C_J (C_K _ (C_J _ _)) True -> 15 
  C_J (C_K _ (C_J _ _)) False -> 16 
  C_J (C_K _ (C_K _ _)) True -> 17 
  C_J (C_K _ (C_K _ _)) False -> 18 
  C_K _ (C_I _) -> 19 
  C_K _ (C_K _ _) -> 20 
