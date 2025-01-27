package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Char)) extends T_A[T_A[Boolean, Int], C]

val v_a: T_A[T_A[Boolean, Int], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard (T_A Byte (T_A Byte Boolean)))