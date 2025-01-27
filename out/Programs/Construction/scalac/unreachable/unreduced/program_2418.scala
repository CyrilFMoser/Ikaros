package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[(CC_A,CC_A)], b: T_B[CC_A], c: T_A) extends T_A
case class CC_C(a: (T_B[CC_B],Char)) extends T_A
case class CC_D(a: Byte, b: T_B[Boolean], c: T_B[T_A]) extends T_B[Boolean]
case class CC_E() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(0, _, _) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E() => 2 
}
}