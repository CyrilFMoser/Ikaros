module Program_9 () where 

main = print $ show v_b
data B_A a = C_A a (B_A a) | C_B (B_A a) (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_B (C_B _ _) (C_A _ _)) -> 0 
  C_A _ (C_B (C_A _ _) _) -> 1 
  C_A _ (C_B _ _) -> 2 
  C_A _ _ -> 3 
  C_B (C_A _ (C_B _ _)) (C_B (C_B _ _) (C_A _ _)) -> 4 
  C_B (C_A _ (C_A _ _)) (C_B (C_B _ _) (C_A _ _)) -> 5 
  C_B (C_B _ (C_A _ _)) (C_B (C_A _ _) _) -> 6 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B _ (C_B _ _)) -> 7 
  C_B (C_B _ _) (C_B (C_A _ _) (C_B _ _)) -> 8 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_A _ _) (C_A _ _)) -> 9 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_A _ _) -> 10 
  C_B (C_B (C_B _ _) _) (C_A _ _) -> 11 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_A _ _) _) -> 12 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_A _ (C_A _ _)) -> 13 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) (C_A _ _)) -> 14 
  C_B (C_B (C_A _ _) _) (C_B (C_B _ _) (C_B _ _)) -> 15 
  C_B _ (C_B _ (C_A _ _)) -> 16 
  C_B (C_A _ (C_B _ _)) (C_A _ (C_B _ _)) -> 17 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_B _ _) (C_B _ _)) -> 18 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B _ _) -> 19 
  C_B (C_A _ _) (C_B (C_A _ _) (C_A _ _)) -> 20 
  C_B (C_B (C_B _ _) _) (C_B _ (C_A _ _)) -> 21 
  C_B (C_A _ (C_B _ _)) (C_A _ _) -> 22 
  C_B (C_A _ (C_A _ _)) (C_A _ (C_A _ _)) -> 23 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B _ _) -> 24 
  C_B (C_B _ (C_B _ _)) (C_B _ (C_B _ _)) -> 25 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_B _ _) (C_A _ _)) -> 26 
  C_B (C_B (C_B _ _) _) (C_A _ (C_B _ _)) -> 27 
  C_B (C_B _ (C_A _ _)) (C_B (C_A _ _) (C_B _ _)) -> 28 
  C_B (C_B _ (C_A _ _)) (C_A _ (C_A _ _)) -> 29 
  C_B (C_A _ (C_B _ _)) _ -> 30 
  C_B (C_A _ _) (C_B (C_B _ _) (C_B _ _)) -> 31 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_A _ _) _) -> 32 
  C_B (C_B (C_B _ _) _) (C_B _ (C_B _ _)) -> 33 
  C_B (C_A _ (C_A _ _)) (C_B (C_A _ _) (C_A _ _)) -> 34 
  C_B (C_B (C_B _ _) _) (C_B (C_A _ _) (C_B _ _)) -> 35 
  C_B (C_B (C_B _ _) _) (C_B (C_A _ _) _) -> 36 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_A _ _) (C_A _ _)) -> 37 
  C_B _ (C_B (C_B _ _) _) -> 38 
  C_B (C_B (C_B _ _) _) (C_B (C_B _ _) (C_A _ _)) -> 39 
  C_B (C_B _ (C_A _ _)) (C_A _ _) -> 40 
  C_B (C_B (C_A _ _) _) (C_B _ _) -> 41 
  C_B (C_B _ _) (C_B _ (C_B _ _)) -> 42 
  C_B (C_A _ (C_B _ _)) (C_B (C_A _ _) _) -> 43 
  C_B (C_A _ _) (C_B (C_B _ _) _) -> 44 
  C_B (C_A _ _) (C_B (C_A _ _) _) -> 45 
  C_B (C_B (C_B _ _) _) (C_A _ (C_A _ _)) -> 46 
  C_B _ (C_B _ (C_B _ _)) -> 47 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_B _ _) (C_B _ _)) -> 48 
  C_B (C_A _ _) (C_B _ _) -> 49 
  C_B _ (C_A _ _) -> 50 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_A _ _) _) -> 51 
  C_B _ (C_B (C_B _ _) (C_A _ _)) -> 52 
  C_B (C_A _ _) (C_B (C_A _ _) (C_B _ _)) -> 53 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ (C_A _ _)) -> 54 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_A _ _) (C_A _ _)) -> 55 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_A _ _) (C_B _ _)) -> 56 
  C_B (C_B _ _) (C_B (C_A _ _) (C_A _ _)) -> 57 
  C_B (C_B _ (C_A _ _)) (C_B _ (C_B _ _)) -> 58 
  C_B _ (C_A _ (C_B _ _)) -> 59 
  C_B (C_B (C_B _ _) _) (C_B (C_B _ _) _) -> 60 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) _) -> 61 
  C_B (C_A _ (C_B _ _)) (C_B _ (C_B _ _)) -> 62 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B _ (C_A _ _)) -> 63 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B _ (C_A _ _)) -> 64 
  C_B (C_B (C_B _ _) _) (C_B (C_B _ _) (C_B _ _)) -> 65 
  C_B (C_A _ _) (C_A _ (C_B _ _)) -> 66 
  C_B (C_B (C_A _ _) _) (C_B (C_A _ _) _) -> 67 
  C_B (C_A _ _) (C_A _ _) -> 68 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_A _ _) (C_B _ _)) -> 69 
  C_B (C_A _ (C_A _ _)) _ -> 70 
  C_B _ (C_B (C_A _ _) (C_B _ _)) -> 71 
  C_B _ _ -> 72 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_B _ _) _) -> 73 
  C_B (C_B (C_B _ _) (C_B _ _)) _ -> 74 
  C_B (C_B (C_A _ _) _) (C_A _ (C_A _ _)) -> 75 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_B _ _) _) -> 76 
  C_B (C_A _ (C_B _ _)) (C_B _ _) -> 77 
  C_B (C_B _ (C_A _ _)) (C_B _ (C_A _ _)) -> 78 
  C_B (C_A _ (C_A _ _)) (C_B _ (C_A _ _)) -> 79 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ _) -> 80 
  C_B (C_B _ _) (C_B _ _) -> 81 
  C_B (C_B _ _) _ -> 82 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_B _ _) _) -> 83 
  C_B (C_B _ _) (C_B _ (C_A _ _)) -> 84 
  C_B (C_B _ _) (C_B (C_B _ _) (C_A _ _)) -> 85 
  C_B _ (C_B (C_A _ _) _) -> 86 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 87 
  C_B (C_B _ (C_A _ _)) (C_B (C_B _ _) (C_B _ _)) -> 88 
  C_B (C_A _ (C_B _ _)) (C_B (C_A _ _) (C_A _ _)) -> 89 
  C_B (C_B (C_A _ _) _) (C_B _ (C_A _ _)) -> 90 
  C_B (C_A _ _) (C_B (C_B _ _) (C_A _ _)) -> 91 
  C_B (C_B _ _) (C_A _ (C_B _ _)) -> 92 
  C_B (C_B _ (C_B _ _)) (C_A _ (C_A _ _)) -> 93 
  C_B (C_B (C_A _ _) _) (C_B (C_A _ _) (C_B _ _)) -> 94 
  C_B (C_B (C_B _ _) _) (C_B (C_A _ _) (C_A _ _)) -> 95 
  C_B _ (C_B (C_B _ _) (C_B _ _)) -> 96 
  C_B (C_A _ (C_A _ _)) (C_A _ _) -> 97 
  C_B (C_A _ (C_B _ _)) (C_B (C_B _ _) _) -> 98 
  C_B (C_B (C_B _ _) (C_A _ _)) _ -> 99 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_A _ (C_B _ _)) -> 100 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_A _ (C_A _ _)) -> 101 
  C_B (C_B (C_A _ _) (C_B _ _)) _ -> 102 
  C_B (C_B _ (C_B _ _)) (C_B (C_A _ _) (C_B _ _)) -> 103 
  C_B (C_B _ (C_B _ _)) (C_A _ _) -> 104 
  C_B (C_B (C_A _ _) _) (C_A _ (C_B _ _)) -> 105 
  C_B (C_A _ (C_B _ _)) (C_B (C_B _ _) (C_B _ _)) -> 106 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_A _ _) (C_A _ _)) -> 107 
  C_B (C_B _ (C_B _ _)) _ -> 108 
  C_B (C_B _ (C_A _ _)) (C_B (C_B _ _) _) -> 109 
  C_B (C_B _ (C_B _ _)) (C_B (C_A _ _) _) -> 110 
  C_B (C_B _ _) (C_A _ (C_A _ _)) -> 111 
  C_B (C_A _ (C_A _ _)) (C_B (C_B _ _) _) -> 112 
  C_B (C_B _ (C_A _ _)) (C_B (C_B _ _) (C_A _ _)) -> 113 
  C_B (C_B (C_A _ _) (C_A _ _)) _ -> 114 
  C_B (C_A _ (C_A _ _)) (C_A _ (C_B _ _)) -> 115 
  C_B (C_B (C_A _ _) _) (C_B (C_B _ _) (C_A _ _)) -> 116 
  C_B (C_B (C_A _ _) _) _ -> 117 
  C_B (C_B _ (C_B _ _)) (C_B (C_A _ _) (C_A _ _)) -> 118 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_A _ _) -> 119 
  C_B (C_A _ (C_A _ _)) (C_B _ (C_B _ _)) -> 120 
  C_B (C_B _ _) (C_B (C_B _ _) (C_B _ _)) -> 121 
  C_B (C_B (C_A _ _) _) (C_B (C_B _ _) _) -> 122 
  C_B (C_B (C_A _ _) _) (C_B _ (C_B _ _)) -> 123 
  C_B (C_A _ (C_A _ _)) (C_B (C_A _ _) (C_B _ _)) -> 124 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_A _ (C_B _ _)) -> 125 
  C_B (C_B (C_A _ _) _) (C_B (C_A _ _) (C_A _ _)) -> 126 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_B _ _) (C_B _ _)) -> 127 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_B _ _) (C_A _ _)) -> 128 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_B _ _) (C_A _ _)) -> 129 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B _ (C_B _ _)) -> 130 
  C_B _ (C_B (C_A _ _) (C_A _ _)) -> 131 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_A _ _) (C_B _ _)) -> 132 
  C_B _ (C_B _ _) -> 133 
  C_B (C_A _ _) (C_A _ (C_A _ _)) -> 134 
