package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: Byte, b: CC_A[D], c: T_A[Int, D]) extends T_A[Int, D]
case class CC_C[E](a: T_A[Int, CC_B[E]], b: CC_A[(Int,Char)], c: T_A[Int, T_A[E, E]]) extends T_A[Int, E]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 3 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 4 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 5 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 6 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 7 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 8 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 9 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 10 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 11 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 12 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 13 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 14 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 15 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 16 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 17 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 18 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 19 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 20 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 21 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 22 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 23 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 24 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 25 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_C(_, _, _), CC_A(_, _))) => 26 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_C(_, _, _), CC_A(_, _))) => 27 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_C(_, _, _), CC_A(_, _))) => 28 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_C(_, _, _), CC_A(_, _))) => 29 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 30 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 31 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 32 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 33 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 34 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 35 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 36 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 37 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 38 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 39 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 40 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 41 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 42 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 43 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 44 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 45 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 46 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 47 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 48 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 49 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 50 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 51 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 52 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 53 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 54 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 55 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 56 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 57 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 58 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 59 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 60 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 61 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 62 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 63 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 64 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 65 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 66 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 67 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 68 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 69 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 70 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 71 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 72 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 73 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 74 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 75 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 76 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_B(_, _, _))) => 77 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_C(_, _, _))) => 78 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), CC_C(_, _, _))) => 79 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_A(_, _), CC_C(_, _, _))) => 80 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_A(_, _), CC_C(_, _, _))) => 81 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 82 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 83 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 84 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 85 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 86 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 87 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 88 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 89 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 90 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 91 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 92 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 93 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 94 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 95 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 96 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 97 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 98 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 99 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 100 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 101 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 102 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 103 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 104 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 105 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 106 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 107 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 108 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 109 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 110 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 111 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 112 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 113 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 114 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 115 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 116 
  case CC_A(CC_A(CC_A(_, _), _), CC_B(_, _, CC_A(_, _))) => 117 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_B(_, _, CC_A(_, _))) => 118 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_B(_, _, CC_A(_, _))) => 119 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_B(_, _, CC_A(_, _))) => 120 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_A(_, _))) => 121 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_A(_, _))) => 122 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_A(_, _))) => 123 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_A(_, _))) => 124 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_A(_, _))) => 125 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_A(_, _))) => 126 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_A(_, _))) => 127 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_A(_, _))) => 128 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_A(_, _))) => 129 
  case CC_A(CC_A(CC_A(_, _), _), CC_B(_, _, CC_B(_, _, _))) => 130 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_B(_, _, CC_B(_, _, _))) => 131 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_B(_, _, CC_B(_, _, _))) => 132 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_B(_, _, CC_B(_, _, _))) => 133 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_B(_, _, _))) => 134 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_B(_, _, _))) => 135 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_B(_, _, _))) => 136 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 137 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 138 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 139 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 140 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 141 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 142 
  case CC_A(CC_A(CC_A(_, _), _), CC_B(_, _, CC_C(_, _, _))) => 143 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_B(_, _, CC_C(_, _, _))) => 144 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_B(_, _, CC_C(_, _, _))) => 145 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_B(_, _, CC_C(_, _, _))) => 146 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_C(_, _, _))) => 147 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_C(_, _, _))) => 148 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, CC_C(_, _, _))) => 149 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_C(_, _, _))) => 150 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_C(_, _, _))) => 151 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, CC_C(_, _, _))) => 152 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_C(_, _, _))) => 153 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_C(_, _, _))) => 154 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_B(_, _, CC_C(_, _, _))) => 155 
  case CC_A(CC_A(CC_A(_, _), _), CC_C(CC_A(_, _), _, _)) => 156 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_C(CC_A(_, _), _, _)) => 157 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_C(CC_A(_, _), _, _)) => 158 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_C(CC_A(_, _), _, _)) => 159 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_A(_, _), _, _)) => 160 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_A(_, _), _, _)) => 161 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_A(_, _), _, _)) => 162 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_A(_, _), _, _)) => 163 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_A(_, _), _, _)) => 164 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_A(_, _), _, _)) => 165 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_A(_, _), _, _)) => 166 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_A(_, _), _, _)) => 167 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_A(_, _), _, _)) => 168 
  case CC_A(CC_A(CC_A(_, _), _), CC_C(CC_B(_, _, _), _, _)) => 169 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_C(CC_B(_, _, _), _, _)) => 170 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_C(CC_B(_, _, _), _, _)) => 171 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_C(CC_B(_, _, _), _, _)) => 172 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_B(_, _, _), _, _)) => 173 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_B(_, _, _), _, _)) => 174 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_B(_, _, _), _, _)) => 175 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_B(_, _, _), _, _)) => 176 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_B(_, _, _), _, _)) => 177 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_B(_, _, _), _, _)) => 178 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_B(_, _, _), _, _)) => 179 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_B(_, _, _), _, _)) => 180 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_B(_, _, _), _, _)) => 181 
  case CC_A(CC_A(CC_A(_, _), _), CC_C(CC_C(_, _, _), _, _)) => 182 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_C(CC_C(_, _, _), _, _)) => 183 
  case CC_A(CC_A(CC_C(_, _, _), _), CC_C(CC_C(_, _, _), _, _)) => 184 
  case CC_A(CC_B(_, CC_A(_, _), _), CC_C(CC_C(_, _, _), _, _)) => 185 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_C(_, _, _), _, _)) => 186 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_C(_, _, _), _, _)) => 187 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), CC_C(CC_C(_, _, _), _, _)) => 188 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_C(_, _, _), _, _)) => 189 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_C(_, _, _), _, _)) => 190 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), CC_C(CC_C(_, _, _), _, _)) => 191 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_C(_, _, _), _, _)) => 192 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_C(_, _, _), _, _)) => 193 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), CC_C(CC_C(_, _, _), _, _)) => 194 
  case CC_B(_, _, _) => 195 
  case CC_C(CC_A(_, _), _, CC_A(_, _)) => 196 
  case CC_C(CC_A(_, _), _, CC_B(_, _, _)) => 197 
  case CC_C(CC_A(_, _), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 198 
  case CC_C(CC_A(_, _), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 199 
  case CC_C(CC_A(_, _), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 200 
  case CC_C(CC_A(_, _), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 201 
  case CC_C(CC_A(_, _), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 202 
  case CC_C(CC_A(_, _), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 203 
  case CC_C(CC_A(_, _), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 204 
  case CC_C(CC_A(_, _), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 205 
  case CC_C(CC_A(_, _), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 206 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_A(_, _)) => 207 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_B(_, _, _)) => 208 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 209 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 210 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 211 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 212 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 213 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 214 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 215 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 216 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 217 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_A(_, _)) => 218 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 219 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 220 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 221 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 222 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 223 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 224 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 225 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 226 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 227 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 228 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_A(_, _)) => 229 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_B(_, _, _)) => 230 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 231 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 232 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 233 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 234 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 235 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 236 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 237 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 238 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 239 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, _)) => 240 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, _)) => 241 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 242 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 243 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 244 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 245 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 246 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 247 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 248 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 249 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 250 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, _)) => 251 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, _)) => 252 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 253 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 254 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 255 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 256 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 257 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 258 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 259 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 260 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 261 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, _)) => 262 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, _)) => 263 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 264 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 265 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 266 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 267 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 268 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 269 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 270 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 271 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 272 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, _)) => 273 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, _)) => 274 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 275 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 276 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 277 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 278 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 279 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 280 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 281 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 282 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 283 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, _)) => 284 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, _)) => 285 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 286 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 287 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 288 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 289 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 290 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 291 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 292 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 293 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 294 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, _)) => 295 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, _)) => 296 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 297 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 298 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 299 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 300 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 301 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 302 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 303 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 304 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 305 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, _)) => 306 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, _)) => 307 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 308 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 309 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 310 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 311 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 312 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 313 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 314 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 315 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 316 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, _)) => 317 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, _)) => 318 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 319 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 320 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 321 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 322 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 323 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 324 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 325 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 326 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 327 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, _)) => 328 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, _)) => 329 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 330 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 331 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 332 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _))) => 333 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 334 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 335 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _))) => 336 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _))) => 337 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _))) => 338 
}
}