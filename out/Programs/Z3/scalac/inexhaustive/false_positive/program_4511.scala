package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[Boolean, Byte], T_B[Int, Int]]
case class CC_B[E]() extends T_A[T_A[Boolean, Byte], T_B[Int, Int]]
case class CC_C[F, G](a: T_B[F, F], b: Int) extends T_B[F, G]
case class CC_D[H](a: Byte) extends T_B[H, Byte]
case class CC_E[I](a: T_B[I, I]) extends T_B[I, Byte]

val v_a: T_A[T_A[Boolean, Byte], T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Boolean (T_A (T_A Boolean Byte) (T_B Int Int)))
// This is not matched: (CC_A Int Wildcard Wildcard (T_A Int))