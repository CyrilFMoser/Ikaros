package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[CC_A], b: Byte, c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[CC_A]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 2 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 3 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 5 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 6 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 7 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 8 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 9 
  case CC_A(CC_C(_), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 10 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 11 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 12 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 13 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 14 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 15 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 16 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 17 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 18 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 19 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 20 
  case CC_A(CC_C(_), CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 21 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 22 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 23 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 24 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 25 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 26 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 27 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 28 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 29 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 30 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 31 
  case CC_A(CC_C(_), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 32 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 33 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 34 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 35 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 36 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 37 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 38 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 39 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 40 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 41 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 42 
  case CC_A(CC_C(_), CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 43 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 44 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 45 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 46 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 47 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 48 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 49 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 50 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 51 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 52 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 53 
  case CC_A(CC_C(_), CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 54 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 55 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 56 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 57 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 58 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 59 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 60 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 61 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 62 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 63 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 64 
  case CC_A(CC_C(_), CC_A(CC_B(_, _, _), CC_C(_), _), _) => 65 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 66 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 67 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 68 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 69 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 70 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 71 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 72 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 73 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 74 
  case CC_A(CC_B(_, _, _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 75 
  case CC_A(CC_C(_), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 76 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 77 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 78 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 79 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 80 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 81 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 82 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 83 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 84 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 85 
  case CC_A(CC_B(_, _, _), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 86 
  case CC_A(CC_C(_), CC_A(CC_C(_), CC_B(_, _, _), _), _) => 87 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_C(_), CC_C(_), _), _) => 88 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_C(_), CC_C(_), _), _) => 89 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_A(CC_C(_), CC_C(_), _), _) => 90 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(CC_C(_), CC_C(_), _), _) => 91 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_C(_), CC_C(_), _), _) => 92 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_A(CC_C(_), CC_C(_), _), _) => 93 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_A(CC_C(_), CC_C(_), _), _) => 94 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_A(CC_C(_), CC_C(_), _), _) => 95 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_A(CC_C(_), CC_C(_), _), _) => 96 
  case CC_A(CC_B(_, _, _), CC_A(CC_C(_), CC_C(_), _), _) => 97 
  case CC_A(CC_C(_), CC_A(CC_C(_), CC_C(_), _), _) => 98 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(_, _, CC_A(_, _, _)), _) => 99 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_B(_, _, CC_A(_, _, _)), _) => 100 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_B(_, _, CC_A(_, _, _)), _) => 101 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_B(_, _, CC_A(_, _, _)), _) => 102 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(_, _, CC_A(_, _, _)), _) => 103 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_B(_, _, CC_A(_, _, _)), _) => 104 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_B(_, _, CC_A(_, _, _)), _) => 105 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_B(_, _, CC_A(_, _, _)), _) => 106 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_B(_, _, CC_A(_, _, _)), _) => 107 
  case CC_A(CC_B(_, _, _), CC_B(_, _, CC_A(_, _, _)), _) => 108 
  case CC_A(CC_C(_), CC_B(_, _, CC_A(_, _, _)), _) => 109 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(_, _, CC_B(_, _, _)), _) => 110 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_B(_, _, CC_B(_, _, _)), _) => 111 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_B(_, _, CC_B(_, _, _)), _) => 112 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_B(_, _, CC_B(_, _, _)), _) => 113 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(_, _, CC_B(_, _, _)), _) => 114 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_B(_, _, CC_B(_, _, _)), _) => 115 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_B(_, _, CC_B(_, _, _)), _) => 116 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_B(_, _, CC_B(_, _, _)), _) => 117 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_B(_, _, CC_B(_, _, _)), _) => 118 
  case CC_A(CC_B(_, _, _), CC_B(_, _, CC_B(_, _, _)), _) => 119 
  case CC_A(CC_C(_), CC_B(_, _, CC_B(_, _, _)), _) => 120 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(_, _, CC_C(_)), _) => 121 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_B(_, _, CC_C(_)), _) => 122 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_B(_, _, CC_C(_)), _) => 123 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_B(_, _, CC_C(_)), _) => 124 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(_, _, CC_C(_)), _) => 125 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_B(_, _, CC_C(_)), _) => 126 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_B(_, _, CC_C(_)), _) => 127 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_B(_, _, CC_C(_)), _) => 128 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_B(_, _, CC_C(_)), _) => 129 
  case CC_A(CC_B(_, _, _), CC_B(_, _, CC_C(_)), _) => 130 
  case CC_A(CC_C(_), CC_B(_, _, CC_C(_)), _) => 131 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(_), _) => 132 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_C(_), _) => 133 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_), _), CC_C(_), _) => 134 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_C(_), _) => 135 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_C(_), _) => 136 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_), _), CC_C(_), _) => 137 
  case CC_A(CC_A(CC_C(_), CC_A(_, _, _), _), CC_C(_), _) => 138 
  case CC_A(CC_A(CC_C(_), CC_B(_, _, _), _), CC_C(_), _) => 139 
  case CC_A(CC_A(CC_C(_), CC_C(_), _), CC_C(_), _) => 140 
  case CC_A(CC_B(_, _, _), CC_C(_), _) => 141 
  case CC_A(CC_C(_), CC_C(_), _) => 142 
  case CC_B(_, _, _) => 143 
  case CC_C(_) => 144 
}
}