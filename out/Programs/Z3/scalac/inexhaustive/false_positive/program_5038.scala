package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F]() extends T_A[F, Byte]
case class CC_C[G, H](a: T_B[G], b: Boolean, c: H) extends T_A[G, Byte]
case class CC_D[I](a: T_B[I], b: I, c: I) extends T_B[I]
case class CC_E(a: T_B[Boolean], b: CC_A[Byte, Boolean]) extends T_B[T_A[Byte, Byte]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_D(_, _, _), _, _) => 2 
}
}
// This is not matched: (CC_C Int Boolean Wildcard Boolean Wildcard (T_A Int Byte))
// This is not matched: (CC_B T_A)