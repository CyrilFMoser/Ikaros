module Program_12 () where 

main = print $ show v_b
data B_B b c = C_D | C_E (B_A b) (B_A b) | C_F
data B_A a = C_A (B_B a a) (B_A a) | C_B (B_A a) (((Char,Char),Int)) | C_C

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_A _ (C_C)) (C_A _ (C_C)) -> 0 
  C_E (C_B (C_A _ _) _) (C_B _ (((_,_),_))) -> 1 
  C_E (C_A _ (C_C)) (C_A (C_E _ _) (C_A _ _)) -> 2 
  C_E (C_A (C_F) (C_A _ _)) (C_A _ (C_B _ _)) -> 3 
  C_E (C_A (C_D) (C_A _ _)) (C_A (C_E _ _) (C_C)) -> 4 
  C_E (C_B (C_C) _) (C_A (C_E _ _) _) -> 5 
  C_E (C_B (C_C) (((_,_),_))) (C_A (C_F) (C_C)) -> 6 
  C_E _ (C_A _ (C_C)) -> 7 
  C_E (C_A (C_F) (C_C)) (C_B _ (((_,_),_))) -> 8 
  C_E (C_A (C_D) _) (C_A (C_E _ _) _) -> 9 
  C_E (C_A (C_F) (C_A _ _)) (C_A (C_D) (C_B _ _)) -> 10 
  C_E (C_A (C_F) _) (C_A (C_E _ _) (C_C)) -> 11 
  C_E (C_B (C_B _ _) _) (C_A (C_F) (C_C)) -> 12 
  C_E (C_A _ (C_C)) (C_A (C_D) (C_C)) -> 13 
  C_E (C_A (C_D) (C_C)) (C_A (C_E _ _) (C_A _ _)) -> 14 
  C_E (C_A (C_F) (C_C)) (C_A (C_D) (C_A _ _)) -> 15 
  C_E (C_A (C_D) _) (C_A (C_F) (C_C)) -> 16 
  C_E (C_A (C_F) (C_B _ _)) (C_B _ (((_,_),_))) -> 17 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_A _ (C_A _ _)) -> 18 
  C_E (C_A (C_F) (C_A _ _)) (C_B (C_A _ _) (((_,_),_))) -> 19 
  C_E (C_A (C_F) (C_C)) (C_A (C_D) _) -> 20 
  C_E (C_A (C_F) _) (C_B (C_A _ _) (((_,_),_))) -> 21 
  C_E (C_B _ _) (C_A (C_D) (C_B _ _)) -> 22 
  C_E (C_A (C_D) (C_A _ _)) (C_B (C_B _ _) (((_,_),_))) -> 23 
  C_E (C_B _ _) (C_B (C_C) (((_,_),_))) -> 24 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_E _ _) (C_B _ _)) -> 25 
  C_E (C_C) (C_B (C_A _ _) _) -> 26 
  C_E _ (C_A (C_D) (C_B _ _)) -> 27 
  C_E (C_B (C_A _ _) _) _ -> 28 
  C_E (C_A (C_F) (C_C)) (C_A (C_F) (C_A _ _)) -> 29 
  C_E (C_A _ (C_C)) (C_A (C_D) _) -> 30 
  C_E (C_A (C_F) _) (C_A (C_F) _) -> 31 
  C_E (C_B _ _) (C_A _ (C_C)) -> 32 
  C_E (C_A (C_D) (C_A _ _)) (C_A _ (C_A _ _)) -> 33 
  C_E (C_A (C_F) _) (C_A _ (C_B _ _)) -> 34 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_A (C_F) (C_B _ _)) -> 35 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_A (C_E _ _) (C_A _ _)) -> 36 
  C_E (C_A (C_D) _) (C_B (C_B _ _) (((_,_),_))) -> 37 
  C_E (C_A (C_D) (C_B _ _)) (C_B _ (((_,_),_))) -> 38 
  C_E (C_A (C_F) _) (C_A (C_D) _) -> 39 
  C_E (C_A (C_F) (C_A _ _)) _ -> 40 
  C_E (C_A (C_E _ _) (C_C)) (C_B (C_C) _) -> 41 
  C_E (C_A _ (C_C)) (C_B _ _) -> 42 
  C_E (C_A (C_F) (C_B _ _)) (C_B (C_B _ _) _) -> 43 
  C_E (C_A (C_D) (C_B _ _)) (C_B _ _) -> 44 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A (C_E _ _) (C_B _ _)) -> 45 
  C_E (C_A (C_D) (C_A _ _)) (C_B (C_A _ _) _) -> 46 
  C_E _ _ -> 47 
  C_E (C_A (C_F) (C_B _ _)) (C_B (C_B _ _) (((_,_),_))) -> 48 
  C_E (C_B (C_B _ _) _) (C_A _ (C_C)) -> 49 
  C_E (C_A (C_E _ _) _) (C_A (C_F) (C_B _ _)) -> 50 
  C_E (C_A (C_D) (C_C)) (C_A _ (C_C)) -> 51 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_B (C_B _ _) (((_,_),_))) -> 52 
  C_E (C_A _ (C_A _ _)) (C_B (C_A _ _) _) -> 53 
  C_E (C_A (C_E _ _) _) (C_A (C_D) (C_C)) -> 54 
  C_E (C_A (C_D) _) (C_A _ (C_B _ _)) -> 55 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_B (C_A _ _) _) -> 56 
  C_E (C_A (C_E _ _) (C_C)) (C_A (C_D) (C_B _ _)) -> 57 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_A _ (C_A _ _)) -> 58 
  C_E (C_A (C_D) (C_C)) (C_B (C_B _ _) (((_,_),_))) -> 59 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A _ (C_B _ _)) -> 60 
  C_E (C_A _ (C_B _ _)) (C_A _ (C_C)) -> 61 
  C_E (C_B _ (((_,_),_))) (C_A (C_F) (C_A _ _)) -> 62 
  C_E (C_B (C_A _ _) _) (C_B _ _) -> 63 
  C_E (C_A (C_F) _) (C_A (C_E _ _) _) -> 64 
  C_E (C_A (C_D) _) (C_C) -> 65 
  C_E _ (C_A (C_E _ _) (C_C)) -> 66 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_B (C_A _ _) _) -> 67 
  C_E (C_A _ (C_B _ _)) (C_A _ (C_A _ _)) -> 68 
  C_E (C_A _ (C_A _ _)) (C_B (C_B _ _) _) -> 69 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_B _ _) -> 70 
  C_E (C_B (C_A _ _) _) (C_A _ (C_A _ _)) -> 71 
  C_E (C_B _ _) (C_B _ (((_,_),_))) -> 72 
  C_E (C_A _ (C_B _ _)) _ -> 73 
  C_E (C_B (C_C) (((_,_),_))) (C_A (C_D) (C_A _ _)) -> 74 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A (C_D) (C_A _ _)) -> 75 
  C_E (C_A (C_F) (C_A _ _)) (C_B (C_C) (((_,_),_))) -> 76 
  C_E (C_B (C_B _ _) _) (C_B (C_C) _) -> 77 
  C_E (C_B (C_C) (((_,_),_))) (C_A _ (C_A _ _)) -> 78 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_B (C_A _ _) (((_,_),_))) -> 79 
  C_E _ (C_B (C_A _ _) _) -> 80 
  C_E (C_B _ (((_,_),_))) (C_A _ (C_A _ _)) -> 81 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A (C_E _ _) _) -> 82 
  C_E (C_B (C_B _ _) _) (C_B _ _) -> 83 
  C_E (C_A _ (C_A _ _)) (C_A (C_F) (C_C)) -> 84 
  C_E (C_B _ _) (C_A (C_E _ _) (C_A _ _)) -> 85 
  C_E (C_A (C_F) (C_A _ _)) (C_B (C_A _ _) _) -> 86 
  C_E (C_A (C_F) (C_B _ _)) (C_A _ (C_A _ _)) -> 87 
  C_E (C_A (C_D) (C_C)) (C_A _ (C_A _ _)) -> 88 
  C_E (C_B (C_A _ _) _) (C_A _ (C_B _ _)) -> 89 
  C_E _ (C_A _ (C_B _ _)) -> 90 
  C_E (C_A (C_D) _) (C_A (C_E _ _) (C_B _ _)) -> 91 
  C_E (C_A _ (C_C)) (C_A (C_E _ _) (C_C)) -> 92 
  C_E (C_B _ _) (C_A _ (C_A _ _)) -> 93 
  C_E (C_B _ _) (C_A _ (C_B _ _)) -> 94 
  C_E (C_A (C_D) (C_A _ _)) (C_A _ (C_B _ _)) -> 95 
  C_E (C_B _ (((_,_),_))) (C_B (C_C) _) -> 96 
  C_E (C_B (C_C) (((_,_),_))) (C_B (C_A _ _) _) -> 97 
  C_E (C_B _ _) (C_A (C_F) _) -> 98 
  C_E (C_A (C_D) _) (C_A _ (C_C)) -> 99 
  C_E (C_B (C_C) _) (C_A _ _) -> 100 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A (C_F) (C_B _ _)) -> 101 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A _ (C_C)) -> 102 
  C_E (C_A (C_D) (C_A _ _)) (C_A (C_D) _) -> 103 
  C_E (C_B _ _) (C_B (C_C) _) -> 104 
  C_E (C_A _ _) (C_A _ (C_A _ _)) -> 105 
  C_E (C_B (C_B _ _) _) (C_C) -> 106 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A (C_F) (C_A _ _)) -> 107 
  C_E (C_B (C_C) (((_,_),_))) (C_A (C_E _ _) (C_B _ _)) -> 108 
  C_E (C_A (C_D) (C_C)) _ -> 109 
  C_E (C_A (C_F) (C_B _ _)) (C_A _ (C_B _ _)) -> 110 
  C_E (C_B (C_C) (((_,_),_))) (C_A (C_F) (C_B _ _)) -> 111 
  C_E (C_A (C_E _ _) (C_C)) (C_A (C_F) _) -> 112 
  C_E (C_A _ _) (C_A (C_D) _) -> 113 
  C_E (C_A _ (C_B _ _)) (C_A (C_F) (C_A _ _)) -> 114 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_B (C_A _ _) _) -> 115 
  C_E (C_A (C_D) (C_B _ _)) (C_A (C_E _ _) (C_A _ _)) -> 116 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_C) -> 117 
  C_E (C_B (C_C) (((_,_),_))) (C_A _ _) -> 118 
  C_E (C_B (C_C) _) (C_A (C_F) (C_B _ _)) -> 119 
  C_E _ (C_A (C_F) (C_A _ _)) -> 120 
  C_E (C_B (C_B _ _) _) (C_B (C_A _ _) (((_,_),_))) -> 121 
  C_E (C_B (C_A _ _) _) (C_A (C_F) (C_C)) -> 122 
  C_E (C_A (C_D) _) (C_A (C_E _ _) (C_C)) -> 123 
  C_E (C_A _ _) (C_A (C_F) (C_C)) -> 124 
  C_E _ (C_B (C_B _ _) _) -> 125 
  C_E (C_A (C_F) _) (C_A _ (C_C)) -> 126 
  C_E (C_B (C_C) _) (C_A _ (C_A _ _)) -> 127 
  C_E (C_A (C_F) _) (C_A (C_F) (C_A _ _)) -> 128 
  C_E (C_A (C_F) (C_A _ _)) (C_A (C_D) (C_A _ _)) -> 129 
  C_E (C_C) (C_A (C_F) (C_A _ _)) -> 130 
  C_E (C_A (C_D) (C_A _ _)) (C_A (C_F) _) -> 131 
  C_E (C_A (C_E _ _) (C_C)) (C_A (C_E _ _) (C_B _ _)) -> 132 
  C_E (C_A (C_E _ _) _) (C_B (C_C) (((_,_),_))) -> 133 
  C_E (C_A (C_E _ _) (C_C)) (C_B (C_A _ _) _) -> 134 
  C_E (C_A (C_F) _) (C_A (C_E _ _) (C_B _ _)) -> 135 
  C_E (C_A (C_F) (C_C)) (C_A (C_D) (C_C)) -> 136 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_E _ _) (C_C)) -> 137 
  C_E (C_B _ _) (C_A (C_E _ _) (C_B _ _)) -> 138 
  C_E (C_C) (C_B (C_B _ _) (((_,_),_))) -> 139 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_A (C_D) (C_A _ _)) -> 140 
  C_E (C_A (C_D) _) (C_B (C_C) _) -> 141 
  C_E (C_A _ (C_C)) (C_A (C_F) (C_B _ _)) -> 142 
  C_E (C_B _ _) (C_A (C_E _ _) (C_C)) -> 143 
  C_E (C_A (C_D) (C_C)) (C_B (C_C) _) -> 144 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_C) -> 145 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A (C_D) _) -> 146 
  C_E (C_A (C_D) _) (C_A (C_F) _) -> 147 
  C_E (C_A (C_D) (C_B _ _)) (C_B (C_C) _) -> 148 
  C_E (C_A (C_F) (C_B _ _)) (C_B _ _) -> 149 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_F) _) -> 150 
  C_E (C_B (C_A _ _) _) (C_B (C_C) _) -> 151 
