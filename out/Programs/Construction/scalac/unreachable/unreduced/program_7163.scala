package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[Char]) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]]) extends T_B
case class CC_C(a: T_B, b: CC_B, c: T_A[T_A[T_B]]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C(CC_B(CC_A(_, _)), _, _) => 1 
  case CC_C(CC_C(_, CC_B(_), CC_A(_, _)), _, _) => 2 
  case CC_C(CC_D(), _, _) => 3 
  case CC_D() => 4 
}
}