package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: CC_A, c: T_B[Char]) extends T_B[T_A]
case class CC_C(a: T_B[T_A], b: CC_B) extends T_B[T_A]
case class CC_D(a: CC_B, b: T_A, c: CC_C) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_B(_, _, _), CC_B(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_B(_, CC_A(CC_B(_, _, _), CC_C(_, _), CC_A(_, _, _)), _) => 1 
  case CC_B(_, CC_A(CC_B(_, _, _), CC_D(_, _, _), CC_A(_, _, _)), _) => 2 
  case CC_B(_, CC_A(CC_C(_, _), CC_B(_, _, _), CC_A(_, _, _)), _) => 3 
  case CC_B(_, CC_A(CC_C(_, _), CC_C(_, _), CC_A(_, _, _)), _) => 4 
  case CC_B(_, CC_A(CC_C(_, _), CC_D(_, _, _), CC_A(_, _, _)), _) => 5 
  case CC_B(_, CC_A(CC_D(_, _, _), CC_B(_, _, _), CC_A(_, _, _)), _) => 6 
  case CC_B(_, CC_A(CC_D(_, _, _), CC_C(_, _), CC_A(_, _, _)), _) => 7 
  case CC_C(CC_B(_, CC_A(_, _, _), _), _) => 8 
  case CC_C(CC_C(CC_B(_, _, _), _), _) => 9 
  case CC_C(CC_C(CC_C(_, _), _), _) => 10 
  case CC_C(CC_C(CC_D(_, _, _), _), _) => 11 
  case CC_C(CC_D(_, CC_A(_, _, _), _), _) => 12 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 13 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 14 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 15 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 16 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 17 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 18 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 19 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 20 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_B(_, _, _), _)) => 21 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 22 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 23 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 24 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 25 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 26 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 27 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 28 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 29 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_C(_, _), _)) => 30 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 31 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 32 
  case CC_D(CC_B(CC_B(_, _, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 33 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 34 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 35 
  case CC_D(CC_B(CC_C(_, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 36 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 37 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_C(_, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 38 
  case CC_D(CC_B(CC_D(_, _, _), _, _), CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_C(CC_D(_, _, _), _)) => 39 
}
}
// This is not matched: CC_B(_, CC_A(CC_D(_, _, _), CC_D(_, _, _), CC_A(_, _, _)), _)