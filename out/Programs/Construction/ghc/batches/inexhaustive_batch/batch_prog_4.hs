module Program_4 () where 

 main = print $ show v_b
data B_B a = C_E (B_B a) | C_F ((Int,(Char,Char))) Char
data B_C b = C_G | C_H (B_C b) Int | C_I
data B_A = C_A (B_C B_A) B_A | C_B (B_C ((Bool,Char))) Bool | C_C (B_C B_A) Bool | C_D (B_C B_A) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_G) _ -> 1 
  C_B (C_H _ _) _ -> 2 
  C_B (C_I) _ -> 3 
  C_C (C_G) _ -> 4 
  C_C (C_H (C_G) _) _ -> 5 
  C_C (C_H (C_H _ _) _) _ -> 6 
  C_C (C_H (C_I) _) _ -> 7 
  C_C (C_I) _ -> 8 
  C_D (C_G) (C_A (C_G) (C_A _ _)) -> 9 
  C_D (C_H (C_G) _) (C_A (C_G) (C_A _ _)) -> 10 
  C_D (C_H (C_H _ _) _) (C_A (C_G) (C_A _ _)) -> 11 
  C_D (C_H (C_I) _) (C_A (C_G) (C_A _ _)) -> 12 
  C_D (C_I) (C_A (C_G) (C_A _ _)) -> 13 
  C_D (C_G) (C_A (C_G) (C_B _ _)) -> 14 
  C_D (C_H (C_G) _) (C_A (C_G) (C_B _ _)) -> 15 
  C_D (C_H (C_H _ _) _) (C_A (C_G) (C_B _ _)) -> 16 
  C_D (C_H (C_I) _) (C_A (C_G) (C_B _ _)) -> 17 
  C_D (C_I) (C_A (C_G) (C_B _ _)) -> 18 
  C_D (C_G) (C_A (C_G) (C_C _ _)) -> 19 
  C_D (C_H (C_G) _) (C_A (C_G) (C_C _ _)) -> 20 
  C_D (C_H (C_H _ _) _) (C_A (C_G) (C_C _ _)) -> 21 
  C_D (C_H (C_I) _) (C_A (C_G) (C_C _ _)) -> 22 
  C_D (C_I) (C_A (C_G) (C_C _ _)) -> 23 
  C_D (C_G) (C_A (C_G) (C_D _ _)) -> 24 
  C_D (C_H (C_G) _) (C_A (C_G) (C_D _ _)) -> 25 
  C_D (C_H (C_H _ _) _) (C_A (C_G) (C_D _ _)) -> 26 
  C_D (C_H (C_I) _) (C_A (C_G) (C_D _ _)) -> 27 
  C_D (C_I) (C_A (C_G) (C_D _ _)) -> 28 
  C_D (C_G) (C_A (C_H _ _) (C_A _ _)) -> 29 
  C_D (C_H (C_G) _) (C_A (C_H _ _) (C_A _ _)) -> 30 
  C_D (C_H (C_H _ _) _) (C_A (C_H _ _) (C_A _ _)) -> 31 
  C_D (C_H (C_I) _) (C_A (C_H _ _) (C_A _ _)) -> 32 
  C_D (C_I) (C_A (C_H _ _) (C_A _ _)) -> 33 
  C_D (C_G) (C_A (C_H _ _) (C_B _ _)) -> 34 
  C_D (C_H (C_G) _) (C_A (C_H _ _) (C_B _ _)) -> 35 
  C_D (C_H (C_I) _) (C_A (C_H _ _) (C_B _ _)) -> 36 
  C_D (C_I) (C_A (C_H _ _) (C_B _ _)) -> 37 
  C_D (C_G) (C_A (C_H _ _) (C_C _ _)) -> 38 
  C_D (C_H (C_G) _) (C_A (C_H _ _) (C_C _ _)) -> 39 
  C_D (C_H (C_H _ _) _) (C_A (C_H _ _) (C_C _ _)) -> 40 
  C_D (C_H (C_I) _) (C_A (C_H _ _) (C_C _ _)) -> 41 
  C_D (C_I) (C_A (C_H _ _) (C_C _ _)) -> 42 
  C_D (C_G) (C_A (C_H _ _) (C_D _ _)) -> 43 
  C_D (C_H (C_G) _) (C_A (C_H _ _) (C_D _ _)) -> 44 
  C_D (C_H (C_H _ _) _) (C_A (C_H _ _) (C_D _ _)) -> 45 
  C_D (C_H (C_I) _) (C_A (C_H _ _) (C_D _ _)) -> 46 
  C_D (C_I) (C_A (C_H _ _) (C_D _ _)) -> 47 
  C_D (C_G) (C_A (C_I) (C_A _ _)) -> 48 
  C_D (C_H (C_G) _) (C_A (C_I) (C_A _ _)) -> 49 
  C_D (C_H (C_H _ _) _) (C_A (C_I) (C_A _ _)) -> 50 
  C_D (C_H (C_I) _) (C_A (C_I) (C_A _ _)) -> 51 
  C_D (C_I) (C_A (C_I) (C_A _ _)) -> 52 
  C_D (C_G) (C_A (C_I) (C_B _ _)) -> 53 
  C_D (C_H (C_G) _) (C_A (C_I) (C_B _ _)) -> 54 
  C_D (C_H (C_H _ _) _) (C_A (C_I) (C_B _ _)) -> 55 
  C_D (C_H (C_I) _) (C_A (C_I) (C_B _ _)) -> 56 
  C_D (C_I) (C_A (C_I) (C_B _ _)) -> 57 
  C_D (C_G) (C_A (C_I) (C_C _ _)) -> 58 
  C_D (C_H (C_G) _) (C_A (C_I) (C_C _ _)) -> 59 
  C_D (C_H (C_H _ _) _) (C_A (C_I) (C_C _ _)) -> 60 
  C_D (C_H (C_I) _) (C_A (C_I) (C_C _ _)) -> 61 
  C_D (C_I) (C_A (C_I) (C_C _ _)) -> 62 
  C_D (C_G) (C_A (C_I) (C_D _ _)) -> 63 
  C_D (C_H (C_G) _) (C_A (C_I) (C_D _ _)) -> 64 
  C_D (C_H (C_H _ _) _) (C_A (C_I) (C_D _ _)) -> 65 
  C_D (C_H (C_I) _) (C_A (C_I) (C_D _ _)) -> 66 
  C_D (C_I) (C_A (C_I) (C_D _ _)) -> 67 
  C_D (C_G) (C_B (C_G) _) -> 68 
  C_D (C_H (C_G) _) (C_B (C_G) _) -> 69 
  C_D (C_H (C_H _ _) _) (C_B (C_G) _) -> 70 
  C_D (C_H (C_I) _) (C_B (C_G) _) -> 71 
  C_D (C_I) (C_B (C_G) _) -> 72 
  C_D (C_G) (C_B (C_H _ _) _) -> 73 
  C_D (C_H (C_G) _) (C_B (C_H _ _) _) -> 74 
  C_D (C_H (C_H _ _) _) (C_B (C_H _ _) _) -> 75 
  C_D (C_H (C_I) _) (C_B (C_H _ _) _) -> 76 
  C_D (C_I) (C_B (C_H _ _) _) -> 77 
  C_D (C_G) (C_B (C_I) _) -> 78 
  C_D (C_H (C_G) _) (C_B (C_I) _) -> 79 
  C_D (C_H (C_H _ _) _) (C_B (C_I) _) -> 80 
  C_D (C_H (C_I) _) (C_B (C_I) _) -> 81 
  C_D (C_I) (C_B (C_I) _) -> 82 
  C_D (C_G) (C_C _ _) -> 83 
  C_D (C_H (C_G) _) (C_C _ _) -> 84 
  C_D (C_H (C_H _ _) _) (C_C _ _) -> 85 
  C_D (C_H (C_I) _) (C_C _ _) -> 86 
  C_D (C_I) (C_C _ _) -> 87 
  C_D (C_G) (C_D _ (C_A _ _)) -> 88 
  C_D (C_H (C_G) _) (C_D _ (C_A _ _)) -> 89 
  C_D (C_H (C_H _ _) _) (C_D _ (C_A _ _)) -> 90 
  C_D (C_H (C_I) _) (C_D _ (C_A _ _)) -> 91 
  C_D (C_I) (C_D _ (C_A _ _)) -> 92 
  C_D (C_G) (C_D _ (C_B _ _)) -> 93 
  C_D (C_H (C_G) _) (C_D _ (C_B _ _)) -> 94 
  C_D (C_H (C_H _ _) _) (C_D _ (C_B _ _)) -> 95 
  C_D (C_H (C_I) _) (C_D _ (C_B _ _)) -> 96 
  C_D (C_I) (C_D _ (C_B _ _)) -> 97 
  C_D (C_G) (C_D _ (C_C _ _)) -> 98 
  C_D (C_H (C_G) _) (C_D _ (C_C _ _)) -> 99 
  C_D (C_H (C_H _ _) _) (C_D _ (C_C _ _)) -> 100 
  C_D (C_H (C_I) _) (C_D _ (C_C _ _)) -> 101 
  C_D (C_I) (C_D _ (C_C _ _)) -> 102 
  C_D (C_G) (C_D _ (C_D _ _)) -> 103 
  C_D (C_H (C_G) _) (C_D _ (C_D _ _)) -> 104 
  C_D (C_H (C_H _ _) _) (C_D _ (C_D _ _)) -> 105 
  C_D (C_H (C_I) _) (C_D _ (C_D _ _)) -> 106 
  C_D (C_I) (C_D _ (C_D _ _)) -> 107 
