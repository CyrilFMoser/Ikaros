package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[(Int,Char)]]) extends T_A
case class CC_B[B](a: CC_A, b: Boolean, c: CC_A) extends T_B[B]
case class CC_C[C](a: CC_B[C], b: CC_A, c: T_B[C]) extends T_B[C]
case class CC_D() extends T_B[T_B[CC_C[T_A]]]

val v_a: T_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _), _), _, _) => 0 
  case CC_C(_, CC_A(_, CC_B(_, _, _)), _) => 1 
  case CC_C(_, CC_A(_, CC_C(_, _, _)), _) => 2 
}
}