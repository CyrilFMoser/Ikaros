package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B[C](a: CC_A) extends T_A
case class CC_C[E, D]() extends T_B[D, E]
case class CC_D[F](a: CC_A, b: CC_B[F], c: CC_A) extends T_B[F, (Boolean,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_C()) => 1 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)
// This is not matched: (CC_A Byte Byte Boolean Wildcard Wildcard (T_A Byte Byte))