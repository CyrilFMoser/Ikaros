package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[T_B[T_A, Boolean], Byte]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: CC_C, b: T_B[CC_A, C], c: (T_B[CC_B, T_A],CC_A)) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(CC_A(_, _, _), CC_A(_, _, _), _))