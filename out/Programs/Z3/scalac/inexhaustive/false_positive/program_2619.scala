package Program_29 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Int,(Byte,Int))) extends T_A[T_A[(Byte,Byte), Byte], T_A[Int, Byte]]

val v_a: T_A[T_A[(Byte,Byte), Byte], T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A (Tuple Byte Byte) Byte) (T_A Int Byte)))
// This is not matched: (CC_A Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A (Tuple Byte Byte) Byte) (T_A Int Byte)))