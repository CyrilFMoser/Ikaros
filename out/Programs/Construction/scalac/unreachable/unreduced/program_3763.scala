package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, Boolean]], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[T_B[CC_C, CC_C], T_A], b: CC_C) extends T_B[Int, T_B[Byte, CC_A]]
case class CC_E(a: Byte, b: CC_D) extends T_B[Int, T_B[Byte, CC_A]]
case class CC_F() extends T_B[Int, T_B[Byte, CC_A]]

val v_a: T_B[Int, T_B[Byte, CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C()) => 0 
  case CC_E(_, _) => 1 
  case CC_F() => 2 
}
}