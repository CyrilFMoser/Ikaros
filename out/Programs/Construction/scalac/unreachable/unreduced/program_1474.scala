package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, CC_A], c: CC_A) extends T_A
case class CC_C(a: T_B[(Char,CC_A), T_A], b: T_B[(CC_A,(Int,Boolean)), T_B[CC_B, CC_B]], c: CC_B) extends T_A
case class CC_D[C](a: (Int,CC_A), b: C, c: CC_A) extends T_B[T_B[C, C], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, CC_A(_)) => 1 
  case CC_C(_, _, _) => 2 
}
}