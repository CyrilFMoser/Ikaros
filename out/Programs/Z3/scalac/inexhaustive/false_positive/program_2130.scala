package Program_30 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: (Int,Boolean), b: Int, c: D) extends T_A[C, D]
case class CC_B[F](a: F, b: Char) extends T_A[(Byte,Char), F]
case class CC_C(a: T_A[Int, Byte], b: T_A[Int, (Boolean,Byte)]) extends T_A[(Byte,Char), Int]

val v_a: T_A[(Byte,Char), Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(0, 'x') => 1 
  case CC_B(_, 'x') => 2 
  case CC_B(0, _) => 3 
  case CC_B(_, _) => 4 
}
}
// This is not matched: (CC_A Byte
//      (Tuple Byte Char)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (Tuple Byte Char) Byte))
// This is not matched: (CC_B (CC_A T_A) Wildcard T_A)