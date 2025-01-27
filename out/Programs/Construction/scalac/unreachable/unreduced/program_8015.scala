package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_B, b: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_A, b: T_B, c: CC_B) extends T_B
case class CC_D(a: T_A[Int]) extends T_B
case class CC_E(a: Char, b: CC_A) extends T_B

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_C(_, _, CC_B(_, _)), CC_A(CC_C(_, _, _), _, 0)) => 1 
  case CC_B(CC_C(_, _, CC_B(_, _)), CC_A(CC_C(_, _, _), _, _)) => 2 
  case CC_B(CC_C(_, _, CC_B(_, _)), CC_A(CC_D(_), _, 0)) => 3 
  case CC_B(CC_C(_, _, CC_B(_, _)), CC_A(CC_D(_), _, _)) => 4 
  case CC_B(CC_C(_, _, CC_B(_, _)), CC_A(CC_E(_, _), _, 0)) => 5 
  case CC_B(CC_C(_, _, CC_B(_, _)), CC_A(CC_E(_, _), _, _)) => 6 
  case CC_B(CC_D(_), CC_A(CC_C(_, _, _), _, 0)) => 7 
  case CC_B(CC_D(_), CC_A(CC_C(_, _, _), _, _)) => 8 
  case CC_B(CC_D(_), CC_A(CC_D(_), _, 0)) => 9 
  case CC_B(CC_D(_), CC_A(CC_D(_), _, _)) => 10 
  case CC_B(CC_D(_), CC_A(CC_E(_, _), _, 0)) => 11 
  case CC_B(CC_D(_), CC_A(CC_E(_, _), _, _)) => 12 
  case CC_B(CC_E(_, CC_A(_, _, _)), CC_A(CC_C(_, _, _), _, 0)) => 13 
  case CC_B(CC_E(_, CC_A(_, _, _)), CC_A(CC_C(_, _, _), _, _)) => 14 
  case CC_B(CC_E(_, CC_A(_, _, _)), CC_A(CC_D(_), _, 0)) => 15 
  case CC_B(CC_E(_, CC_A(_, _, _)), CC_A(CC_D(_), _, _)) => 16 
  case CC_B(CC_E(_, CC_A(_, _, _)), CC_A(CC_E(_, _), _, 0)) => 17 
  case CC_B(CC_E(_, CC_A(_, _, _)), CC_A(CC_E(_, _), _, _)) => 18 
}
}