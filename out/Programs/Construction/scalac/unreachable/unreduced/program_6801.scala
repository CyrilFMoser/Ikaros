package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_B[T_B[T_A, T_A], Char], c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_B[CC_A, CC_A]
case class CC_C(a: T_B[CC_A, CC_A], b: Char) extends T_B[CC_A, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_, _) => 1 
}
}