package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C[C](a: ((CC_A,CC_A),T_A[Boolean]), b: (Int,Int)) extends T_B[C]
case class CC_D(a: (CC_A,T_B[Boolean]), b: CC_B) extends T_B[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_B(CC_A(), _)