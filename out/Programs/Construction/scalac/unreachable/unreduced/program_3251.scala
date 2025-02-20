package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A) extends T_A[T_A[Boolean]]
case class CC_C() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_C(), CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_))) => 3 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_B(_))) => 4 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_C(), CC_B(_))) => 5 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_C())) => 6 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_C())) => 7 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_C(), CC_C())) => 8 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 9 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_C()) => 10 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 11 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_B(_), CC_A(_, _, _))) => 12 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_C(), CC_A(_, _, _))) => 13 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_B(_))) => 14 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_B(_), CC_B(_))) => 15 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_C(), CC_B(_))) => 16 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_C())) => 17 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_B(_), CC_C())) => 18 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, CC_C(), CC_C())) => 19 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_B(_)) => 20 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_C()) => 21 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 22 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_B(_), CC_A(_, _, _))) => 23 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_C(), CC_A(_, _, _))) => 24 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_A(_, _, _), CC_B(_))) => 25 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_B(_), CC_B(_))) => 26 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_C(), CC_B(_))) => 27 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_A(_, _, _), CC_C())) => 28 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_B(_), CC_C())) => 29 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, CC_C(), CC_C())) => 30 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_B(_)) => 31 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_C()) => 32 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 33 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_A(_, _, _))) => 34 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_C(), CC_A(_, _, _))) => 35 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_))) => 36 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_B(_))) => 37 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_C(), CC_B(_))) => 38 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_C())) => 39 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_C())) => 40 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, CC_C(), CC_C())) => 41 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_B(_)) => 42 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_C()) => 43 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 44 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_B(_), CC_A(_, _, _))) => 45 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_C(), CC_A(_, _, _))) => 46 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_B(_))) => 47 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_B(_), CC_B(_))) => 48 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_C(), CC_B(_))) => 49 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_C())) => 50 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_B(_), CC_C())) => 51 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, CC_C(), CC_C())) => 52 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_B(_)) => 53 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_C()) => 54 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 55 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_B(_), CC_A(_, _, _))) => 56 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_C(), CC_A(_, _, _))) => 57 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_A(_, _, _), CC_B(_))) => 58 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_B(_), CC_B(_))) => 59 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_C(), CC_B(_))) => 60 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_A(_, _, _), CC_C())) => 61 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_B(_), CC_C())) => 62 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_A(_, CC_C(), CC_C())) => 63 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_B(_)) => 64 
  case CC_A(_, CC_A(_, CC_B(_), CC_C()), CC_C()) => 65 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 66 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_A(_, _, _))) => 67 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_C(), CC_A(_, _, _))) => 68 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_))) => 69 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_B(_))) => 70 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_C(), CC_B(_))) => 71 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_C())) => 72 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_B(_), CC_C())) => 73 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, CC_C(), CC_C())) => 74 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_B(_)) => 75 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_C()) => 76 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 77 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_B(_), CC_A(_, _, _))) => 78 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_C(), CC_A(_, _, _))) => 79 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_B(_))) => 80 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_B(_), CC_B(_))) => 81 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_C(), CC_B(_))) => 82 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_A(_, _, _), CC_C())) => 83 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_B(_), CC_C())) => 84 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_A(_, CC_C(), CC_C())) => 85 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_B(_)) => 86 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_)), CC_C()) => 87 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 88 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_B(_), CC_A(_, _, _))) => 89 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_C(), CC_A(_, _, _))) => 90 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_A(_, _, _), CC_B(_))) => 91 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_B(_), CC_B(_))) => 92 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_C(), CC_B(_))) => 93 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_A(_, _, _), CC_C())) => 94 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_B(_), CC_C())) => 95 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, CC_C(), CC_C())) => 96 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_B(_)) => 97 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_C()) => 98 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 99 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_B(_), CC_A(_, _, _))) => 100 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_C(), CC_A(_, _, _))) => 101 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_))) => 102 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_B(_), CC_B(_))) => 103 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_C(), CC_B(_))) => 104 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_C())) => 105 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_B(_), CC_C())) => 106 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_A(_, CC_C(), CC_C())) => 107 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_B(_)) => 108 
  case CC_A(_, CC_B(CC_A(_, _, _)), CC_C()) => 109 
  case CC_A(_, CC_C(), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 110 
  case CC_A(_, CC_C(), CC_A(_, CC_B(_), CC_A(_, _, _))) => 111 
  case CC_A(_, CC_C(), CC_A(_, CC_C(), CC_A(_, _, _))) => 112 
  case CC_A(_, CC_C(), CC_A(_, CC_A(_, _, _), CC_B(_))) => 113 
  case CC_A(_, CC_C(), CC_A(_, CC_B(_), CC_B(_))) => 114 
  case CC_A(_, CC_C(), CC_A(_, CC_C(), CC_B(_))) => 115 
  case CC_A(_, CC_C(), CC_A(_, CC_A(_, _, _), CC_C())) => 116 
  case CC_A(_, CC_C(), CC_A(_, CC_B(_), CC_C())) => 117 
  case CC_A(_, CC_C(), CC_A(_, CC_C(), CC_C())) => 118 
  case CC_A(_, CC_C(), CC_B(_)) => 119 
  case CC_A(_, CC_C(), CC_C()) => 120 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 121 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_B(_))) => 122 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_C())) => 123 
  case CC_B(CC_A(_, CC_B(_), CC_A(_, _, _))) => 124 
  case CC_B(CC_A(_, CC_B(_), CC_B(_))) => 125 
  case CC_B(CC_A(_, CC_B(_), CC_C())) => 126 
  case CC_B(CC_A(_, CC_C(), CC_A(_, _, _))) => 127 
  case CC_B(CC_A(_, CC_C(), CC_B(_))) => 128 
  case CC_B(CC_A(_, CC_C(), CC_C())) => 129 
  case CC_C() => 130 
}
}