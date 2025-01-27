package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C[E](a: T_B[E]) extends T_A[E]
case class CC_D(a: T_A[T_A[Char]]) extends T_B[(T_A[Int],CC_B[Int])]

val v_a: T_B[(T_A[Int],CC_B[Int])] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_B(_))) => 0 
  case CC_D(CC_A(_, CC_C(_))) => 1 
  case CC_D(CC_B(_)) => 2 
  case CC_D(CC_C(_)) => 3 
}
}
// This is not matched: CC_D(CC_A(_, CC_A(_, _)))