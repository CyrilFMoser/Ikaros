package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, T_B[(Boolean,Char), CC_A]], b: Int, c: CC_A) extends T_A
case class CC_C(a: CC_B) extends T_B[T_A, T_B[T_B[CC_A, T_A], Char]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}