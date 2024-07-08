module Program_21 () where 

main = print $ show v_b
data B_A a b = C_A | C_B (B_B b) (B_B a) | C_C (B_A a b) (B_B b) | C_D
data B_B c = C_E (B_A c c) | C_F c (B_A Int c) | C_G

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_C (C_B _ _) (C_E _)) -> 0 
