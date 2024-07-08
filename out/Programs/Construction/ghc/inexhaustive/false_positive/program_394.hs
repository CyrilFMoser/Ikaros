module Program_18 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B B_A ((B_A,B_A)) | C_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_A _ _) ((C_A _ _,C_A _ _)) -> 1 
  C_B (C_A _ _) ((C_A _ _,C_B _ _)) -> 2 
  C_B (C_A _ _) ((C_A _ _,C_C)) -> 3 
  C_B (C_A _ _) ((C_B _ _,C_A _ _)) -> 4 
  C_B (C_A _ _) ((C_B _ _,C_B _ _)) -> 5 
  C_B (C_A _ _) ((C_B _ _,C_C)) -> 6 
  C_B (C_A _ _) ((C_C,C_A _ _)) -> 7 
  C_B (C_A _ _) ((C_C,C_B _ _)) -> 8 
  C_B (C_A _ _) ((C_C,C_C)) -> 9 
  C_B (C_B _ _) ((C_A _ _,C_A _ _)) -> 10 
  C_B (C_B _ _) ((C_A _ _,C_B _ _)) -> 11 
  C_B (C_B _ _) ((C_A _ _,C_C)) -> 12 
  C_B (C_B _ _) ((C_B _ _,C_A _ _)) -> 13 
  C_B (C_B _ _) ((C_B _ _,C_B _ _)) -> 14 
  C_B (C_B _ _) ((C_B _ _,C_C)) -> 15 
  C_B (C_B _ _) ((C_C,C_A _ _)) -> 16 
  C_B (C_B _ _) ((C_C,C_B _ _)) -> 17 
  C_B (C_B _ _) ((C_C,C_C)) -> 18 
  C_B C_C ((C_A _ _,C_A _ _)) -> 19 
  C_B C_C ((C_A _ _,C_C)) -> 20 
  C_B C_C ((C_B _ _,C_A _ _)) -> 21 
  C_B C_C ((C_B _ _,C_B _ _)) -> 22 
  C_B C_C ((C_B _ _,C_C)) -> 23 
  C_B C_C ((C_C,C_A _ _)) -> 24 
  C_B C_C ((C_C,C_B _ _)) -> 25 
  C_B C_C ((C_C,C_C)) -> 26 
  C_C -> 27 
