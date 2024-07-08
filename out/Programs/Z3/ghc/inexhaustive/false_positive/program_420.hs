module Program_12 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B (((Int,Int),B_A)) | C_C B_A Char

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (((_,_),C_A (C_C _ _) _)) -> 0 
  C_B (((_,_),C_A (C_B _) _)) -> 1 
  C_B (((_,_),C_C (C_A _ _) _)) -> 2 
  C_B (((_,_),C_A _ _)) -> 3 
  C_B (((_,_),C_B ((_,_)))) -> 4 
  C_B _ -> 5 
  C_A (C_A (C_C _ _) (C_B _)) (C_C (C_C _ _) _) -> 6 
  C_A (C_C (C_A _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 7 
  C_A (C_C _ _) (C_B (((_,_),C_C _ _))) -> 8 
  C_A (C_A _ (C_A _ _)) _ -> 9 
  C_A (C_A (C_B _) _) (C_A (C_B _) (C_C _ _)) -> 10 
  C_A (C_B _) (C_A (C_C _ _) _) -> 11 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_A _ _) (C_C _ _)) -> 12 
  C_A (C_C (C_A _ _) _) (C_B (((_,_),C_A _ _))) -> 13 
  C_A (C_A _ _) (C_C (C_B _) _) -> 14 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_B (((_,_),C_A _ _))) -> 15 
  C_A (C_A _ (C_B _)) (C_A (C_A _ _) (C_C _ _)) -> 16 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_B _) (C_B _)) -> 17 
  C_A (C_A _ (C_B _)) _ -> 18 
  C_A (C_A (C_A _ _) (C_B _)) (C_A _ _) -> 19 
  C_A (C_A _ (C_B _)) (C_C (C_C _ _) _) -> 20 
  C_A (C_A _ (C_A _ _)) (C_B (((_,_),C_B _))) -> 21 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_B _) (C_A _ _)) -> 22 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 23 
  C_A (C_C (C_B _) _) (C_C (C_A _ _) _) -> 24 
  C_A (C_A _ _) (C_C (C_A _ _) _) -> 25 
  C_A (C_A _ (C_A _ _)) (C_C (C_C _ _) _) -> 26 
  C_A (C_A (C_B _) _) (C_A (C_B _) _) -> 27 
  C_A (C_B (((_,_),C_B _))) (C_A (C_B _) (C_C _ _)) -> 28 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A _ (C_A _ _)) -> 29 
  C_A (C_A _ _) (C_B (((_,_),C_C _ _))) -> 30 
  C_A (C_C (C_C _ _) _) (C_A (C_B _) (C_A _ _)) -> 31 
  C_A (C_B (((_,_),C_B _))) (C_A _ (C_C _ _)) -> 32 
  C_A (C_A (C_C _ _) _) (C_B (((_,_),C_A _ _))) -> 33 
  C_A (C_A _ (C_B _)) (C_C (C_A _ _) _) -> 34 
  C_A (C_A (C_B _) (C_B _)) (C_B (((_,_),C_A _ _))) -> 35 
  C_A (C_A (C_A _ _) (C_B _)) (C_C (C_B _) _) -> 36 
  C_A (C_A (C_B _) _) (C_A (C_C _ _) (C_A _ _)) -> 37 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_A _ _) (C_A _ _)) -> 38 
  C_A (C_A _ _) (C_A _ (C_A _ _)) -> 39 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_C _ _) (C_C _ _)) -> 40 
  C_A (C_A _ (C_A _ _)) (C_C _ _) -> 41 
  C_A (C_A (C_C _ _) (C_A _ _)) _ -> 42 
  C_A (C_A (C_B _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 43 
  C_A (C_A (C_A _ _) _) (C_C (C_B _) _) -> 44 
  C_A (C_A _ _) (C_A (C_B _) (C_A _ _)) -> 45 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A _ (C_B _)) -> 46 
  C_A (C_B _) (C_A (C_B _) _) -> 47 
  C_A (C_A (C_B _) (C_B _)) (C_B (((_,_),C_C _ _))) -> 48 
  C_A (C_C (C_C _ _) _) (C_B (((_,_),C_B _))) -> 49 
  C_A (C_B (((_,_),C_C _ _))) (C_A (C_B _) (C_C _ _)) -> 50 
  C_A (C_A (C_C _ _) _) (C_A (C_A _ _) (C_B _)) -> 51 
  C_A _ _ -> 52 
  C_A _ (C_C _ _) -> 53 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_C (C_A _ _) _) -> 54 
  C_A (C_C (C_B _) _) (C_A _ _) -> 55 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_B (((_,_),C_B _))) -> 56 
  C_A (C_C (C_C _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 57 
  C_A (C_A (C_A _ _) _) _ -> 58 
  C_A (C_B _) (C_C (C_A _ _) _) -> 59 
  C_A (C_C (C_C _ _) _) (C_A (C_A _ _) _) -> 60 
  C_A (C_A (C_C _ _) (C_B _)) (C_A _ (C_A _ _)) -> 61 
  C_A (C_B _) (C_A _ (C_A _ _)) -> 62 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _) (C_A _ _)) -> 63 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_A _ _) (C_B _)) -> 64 
  C_A (C_A (C_B _) (C_B _)) (C_A (C_A _ _) _) -> 65 
  C_A _ (C_A (C_A _ _) (C_B _)) -> 66 
  C_A (C_A (C_A _ _) _) (C_A (C_B _) (C_C _ _)) -> 67 
  C_A (C_C (C_C _ _) _) (C_C (C_B _) _) -> 68 
  C_A (C_A _ (C_B _)) (C_B (((_,_),C_C _ _))) -> 69 
  C_A (C_A _ _) (C_A _ (C_B _)) -> 70 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 71 
  C_A (C_A _ _) (C_A (C_B _) (C_B _)) -> 72 
  C_A (C_C (C_A _ _) _) (C_A (C_C _ _) _) -> 73 
  C_A _ (C_B _) -> 74 
  C_A (C_A (C_C _ _) _) (C_C _ _) -> 75 
  C_A (C_C _ _) (C_A _ (C_C _ _)) -> 76 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_A _ _) (C_A _ _)) -> 77 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_B _) (C_B _)) -> 78 
  C_A (C_A (C_B _) _) (C_A _ (C_B _)) -> 79 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A (C_A _ _) _) -> 80 
  C_A (C_B (((_,_),C_B _))) (C_A (C_B _) (C_A _ _)) -> 81 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_C (C_B _) _) -> 82 
  C_A (C_A (C_B _) (C_B _)) (C_A _ (C_C _ _)) -> 83 
  C_A (C_A (C_B _) (C_A _ _)) (C_A (C_B _) (C_A _ _)) -> 84 
  C_A (C_A (C_C _ _) (C_B _)) (C_A (C_B _) (C_A _ _)) -> 85 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A _ (C_A _ _)) -> 86 
  C_A _ (C_A (C_B _) _) -> 87 
  C_A (C_B (((_,_),C_B _))) _ -> 88 
  C_A (C_A (C_B _) (C_B _)) (C_A _ (C_A _ _)) -> 89 
  C_A (C_A (C_B _) (C_C _ _)) (C_B (((_,_),C_C _ _))) -> 90 
  C_A (C_A _ (C_A _ _)) (C_A (C_B _) _) -> 91 
  C_A (C_B (((_,_),C_C _ _))) (C_A (C_C _ _) (C_A _ _)) -> 92 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_B (((_,_),C_C _ _))) -> 93 
  C_A (C_C (C_B _) _) (C_C _ _) -> 94 
  C_A (C_A (C_B _) (C_C _ _)) (C_A _ (C_B _)) -> 95 
  C_A (C_A (C_C _ _) _) (C_C (C_A _ _) _) -> 96 
  C_A (C_A _ (C_B _)) (C_A _ (C_A _ _)) -> 97 
  C_A (C_B _) (C_C (C_B _) _) -> 98 
  C_A (C_A _ (C_B _)) (C_C (C_B _) _) -> 99 
  C_A (C_A _ (C_B _)) (C_A (C_B _) _) -> 100 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_C _ _) -> 101 
  C_A (C_A (C_B _) (C_A _ _)) (C_B _) -> 102 
  C_A (C_B (((_,_),C_C _ _))) (C_A _ (C_A _ _)) -> 103 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_C _ _) _) -> 104 
  C_A (C_A (C_B _) (C_A _ _)) (C_B (((_,_),C_A _ _))) -> 105 
  C_A (C_A _ (C_C _ _)) (C_A (C_B _) (C_C _ _)) -> 106 
  C_A (C_B (((_,_),C_B _))) (C_C _ _) -> 107 
  C_A (C_A (C_C _ _) _) (C_A (C_B _) (C_A _ _)) -> 108 
  C_A (C_A (C_B _) (C_C _ _)) (C_B (((_,_),C_B _))) -> 109 
  C_A (C_A _ (C_C _ _)) _ -> 110 
  C_A (C_A _ (C_C _ _)) (C_A (C_C _ _) (C_B _)) -> 111 
  C_A (C_B (((_,_),C_C _ _))) (C_B _) -> 112 
  C_A (C_A (C_B _) (C_A _ _)) (C_B (((_,_),C_B _))) -> 113 
  C_A (C_A (C_A _ _) _) (C_A (C_C _ _) (C_C _ _)) -> 114 
  C_A (C_A _ (C_C _ _)) (C_A (C_C _ _) (C_C _ _)) -> 115 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_C _ _) -> 116 
  C_A (C_B (((_,_),C_C _ _))) (C_B (((_,_),C_B _))) -> 117 
  C_A (C_A _ _) (C_A (C_A _ _) (C_C _ _)) -> 118 
  C_A (C_B (((_,_),C_B _))) (C_A _ _) -> 119 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_B _) -> 120 
  C_A (C_A (C_A _ _) _) (C_C _ _) -> 121 
  C_A (C_B (((_,_),C_B _))) (C_C (C_A _ _) _) -> 122 
  C_A (C_A (C_C _ _) _) (C_A (C_C _ _) (C_A _ _)) -> 123 
  C_A (C_A (C_B _) (C_C _ _)) (C_A (C_C _ _) (C_B _)) -> 124 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_B _)) -> 125 
  C_A (C_A (C_B _) (C_A _ _)) (C_A (C_C _ _) (C_C _ _)) -> 126 
  C_A (C_A _ (C_C _ _)) (C_B _) -> 127 
  C_A (C_A (C_B _) _) (C_A (C_A _ _) (C_A _ _)) -> 128 
  C_A (C_A (C_A _ _) _) (C_C (C_A _ _) _) -> 129 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 130 
  C_A (C_C (C_C _ _) _) (C_C (C_A _ _) _) -> 131 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_A (C_C _ _) (C_A _ _)) -> 132 
  C_A (C_B _) (C_C (C_C _ _) _) -> 133 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_A _ _) _) -> 134 
  C_A (C_A _ (C_C _ _)) (C_B (((_,_),C_B _))) -> 135 
  C_A (C_A _ (C_C _ _)) (C_B (((_,_),C_C _ _))) -> 136 
  C_A (C_C (C_C _ _) _) (C_A (C_C _ _) _) -> 137 
  C_A (C_C (C_B _) _) (C_A (C_B _) (C_C _ _)) -> 138 
  C_A (C_A (C_A _ _) (C_C _ _)) _ -> 139 
  C_A (C_A (C_B _) _) (C_C (C_C _ _) _) -> 140 
  C_A (C_A (C_A _ _) (C_B _)) (C_C (C_C _ _) _) -> 141 
  C_A (C_C _ _) (C_B (((_,_),C_A _ _))) -> 142 
  C_A (C_A (C_C _ _) _) (C_B _) -> 143 
  C_A (C_C (C_C _ _) _) (C_A (C_B _) (C_C _ _)) -> 144 
  C_A (C_B (((_,_),C_B _))) (C_A (C_C _ _) (C_C _ _)) -> 145 
  C_A (C_A (C_A _ _) (C_C _ _)) (C_C (C_B _) _) -> 146 
  C_A (C_B (((_,_),C_A _ _))) (C_A (C_B _) (C_C _ _)) -> 147 
  C_A (C_C (C_B _) _) (C_C (C_B _) _) -> 148 
  C_A (C_C _ _) (C_A (C_C _ _) _) -> 149 
  C_A (C_A _ (C_A _ _)) (C_A (C_C _ _) (C_B _)) -> 150 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_B _)) -> 151 
  C_A (C_A (C_A _ _) (C_B _)) (C_A (C_C _ _) (C_C _ _)) -> 152 
  C_A (C_B (((_,_),C_C _ _))) (C_A (C_B _) (C_A _ _)) -> 153 
  C_A (C_A (C_C _ _) (C_A _ _)) (C_A (C_C _ _) (C_A _ _)) -> 154 
  C_A (C_A (C_B _) (C_A _ _)) (C_A (C_B _) (C_B _)) -> 155 
  C_A (C_A _ _) (C_A (C_A _ _) (C_B _)) -> 156 
  C_A (C_A _ (C_B _)) (C_C _ _) -> 157 
  C_A (C_A (C_B _) (C_B _)) (C_A (C_C _ _) _) -> 158 
  C_A (C_A (C_A _ _) (C_B _)) (C_B (((_,_),C_B _))) -> 159 
  C_A (C_A (C_C _ _) (C_B _)) (C_A (C_C _ _) (C_B _)) -> 160 
  C_A (C_A (C_C _ _) (C_C _ _)) (C_B (((_,_),C_B _))) -> 161 
  C_A (C_C (C_A _ _) _) (C_B (((_,_),C_B _))) -> 162 
  C_A (C_C (C_B _) _) (C_A (C_B _) _) -> 163 
  C_A (C_B (((_,_),C_C _ _))) (C_A _ _) -> 164 
  C_A (C_B (((_,_),C_B _))) (C_A _ (C_A _ _)) -> 165 
  C_A (C_A (C_C _ _) (C_B _)) (C_A (C_C _ _) (C_C _ _)) -> 166 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) _) -> 167 
  C_A (C_B (((_,_),C_B _))) (C_C (C_C _ _) _) -> 168 
  C_A (C_A (C_B _) (C_B _)) (C_C (C_A _ _) _) -> 169 
