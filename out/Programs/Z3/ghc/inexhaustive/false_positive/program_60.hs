module Program_6 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A | C_C ((B_B,Bool)) B_B
data B_B = C_D | C_E B_A B_B | C_F | C_G B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G (C_E (C_C _ _) (C_G _)) -> 0 
  C_E (C_C ((C_F,_)) _) (C_G C_F) -> 1 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E (C_C _ _) C_F) -> 2 
  C_E (C_B _ (C_B _ _)) (C_G C_D) -> 3 
  C_E (C_B C_A (C_C _ _)) (C_E (C_C _ _) _) -> 4 
  C_E (C_C ((C_F,_)) _) (C_E (C_C _ _) (C_G _)) -> 5 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_E (C_C _ _) (C_E _ _)) -> 6 
  C_E (C_B (C_B _ _) C_A) (C_E _ C_F) -> 7 
  C_E (C_B C_A C_A) C_D -> 8 
  C_E (C_B C_A (C_B _ _)) (C_E (C_B _ _) _) -> 9 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_E C_A C_F) -> 10 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C _ _) _) -> 11 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) C_D -> 12 
  C_E (C_C ((C_F,_)) (C_G _)) (C_G (C_E _ _)) -> 13 
  C_E (C_C ((C_D,_)) (C_G _)) (C_G _) -> 14 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E (C_B _ _) (C_E _ _)) -> 15 
  C_E (C_C _ C_F) (C_G _) -> 16 
  C_E (C_C ((C_G _,_)) C_F) (C_E C_A C_F) -> 17 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E C_A C_F) -> 18 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_B _ _) _) -> 19 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_B _ _) C_D) -> 20 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E C_A C_D) -> 21 
  C_E (C_B C_A C_A) C_F -> 22 
  C_E (C_B _ (C_C _ _)) (C_E C_A (C_E _ _)) -> 23 
  C_E (C_B (C_B _ _) C_A) (C_E (C_C _ _) (C_E _ _)) -> 24 
  C_E (C_C ((C_D,_)) C_D) C_D -> 25 
  C_E (C_B C_A _) (C_E (C_C _ _) (C_G _)) -> 26 
  C_E (C_C _ C_F) (C_G (C_G _)) -> 27 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_C _ _) _) -> 28 
  C_E (C_B (C_C _ _) (C_B _ _)) (C_E C_A (C_E _ _)) -> 29 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E _ C_F) -> 30 
  C_E (C_C ((C_G _,_)) (C_E _ _)) (C_E C_A (C_E _ _)) -> 31 
  C_E (C_B _ C_A) (C_E _ _) -> 32 
  C_E (C_C ((C_G _,_)) C_D) C_D -> 33 
  C_E (C_B (C_B _ _) C_A) (C_E _ (C_G _)) -> 34 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_C _ _) _) -> 35 
  C_E (C_B (C_B _ _) C_A) (C_E (C_B _ _) C_F) -> 36 
  C_E (C_C ((C_F,_)) C_D) _ -> 37 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_C _ _) _) -> 38 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_C _ _) (C_E _ _)) -> 39 
  C_E (C_C ((C_D,_)) _) (C_E (C_B _ _) C_D) -> 40 
  C_E (C_C ((C_F,_)) C_F) (C_E _ (C_G _)) -> 41 
  C_E (C_B _ C_A) (C_G (C_E _ _)) -> 42 
  C_E (C_C ((C_G _,_)) (C_G _)) (C_G C_F) -> 43 
  C_E (C_B _ _) (C_E _ C_F) -> 44 
  C_E (C_C ((C_F,_)) C_D) (C_G C_D) -> 45 
  C_E (C_C ((C_E _ _,_)) C_F) (C_G C_F) -> 46 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E C_A (C_E _ _)) -> 47 
  C_E (C_C ((C_E _ _,_)) C_D) (C_E _ C_D) -> 48 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E (C_B _ _) (C_E _ _)) -> 49 
  C_E (C_B (C_C _ _) (C_C _ _)) (C_E C_A C_F) -> 50 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_C _ _) (C_E _ _)) -> 51 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_B _ _) C_D) -> 52 
  C_E (C_C ((C_E _ _,_)) _) (C_G (C_G _)) -> 53 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_G _) -> 54 
  C_E (C_B (C_B _ _) _) (C_E _ C_F) -> 55 
  C_E (C_C ((C_F,_)) _) (C_E (C_B _ _) _) -> 56 
  C_E (C_C _ (C_G _)) (C_E _ _) -> 57 
  C_E (C_C ((C_G _,_)) (C_E _ _)) C_D -> 58 
  C_E (C_C ((C_G _,_)) _) (C_E _ (C_G _)) -> 59 
  C_E (C_C ((C_D,_)) C_F) (C_E _ C_F) -> 60 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_B _ _) C_F) -> 61 
  C_E (C_B C_A C_A) (C_E (C_B _ _) C_F) -> 62 
  C_E (C_B (C_C _ _) C_A) (C_G (C_E _ _)) -> 63 
  C_E (C_C ((C_G _,_)) C_D) (C_G C_D) -> 64 
  C_E (C_C _ C_D) (C_E (C_C _ _) (C_E _ _)) -> 65 
  C_E (C_C ((C_G _,_)) C_D) (C_G (C_E _ _)) -> 66 
  C_E (C_B (C_B _ _) (C_B _ _)) _ -> 67 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E C_A _) -> 68 
  C_E (C_C ((C_D,_)) (C_G _)) (C_E _ (C_E _ _)) -> 69 
  C_E (C_B (C_C _ _) _) _ -> 70 
  C_E C_A (C_E (C_B _ _) C_F) -> 71 
  C_E C_A (C_E C_A (C_E _ _)) -> 72 
  C_E (C_B C_A C_A) (C_E _ _) -> 73 
  C_E (C_C ((C_F,_)) _) (C_E (C_C _ _) (C_E _ _)) -> 74 
  C_E (C_C ((C_F,_)) (C_G _)) _ -> 75 
  C_E (C_C _ C_D) (C_E (C_B _ _) C_D) -> 76 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_G _) -> 77 
  C_E (C_C ((C_D,_)) C_D) (C_E (C_B _ _) C_D) -> 78 
  C_E (C_B C_A (C_C _ _)) (C_E (C_C _ _) (C_G _)) -> 79 
  C_E (C_C ((C_G _,_)) C_F) (C_G C_F) -> 80 
  C_E (C_B _ (C_B _ _)) (C_E (C_C _ _) _) -> 81 
  C_E (C_C ((C_E _ _,_)) C_F) (C_G C_D) -> 82 
  C_E (C_C ((C_F,_)) C_D) (C_E (C_C _ _) _) -> 83 
  C_E (C_C ((C_G _,_)) _) (C_E (C_B _ _) (C_E _ _)) -> 84 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E (C_C _ _) (C_E _ _)) -> 85 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_G C_F) -> 86 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_G C_D) -> 87 
  C_E (C_C ((C_G _,_)) _) C_F -> 88 
  C_E (C_B (C_C _ _) C_A) (C_E (C_B _ _) (C_E _ _)) -> 89 
  C_E (C_C ((C_F,_)) C_F) (C_E (C_B _ _) (C_G _)) -> 90 
  C_E (C_C ((C_D,_)) (C_E _ _)) (C_E _ C_F) -> 91 
  C_E (C_C ((C_D,_)) C_D) (C_E _ (C_G _)) -> 92 
  C_E (C_B (C_C _ _) _) (C_E C_A (C_G _)) -> 93 
  C_E (C_B C_A _) (C_E (C_B _ _) _) -> 94 
  C_E (C_C ((C_F,_)) (C_E _ _)) (C_E (C_C _ _) C_F) -> 95 
  C_E (C_B (C_C _ _) (C_C _ _)) _ -> 96 
  C_E _ (C_E _ C_D) -> 97 
  C_E (C_C ((C_F,_)) (C_G _)) (C_E C_A (C_E _ _)) -> 98 
  C_E (C_C ((C_D,_)) C_F) (C_E (C_C _ _) C_F) -> 99 
  C_E (C_B (C_B _ _) (C_C _ _)) (C_G C_D) -> 100 
  C_E (C_C ((C_E _ _,_)) (C_E _ _)) (C_E (C_C _ _) (C_E _ _)) -> 101 
  C_E (C_C ((C_E _ _,_)) (C_G _)) (C_E (C_B _ _) C_F) -> 102 
  C_E C_A _ -> 103 
  C_E (C_C ((C_F,_)) _) C_D -> 104 
