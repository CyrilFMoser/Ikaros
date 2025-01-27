package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Char], b: Boolean) extends T_A
case class CC_B(a: (T_B[CC_A, T_A],T_A), b: T_A) extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_B[Boolean, T_B[(Int,T_A), CC_A]]
case class CC_D(a: CC_A) extends T_B[Boolean, T_B[(Int,T_A), CC_A]]
case class CC_E() extends T_B[Boolean, T_B[(Int,T_A), CC_A]]

val v_a: T_B[Boolean, T_B[(Int,T_A), CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _) => 0 
  case CC_D(CC_A(_, _)) => 1 
  case CC_E() => 2 
}
}