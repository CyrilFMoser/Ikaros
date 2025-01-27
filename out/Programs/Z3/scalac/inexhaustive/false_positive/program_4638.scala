package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, Int]) extends T_A[D, C]
case class CC_B[F](a: T_A[F, F]) extends T_A[T_A[Byte, Boolean], F]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
  case CC_A(CC_A(_)) => 1 
}
}
// This is not matched: (CC_A Char
//      Byte
//      Boolean
//      (CC_A Boolean Int Boolean Wildcard (T_A Boolean Int))
//      (T_A Char Byte))
// This is not matched: (CC_C Boolean (T_B Boolean Boolean))