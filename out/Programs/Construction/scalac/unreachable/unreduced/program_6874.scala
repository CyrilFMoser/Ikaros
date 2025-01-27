package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: Byte) extends T_A[C]
case class CC_B(a: T_A[T_A[Boolean]], b: T_A[T_A[Char]]) extends T_B[Boolean]
case class CC_C(a: T_A[T_B[CC_B]]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _), 0), CC_A(_, _)) => 0 
  case CC_B(CC_A(CC_A(_, _), _), CC_A(_, _)) => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}