package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B[B]() extends T_A
case class CC_C(a: CC_A, b: T_B[T_A]) extends T_A
case class CC_D(a: T_A, b: CC_C) extends T_B[(T_B[(Int,Boolean)],CC_C)]
case class CC_E(a: T_A, b: (T_B[T_A],CC_B[Char]), c: CC_A) extends T_B[(T_B[(Int,Boolean)],CC_C)]
case class CC_F(a: CC_E, b: T_A, c: CC_B[(CC_D,CC_D)]) extends T_B[(T_B[(Int,Boolean)],CC_C)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), _) => 2 
}
}