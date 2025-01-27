package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C], b: Char) extends T_A[T_A[Byte]]
case class CC_C[D](a: (Byte,Char)) extends T_A[T_A[Byte]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C((0,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants