package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A, (Char,Int)], T_B[CC_A, CC_A]]) extends T_B[CC_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}