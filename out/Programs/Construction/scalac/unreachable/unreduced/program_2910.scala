package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Boolean, T_A[Byte, T_B]], b: T_A[Boolean, T_A[Byte, T_B]]) extends T_A[Boolean, T_A[Byte, T_B]]
case class CC_B(a: T_A[T_B, CC_A], b: (T_B,T_A[T_B, Byte])) extends T_A[Boolean, T_A[Byte, T_B]]
case class CC_C(a: T_B, b: T_A[T_A[T_B, Boolean], T_A[CC_A, Boolean]]) extends T_A[Boolean, T_A[Byte, T_B]]
case class CC_D(a: T_A[T_A[Int, (Int,Int)], T_A[CC_C, CC_C]]) extends T_B
case class CC_E(a: T_A[Boolean, T_A[Byte, T_B]], b: CC_A, c: T_A[Boolean, T_A[Byte, T_B]]) extends T_B

val v_a: T_A[Boolean, T_A[Byte, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), _) => 0 
  case CC_A(CC_A(_, CC_B(_, _)), _) => 1 
  case CC_A(CC_A(_, CC_C(_, _)), _) => 2 
  case CC_A(CC_B(_, _), _) => 3 
  case CC_A(CC_C(CC_D(_), _), _) => 4 
  case CC_A(CC_C(CC_E(_, _, _), _), _) => 5 
  case CC_B(_, _) => 6 
  case CC_C(_, _) => 7 
}
}