package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[(Byte,Char), Byte]], b: T_B[(T_A,T_A), Int]) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C[C](a: Boolean, b: CC_A, c: Int) extends T_B[C, CC_A]
case class CC_D() extends T_B[CC_C[T_A], CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}