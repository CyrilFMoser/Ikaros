package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[(Char,Byte), C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A Char))