package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Char,T_B[(Boolean,Boolean), T_A]), b: (Int,Char), c: Int) extends T_A
case class CC_B[C](a: T_B[(T_A,(Char,Char)), C], b: C) extends T_B[C, Boolean]
case class CC_C[D](a: Byte) extends T_B[D, Boolean]
case class CC_D[E](a: T_B[E, Boolean], b: Char) extends T_B[CC_B[T_B[T_A, Boolean]], E]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(0) => 1 
}
}
// This is not matched: CC_C(_)