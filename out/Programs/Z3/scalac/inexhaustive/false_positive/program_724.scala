package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Byte,Int)) extends T_A[T_A[Byte, Boolean], C]

val v_a: T_A[T_A[Byte, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_B Wildcard T_B)