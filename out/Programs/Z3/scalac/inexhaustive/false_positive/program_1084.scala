package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (Char,Byte), b: T_A[Byte, Char], c: T_B[Int]) extends T_A[Byte, T_A[Boolean, (Boolean,Char)]]
case class CC_B[D]() extends T_B[D]
case class CC_C[E]() extends T_B[E]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))