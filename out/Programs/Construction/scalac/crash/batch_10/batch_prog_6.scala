package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D], b: Byte, c: T_A[D, D]) extends T_A[D, C]
case class CC_B[F, E, G](a: Char, b: CC_A[E, G]) extends T_A[F, E]
case class CC_C[I, H](a: T_A[I, H], b: T_A[I, Byte], c: T_A[H, I]) extends T_A[I, H]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _)) => 1 
  case CC_A(_, _, CC_C(CC_A(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_C(CC_A(_, _, _), _, CC_B(_, _))) => 3 
  case CC_A(_, _, CC_C(CC_A(_, _, _), _, CC_C(_, _, _))) => 4 
  case CC_A(_, _, CC_C(CC_B(_, _), _, CC_A(_, _, _))) => 5 
  case CC_A(_, _, CC_C(CC_B(_, _), _, CC_B(_, _))) => 6 
  case CC_A(_, _, CC_C(CC_B(_, _), _, CC_C(_, _, _))) => 7 
  case CC_A(_, _, CC_C(CC_C(_, _, _), _, CC_A(_, _, _))) => 8 
  case CC_A(_, _, CC_C(CC_C(_, _, _), _, CC_B(_, _))) => 9 
  case CC_A(_, _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 10 
  case CC_B(_, _) => 11 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 12 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 13 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, CC_C(_, _, _))) => 14 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 15 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_B(_, _), _, CC_B(_, _))) => 16 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_B(_, _), _, CC_C(_, _, _))) => 17 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_C(_, _, _), _, CC_A(_, _, _))) => 18 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_C(_, _, _), _, CC_B(_, _))) => 19 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_A(CC_C(_, _, _), _, CC_C(_, _, _))) => 20 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_B(_, _)) => 21 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 22 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 23 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 24 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 25 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_B(_, _))) => 26 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 27 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 28 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 29 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 30 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _))) => 31 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_A(_, _, _))) => 32 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_A(_, _, _))) => 33 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_B(_, _))) => 34 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _))) => 35 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_B(_, _))) => 36 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _))) => 37 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_C(_, _, _))) => 38 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_C(_, _, _))) => 39 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 40 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 41 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 42 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 43 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_B(_, _))) => 44 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 45 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 46 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 47 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 48 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 49 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 50 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_A(_, _, _), _, CC_C(_, _, _))) => 51 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 52 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_B(_, _), _, CC_B(_, _))) => 53 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_B(_, _), _, CC_C(_, _, _))) => 54 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_C(_, _, _), _, CC_A(_, _, _))) => 55 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_C(_, _, _), _, CC_B(_, _))) => 56 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_A(CC_C(_, _, _), _, CC_C(_, _, _))) => 57 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_B(_, _)) => 58 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 59 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 60 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 61 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 62 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_B(_, _))) => 63 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 64 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 65 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 66 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 67 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _))) => 68 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_A(_, _, _))) => 69 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_A(_, _, _))) => 70 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_B(_, _))) => 71 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _))) => 72 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_B(_, _))) => 73 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _))) => 74 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_C(_, _, _))) => 75 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_C(_, _, _))) => 76 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 77 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 78 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 79 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 80 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_B(_, _))) => 81 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 82 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 83 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 84 
  case CC_C(_, CC_A(_, _, CC_B(_, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 85 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 86 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 87 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_A(_, _, _), _, CC_C(_, _, _))) => 88 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 89 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_B(_, _), _, CC_B(_, _))) => 90 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_B(_, _), _, CC_C(_, _, _))) => 91 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_C(_, _, _), _, CC_A(_, _, _))) => 92 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_C(_, _, _), _, CC_B(_, _))) => 93 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_A(CC_C(_, _, _), _, CC_C(_, _, _))) => 94 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_B(_, _)) => 95 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 96 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 97 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 98 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 99 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_B(_, _))) => 100 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 101 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 102 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 103 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 104 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _))) => 105 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_A(_, _, _))) => 106 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_A(_, _, _))) => 107 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_B(_, _))) => 108 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _))) => 109 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_B(_, _))) => 110 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _))) => 111 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_B(_, _), CC_C(_, _, _))) => 112 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_B(_, _), CC_C(_, _, _), CC_C(_, _, _))) => 113 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 114 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 115 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 116 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 117 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_B(_, _))) => 118 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 119 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 120 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 121 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 122 
  case CC_C(_, CC_B(_, _), CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 123 
  case CC_C(_, CC_B(_, _), CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 124 
  case CC_C(_, CC_B(_, _), CC_A(CC_A(_, _, _), _, CC_C(_, _, _))) => 125 
  case CC_C(_, CC_B(_, _), CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 126 
  case CC_C(_, CC_B(_, _), CC_A(CC_B(_, _), _, CC_B(_, _))) => 127 
  case CC_C(_, CC_B(_, _), CC_A(CC_B(_, _), _, CC_C(_, _, _))) => 128 
  case CC_C(_, CC_B(_, _), CC_A(CC_C(_, _, _), _, CC_A(_, _, _))) => 129 
  case CC_C(_, CC_B(_, _), CC_A(CC_C(_, _, _), _, CC_B(_, _))) => 130 
  case CC_C(_, CC_B(_, _), CC_A(CC_C(_, _, _), _, CC_C(_, _, _))) => 131 
  case CC_C(_, CC_B(_, _), CC_B(_, _)) => 132 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 133 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 134 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 135 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 136 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_B(_, _), CC_B(_, _))) => 137 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 138 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 139 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 140 
  case CC_C(_, CC_B(_, _), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 141 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _))) => 142 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_B(_, _), CC_A(_, _, _))) => 143 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_C(_, _, _), CC_A(_, _, _))) => 144 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_A(_, _, _), CC_B(_, _))) => 145 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _))) => 146 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_C(_, _, _), CC_B(_, _))) => 147 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _))) => 148 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_B(_, _), CC_C(_, _, _))) => 149 
  case CC_C(_, CC_B(_, _), CC_C(CC_B(_, _), CC_C(_, _, _), CC_C(_, _, _))) => 150 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 151 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 152 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 153 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 154 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_B(_, _), CC_B(_, _))) => 155 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 156 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 157 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 158 
  case CC_C(_, CC_B(_, _), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 159 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 160 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 161 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_A(_, _, _), _, CC_C(_, _, _))) => 162 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 163 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_B(_, _), _, CC_B(_, _))) => 164 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_B(_, _), _, CC_C(_, _, _))) => 165 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_C(_, _, _), _, CC_A(_, _, _))) => 166 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_C(_, _, _), _, CC_B(_, _))) => 167 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_C(_, _, _), _, CC_C(_, _, _))) => 168 
  case CC_C(_, CC_C(_, _, _), CC_B(_, _)) => 169 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 170 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 171 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 172 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 173 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_B(_, _), CC_B(_, _))) => 174 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 175 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 176 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 177 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 178 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _))) => 179 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_B(_, _), CC_A(_, _, _))) => 180 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_C(_, _, _), CC_A(_, _, _))) => 181 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_A(_, _, _), CC_B(_, _))) => 182 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _))) => 183 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_C(_, _, _), CC_B(_, _))) => 184 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _))) => 185 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_B(_, _), CC_C(_, _, _))) => 186 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_B(_, _), CC_C(_, _, _), CC_C(_, _, _))) => 187 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 188 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_B(_, _), CC_A(_, _, _))) => 189 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _, _))) => 190 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_B(_, _))) => 191 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_B(_, _), CC_B(_, _))) => 192 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B(_, _))) => 193 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_C(_, _, _))) => 194 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_B(_, _), CC_C(_, _, _))) => 195 
  case CC_C(_, CC_C(_, _, _), CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 196 
}
}