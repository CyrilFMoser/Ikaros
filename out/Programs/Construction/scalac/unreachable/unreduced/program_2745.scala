package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],((Int,Boolean),Byte))) extends T_A
case class CC_B(a: T_B[T_A, Boolean], b: Int, c: T_B[T_A, Boolean]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Char, b: T_B[CC_A, C], c: CC_B) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}