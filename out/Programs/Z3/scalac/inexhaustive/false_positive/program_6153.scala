package Program_15 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: T_B) extends T_A[Int, C]
case class CC_B[E](a: Byte, b: E) extends T_A[Int, E]
case class CC_C[F, G](a: (T_B,Char), b: CC_A[G, G], c: Boolean) extends T_A[G, F]
case class CC_D(a: T_B, b: (T_B,T_B)) extends T_B
case class CC_E(a: CC_A[Boolean, Boolean]) extends T_B

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_, _), _) => 2 
  case CC_C((CC_E(_),_), _, _) => 3 
  case CC_A(_, _) => 4 
}
}
// This is not matched: (CC_A Byte T_B Wildcard Wildcard (T_A Int Byte))
// This is not matched: Pattern match is empty without constants