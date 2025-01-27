package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Boolean)) extends T_A[(Boolean,Byte), C]

val v_a: T_A[(Boolean,Byte), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_C (CC_B Wildcard Wildcard Wildcard T_B) T_B) Char T_B)