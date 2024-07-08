module Program_26 () where 

 main = print $ show v_b
data B_B = C_D | C_E ((B_B,B_B)) | C_F (B_A Bool B_B)
data B_A a b = C_A | C_B B_B | C_C (B_A b b) b

v_a :: B_A Char B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_C _ _) _) (C_E ((C_E _,C_D))) -> 0 
  C_C (C_C (C_B _) _) (C_F (C_A)) -> 1 
  C_C (C_C (C_B _) _) (C_E ((C_E _,C_D))) -> 2 
  C_C _ (C_E ((C_F _,C_F _))) -> 3 
  C_C (C_C _ (C_E _)) (C_E ((C_F _,C_F _))) -> 4 
  C_C (C_C _ _) (C_E _) -> 5 
  C_C (C_B C_D) (C_E _) -> 6 
  C_C (C_C _ C_D) (C_F _) -> 7 
  C_C (C_C (C_A) _) (C_F (C_B _)) -> 8 
  C_C (C_B (C_E _)) (C_E ((C_D,C_E _))) -> 9 
  C_C (C_B C_D) (C_E ((C_E _,C_D))) -> 10 
  C_C (C_C (C_B _) C_D) (C_E ((C_F _,C_E _))) -> 11 
  C_C (C_C (C_C _ _) (C_E _)) (C_F (C_C _ _)) -> 12 
  C_C (C_C (C_C _ _) _) (C_E ((C_D,C_D))) -> 13 
  C_C (C_B C_D) (C_F (C_A)) -> 14 
  C_C (C_C (C_A) _) (C_E ((C_F _,C_E _))) -> 15 
  C_C (C_B _) (C_F (C_B _)) -> 16 
  C_C (C_C (C_C _ _) C_D) (C_E ((C_D,C_F _))) -> 17 
  C_C (C_C _ _) (C_E ((C_F _,C_E _))) -> 18 
  C_C (C_C (C_A) (C_F _)) (C_F (C_C _ _)) -> 19 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_E _,C_E _))) -> 20 
  C_C (C_C _ (C_F _)) (C_E ((C_F _,C_D))) -> 21 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_F _,C_F _))) -> 22 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_E _,C_F _))) -> 23 
  C_C _ (C_E ((C_F _,C_E _))) -> 24 
  C_C (C_A) (C_E ((C_E _,C_D))) -> 25 
  C_C (C_C (C_B _) C_D) (C_E ((C_E _,C_E _))) -> 26 
  C_C (C_C (C_B _) _) (C_E ((C_D,C_D))) -> 27 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_F _,C_E _))) -> 28 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_F _,C_D))) -> 29 
  C_C (C_C (C_B _) _) _ -> 30 
  C_C (C_B _) (C_E ((C_E _,C_D))) -> 31 
  C_C (C_C (C_C _ _) C_D) C_D -> 32 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_D,C_E _))) -> 33 
  C_C (C_C (C_B _) C_D) (C_E ((C_D,C_D))) -> 34 
  C_C (C_C _ (C_F _)) (C_E ((C_D,C_D))) -> 35 
  C_C (C_B _) (C_E ((C_D,C_D))) -> 36 
  C_C (C_B _) (C_E ((C_D,C_F _))) -> 37 
  C_C (C_B _) (C_E ((C_D,C_E _))) -> 38 
  C_C (C_C (C_C _ _) C_D) (C_E ((C_D,C_E _))) -> 39 
  C_C (C_C (C_C _ _) (C_E _)) (C_F (C_B _)) -> 40 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_F _,C_F _))) -> 41 
  C_C (C_B (C_F _)) (C_E ((C_E _,C_E _))) -> 42 
  C_C (C_C (C_B _) _) (C_F (C_C _ _)) -> 43 
  C_C (C_C (C_C _ _) _) (C_E ((C_E _,C_E _))) -> 44 
  C_C (C_C _ _) (C_E ((C_D,C_F _))) -> 45 
  C_C (C_B (C_E _)) (C_E ((C_E _,C_D))) -> 46 
  C_C (C_C (C_A) C_D) (C_E ((C_D,C_F _))) -> 47 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_E _,C_E _))) -> 48 
  C_C (C_C (C_C _ _) (C_F _)) (C_F (C_C _ _)) -> 49 
  C_C (C_C (C_C _ _) (C_E _)) C_D -> 50 
  C_C (C_C (C_A) C_D) (C_F (C_A)) -> 51 
  C_C (C_C (C_C _ _) C_D) (C_E ((C_E _,C_D))) -> 52 
  C_C (C_C (C_A) C_D) (C_F (C_B _)) -> 53 
  C_C (C_C (C_A) _) (C_F (C_A)) -> 54 
  C_C (C_C (C_C _ _) _) C_D -> 55 
  C_C (C_B (C_F _)) (C_E ((C_E _,C_D))) -> 56 
  C_C (C_C _ (C_F _)) (C_E ((C_D,C_F _))) -> 57 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_F _,C_D))) -> 58 
  C_C (C_C (C_A) (C_E _)) (C_F _) -> 59 
  C_C (C_B (C_F _)) (C_E ((C_D,C_E _))) -> 60 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_F _,C_E _))) -> 61 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_E _,C_E _))) -> 62 
  C_C (C_C _ (C_F _)) (C_E _) -> 63 
