module Program_10 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G C_D -> 0 
  C_G (C_E (C_C _ _) _) -> 1 
  C_G (C_E (C_B _ _) _) -> 2 
  C_G C_F -> 3 
  C_G (C_E _ (C_E _ _)) -> 4 
  C_G (C_G (C_E _ _)) -> 5 
  C_G (C_E C_A (C_G _)) -> 6 
  C_G _ -> 7 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C _ _) (C_G _)) -> 8 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_B _ _) C_D) -> 9 
  C_E (C_C ((C_G _,_)) C_D) (C_E _ (C_E _ _)) -> 10 
  C_E _ (C_E C_A (C_G _)) -> 11 
  C_E (C_C _ C_D) (C_E _ (C_E _ _)) -> 12 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_C _ _) (C_G _)) -> 13 
  C_E (C_C ((C_E _ _,_)) C_D) (C_G C_F) -> 14 
  C_E (C_C _ (C_E _ _)) (C_E C_A (C_G _)) -> 15 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_B _ _) _) -> 16 
  C_E C_A (C_E (C_C _ _) (C_G _)) -> 17 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_B _ _) (C_G _)) -> 18 
  C_E (C_C ((C_D,_)) C_F) (C_G _) -> 19 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_B _ _) (C_E _ _)) -> 20 
  C_E (C_C ((C_F,_)) C_D) (C_G (C_E _ _)) -> 21 
  C_E (C_B C_A _) _ -> 22 
  C_E (C_C ((C_G _,_)) C_D) _ -> 23 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E _ (C_G _)) -> 24 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_B _ _) _) -> 25 
  C_E (C_C ((C_D,_)) _) (C_E C_A (C_E _ _)) -> 26 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_G _) -> 27 
  C_E (C_B C_A (C_C _ _)) (C_G (C_G _)) -> 28 
  C_E (C_B _ _) (C_E _ _) -> 29 
  C_E (C_B C_A (C_C _ _)) (C_G (C_E _ _)) -> 30 
  C_E (C_C _ (C_E _ _)) _ -> 31 
  C_E (C_C ((C_G _,_)) C_D) (C_E _ _) -> 32 
  C_E (C_B C_A (C_B _ _)) (C_E (C_C _ _) C_D) -> 33 
  C_E (C_B C_A (C_B _ _)) (C_G _) -> 34 
  C_E (C_C ((C_G _,_)) _) (C_E (C_B _ _) (C_G _)) -> 35 
  C_E (C_C ((C_F,_)) _) (C_E _ (C_G _)) -> 36 
  C_E (C_B C_A (C_B _ _)) (C_E C_A C_F) -> 37 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_G (C_G _)) -> 38 
  C_E C_A (C_E (C_B _ _) (C_E _ _)) -> 39 
  C_E (C_B (C_B _ _) _) (C_E _ C_D) -> 40 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_B _ _) (C_G _)) -> 41 
  C_E (C_C ((C_D,_)) C_D) (C_E C_A (C_G _)) -> 42 
  C_E (C_B C_A C_A) (C_E C_A C_D) -> 43 
  C_E (C_B _ (C_B _ _)) (C_E _ C_D) -> 44 
  C_E (C_C ((C_G _,_)) C_F) (C_E C_A _) -> 45 
  C_E (C_C _ C_F) C_F -> 46 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_G (C_E _ _)) -> 47 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_B _ _) (C_G _)) -> 48 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_G (C_E _ _)) -> 49 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_C _ _) (C_G _)) -> 50 
  C_E (C_C ((C_G _,_)) _) (C_E _ C_D) -> 51 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E _ C_F) -> 52 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E _ (C_G _)) -> 53 
  C_E (C_C _ C_D) (C_E C_A (C_E _ _)) -> 54 
  C_E (C_C ((C_G _,_)) C_D) (C_G (C_G _)) -> 55 
  C_E (C_C ((C_E _ _,_)) _) (C_E (C_C _ _) (C_G _)) -> 56 
  C_E (C_B C_A (C_C _ _)) (C_G _) -> 57 
  C_E (C_C _ C_F) (C_E (C_C _ _) (C_G _)) -> 58 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_B _ _) (C_G _)) -> 59 
  C_E (C_C _ (C_E _ _)) (C_E (C_B _ _) C_D) -> 60 
  C_E (C_C ((C_E _ _,_)) (C_G _)) C_D -> 61 
  C_E (C_C ((C_D,_)) (C_E _ _)) C_F -> 62 
  C_E (C_C _ C_D) (C_E C_A _) -> 63 
  C_E (C_C ((C_E _ _,_)) C_F) C_D -> 64 
  C_E (C_C ((C_F,_)) C_D) C_D -> 65 
  C_E (C_B C_A C_A) (C_E (C_C _ _) (C_E _ _)) -> 66 
  C_E (C_B (C_C _ _) C_A) (C_E (C_C _ _) _) -> 67 
  C_E (C_B C_A (C_C _ _)) (C_E _ C_D) -> 68 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E C_A C_F) -> 69 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E C_A _) -> 70 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E (C_B _ _) C_F) -> 71 
  C_E (C_B _ _) (C_E C_A (C_G _)) -> 72 
  C_E (C_B (C_C _ _) (C_B _ _)) C_F -> 73 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E _ (C_G _)) -> 74 
  C_E (C_B _ _) (C_G _) -> 75 
  C_E (C_B (C_C _ _) _) (C_G C_F) -> 76 
  C_E (C_B C_A (C_C _ _)) (C_E _ C_F) -> 77 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E C_A C_D) -> 78 
  C_E (C_B C_A _) (C_E (C_C _ _) (C_E _ _)) -> 79 
  C_E (C_B _ (C_B _ _)) (C_E (C_C _ _) C_F) -> 80 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E C_A C_F) -> 81 
  C_E (C_C _ C_F) (C_E _ C_D) -> 82 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E C_A (C_E _ _)) -> 83 
  C_E (C_B (C_B _ _) C_A) (C_G (C_G _)) -> 84 
  C_E (C_B C_A (C_B _ _)) (C_E C_A _) -> 85 
  C_E C_A (C_E C_A C_D) -> 86 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E (C_B _ _) C_F) -> 87 
  C_E (C_B (C_C _ _) C_A) (C_E _ C_D) -> 88 
  C_E (C_B C_A (C_B _ _)) (C_E (C_C _ _) (C_G _)) -> 89 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E (C_C _ _) C_F) -> 90 
  C_E (C_C ((C_D,_)) _) (C_G (C_E _ _)) -> 91 
  C_E (C_B _ _) (C_E (C_B _ _) C_F) -> 92 
  C_E (C_C _ (C_G _)) (C_E _ (C_E _ _)) -> 93 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E C_A (C_E _ _)) -> 94 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_C _ _) (C_G _)) -> 95 
  C_E (C_B _ (C_C _ _)) (C_E _ (C_G _)) -> 96 
  C_E (C_C ((C_F,_)) _) (C_G C_D) -> 97 
  C_E (C_C _ (C_E _ _)) (C_E _ C_D) -> 98 
  C_E (C_B C_A _) (C_E C_A C_D) -> 99 
  C_E (C_C ((C_D,_)) C_F) C_F -> 100 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_C _ _) (C_G _)) -> 101 
  C_E (C_B (C_C _ _) _) (C_E C_A (C_E _ _)) -> 102 
  C_E (C_C _ _) (C_E (C_B _ _) (C_G _)) -> 103 
  C_E (C_B _ _) (C_E (C_C _ _) (C_E _ _)) -> 104 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_G (C_G _)) -> 105 
  C_E (C_C _ (C_E _ _)) (C_E (C_B _ _) C_F) -> 106 
  C_E (C_C ((C_G _,_)) C_D) (C_E (C_B _ _) _) -> 107 
  C_E (C_B _ C_A) (C_G C_D) -> 108 
