package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Char, c: Char) extends T_A
case class CC_B(a: (T_A,T_B[Int, (Char,Byte)])) extends T_A
case class CC_C[C](a: T_A, b: Int) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_B(_),_)) => 1 
}
}
// This is not matched: CC_B((CC_A(_, _, _),_))