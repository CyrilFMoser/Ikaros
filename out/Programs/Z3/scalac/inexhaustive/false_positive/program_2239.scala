package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Byte)) extends T_A[C, T_A[Int, C]]

val v_a: T_A[Byte, T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_B Byte (CC_B Byte Wildcard Wildcard (T_A Byte)) Wildcard (T_A Byte))