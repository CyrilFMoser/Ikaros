package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: Boolean, c: Int) extends T_A
case class CC_B(a: T_B[T_A, CC_A]) extends T_A
case class CC_C[C](a: (CC_B,(T_A,(Boolean,Boolean))), b: Char) extends T_B[Byte, C]
case class CC_D() extends T_B[Byte, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B(_) => 2 
}
}