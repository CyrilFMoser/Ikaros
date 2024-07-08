module Program_6 () where 

 main = print $ show v_b
data B_B = C_D Int | C_E (B_C ((Int,Bool)) B_B) B_B | C_F | C_G (B_A ((Char,Char))) | C_H Bool
data B_C b c = C_I | C_J | C_K (B_C b B_B) (B_C c c) | C_L Bool b | C_M
data B_A a = C_A | C_B (((Bool,Int),B_B)) | C_C

v_a :: B_C B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I -> 0 
  C_J -> 1 
  C_K (C_I) (C_I) -> 2 
  C_K (C_I) (C_J) -> 3 
  C_K (C_I) (C_K (C_I) _) -> 4 
  C_K (C_I) (C_K (C_J) _) -> 5 
  C_K (C_I) (C_K (C_K _ _) _) -> 6 
  C_K (C_I) (C_K (C_L _ _) _) -> 7 
  C_K (C_I) (C_K (C_M) _) -> 8 
  C_K (C_I) (C_L _ _) -> 9 
  C_K (C_I) (C_M) -> 10 
  C_K (C_J) (C_I) -> 11 
  C_K (C_J) (C_J) -> 12 
  C_K (C_J) (C_K (C_I) _) -> 13 
  C_K (C_J) (C_K (C_J) _) -> 14 
  C_K (C_J) (C_K (C_K _ _) _) -> 15 
  C_K (C_J) (C_K (C_L _ _) _) -> 16 
  C_K (C_J) (C_K (C_M) _) -> 17 
  C_K (C_J) (C_L _ _) -> 18 
  C_K (C_J) (C_M) -> 19 
  C_K (C_K (C_I) _) (C_I) -> 20 
  C_K (C_K (C_I) _) (C_J) -> 21 
  C_K (C_K (C_I) _) (C_K (C_I) _) -> 22 
  C_K (C_K (C_I) _) (C_K (C_J) _) -> 23 
  C_K (C_K (C_I) _) (C_K (C_K _ _) _) -> 24 
  C_K (C_K (C_I) _) (C_K (C_L _ _) _) -> 25 
  C_K (C_K (C_I) _) (C_K (C_M) _) -> 26 
  C_K (C_K (C_I) _) (C_L _ _) -> 27 
  C_K (C_K (C_I) _) (C_M) -> 28 
  C_K (C_K (C_J) _) (C_I) -> 29 
  C_K (C_K (C_J) _) (C_J) -> 30 
  C_K (C_K (C_J) _) (C_K (C_I) _) -> 31 
  C_K (C_K (C_J) _) (C_K (C_J) _) -> 32 
  C_K (C_K (C_J) _) (C_K (C_K _ _) _) -> 33 
  C_K (C_K (C_J) _) (C_K (C_L _ _) _) -> 34 
  C_K (C_K (C_J) _) (C_K (C_M) _) -> 35 
  C_K (C_K (C_J) _) (C_L _ _) -> 36 
  C_K (C_K (C_J) _) (C_M) -> 37 
  C_K (C_K (C_K _ _) _) (C_I) -> 38 
  C_K (C_K (C_K _ _) _) (C_J) -> 39 
  C_K (C_K (C_K _ _) _) (C_K (C_I) _) -> 40 
  C_K (C_K (C_K _ _) _) (C_K (C_J) _) -> 41 
  C_K (C_K (C_K _ _) _) (C_K (C_K _ _) _) -> 42 
  C_K (C_K (C_K _ _) _) (C_K (C_L _ _) _) -> 43 
  C_K (C_K (C_K _ _) _) (C_K (C_M) _) -> 44 
  C_K (C_K (C_K _ _) _) (C_L _ _) -> 45 
  C_K (C_K (C_K _ _) _) (C_M) -> 46 
  C_K (C_K (C_L _ _) _) (C_I) -> 47 
  C_K (C_K (C_L _ _) _) (C_J) -> 48 
  C_K (C_K (C_L _ _) _) (C_K (C_I) _) -> 49 
  C_K (C_K (C_L _ _) _) (C_K (C_K _ _) _) -> 50 
  C_K (C_K (C_L _ _) _) (C_K (C_L _ _) _) -> 51 
  C_K (C_K (C_L _ _) _) (C_K (C_M) _) -> 52 
  C_K (C_K (C_L _ _) _) (C_L _ _) -> 53 
  C_K (C_K (C_L _ _) _) (C_M) -> 54 
  C_K (C_K (C_M) _) (C_I) -> 55 
  C_K (C_K (C_M) _) (C_J) -> 56 
  C_K (C_K (C_M) _) (C_K (C_I) _) -> 57 
  C_K (C_K (C_M) _) (C_K (C_J) _) -> 58 
  C_K (C_K (C_M) _) (C_K (C_K _ _) _) -> 59 
  C_K (C_K (C_M) _) (C_K (C_L _ _) _) -> 60 
  C_K (C_K (C_M) _) (C_K (C_M) _) -> 61 
  C_K (C_K (C_M) _) (C_L _ _) -> 62 
  C_K (C_K (C_M) _) (C_M) -> 63 
  C_K (C_L True (C_D _)) (C_I) -> 64 
  C_K (C_L True (C_D _)) (C_J) -> 65 
  C_K (C_L True (C_D _)) (C_K (C_I) _) -> 66 
  C_K (C_L True (C_D _)) (C_K (C_J) _) -> 67 
  C_K (C_L True (C_D _)) (C_K (C_K _ _) _) -> 68 
  C_K (C_L True (C_D _)) (C_K (C_L _ _) _) -> 69 
  C_K (C_L True (C_D _)) (C_K (C_M) _) -> 70 
  C_K (C_L True (C_D _)) (C_L _ _) -> 71 
  C_K (C_L True (C_D _)) (C_M) -> 72 
  C_K (C_L True (C_E _ _)) (C_I) -> 73 
  C_K (C_L True (C_E _ _)) (C_J) -> 74 
  C_K (C_L True (C_E _ _)) (C_K (C_I) _) -> 75 
  C_K (C_L True (C_E _ _)) (C_K (C_J) _) -> 76 
  C_K (C_L True (C_E _ _)) (C_K (C_K _ _) _) -> 77 
  C_K (C_L True (C_E _ _)) (C_K (C_L _ _) _) -> 78 
  C_K (C_L True (C_E _ _)) (C_K (C_M) _) -> 79 
  C_K (C_L True (C_E _ _)) (C_L _ _) -> 80 
  C_K (C_L True (C_E _ _)) (C_M) -> 81 
  C_K (C_L True C_F) (C_I) -> 82 
  C_K (C_L True C_F) (C_J) -> 83 
  C_K (C_L True C_F) (C_K (C_I) _) -> 84 
  C_K (C_L True C_F) (C_K (C_J) _) -> 85 
  C_K (C_L True C_F) (C_K (C_K _ _) _) -> 86 
  C_K (C_L True C_F) (C_K (C_L _ _) _) -> 87 
  C_K (C_L True C_F) (C_K (C_M) _) -> 88 
  C_K (C_L True C_F) (C_L _ _) -> 89 
  C_K (C_L True C_F) (C_M) -> 90 
  C_K (C_L True (C_G _)) (C_I) -> 91 
  C_K (C_L True (C_G _)) (C_J) -> 92 
  C_K (C_L True (C_G _)) (C_K (C_I) _) -> 93 
  C_K (C_L True (C_G _)) (C_K (C_J) _) -> 94 
  C_K (C_L True (C_G _)) (C_K (C_K _ _) _) -> 95 
  C_K (C_L True (C_G _)) (C_K (C_L _ _) _) -> 96 
  C_K (C_L True (C_G _)) (C_K (C_M) _) -> 97 
  C_K (C_L True (C_G _)) (C_L _ _) -> 98 
  C_K (C_L True (C_G _)) (C_M) -> 99 
  C_K (C_L True (C_H _)) (C_I) -> 100 
  C_K (C_L True (C_H _)) (C_J) -> 101 
  C_K (C_L True (C_H _)) (C_K (C_I) _) -> 102 
  C_K (C_L True (C_H _)) (C_K (C_J) _) -> 103 
  C_K (C_L True (C_H _)) (C_K (C_K _ _) _) -> 104 
  C_K (C_L True (C_H _)) (C_K (C_L _ _) _) -> 105 
  C_K (C_L True (C_H _)) (C_K (C_M) _) -> 106 
  C_K (C_L True (C_H _)) (C_L _ _) -> 107 
  C_K (C_L True (C_H _)) (C_M) -> 108 
  C_K (C_L False (C_D _)) (C_I) -> 109 
  C_K (C_L False (C_D _)) (C_J) -> 110 
  C_K (C_L False (C_D _)) (C_K (C_I) _) -> 111 
  C_K (C_L False (C_D _)) (C_K (C_J) _) -> 112 
  C_K (C_L False (C_D _)) (C_K (C_K _ _) _) -> 113 
  C_K (C_L False (C_D _)) (C_K (C_L _ _) _) -> 114 
  C_K (C_L False (C_D _)) (C_K (C_M) _) -> 115 
  C_K (C_L False (C_D _)) (C_L _ _) -> 116 
  C_K (C_L False (C_D _)) (C_M) -> 117 
  C_K (C_L False (C_E _ _)) (C_I) -> 118 
  C_K (C_L False (C_E _ _)) (C_J) -> 119 
  C_K (C_L False (C_E _ _)) (C_K (C_I) _) -> 120 
  C_K (C_L False (C_E _ _)) (C_K (C_J) _) -> 121 
  C_K (C_L False (C_E _ _)) (C_K (C_K _ _) _) -> 122 
  C_K (C_L False (C_E _ _)) (C_K (C_L _ _) _) -> 123 
  C_K (C_L False (C_E _ _)) (C_K (C_M) _) -> 124 
  C_K (C_L False (C_E _ _)) (C_L _ _) -> 125 
  C_K (C_L False (C_E _ _)) (C_M) -> 126 
  C_K (C_L False C_F) (C_I) -> 127 
  C_K (C_L False C_F) (C_J) -> 128 
  C_K (C_L False C_F) (C_K (C_I) _) -> 129 
  C_K (C_L False C_F) (C_K (C_J) _) -> 130 
  C_K (C_L False C_F) (C_K (C_K _ _) _) -> 131 
  C_K (C_L False C_F) (C_K (C_L _ _) _) -> 132 
  C_K (C_L False C_F) (C_K (C_M) _) -> 133 
  C_K (C_L False C_F) (C_L _ _) -> 134 
  C_K (C_L False C_F) (C_M) -> 135 
  C_K (C_L False (C_G _)) (C_I) -> 136 
  C_K (C_L False (C_G _)) (C_J) -> 137 
  C_K (C_L False (C_G _)) (C_K (C_I) _) -> 138 
  C_K (C_L False (C_G _)) (C_K (C_J) _) -> 139 
  C_K (C_L False (C_G _)) (C_K (C_K _ _) _) -> 140 
  C_K (C_L False (C_G _)) (C_K (C_L _ _) _) -> 141 
  C_K (C_L False (C_G _)) (C_K (C_M) _) -> 142 
  C_K (C_L False (C_G _)) (C_L _ _) -> 143 
  C_K (C_L False (C_G _)) (C_M) -> 144 
  C_K (C_L False (C_H _)) (C_I) -> 145 
  C_K (C_L False (C_H _)) (C_J) -> 146 
  C_K (C_L False (C_H _)) (C_K (C_I) _) -> 147 
  C_K (C_L False (C_H _)) (C_K (C_J) _) -> 148 
  C_K (C_L False (C_H _)) (C_K (C_K _ _) _) -> 149 
  C_K (C_L False (C_H _)) (C_K (C_L _ _) _) -> 150 
  C_K (C_L False (C_H _)) (C_K (C_M) _) -> 151 
  C_K (C_L False (C_H _)) (C_L _ _) -> 152 
  C_K (C_L False (C_H _)) (C_M) -> 153 
  C_K (C_M) (C_I) -> 154 
  C_K (C_M) (C_J) -> 155 
  C_K (C_M) (C_K (C_I) _) -> 156 
  C_K (C_M) (C_K (C_J) _) -> 157 
  C_K (C_M) (C_K (C_K _ _) _) -> 158 
  C_K (C_M) (C_K (C_L _ _) _) -> 159 
  C_K (C_M) (C_K (C_M) _) -> 160 
  C_K (C_M) (C_L _ _) -> 161 
  C_K (C_M) (C_M) -> 162 
  C_L _ _ -> 163 
  C_M -> 164 
