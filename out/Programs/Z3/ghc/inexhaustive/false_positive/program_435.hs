module Program_20 () where 

main = print $ show v_b
data B_B c = C_E (B_A c c) | C_F c (B_A Int c) | C_G
data B_A a b = C_A | C_B (B_B b) (B_B a) | C_C (B_A a b) (B_B b) | C_D

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ (C_C (C_D) (C_G)) -> 0 
  C_F _ (C_D) -> 1 
  C_F _ (C_C _ (C_F _ _)) -> 2 
  C_E (C_C (C_A) _) -> 3 
  C_E (C_A) -> 4 
  C_E (C_B (C_F _ _) (C_F _ _)) -> 5 
  C_E (C_C (C_B _ _) (C_F _ _)) -> 6 
  C_E (C_B _ _) -> 7 
