package Program_29 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Int,Boolean), b: T_B[D, Byte], c: Int) extends T_A[(Boolean,Byte)]
case class CC_B[E](a: T_B[E, E], b: E, c: CC_A[E]) extends T_B[E, (Byte,Int)]

val v_a: CC_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants