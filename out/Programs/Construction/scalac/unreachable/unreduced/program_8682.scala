package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(T_A,T_A)], c: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_A, c: T_B[CC_A]) extends T_A
case class CC_D(a: T_A, b: (CC_C,CC_C), c: T_B[Int]) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), _) => 2 
  case CC_C(CC_B(), CC_A(_, _, _), _) => 3 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 4 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_A(_, _, _), _) => 5 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_A(_, _, _), _) => 6 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_A(_, _, _), _) => 7 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_A(_, _, _), _) => 8 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_A(_, _, _), _) => 9 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 10 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_A(_, _, _), _) => 11 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_A(_, _, _), _) => 12 
  case CC_C(CC_A(_, _, _), CC_B(), _) => 13 
  case CC_C(CC_B(), CC_B(), _) => 14 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_B(), _) => 15 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_B(), _) => 16 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_B(), _) => 17 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_B(), _) => 18 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_B(), _) => 19 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_B(), _) => 20 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_B(), _) => 21 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_B(), _) => 22 
  case CC_C(CC_A(_, _, _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 23 
  case CC_C(CC_B(), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 24 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 25 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 26 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 27 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 28 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 29 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 30 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 31 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 32 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_A(_, _, _), _), _) => 33 
  case CC_C(CC_A(_, _, _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 34 
  case CC_C(CC_B(), CC_C(CC_A(_, _, _), CC_B(), _), _) => 35 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 36 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 37 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 38 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 39 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 40 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 41 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 42 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 43 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_B(), _), _) => 44 
  case CC_C(CC_A(_, _, _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 45 
  case CC_C(CC_B(), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 46 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 47 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 48 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 49 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 50 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 51 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 52 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 53 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 54 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_A(_, _, _), CC_C(_, _, _), _), _) => 55 
  case CC_C(CC_A(_, _, _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 56 
  case CC_C(CC_B(), CC_C(CC_B(), CC_A(_, _, _), _), _) => 57 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 58 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 59 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 60 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 61 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 62 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 63 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 64 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 65 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_B(), CC_A(_, _, _), _), _) => 66 
  case CC_C(CC_A(_, _, _), CC_C(CC_B(), CC_B(), _), _) => 67 
  case CC_C(CC_B(), CC_C(CC_B(), CC_B(), _), _) => 68 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_B(), CC_B(), _), _) => 69 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_B(), CC_B(), _), _) => 70 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_B(), CC_B(), _), _) => 71 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_B(), CC_B(), _), _) => 72 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_B(), CC_B(), _), _) => 73 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_B(), CC_B(), _), _) => 74 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_B(), CC_B(), _), _) => 75 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_B(), CC_B(), _), _) => 76 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_B(), CC_B(), _), _) => 77 
  case CC_C(CC_A(_, _, _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 78 
  case CC_C(CC_B(), CC_C(CC_B(), CC_C(_, _, _), _), _) => 79 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 80 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 81 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 82 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 83 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 84 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 85 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 86 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 87 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_B(), CC_C(_, _, _), _), _) => 88 
  case CC_C(CC_A(_, _, _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 89 
  case CC_C(CC_B(), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 90 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 91 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 92 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 93 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 94 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 95 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 96 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 97 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 98 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_A(_, _, _), _), _) => 99 
  case CC_C(CC_A(_, _, _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 100 
  case CC_C(CC_B(), CC_C(CC_C(_, _, _), CC_B(), _), _) => 101 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 102 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 103 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 104 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 105 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 106 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 107 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 108 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 109 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_B(), _), _) => 110 
  case CC_C(CC_A(_, _, _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 111 
  case CC_C(CC_B(), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 112 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 113 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 114 
  case CC_C(CC_C(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 115 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 116 
  case CC_C(CC_C(CC_B(), CC_B(), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 117 
  case CC_C(CC_C(CC_B(), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 118 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 119 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 120 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 121 
}
}
// This is not matched: CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(), _)