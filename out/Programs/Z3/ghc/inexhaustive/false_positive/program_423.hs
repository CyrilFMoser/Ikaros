module Program_1 () where 

main = print $ show v_b
data B_B a = C_C ((B_A,B_A)) B_A | C_D (B_B a) | C_E Int | C_F
data B_A = C_A (B_B B_A) (B_B Bool) | C_B

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C ((C_A _ _,C_B)) C_B) -> 0 
  C_D (C_D _) -> 1 
  C_D (C_C _ _) -> 2 
  C_C ((C_A (C_C _ _) (C_E _),C_A (C_F) (C_F))) (C_A (C_E _) _) -> 3 
  C_C ((C_A (C_D _) (C_D _),C_A (C_E _) (C_D _))) (C_A (C_F) (C_D _)) -> 4 
  C_C ((C_A _ (C_D _),C_B)) (C_A (C_F) (C_C _ _)) -> 5 
  C_C ((C_A _ (C_C _ _),C_A (C_C _ _) (C_C _ _))) (C_A (C_F) (C_F)) -> 6 
  C_C ((C_A (C_F) (C_C _ _),C_B)) (C_A (C_E _) (C_C _ _)) -> 7 
  C_C ((C_A _ (C_C _ _),C_A (C_F) (C_F))) (C_A _ (C_D _)) -> 8 
  C_C ((C_A (C_F) (C_C _ _),C_A _ _)) (C_A (C_F) (C_E _)) -> 9 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_C _ _) (C_D _))) (C_A (C_E _) _) -> 10 
  C_C ((C_A (C_C _ _) (C_D _),C_A _ (C_E _))) (C_A (C_D _) (C_E _)) -> 11 
  C_C ((C_A _ (C_F),C_A (C_D _) (C_D _))) (C_A (C_E _) (C_E _)) -> 12 
  C_C ((C_A _ (C_C _ _),C_A (C_E _) (C_F))) (C_A _ _) -> 13 
  C_C ((C_A _ (C_D _),C_A (C_C _ _) _)) (C_A (C_F) (C_F)) -> 14 
  C_C ((C_A (C_E _) (C_F),C_A (C_C _ _) (C_C _ _))) (C_A (C_C _ _) (C_C _ _)) -> 15 
  C_C ((C_A (C_F) (C_F),C_A _ _)) (C_A (C_D _) (C_E _)) -> 16 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_C _ _) _)) (C_A (C_C _ _) _) -> 17 
  C_C ((C_A _ (C_D _),C_A (C_E _) _)) (C_A (C_C _ _) _) -> 18 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_C _ _) _)) (C_A (C_D _) (C_F)) -> 19 
  C_C ((C_A _ (C_D _),C_A _ (C_D _))) (C_A (C_C _ _) (C_D _)) -> 20 
  C_C ((C_A (C_C _ _) (C_E _),C_A (C_D _) (C_C _ _))) (C_A _ (C_E _)) -> 21 
  C_C ((C_A (C_C _ _) (C_E _),C_A (C_E _) (C_E _))) (C_A _ (C_E _)) -> 22 
  C_C ((C_A (C_E _) (C_D _),C_A (C_F) (C_F))) _ -> 23 
  C_C ((C_A (C_E _) _,C_A (C_E _) (C_D _))) (C_A (C_D _) (C_D _)) -> 24 
  C_C ((C_A _ (C_D _),C_A (C_E _) (C_E _))) C_B -> 25 
  C_C ((C_A (C_E _) (C_F),C_A (C_C _ _) (C_F))) (C_A (C_E _) (C_D _)) -> 26 
  C_C ((C_A (C_D _) (C_D _),C_A _ (C_C _ _))) (C_A (C_C _ _) _) -> 27 
  C_C ((C_A (C_D _) _,C_A (C_F) (C_E _))) (C_A (C_E _) _) -> 28 
  C_C ((C_A (C_E _) _,C_A (C_D _) (C_C _ _))) (C_A _ (C_F)) -> 29 
  C_C ((C_A _ _,C_A (C_C _ _) _)) (C_A (C_E _) (C_D _)) -> 30 
  C_C ((C_A (C_F) _,C_A _ (C_D _))) (C_A (C_E _) (C_D _)) -> 31 
  C_C ((C_A (C_E _) (C_D _),C_A (C_E _) (C_D _))) (C_A (C_E _) _) -> 32 
  C_C ((C_A (C_E _) (C_D _),C_A (C_F) (C_E _))) (C_A (C_F) (C_D _)) -> 33 
  C_C ((C_A (C_D _) (C_F),C_A (C_C _ _) _)) (C_A _ (C_D _)) -> 34 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A _ (C_E _))) C_B -> 35 
  C_C ((C_A (C_C _ _) (C_F),C_A _ (C_D _))) (C_A _ (C_E _)) -> 36 
  C_C ((C_A (C_F) (C_D _),C_A (C_D _) _)) (C_A (C_F) (C_D _)) -> 37 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_F) (C_D _))) C_B -> 38 
  C_C ((C_A (C_C _ _) _,C_A (C_E _) (C_D _))) (C_A (C_D _) (C_D _)) -> 39 
  C_C ((C_A _ _,C_A (C_F) (C_C _ _))) (C_A (C_F) (C_F)) -> 40 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_D _) (C_D _))) (C_A (C_E _) (C_F)) -> 41 
  C_C ((C_A (C_E _) (C_C _ _),C_A (C_F) (C_D _))) (C_A (C_E _) _) -> 42 
  C_C ((C_A (C_E _) (C_E _),C_A (C_E _) (C_C _ _))) (C_A (C_E _) (C_C _ _)) -> 43 
  C_C ((C_A (C_F) _,C_A _ _)) (C_A (C_F) (C_E _)) -> 44 
  C_C ((C_A _ (C_F),C_A (C_D _) (C_D _))) (C_A (C_D _) (C_D _)) -> 45 
  C_C ((C_A (C_F) (C_F),C_A (C_D _) (C_D _))) (C_A (C_F) (C_D _)) -> 46 
  C_C ((C_A (C_D _) (C_D _),C_A (C_D _) (C_D _))) (C_A (C_D _) _) -> 47 
  C_C ((C_A (C_D _) (C_F),C_A (C_E _) _)) C_B -> 48 
  C_C ((C_A (C_E _) _,C_A (C_D _) (C_C _ _))) (C_A (C_D _) _) -> 49 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_E _) (C_C _ _))) (C_A (C_D _) (C_D _)) -> 50 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_E _) (C_F))) (C_A _ _) -> 51 
  C_C ((C_A (C_C _ _) (C_E _),C_A _ _)) (C_A _ _) -> 52 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_C _ _) (C_D _))) (C_A (C_F) _) -> 53 
  C_C ((C_A (C_F) (C_D _),C_A (C_C _ _) (C_F))) (C_A (C_D _) (C_C _ _)) -> 54 
  C_C ((C_A (C_E _) (C_C _ _),C_A (C_D _) (C_E _))) (C_A _ (C_F)) -> 55 
  C_C ((C_A (C_D _) (C_F),C_A (C_E _) _)) (C_A (C_C _ _) (C_F)) -> 56 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_C _ _) (C_D _))) (C_A (C_C _ _) (C_F)) -> 57 
  C_C ((C_A (C_E _) (C_D _),C_A (C_F) (C_F))) (C_A (C_E _) (C_F)) -> 58 
  C_C ((C_B,C_A (C_D _) (C_C _ _))) (C_A (C_F) (C_E _)) -> 59 
  C_C ((C_A (C_E _) (C_D _),C_A (C_D _) (C_C _ _))) C_B -> 60 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_F) (C_F))) (C_A (C_E _) (C_F)) -> 61 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_F) (C_C _ _))) (C_A (C_D _) _) -> 62 
  C_C _ (C_A _ (C_E _)) -> 63 
  C_C ((C_A _ (C_F),C_A (C_C _ _) _)) (C_A _ (C_E _)) -> 64 
  C_C ((C_A (C_E _) (C_E _),C_A _ _)) (C_A (C_D _) (C_E _)) -> 65 
  C_C ((C_A (C_F) (C_E _),C_B)) (C_A (C_D _) (C_F)) -> 66 
  C_C ((C_A (C_E _) (C_F),C_A (C_C _ _) (C_F))) (C_A (C_D _) (C_C _ _)) -> 67 
  C_C ((C_A _ (C_D _),C_A (C_F) (C_C _ _))) _ -> 68 
  C_C ((C_A (C_F) (C_F),C_A _ _)) (C_A (C_E _) (C_D _)) -> 69 
  C_C ((C_A (C_D _) (C_D _),C_A _ (C_C _ _))) (C_A (C_D _) _) -> 70 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_D _) (C_C _ _))) (C_A (C_D _) (C_E _)) -> 71 
  C_C ((C_A (C_C _ _) (C_E _),C_A (C_E _) (C_F))) (C_A (C_D _) (C_F)) -> 72 
  C_C ((C_A _ _,C_A (C_F) (C_D _))) (C_A _ (C_E _)) -> 73 
  C_C ((C_A _ (C_C _ _),C_A _ (C_E _))) (C_A _ (C_F)) -> 74 
  C_C ((C_A (C_D _) (C_E _),C_A (C_E _) (C_C _ _))) (C_A (C_D _) (C_D _)) -> 75 
  C_C ((C_A (C_C _ _) (C_D _),C_A (C_D _) (C_E _))) (C_A (C_D _) (C_F)) -> 76 
  C_C ((C_A (C_F) _,C_A (C_F) _)) (C_A (C_F) (C_E _)) -> 77 
  C_C ((C_A (C_E _) (C_C _ _),C_A (C_D _) (C_E _))) (C_A (C_C _ _) (C_C _ _)) -> 78 
  C_C ((C_A (C_D _) (C_F),C_A (C_D _) (C_D _))) (C_A (C_F) (C_F)) -> 79 
  C_C ((C_A (C_E _) (C_D _),C_A (C_D _) (C_F))) (C_A (C_E _) _) -> 80 
  C_C ((C_A (C_D _) (C_E _),C_A (C_C _ _) (C_C _ _))) (C_A (C_C _ _) (C_D _)) -> 81 
  C_C ((C_A _ (C_D _),C_A (C_E _) (C_E _))) (C_A (C_D _) (C_C _ _)) -> 82 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_C _ _) (C_D _))) (C_A (C_D _) (C_F)) -> 83 
  C_C ((C_A (C_E _) (C_E _),C_A (C_D _) (C_C _ _))) (C_A (C_D _) (C_D _)) -> 84 
  C_C ((C_A (C_D _) (C_F),C_A (C_F) (C_E _))) (C_A (C_E _) (C_D _)) -> 85 
  C_C ((C_A _ (C_D _),C_A _ _)) (C_A (C_C _ _) (C_E _)) -> 86 
  C_C ((C_A (C_D _) _,C_A (C_D _) (C_C _ _))) (C_A (C_F) (C_F)) -> 87 
  C_C ((C_A (C_C _ _) (C_F),C_A _ (C_D _))) (C_A _ (C_F)) -> 88 
  C_C ((C_A (C_D _) (C_F),C_B)) (C_A (C_E _) (C_E _)) -> 89 
  C_C ((C_A (C_F) (C_E _),C_A (C_D _) _)) _ -> 90 
  C_C ((C_B,C_A (C_E _) (C_C _ _))) (C_A (C_C _ _) (C_F)) -> 91 
  C_C ((C_A (C_F) (C_C _ _),C_A (C_F) (C_D _))) (C_A _ (C_C _ _)) -> 92 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A _ (C_D _))) (C_A (C_F) _) -> 93 
