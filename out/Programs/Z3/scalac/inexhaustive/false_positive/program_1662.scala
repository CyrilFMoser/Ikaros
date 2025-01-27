package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Int)) extends T_A[C, T_A[C, Byte]]

val v_a: T_A[Int, T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_B Char
//      Byte
//      Wildcard
//      Wildcard
//      (CC_C Byte Char Wildcard Wildcard Wildcard (T_B Byte Char))
//      (T_B Byte Char))