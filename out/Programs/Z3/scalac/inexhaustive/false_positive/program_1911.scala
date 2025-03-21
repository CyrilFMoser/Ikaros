package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, Byte], c: Boolean) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]
case class CC_C[E, F](a: T_A[E, Byte], b: T_A[F, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), CC_C(_, _)) => 0 
  case CC_C(CC_B(), CC_C(_, _)) => 1 
}
}
// This is not matched: (CC_C Int Boolean Wildcard Wildcard (T_A (T_A Int Int) Int))
// This is not matched: (CC_C T_A)