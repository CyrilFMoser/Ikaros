module Program_28 () where 

main = print $ show v_b
data B_A = C_A Int B_A | C_B B_A B_A | C_C B_A B_A
data B_B a b = C_D | C_E B_A ((B_A,B_A)) | C_F B_A | C_G

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_C (C_B _ _) (C_B _ _)) ((C_C (C_C _ _) (C_A _ _),C_B (C_B _ _) (C_B _ _))) -> 0 
