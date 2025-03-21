package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_B[T_A, (Byte,Char)]], b: Boolean) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C[C](a: Boolean) extends T_B[C, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_B(CC_B(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_A(_, _)