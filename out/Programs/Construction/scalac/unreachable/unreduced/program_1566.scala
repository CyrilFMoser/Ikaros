package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[(Boolean,T_A)]) extends T_A
case class CC_B(a: T_B[CC_A], b: T_A, c: T_B[CC_A]) extends T_B[CC_A]
case class CC_C(a: T_B[CC_A], b: T_B[T_B[CC_A]], c: T_A) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_B(CC_C(_, _, _), _, _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
  case CC_C(CC_C(_, _, _), _, _) => 3 
}
}