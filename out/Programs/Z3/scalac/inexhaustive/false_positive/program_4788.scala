package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Boolean, b: E, c: Int) extends T_A[D]
case class CC_B[F]() extends T_B[T_A[F], F]
case class CC_C(a: Byte, b: (Byte,(Char,Char))) extends T_B[T_A[(Byte,Char)], (Byte,Char)]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_D Wildcard Wildcard Wildcard (T_B (CC_B T_A T_A T_A T_A T_A)))