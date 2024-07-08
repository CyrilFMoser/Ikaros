module Program_3 () where 

main = print $ show v_b
data B_A = C_A B_B ((B_A,B_A)) | C_B ((B_B,(Bool,Char))) | C_C ((Bool,B_B))
data B_B = C_D B_A | C_E Char | C_F Bool | C_G B_B B_A

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_G (C_D (C_B _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 1 
  C_G (C_G _ (C_B _)) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 2 
  C_G (C_G (C_G _ _) _) (C_A (C_E _) ((C_C _,C_C _))) -> 3 
  C_G (C_E _) (C_A _ ((C_A _ _,C_A _ _))) -> 4 
  C_G (C_F _) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 5 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_B _))) -> 6 
  C_G (C_G (C_G _ _) _) (C_A (C_E _) ((C_C _,C_A _ _))) -> 7 
  C_G (C_G (C_F _) (C_B _)) (C_B ((C_F _,(_,_)))) -> 8 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_E _) ((C_B _,C_B _))) -> 9 
  C_G (C_G (C_G _ _) _) (C_A _ ((C_C _,C_B _))) -> 10 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 11 
  C_G (C_D (C_B _)) _ -> 12 
  C_G _ (C_A (C_E _) ((C_C _,C_A _ _))) -> 13 
  C_G (C_F _) (C_B ((C_G _ _,(_,_)))) -> 14 
  C_G (C_D _) (C_A (C_D _) ((C_C _,C_C _))) -> 15 
  C_G (C_G _ (C_C _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 16 
  C_G (C_G (C_E _) _) (C_A (C_F _) ((C_A _ _,C_B _))) -> 17 
  C_G _ (C_A (C_F _) _) -> 18 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 19 
  C_G (C_D (C_B _)) (C_A (C_G _ _) ((C_A _ _,C_B _))) -> 20 
  C_G (C_E _) (C_A (C_E _) ((C_B _,C_B _))) -> 21 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_F _) ((C_B _,C_C _))) -> 22 
  C_G (C_F _) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 23 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 24 
  C_G (C_D (C_B _)) (C_A (C_F _) ((C_C _,C_C _))) -> 25 
  C_G (C_G (C_G _ _) _) (C_A (C_E _) ((C_A _ _,C_A _ _))) -> 26 
  C_G (C_E _) (C_A (C_D _) ((C_A _ _,C_B _))) -> 27 
  C_G (C_G _ (C_C _)) (C_A (C_G _ _) _) -> 28 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 29 
  C_G (C_G (C_F _) _) (C_C ((_,C_E _))) -> 30 
  C_G (C_G (C_G _ _) (C_C _)) (C_B ((C_G _ _,(_,_)))) -> 31 
  C_G (C_D (C_C _)) (C_A (C_D _) ((C_A _ _,C_A _ _))) -> 32 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_D _) ((C_C _,C_B _))) -> 33 
  C_G (C_D (C_A _ _)) (C_A (C_E _) ((C_C _,C_B _))) -> 34 
  C_G (C_G (C_E _) (C_B _)) (C_C ((_,C_G _ _))) -> 35 
  C_G (C_E _) (C_A (C_G _ _) ((C_B _,C_C _))) -> 36 
  C_G (C_D _) (C_A _ _) -> 37 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_D _) ((C_B _,C_A _ _))) -> 38 
  C_G (C_G (C_E _) (C_A _ _)) (C_A _ ((C_A _ _,C_B _))) -> 39 
  C_G (C_G (C_F _) (C_B _)) _ -> 40 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 41 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_F _) ((C_C _,C_C _))) -> 42 
  C_G (C_G (C_D _) _) (C_B _) -> 43 
  C_G (C_G (C_F _) (C_B _)) (C_A _ ((C_A _ _,C_C _))) -> 44 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_E _) ((C_C _,C_A _ _))) -> 45 
  C_G (C_G _ (C_A _ _)) (C_A _ ((C_A _ _,C_C _))) -> 46 
  C_G (C_D (C_A _ _)) (C_A _ ((C_A _ _,C_B _))) -> 47 
  C_G (C_E _) (C_A _ ((C_A _ _,C_C _))) -> 48 
  C_G (C_D _) (C_A (C_F _) ((C_B _,C_C _))) -> 49 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 50 
  C_G (C_E _) (C_A _ ((C_C _,C_A _ _))) -> 51 
  C_G (C_G (C_E _) (C_A _ _)) (C_C ((_,C_D _))) -> 52 
  C_G (C_G (C_G _ _) _) (C_A _ ((C_A _ _,C_C _))) -> 53 
  C_G (C_G (C_E _) (C_C _)) _ -> 54 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 55 
  C_G (C_G _ _) (C_A _ ((C_B _,C_B _))) -> 56 
  C_G (C_G (C_D _) (C_A _ _)) (C_A (C_E _) ((C_B _,C_A _ _))) -> 57 
  C_G (C_D (C_C _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 58 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_E _) ((C_A _ _,C_C _))) -> 59 
  C_G (C_G (C_G _ _) (C_C _)) _ -> 60 
  C_G (C_G (C_F _) _) (C_A _ ((C_B _,C_C _))) -> 61 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A _ ((C_A _ _,C_C _))) -> 62 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_B _))) -> 63 
  C_G _ (C_A _ ((C_A _ _,C_A _ _))) -> 64 
  C_G (C_D (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 65 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_F _) _) -> 66 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_G _ _) ((C_A _ _,C_A _ _))) -> 67 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_G _ _) ((C_B _,C_C _))) -> 68 
  C_G (C_G (C_F _) _) (C_A (C_D _) ((C_C _,C_A _ _))) -> 69 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_D _) ((C_A _ _,C_C _))) -> 70 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_F _) ((C_C _,C_B _))) -> 71 
  C_G (C_G (C_E _) _) (C_A _ ((C_C _,C_C _))) -> 72 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 73 
  C_G (C_G (C_D _) _) (C_A (C_D _) ((C_B _,C_A _ _))) -> 74 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_D _) ((C_C _,C_C _))) -> 75 
  C_G (C_G _ _) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 76 
  C_G (C_E _) (C_A (C_E _) _) -> 77 
  C_G (C_G (C_D _) _) (C_A (C_D _) _) -> 78 
  C_G (C_G (C_D _) (C_C _)) (C_C ((_,C_E _))) -> 79 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_F _) _) -> 80 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_C _))) -> 81 
  C_G (C_D (C_A _ _)) (C_B ((C_F _,(_,_)))) -> 82 
  C_G (C_G (C_E _) (C_B _)) (C_A (C_F _) ((C_C _,C_C _))) -> 83 
  C_G (C_G (C_F _) (C_C _)) (C_C ((_,C_E _))) -> 84 
  C_G (C_D (C_B _)) (C_C _) -> 85 
  C_G (C_D (C_B _)) (C_A _ ((C_A _ _,C_C _))) -> 86 
  C_G (C_G (C_G _ _) (C_B _)) (C_A _ ((C_A _ _,C_B _))) -> 87 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 88 
  C_G (C_G (C_G _ _) _) (C_A _ _) -> 89 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_D _) ((C_B _,C_B _))) -> 90 
  C_G (C_G _ (C_B _)) (C_A _ ((C_B _,C_B _))) -> 91 
  C_G _ (C_A (C_E _) ((C_C _,C_B _))) -> 92 
  C_G (C_G (C_G _ _) (C_C _)) (C_A (C_E _) ((C_B _,C_B _))) -> 93 
  C_G (C_G _ (C_A _ _)) (C_C ((_,C_F _))) -> 94 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_B _))) -> 95 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_F _) ((C_C _,C_C _))) -> 96 
  C_G (C_D _) (C_A (C_F _) ((C_C _,C_C _))) -> 97 
  C_G (C_D (C_C _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 98 
  C_G (C_D (C_A _ _)) (C_A (C_G _ _) ((C_C _,C_B _))) -> 99 
  C_G (C_G (C_F _) (C_C _)) (C_B ((C_G _ _,(_,_)))) -> 100 
  C_G (C_G _ (C_B _)) (C_B ((C_E _,(_,_)))) -> 101 
  C_G (C_E _) (C_A (C_F _) ((C_B _,C_A _ _))) -> 102 
  C_G (C_G (C_E _) (C_A _ _)) (C_A (C_E _) _) -> 103 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_E _) ((C_B _,C_C _))) -> 104 
  C_G (C_G (C_G _ _) (C_A _ _)) (C_A (C_F _) ((C_C _,C_C _))) -> 105 
  C_G (C_G _ (C_B _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 106 
  C_G (C_G (C_D _) (C_C _)) (C_A _ ((C_A _ _,C_A _ _))) -> 107 
  C_G (C_G (C_G _ _) _) (C_A (C_F _) ((C_C _,C_A _ _))) -> 108 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_E _) ((C_A _ _,C_B _))) -> 109 
  C_G (C_G (C_F _) (C_B _)) (C_C ((_,C_F _))) -> 110 
  C_G (C_D (C_C _)) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 111 
  C_G (C_G (C_G _ _) (C_B _)) (C_C ((_,C_G _ _))) -> 112 
  C_G (C_G (C_F _) (C_B _)) (C_A (C_F _) ((C_B _,C_B _))) -> 113 
  C_G (C_G (C_F _) _) (C_B ((C_G _ _,(_,_)))) -> 114 
  C_G (C_G (C_D _) (C_C _)) (C_A (C_D _) ((C_C _,C_B _))) -> 115 
  C_G (C_G (C_D _) _) (C_A _ ((C_A _ _,C_B _))) -> 116 
  C_G (C_D (C_A _ _)) (C_A _ ((C_A _ _,C_A _ _))) -> 117 
  C_G (C_G _ (C_C _)) (C_A (C_F _) ((C_A _ _,C_C _))) -> 118 
  C_G (C_D (C_B _)) (C_A _ ((C_B _,C_B _))) -> 119 
  C_G (C_E _) (C_A (C_D _) ((C_B _,C_C _))) -> 120 
  C_G (C_G (C_F _) (C_A _ _)) (C_A (C_G _ _) ((C_B _,C_A _ _))) -> 121 
  C_G (C_D (C_A _ _)) (C_C ((_,C_E _))) -> 122 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_E _) ((C_B _,C_C _))) -> 123 
  C_G (C_G (C_E _) (C_A _ _)) _ -> 124 
  C_G (C_D (C_C _)) (C_C ((_,C_F _))) -> 125 
  C_G _ _ -> 126 
  C_G (C_G (C_E _) (C_C _)) (C_A (C_G _ _) ((C_C _,C_A _ _))) -> 127 
  C_G (C_G (C_G _ _) (C_B _)) (C_A (C_D _) ((C_C _,C_A _ _))) -> 128 
  C_G (C_G (C_D _) _) (C_A (C_F _) ((C_A _ _,C_A _ _))) -> 129 
  C_G (C_G (C_F _) (C_C _)) (C_A _ ((C_C _,C_A _ _))) -> 130 
  C_G (C_G (C_D _) (C_B _)) (C_A (C_E _) ((C_B _,C_B _))) -> 131 
  C_G (C_G (C_F _) (C_C _)) (C_A (C_F _) ((C_C _,C_A _ _))) -> 132 
