package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_D(a: T_B[T_A], b: Int, c: Boolean) extends T_B[CC_A]
case class CC_E[C]() extends T_B[C]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), 12, _) => 1 
  case CC_D(CC_C(), _, _) => 2 
  case CC_D(CC_E(), 12, _) => 3 
  case CC_D(CC_E(), _, _) => 4 
  case CC_E() => 5 
}
}