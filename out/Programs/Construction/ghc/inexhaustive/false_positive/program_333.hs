module Program_20 () where 

 main = print $ show v_b
data B_B c = C_D (((Char,Char),(Int,Bool))) (B_D c c) | C_E (B_B c) | C_F (B_B c) B_C | C_G (B_A c c)
data B_A a b = C_A (B_A a a) | C_B | C_C
data B_D d e = C_J | C_K d Bool | C_L ((B_C,Char)) Bool
data B_C = C_H (B_D B_C B_C) | C_I

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_E _ -> 1 
  C_F (C_D _ (C_J)) _ -> 2 
  C_F (C_D _ (C_K _ _)) _ -> 3 
  C_F (C_D _ (C_L _ _)) _ -> 4 
  C_F (C_E (C_D _ _)) _ -> 5 
  C_F (C_E (C_E _)) _ -> 6 
  C_F (C_E (C_F _ _)) _ -> 7 
  C_F (C_E (C_G _)) _ -> 8 
  C_F (C_F (C_D _ _) (C_H _)) _ -> 9 
  C_F (C_F (C_D _ _) C_I) _ -> 10 
  C_F (C_F (C_E _) (C_H _)) _ -> 11 
  C_F (C_F (C_E _) C_I) _ -> 12 
  C_F (C_F (C_F _ _) (C_H _)) _ -> 13 
  C_F (C_F (C_F _ _) C_I) _ -> 14 
  C_F (C_F (C_G _) (C_H _)) _ -> 15 
  C_F (C_F (C_G _) C_I) _ -> 16 
  C_F (C_G (C_B)) _ -> 17 
  C_F (C_G (C_C)) _ -> 18 
  C_G _ -> 19 
