package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C](a: T_B[C, C], b: T_B[C, Boolean], c: Boolean) extends T_B[T_B[T_A, CC_A], C]
case class CC_C[D]() extends T_B[T_B[T_A, CC_A], D]
case class CC_D() extends T_B[T_B[T_A, CC_A], CC_B[CC_B[CC_A]]]

val v_a: T_B[T_B[T_A, CC_A], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}