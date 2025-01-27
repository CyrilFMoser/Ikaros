package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, Byte]
case class CC_B[D, C](a: (T_B,Char), b: D) extends T_A[C, D]
case class CC_C[E](a: Byte) extends T_B

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_C(_),_), _) => 0 
}
}
// This is not matched: (CC_B Boolean Byte (Tuple (CC_C T_B Byte T_B) Char) Wildcard (T_A Byte Boolean))
// This is not matched: (CC_B Char
//      T_B
//      (CC_A Char Wildcard Wildcard Byte (T_A Char T_B))
//      Wildcard
//      Char
//      (T_A Char T_B))