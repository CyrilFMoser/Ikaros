module Program_27 () where 

main = print $ show v_b
data B_B a b = C_D | C_E B_A ((B_A,B_A)) | C_F B_A | C_G
data B_A = C_A Int B_A | C_B B_A B_A | C_C B_A B_A

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B (C_A _ _) (C_C _ _)) ((C_B (C_B _ _) (C_B _ _),C_C _ (C_A _ _))) -> 0 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_C (C_C _ _) (C_A _ _),C_A _ _)) -> 1 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_C _ _) _,C_C (C_A _ _) (C_A _ _))) -> 2 
  C_E (C_B (C_A _ _) (C_A _ _)) ((C_C _ _,C_B (C_A _ _) _)) -> 3 
  C_E (C_C _ (C_C _ _)) ((C_B (C_A _ _) (C_C _ _),C_C (C_B _ _) (C_B _ _))) -> 4 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B (C_C _ _) (C_C _ _),C_C (C_C _ _) (C_A _ _))) -> 5 
  C_E (C_C (C_A _ _) (C_B _ _)) ((C_C (C_B _ _) (C_A _ _),C_C (C_A _ _) (C_C _ _))) -> 6 
  C_E (C_B (C_B _ _) (C_C _ _)) ((C_A _ (C_B _ _),C_C (C_C _ _) (C_A _ _))) -> 7 
  C_E (C_B (C_B _ _) (C_A _ _)) ((C_B (C_A _ _) _,C_C (C_C _ _) (C_B _ _))) -> 8 
  C_E (C_C (C_A _ _) (C_A _ _)) ((C_C _ (C_B _ _),C_B (C_B _ _) (C_A _ _))) -> 9 
