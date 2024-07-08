module Program_2 () where 

 main = print $ show v_b
data B_A = C_A B_A ((B_A,Int)) | C_B B_B | C_C | C_D B_B B_A | C_E Char Int
data B_B = C_F ((B_A,B_A)) (B_C Int B_B) | C_G B_B (B_C Bool B_B) | C_H Int | C_I
data B_C a b = C_J Bool Bool | C_K | C_L | C_M B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ -> 1 
  C_C -> 2 
  C_D _ (C_A _ _) -> 3 
  C_D _ (C_B (C_F _ _)) -> 4 
  C_D _ (C_B (C_G _ _)) -> 5 
  C_D _ (C_B (C_H _)) -> 6 
  C_D _ (C_B C_I) -> 7 
  C_D _ C_C -> 8 
  C_D _ (C_D (C_F _ _) (C_A _ _)) -> 9 
  C_D _ (C_D (C_F _ _) (C_B _)) -> 10 
  C_D _ (C_D (C_F _ _) C_C) -> 11 
  C_D _ (C_D (C_F _ _) (C_D _ _)) -> 12 
  C_D _ (C_D (C_F _ _) (C_E _ _)) -> 13 
  C_D _ (C_D (C_G _ _) (C_A _ _)) -> 14 
  C_D _ (C_D (C_G _ _) (C_B _)) -> 15 
  C_D _ (C_D (C_G _ _) C_C) -> 16 
  C_D _ (C_D (C_G _ _) (C_E _ _)) -> 17 
  C_D _ (C_D (C_H _) (C_A _ _)) -> 18 
  C_D _ (C_D (C_H _) (C_B _)) -> 19 
  C_D _ (C_D (C_H _) C_C) -> 20 
  C_D _ (C_D (C_H _) (C_D _ _)) -> 21 
  C_D _ (C_D (C_H _) (C_E _ _)) -> 22 
  C_D _ (C_D C_I (C_A _ _)) -> 23 
  C_D _ (C_D C_I (C_B _)) -> 24 
  C_D _ (C_D C_I C_C) -> 25 
  C_D _ (C_D C_I (C_D _ _)) -> 26 
  C_D _ (C_D C_I (C_E _ _)) -> 27 
  C_D _ (C_E _ _) -> 28 
  C_E _ _ -> 29 
