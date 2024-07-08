module Program_6 () where 

 main = print $ show v_b
data B_B c d = C_E (B_B c d) (B_B c Char) | C_F d | C_G (B_A c d) (B_A d c) | C_H | C_I d
data B_A a b = C_A Bool (B_B ((Int,Char)) b) | C_B (B_A b b) | C_C | C_D (B_B b Int)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_E (C_E _ _) (C_E _ _)) -> 0 
  C_A _ (C_E (C_F _) (C_E _ _)) -> 1 
  C_A _ (C_E (C_G _ _) (C_E _ _)) -> 2 
  C_A _ (C_E (C_H) (C_E _ _)) -> 3 
  C_A _ (C_E (C_I _) (C_E _ _)) -> 4 
  C_A _ (C_E (C_E _ _) (C_F _)) -> 5 
  C_A _ (C_E (C_F _) (C_F _)) -> 6 
  C_A _ (C_E (C_G _ _) (C_F _)) -> 7 
  C_A _ (C_E (C_H) (C_F _)) -> 8 
  C_A _ (C_E (C_I _) (C_F _)) -> 9 
  C_A _ (C_E (C_E _ _) (C_G _ _)) -> 10 
  C_A _ (C_E (C_F _) (C_G _ _)) -> 11 
  C_A _ (C_E (C_G _ _) (C_G _ _)) -> 12 
  C_A _ (C_E (C_H) (C_G _ _)) -> 13 
  C_A _ (C_E (C_I _) (C_G _ _)) -> 14 
  C_A _ (C_E (C_E _ _) (C_H)) -> 15 
  C_A _ (C_E (C_F _) (C_H)) -> 16 
  C_A _ (C_E (C_G _ _) (C_H)) -> 17 
  C_A _ (C_E (C_H) (C_H)) -> 18 
  C_A _ (C_E (C_I _) (C_H)) -> 19 
  C_A _ (C_E (C_E _ _) (C_I _)) -> 20 
  C_A _ (C_E (C_F _) (C_I _)) -> 21 
  C_A _ (C_E (C_G _ _) (C_I _)) -> 22 
  C_A _ (C_E (C_H) (C_I _)) -> 23 
  C_A _ (C_E (C_I _) (C_I _)) -> 24 
  C_A _ (C_F _) -> 25 
  C_A _ (C_G _ _) -> 26 
  C_A _ (C_H) -> 27 
  C_A _ (C_I _) -> 28 
  C_B (C_A _ (C_E _ _)) -> 29 
  C_B (C_A _ (C_F _)) -> 30 
  C_B (C_A _ (C_G _ _)) -> 31 
  C_B (C_A _ (C_H)) -> 32 
  C_B (C_A _ (C_I _)) -> 33 
  C_B (C_B (C_A _ _)) -> 34 
  C_B (C_B (C_B _)) -> 35 
  C_B (C_B (C_C)) -> 36 
  C_B (C_B (C_D _)) -> 37 
  C_B (C_C) -> 38 
  C_B (C_D _) -> 39 
  C_C -> 40 
  C_D (C_E (C_E _ _) (C_E _ _)) -> 41 
  C_D (C_E (C_F _) (C_E _ _)) -> 42 
  C_D (C_E (C_G _ _) (C_E _ _)) -> 43 
  C_D (C_E (C_H) (C_E _ _)) -> 44 
  C_D (C_E (C_I _) (C_E _ _)) -> 45 
  C_D (C_E (C_E _ _) (C_F _)) -> 46 
  C_D (C_E (C_F _) (C_F _)) -> 47 
  C_D (C_E (C_G _ _) (C_F _)) -> 48 
  C_D (C_E (C_H) (C_F _)) -> 49 
  C_D (C_E (C_I _) (C_F _)) -> 50 
  C_D (C_E (C_E _ _) (C_G _ _)) -> 51 
  C_D (C_E (C_F _) (C_G _ _)) -> 52 
  C_D (C_E (C_G _ _) (C_G _ _)) -> 53 
  C_D (C_E (C_H) (C_G _ _)) -> 54 
  C_D (C_E (C_I _) (C_G _ _)) -> 55 
  C_D (C_E (C_E _ _) (C_H)) -> 56 
  C_D (C_E (C_F _) (C_H)) -> 57 
  C_D (C_E (C_G _ _) (C_H)) -> 58 
  C_D (C_E (C_H) (C_H)) -> 59 
  C_D (C_E (C_I _) (C_H)) -> 60 
  C_D (C_E (C_E _ _) (C_I _)) -> 61 
  C_D (C_E (C_F _) (C_I _)) -> 62 
  C_D (C_E (C_G _ _) (C_I _)) -> 63 
  C_D (C_E (C_H) (C_I _)) -> 64 
  C_D (C_E (C_I _) (C_I _)) -> 65 
  C_D (C_F _) -> 66 
  C_D (C_G (C_A _ _) (C_A _ _)) -> 67 
  C_D (C_G (C_A _ _) (C_B _)) -> 68 
  C_D (C_G (C_A _ _) (C_C)) -> 69 
  C_D (C_G (C_A _ _) (C_D _)) -> 70 
  C_D (C_G (C_B _) (C_A _ _)) -> 71 
  C_D (C_G (C_B _) (C_B _)) -> 72 
  C_D (C_G (C_B _) (C_C)) -> 73 
  C_D (C_G (C_B _) (C_D _)) -> 74 
  C_D (C_G (C_C) (C_A _ _)) -> 75 
  C_D (C_G (C_C) (C_B _)) -> 76 
  C_D (C_G (C_C) (C_C)) -> 77 
  C_D (C_G (C_C) (C_D _)) -> 78 
  C_D (C_G (C_D _) (C_A _ _)) -> 79 
  C_D (C_G (C_D _) (C_B _)) -> 80 
  C_D (C_G (C_D _) (C_C)) -> 81 
  C_D (C_G (C_D _) (C_D _)) -> 82 
  C_D (C_H) -> 83 
  C_D (C_I 12) -> 84 
  C_D (C_I _) -> 85 
