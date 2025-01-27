package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Char]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_A, b: T_A) extends T_B[CC_B, C]
case class CC_E[D](a: (Byte,Int)) extends T_B[CC_B, D]

val v_a: T_B[CC_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), _) => 0 
  case CC_E((0,_)) => 1 
  case CC_E((_,_)) => 2 
}
}