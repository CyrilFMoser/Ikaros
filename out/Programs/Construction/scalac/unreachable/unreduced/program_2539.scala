package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D, E](a: T_B[D]) extends T_A[D]
case class CC_C() extends T_A[T_A[T_A[Char]]]
case class CC_D() extends T_B[Char]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}