package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: Boolean, b: T_B[CC_C]) extends T_B[(CC_C,CC_C)]
case class CC_E(a: T_A, b: CC_A, c: T_B[CC_D]) extends T_B[(CC_C,CC_C)]
case class CC_F() extends T_B[(CC_C,CC_C)]

val v_a: T_B[(CC_C,CC_C)] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F() => 2 
}
}