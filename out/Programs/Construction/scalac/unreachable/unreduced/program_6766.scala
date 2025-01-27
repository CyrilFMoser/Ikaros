package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B() extends T_B[CC_A]
case class CC_C() extends T_B[CC_A]
case class CC_D(a: T_B[Int], b: (T_B[CC_A],T_B[(Byte,Boolean)])) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}