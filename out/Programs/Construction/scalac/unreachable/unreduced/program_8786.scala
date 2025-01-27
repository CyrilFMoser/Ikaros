package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, (Boolean,Boolean)], T_B[T_A, Byte]]) extends T_A
case class CC_B[C](a: T_A, b: C) extends T_A
case class CC_C() extends T_B[T_B[CC_B[Byte], CC_A], CC_B[T_A]]
case class CC_D() extends T_B[T_B[CC_B[Byte], CC_A], CC_B[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(CC_A(_, _), _), _) => 1 
  case CC_A(CC_B(CC_B(_, _), _), _) => 2 
  case CC_B(_, _) => 3 
}
}