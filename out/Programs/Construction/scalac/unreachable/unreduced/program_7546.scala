package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_A[Boolean])) extends T_A[Boolean]
case class CC_B[B](a: B) extends T_A[Boolean]
case class CC_C(a: T_A[T_B], b: T_A[Boolean]) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_B(_))) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A((_,CC_A(_)))