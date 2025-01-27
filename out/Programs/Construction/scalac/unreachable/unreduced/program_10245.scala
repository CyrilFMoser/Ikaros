package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: Boolean, c: T_B[CC_A, CC_A]) extends T_A
case class CC_C(a: T_A, b: CC_B, c: T_A) extends T_A
case class CC_D[C](a: CC_A, b: C) extends T_B[Byte, C]
case class CC_E() extends T_B[Byte, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), _, _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 3 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, _) => 4 
  case CC_B(CC_C(_, _, CC_A()), _, _) => 5 
  case CC_B(CC_C(_, _, CC_B(_, _, _)), _, _) => 6 
  case CC_B(CC_C(_, _, CC_C(_, _, _)), _, _) => 7 
  case CC_C(_, CC_B(CC_A(), _, _), CC_A()) => 8 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_A()) => 9 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_A()) => 10 
  case CC_C(_, CC_B(CC_A(), _, _), CC_B(CC_A(), _, _)) => 11 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_B(CC_A(), _, _)) => 12 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_B(CC_A(), _, _)) => 13 
  case CC_C(_, CC_B(CC_A(), _, _), CC_B(CC_B(_, _, _), _, _)) => 14 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_B(CC_B(_, _, _), _, _)) => 15 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_B(CC_B(_, _, _), _, _)) => 16 
  case CC_C(_, CC_B(CC_A(), _, _), CC_B(CC_C(_, _, _), _, _)) => 17 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_B(CC_C(_, _, _), _, _)) => 18 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_B(CC_C(_, _, _), _, _)) => 19 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_A())) => 20 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_A())) => 21 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_A())) => 22 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_A())) => 23 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_A())) => 24 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_A())) => 25 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_A())) => 26 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_A())) => 27 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_A())) => 28 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_B(_, _, _))) => 29 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_B(_, _, _))) => 30 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_B(_, _, _))) => 31 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 32 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 33 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 34 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 35 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 36 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 37 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_C(_, _, _))) => 38 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_C(_, _, _))) => 39 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_A(), CC_B(_, _, _), CC_C(_, _, _))) => 40 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 41 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 42 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 43 
  case CC_C(_, CC_B(CC_A(), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 44 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 45 
  case CC_C(_, CC_B(CC_C(_, _, _), _, _), CC_C(CC_C(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 46 
}
}