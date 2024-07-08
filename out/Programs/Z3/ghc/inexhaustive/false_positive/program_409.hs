module Program_31 () where 

 main = print $ show v_b
data B_B b c = C_E (B_B c c) | C_F b (B_A c)
data B_A a = C_A (B_A a) (B_B a a) | C_B ((Bool,Int)) | C_C Char (B_B a a) | C_D

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_F _ (C_B _)) -> 0 
  C_E (C_E _) -> 1 
  C_E (C_F _ _) -> 2 
  C_F _ (C_A (C_C _ _) (C_E _)) -> 3 
  C_F _ (C_A _ (C_E _)) -> 4 
  C_F _ (C_A (C_B _) (C_E _)) -> 5 
  C_F _ (C_C _ _) -> 6 
  C_F _ (C_A (C_C _ _) (C_F _ _)) -> 7 
  C_F _ (C_C _ (C_E _)) -> 8 
  C_F _ (C_A _ (C_F _ _)) -> 9 
  C_F _ (C_C _ (C_F _ _)) -> 10 
  C_F _ (C_A (C_D) (C_F _ _)) -> 11 
  C_F _ (C_A (C_D) _) -> 12 
