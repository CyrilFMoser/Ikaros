package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Boolean, D], b: D) extends T_A[Boolean, D]
case class CC_B[E](a: Int, b: E) extends T_A[Boolean, E]
case class CC_C[F](a: T_A[Boolean, F], b: T_A[Boolean, (Int,Int)]) extends T_A[T_A[Boolean, Byte], (Byte,Int)]
case class CC_D[G](a: CC_B[G]) extends T_B[G]
case class CC_E[H](a: ((Boolean,Byte),(Int,Boolean))) extends T_B[H]

val v_a: T_A[T_A[Boolean, Byte], (Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), CC_B(_, _)) => 0 
  case CC_C(_, _) => 1 
  case CC_C(_, CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_C (T_B (T_A Boolean Boolean))
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean Byte) (Tuple Byte Int)))
// This is not matched: (CC_B T_A)