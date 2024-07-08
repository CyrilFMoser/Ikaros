module Program_2 () where 

main = print $ show v_b
data B_B a = C_C ((B_A,B_A)) B_A | C_D (B_B a) | C_E Int | C_F
data B_A = C_A (B_B B_A) (B_B Bool) | C_B

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((C_A (C_D _) (C_D _),C_A (C_E _) (C_E _))) (C_A (C_F) _) -> 0 
  C_C ((C_A (C_E _) _,C_A (C_F) (C_D _))) (C_A (C_E _) _) -> 1 
  C_C ((C_A (C_D _) (C_E _),C_A (C_D _) _)) (C_A _ (C_E _)) -> 2 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_E _) (C_D _))) (C_A _ (C_E _)) -> 3 
  C_C ((C_A (C_E _) _,C_A _ (C_F))) (C_A (C_C _ _) _) -> 4 
  C_C ((C_A (C_C _ _) _,C_A (C_E _) _)) (C_A (C_C _ _) (C_D _)) -> 5 
  C_C ((C_A (C_E _) (C_C _ _),C_A (C_E _) (C_E _))) (C_A (C_C _ _) (C_F)) -> 6 
  C_C ((C_A (C_F) _,C_A (C_E _) (C_F))) (C_A _ _) -> 7 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_C _ _) (C_F))) (C_A (C_E _) (C_D _)) -> 8 
  C_C ((C_A _ (C_F),C_A (C_D _) (C_F))) (C_A (C_F) _) -> 9 
  C_C ((C_A _ (C_C _ _),C_A (C_D _) (C_E _))) (C_A (C_F) _) -> 10 
  C_C ((C_A (C_E _) (C_D _),C_A (C_F) (C_C _ _))) (C_A (C_F) (C_F)) -> 11 
  C_C ((C_A (C_D _) (C_E _),C_A (C_D _) _)) (C_A (C_F) (C_E _)) -> 12 
  C_C ((C_A (C_E _) (C_C _ _),C_A (C_D _) (C_C _ _))) (C_A (C_F) (C_C _ _)) -> 13 
  C_C ((C_A (C_D _) (C_E _),C_A (C_D _) (C_F))) (C_A (C_F) _) -> 14 
  C_C ((C_A _ _,C_A (C_F) (C_C _ _))) (C_A _ _) -> 15 
  C_C ((C_A _ (C_D _),C_B)) (C_A (C_E _) (C_C _ _)) -> 16 
  C_C ((C_A _ (C_C _ _),C_A (C_C _ _) (C_E _))) (C_A (C_D _) (C_F)) -> 17 
  C_C ((C_A _ (C_E _),C_A (C_C _ _) (C_E _))) (C_A _ (C_D _)) -> 18 
  C_C ((C_A (C_F) (C_D _),C_A (C_E _) (C_D _))) (C_A (C_D _) (C_D _)) -> 19 
  C_C ((C_A (C_F) (C_C _ _),C_A (C_D _) (C_D _))) (C_A (C_C _ _) (C_E _)) -> 20 
  C_C ((C_A (C_D _) _,C_A (C_C _ _) _)) (C_A _ _) -> 21 
  C_C ((C_A (C_D _) _,C_A (C_E _) (C_F))) (C_A (C_D _) (C_E _)) -> 22 
  C_C ((C_A (C_D _) (C_D _),C_A (C_E _) (C_F))) (C_A (C_D _) (C_E _)) -> 23 
  C_C ((C_B,C_A (C_D _) (C_E _))) (C_A (C_F) (C_E _)) -> 24 
  C_C ((C_A (C_D _) _,C_A (C_C _ _) (C_C _ _))) (C_A (C_E _) _) -> 25 
  C_C ((C_A (C_D _) (C_F),C_A (C_C _ _) (C_F))) (C_A (C_E _) (C_C _ _)) -> 26 
  C_C ((C_A (C_C _ _) _,C_A (C_E _) _)) (C_A (C_C _ _) (C_F)) -> 27 
  C_C ((C_A (C_F) (C_D _),C_A _ (C_F))) (C_A (C_F) (C_E _)) -> 28 
  C_C ((C_A (C_F) (C_E _),C_A (C_E _) _)) (C_A (C_C _ _) (C_C _ _)) -> 29 
  C_C ((C_A (C_E _) (C_C _ _),C_A _ (C_E _))) (C_A _ (C_D _)) -> 30 
  C_C ((C_A (C_F) (C_D _),C_A (C_D _) (C_F))) (C_A (C_C _ _) (C_D _)) -> 31 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_E _) (C_F))) (C_A (C_D _) (C_F)) -> 32 
  C_C ((C_A (C_C _ _) _,C_A _ (C_E _))) (C_A _ (C_F)) -> 33 
  C_C ((C_A (C_C _ _) _,C_A (C_D _) (C_E _))) (C_A (C_C _ _) (C_F)) -> 34 
  C_C ((C_A (C_D _) (C_F),C_A _ (C_D _))) (C_A _ _) -> 35 
  C_C ((C_A (C_F) (C_D _),C_A (C_F) (C_C _ _))) (C_A (C_D _) _) -> 36 
  C_C ((C_B,C_A (C_C _ _) (C_E _))) (C_A (C_C _ _) (C_F)) -> 37 
  C_C ((C_A (C_F) (C_D _),C_A (C_F) (C_D _))) (C_A _ (C_E _)) -> 38 
  C_C ((C_A (C_D _) (C_F),C_A (C_F) (C_D _))) (C_A (C_E _) (C_E _)) -> 39 
  C_C ((C_A _ (C_C _ _),C_A (C_D _) (C_E _))) C_B -> 40 
  C_C ((C_A (C_F) (C_F),C_A _ (C_D _))) C_B -> 41 
  C_C ((C_A _ (C_C _ _),C_A (C_C _ _) (C_F))) (C_A (C_F) (C_D _)) -> 42 
  C_C ((C_A _ (C_E _),C_A _ (C_E _))) (C_A _ (C_F)) -> 43 
  C_C ((C_A _ (C_D _),C_A (C_C _ _) (C_E _))) (C_A (C_C _ _) (C_D _)) -> 44 
  C_C ((C_A (C_E _) (C_C _ _),C_A _ _)) (C_A (C_E _) (C_F)) -> 45 
  C_C ((C_A _ (C_F),C_A (C_C _ _) (C_F))) (C_A _ (C_D _)) -> 46 
  C_C ((C_A _ (C_F),C_A (C_C _ _) (C_E _))) (C_A (C_E _) (C_E _)) -> 47 
  C_C ((C_A _ (C_F),C_A (C_F) (C_C _ _))) (C_A (C_F) (C_E _)) -> 48 
  C_C ((C_A (C_D _) (C_E _),C_A _ _)) (C_A (C_D _) (C_F)) -> 49 
  C_C ((C_A (C_C _ _) (C_E _),C_A (C_D _) (C_E _))) (C_A (C_E _) (C_F)) -> 50 
  C_C ((C_B,C_A (C_C _ _) (C_C _ _))) (C_A _ _) -> 51 
  C_C ((C_A _ (C_C _ _),C_A (C_E _) (C_E _))) _ -> 52 
  C_C ((C_A (C_D _) (C_F),C_A (C_E _) (C_F))) (C_A (C_D _) (C_C _ _)) -> 53 
  C_C ((C_A (C_F) _,C_A (C_D _) (C_D _))) (C_A (C_C _ _) (C_E _)) -> 54 
  C_C ((C_A _ (C_C _ _),C_A (C_F) (C_C _ _))) (C_A (C_D _) (C_C _ _)) -> 55 
  C_C ((C_A _ _,C_A _ _)) (C_A (C_E _) (C_C _ _)) -> 56 
  C_C ((C_A _ (C_F),C_A _ (C_F))) (C_A (C_F) _) -> 57 
  C_C ((C_A (C_C _ _) _,C_A (C_C _ _) _)) C_B -> 58 
  C_C ((C_A (C_D _) _,C_A (C_D _) (C_E _))) (C_A (C_E _) (C_F)) -> 59 
  C_C ((C_A (C_F) (C_C _ _),C_A (C_E _) _)) (C_A (C_D _) (C_E _)) -> 60 
  C_C ((C_A (C_C _ _) _,C_A (C_F) (C_E _))) (C_A (C_C _ _) _) -> 61 
  C_C ((C_A (C_F) (C_C _ _),C_A (C_D _) (C_C _ _))) (C_A _ (C_C _ _)) -> 62 
  C_C ((C_A _ (C_D _),C_A _ (C_D _))) (C_A (C_D _) _) -> 63 
  C_C ((C_A _ (C_E _),C_A _ (C_F))) (C_A (C_F) (C_F)) -> 64 
  C_C ((C_A (C_D _) (C_F),C_B)) _ -> 65 
  C_C ((C_A (C_D _) (C_D _),C_A (C_E _) (C_E _))) C_B -> 66 
  C_C ((C_A (C_E _) (C_D _),C_A (C_D _) _)) (C_A (C_E _) (C_E _)) -> 67 
  C_C ((C_B,C_A (C_F) (C_D _))) (C_A (C_C _ _) (C_E _)) -> 68 
  C_C ((C_A (C_D _) (C_E _),C_A _ (C_F))) (C_A (C_C _ _) (C_D _)) -> 69 
  C_C ((C_A (C_D _) (C_C _ _),C_A (C_F) (C_D _))) (C_A _ _) -> 70 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_E _) _)) (C_A _ (C_F)) -> 71 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_F) (C_C _ _))) (C_A (C_E _) (C_C _ _)) -> 72 
  C_C ((C_A (C_F) (C_E _),C_A (C_C _ _) _)) (C_A (C_C _ _) (C_E _)) -> 73 
  C_C ((C_A _ (C_D _),C_A (C_E _) _)) (C_A _ (C_F)) -> 74 
  C_C ((C_A _ (C_D _),C_A (C_D _) (C_F))) (C_A (C_F) (C_D _)) -> 75 
  C_C ((C_A _ (C_C _ _),C_A (C_D _) (C_F))) (C_A _ (C_F)) -> 76 
  C_C ((C_A (C_C _ _) (C_E _),C_A (C_C _ _) (C_F))) (C_A _ (C_E _)) -> 77 
  C_C ((C_A _ (C_E _),C_A (C_D _) (C_F))) (C_A (C_E _) _) -> 78 
  C_C ((C_A (C_F) (C_C _ _),C_A (C_E _) (C_F))) (C_A (C_F) (C_F)) -> 79 
  C_C ((C_B,C_A (C_E _) (C_F))) (C_A (C_E _) _) -> 80 
  C_C ((C_A (C_E _) (C_E _),C_A (C_C _ _) (C_C _ _))) (C_A _ (C_C _ _)) -> 81 
  C_C ((C_B,C_A _ (C_D _))) (C_A _ (C_E _)) -> 82 
  C_C ((C_A (C_F) _,C_A _ (C_C _ _))) (C_A (C_F) (C_D _)) -> 83 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_D _) (C_D _))) (C_A (C_E _) (C_D _)) -> 84 
  C_C ((C_A (C_E _) (C_E _),C_A (C_D _) (C_F))) (C_A (C_D _) (C_D _)) -> 85 
  C_C ((C_A _ (C_C _ _),C_A (C_D _) (C_F))) (C_A _ (C_C _ _)) -> 86 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_C _ _) (C_E _))) (C_A (C_F) (C_D _)) -> 87 
  C_C ((C_A _ (C_F),C_A (C_E _) _)) (C_A _ (C_F)) -> 88 
  C_C ((C_A (C_F) (C_E _),C_A (C_E _) (C_D _))) (C_A (C_F) (C_F)) -> 89 
  C_C ((C_A (C_D _) _,C_A (C_C _ _) (C_C _ _))) (C_A _ _) -> 90 
  C_C ((C_A (C_F) _,C_A (C_F) (C_F))) (C_A (C_D _) (C_E _)) -> 91 
  C_C ((C_A (C_E _) (C_C _ _),C_A (C_D _) _)) (C_A (C_E _) (C_C _ _)) -> 92 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_D _) (C_F))) (C_A (C_D _) (C_F)) -> 93 
  C_C ((C_A (C_F) (C_D _),C_A _ _)) _ -> 94 
  C_C ((C_A (C_D _) (C_D _),C_A (C_F) (C_E _))) (C_A (C_E _) (C_C _ _)) -> 95 
  C_C ((C_A (C_C _ _) (C_D _),C_A (C_E _) (C_D _))) _ -> 96 
  C_C ((C_A _ (C_C _ _),C_A _ (C_E _))) (C_A _ _) -> 97 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_F) (C_E _))) (C_A (C_C _ _) (C_F)) -> 98 
  C_C ((C_A (C_F) (C_F),C_A (C_D _) _)) (C_A _ (C_F)) -> 99 
  C_C ((C_A _ _,C_A (C_E _) (C_F))) (C_A (C_E _) (C_C _ _)) -> 100 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_E _) _)) (C_A (C_E _) (C_D _)) -> 101 
  C_C ((C_A (C_E _) _,C_A (C_C _ _) (C_C _ _))) (C_A (C_C _ _) (C_C _ _)) -> 102 
  C_C ((C_A (C_F) (C_E _),C_A (C_E _) (C_E _))) (C_A (C_F) (C_C _ _)) -> 103 
  C_C ((C_A (C_D _) (C_F),C_A (C_E _) _)) (C_A (C_E _) (C_C _ _)) -> 104 
  C_C ((C_A (C_D _) (C_E _),C_A (C_F) (C_F))) _ -> 105 
  C_C ((C_A _ (C_D _),C_A _ (C_C _ _))) (C_A (C_C _ _) _) -> 106 
  C_C ((C_A (C_C _ _) (C_F),C_A (C_F) (C_C _ _))) C_B -> 107 
  C_C ((C_A (C_D _) _,C_A _ (C_E _))) (C_A _ (C_D _)) -> 108 
  C_C ((C_A (C_D _) (C_D _),C_A (C_C _ _) (C_E _))) (C_A (C_C _ _) (C_C _ _)) -> 109 
  C_C ((C_A (C_D _) (C_E _),C_A (C_E _) (C_E _))) (C_A (C_D _) (C_C _ _)) -> 110 
  C_C ((C_A (C_C _ _) (C_C _ _),C_A (C_E _) (C_D _))) (C_A (C_C _ _) (C_E _)) -> 111 
  C_C ((C_A _ (C_C _ _),C_A (C_F) _)) (C_A (C_F) (C_F)) -> 112 
  C_C ((C_A (C_F) (C_E _),C_A (C_E _) (C_D _))) _ -> 113 
  C_C ((C_A (C_D _) _,C_A (C_D _) (C_E _))) (C_A _ (C_C _ _)) -> 114 
  C_C ((C_A (C_F) (C_F),C_A (C_E _) (C_D _))) (C_A (C_C _ _) (C_F)) -> 115 
  C_C ((C_A (C_D _) (C_E _),C_A _ (C_D _))) (C_A (C_C _ _) (C_C _ _)) -> 116 
  C_C ((C_A (C_E _) (C_C _ _),C_A (C_E _) _)) (C_A (C_E _) (C_C _ _)) -> 117 
  C_C ((C_A _ (C_D _),C_A _ (C_C _ _))) (C_A _ (C_C _ _)) -> 118 
