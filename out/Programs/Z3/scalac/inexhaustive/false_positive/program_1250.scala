package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: D) extends T_A[D]
case class CC_C(a: (Boolean,(Int,Byte)), b: T_A[Char], c: T_A[Byte]) extends T_A[T_B[Char]]
case class CC_D[E, F](a: CC_C, b: T_B[F]) extends T_B[E]
case class CC_E[G](a: T_A[(Byte,Int)], b: (CC_C,CC_C)) extends T_B[G]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(_, _) => 0 
  case CC_D(CC_C(_, _, _), _) => 1 
  case CC_D(_, CC_E(_, _)) => 2 
  case CC_D(_, _) => 3 
  case CC_D(CC_C(_, _, _), CC_D(_, _)) => 4 
}
}
// This is not matched: (CC_D Boolean Boolean Wildcard Wildcard (T_B Boolean))
// This is not matched: (CC_E T_A Wildcard (CC_C Wildcard T_A) (T_B T_A))