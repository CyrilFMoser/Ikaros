module Program_6 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (((Bool,Int),Bool)) | C_C (B_A b b) (B_A b b) | C_D

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_D) (C_A)) -> 0 
  C_C (C_B _) (C_B (((_,_),_))) -> 1 
  C_C (C_C (C_D) (C_A)) (C_C (C_D) (C_C _ _)) -> 2 
  C_C (C_C (C_A) (C_D)) (C_B (((_,_),_))) -> 3 
  C_C (C_C (C_C _ _) (C_B _)) (C_C _ (C_A)) -> 4 
  C_C (C_C (C_D) (C_B _)) (C_C (C_A) _) -> 5 
  C_C (C_A) (C_C (C_D) (C_D)) -> 6 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_D) _) -> 7 
  C_C (C_C (C_D) (C_B _)) (C_C (C_D) (C_A)) -> 8 
  C_C (C_C (C_B _) _) (C_C (C_C _ _) _) -> 9 
  C_C (C_C _ (C_C _ _)) (C_B _) -> 10 
  C_C (C_A) (C_C (C_B _) (C_A)) -> 11 
  C_C (C_C (C_D) (C_C _ _)) (C_C _ (C_D)) -> 12 
  C_C (C_C (C_A) (C_B _)) (C_C (C_D) (C_C _ _)) -> 13 
  C_C (C_C (C_C _ _) (C_C _ _)) _ -> 14 
  C_C (C_C (C_C _ _) (C_A)) (C_C _ (C_D)) -> 15 
  C_C (C_C _ (C_A)) (C_C (C_B _) (C_D)) -> 16 
  C_C (C_C (C_A) (C_C _ _)) (C_A) -> 17 
  C_C (C_C (C_D) (C_B _)) (C_C _ _) -> 18 
  C_C (C_C (C_A) _) (C_C (C_A) _) -> 19 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_C _ _) (C_C _ _)) -> 20 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_D) (C_C _ _)) -> 21 
  C_C (C_A) (C_C _ (C_B _)) -> 22 
  C_C (C_C _ (C_A)) (C_C (C_A) (C_D)) -> 23 
  C_C (C_D) (C_C (C_B _) (C_B _)) -> 24 
  C_C (C_C (C_A) _) (C_C (C_A) (C_B _)) -> 25 
  C_C (C_C (C_D) (C_D)) (C_C (C_B _) (C_C _ _)) -> 26 
  C_C (C_C _ (C_B _)) (C_C (C_B _) _) -> 27 
  C_C (C_C _ (C_D)) (C_C (C_A) (C_C _ _)) -> 28 
  C_C (C_C (C_D) (C_D)) (C_C _ _) -> 29 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_C _ _) _) -> 30 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_D) (C_D)) -> 31 
  C_C (C_C (C_C _ _) _) (C_C (C_B _) (C_D)) -> 32 
  C_C (C_C _ (C_C _ _)) (C_C (C_D) (C_A)) -> 33 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) (C_A)) -> 34 
  C_C (C_B (((_,_),_))) (C_C (C_D) (C_D)) -> 35 
  C_C (C_C _ (C_D)) (C_C _ (C_C _ _)) -> 36 
  C_C (C_C (C_A) _) (C_A) -> 37 
  C_C (C_C (C_A) (C_B _)) (C_C _ (C_A)) -> 38 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) _) -> 39 
  C_C (C_C (C_D) (C_B _)) (C_C (C_B _) (C_B _)) -> 40 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_A)) -> 41 
  C_C (C_C (C_D) (C_A)) (C_B (((_,_),_))) -> 42 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) (C_B _)) -> 43 
  C_C (C_C _ (C_B _)) (C_C _ (C_C _ _)) -> 44 
  C_C (C_C (C_A) _) (C_D) -> 45 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_A) (C_C _ _)) -> 46 
  C_C (C_C _ (C_D)) (C_A) -> 47 
  C_C (C_A) (C_B (((_,_),_))) -> 48 
  C_C (C_C _ (C_B _)) (C_C (C_A) (C_A)) -> 49 
  C_C (C_C (C_A) _) _ -> 50 
  C_C (C_C _ _) (C_C (C_B _) _) -> 51 
  C_C (C_C (C_A) (C_A)) (C_C (C_C _ _) _) -> 52 
  C_C (C_C (C_A) (C_B _)) (C_C (C_B _) _) -> 53 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_B _) (C_C _ _)) -> 54 
  C_C (C_C (C_D) (C_B _)) (C_C (C_B _) _) -> 55 
  C_C (C_C (C_A) (C_B _)) (C_C (C_C _ _) (C_D)) -> 56 
  C_C _ (C_C (C_B _) _) -> 57 
  C_C (C_C _ (C_A)) (C_A) -> 58 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) (C_D)) -> 59 
  C_C (C_C (C_D) (C_A)) (C_C _ (C_D)) -> 60 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_D)) -> 61 
  C_C (C_C _ _) (C_C (C_B _) (C_A)) -> 62 
  C_C _ (C_C (C_B _) (C_A)) -> 63 
  C_C (C_C (C_C _ _) (C_B _)) _ -> 64 
  C_C _ (C_C _ (C_D)) -> 65 
  C_C (C_C (C_A) (C_B _)) (C_C (C_A) (C_B _)) -> 66 
  C_C (C_C (C_A) (C_D)) (C_C (C_B _) (C_C _ _)) -> 67 
  C_C (C_C (C_B _) (C_A)) (C_C (C_D) (C_C _ _)) -> 68 
  C_C (C_C _ (C_D)) (C_C (C_B _) (C_A)) -> 69 
  C_C (C_C (C_A) (C_D)) (C_A) -> 70 
  C_C (C_D) (C_C (C_A) (C_D)) -> 71 
  C_C (C_C (C_C _ _) (C_B _)) (C_C _ (C_D)) -> 72 
  C_C (C_C (C_A) (C_A)) (C_C (C_C _ _) (C_D)) -> 73 
  C_C (C_C _ (C_A)) (C_C (C_A) (C_B _)) -> 74 
  C_C (C_C (C_A) (C_B _)) (C_C (C_A) (C_C _ _)) -> 75 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_D) (C_A)) -> 76 
  C_C (C_B _) (C_C (C_C _ _) (C_B _)) -> 77 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) (C_A)) -> 78 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_C _ _) (C_D)) -> 79 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_D) -> 80 
  C_C (C_A) (C_C (C_C _ _) (C_B _)) -> 81 
  C_C (C_C (C_D) _) (C_C (C_C _ _) (C_B _)) -> 82 
  C_C (C_C (C_C _ _) _) (C_C (C_A) (C_B _)) -> 83 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_B _) (C_C _ _)) -> 84 
  C_C (C_C (C_B _) (C_D)) (C_C (C_D) _) -> 85 
  C_C (C_B _) (C_C (C_A) (C_B _)) -> 86 
  C_C (C_C (C_B _) (C_D)) (C_C (C_A) (C_D)) -> 87 
  C_C (C_B (((_,_),_))) (C_C (C_B _) (C_D)) -> 88 
  C_C (C_C (C_D) _) (C_C (C_D) _) -> 89 
  C_C (C_C _ (C_D)) (C_C _ _) -> 90 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_C _ _) (C_A)) -> 91 
  C_C (C_C _ (C_B _)) (C_C _ _) -> 92 
  C_C (C_C (C_A) (C_B _)) (C_B (((_,_),_))) -> 93 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) (C_D)) -> 94 
  C_C (C_C (C_B _) _) (C_C (C_D) (C_A)) -> 95 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_B _) (C_A)) -> 96 
  C_C (C_C _ (C_A)) (C_C (C_C _ _) _) -> 97 
  C_C (C_C (C_A) (C_D)) (C_C (C_C _ _) (C_B _)) -> 98 
  C_C (C_B _) (C_A) -> 99 
  C_C (C_C (C_B _) (C_A)) (C_D) -> 100 
  C_C (C_C (C_A) (C_A)) (C_C (C_A) _) -> 101 
  C_C (C_C (C_A) (C_A)) (C_C (C_A) (C_A)) -> 102 
  C_C (C_C (C_A) _) (C_C (C_D) (C_C _ _)) -> 103 
  C_C (C_C (C_D) (C_B _)) (C_C _ (C_C _ _)) -> 104 
  C_C (C_C (C_B _) (C_C _ _)) (C_C _ (C_B _)) -> 105 
  C_C (C_C _ _) (C_C (C_D) (C_A)) -> 106 
  C_C (C_C (C_A) (C_A)) (C_C (C_A) (C_D)) -> 107 
  C_C (C_C (C_A) (C_B _)) (C_C (C_A) _) -> 108 
  C_C (C_C (C_A) (C_A)) (C_C (C_D) (C_D)) -> 109 
  C_C (C_C _ (C_D)) (C_C (C_C _ _) (C_C _ _)) -> 110 
  C_C (C_C (C_B _) _) (C_C (C_A) _) -> 111 
  C_C (C_A) (C_A) -> 112 
  C_C (C_C (C_A) (C_B _)) (C_C (C_D) (C_B _)) -> 113 
  C_C (C_C (C_D) (C_D)) (C_C _ (C_C _ _)) -> 114 
  C_C (C_A) (C_C (C_D) (C_C _ _)) -> 115 
  C_C (C_D) (C_C (C_B _) (C_C _ _)) -> 116 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_D) (C_C _ _)) -> 117 
  C_C (C_C (C_A) (C_C _ _)) (C_C _ (C_C _ _)) -> 118 
  C_C (C_C (C_C _ _) _) (C_C (C_A) _) -> 119 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_D) (C_D)) -> 120 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_D) (C_B _)) -> 121 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_C _ _)) -> 122 
  C_C (C_B (((_,_),_))) (C_C (C_A) (C_B _)) -> 123 
  C_C (C_C _ _) (C_C (C_D) _) -> 124 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_C _ _) (C_B _)) -> 125 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) _) -> 126 
  C_C (C_C _ _) _ -> 127 
  C_C (C_C (C_A) _) (C_C (C_C _ _) (C_D)) -> 128 
  C_C (C_D) (C_C (C_D) (C_B _)) -> 129 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_D) (C_A)) -> 130 
  C_C (C_C (C_D) (C_D)) (C_C (C_A) (C_D)) -> 131 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_A) (C_D)) -> 132 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_B _) _) -> 133 
  C_C (C_C (C_B _) (C_D)) (C_C _ (C_B _)) -> 134 
  C_C (C_C (C_B _) (C_C _ _)) (C_C _ (C_C _ _)) -> 135 
  C_C (C_C (C_D) (C_A)) (C_C (C_C _ _) (C_B _)) -> 136 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_D) (C_D)) -> 137 
  C_C (C_C (C_B _) (C_A)) (C_C (C_B _) (C_C _ _)) -> 138 
  C_C (C_C (C_A) (C_A)) (C_C (C_D) (C_A)) -> 139 
  C_C (C_C (C_B _) (C_C _ _)) (C_C _ _) -> 140 
  C_C (C_A) _ -> 141 
  C_C (C_B _) (C_C (C_D) (C_A)) -> 142 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_C _ _) _) -> 143 
  C_C (C_C (C_D) _) (C_C (C_C _ _) (C_C _ _)) -> 144 
  C_C (C_C (C_B _) (C_A)) _ -> 145 
  C_C (C_C (C_B _) _) (C_C (C_D) (C_D)) -> 146 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_D) (C_B _)) -> 147 
  C_C (C_C _ (C_D)) (C_C (C_C _ _) (C_D)) -> 148 
  C_C (C_C (C_A) (C_D)) (C_C (C_A) (C_D)) -> 149 
