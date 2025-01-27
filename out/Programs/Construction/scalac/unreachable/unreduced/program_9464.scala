package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Boolean, b: T_B[Boolean], c: (T_A,T_B[T_A])) extends T_B[Boolean]
case class CC_C(a: T_B[T_B[CC_B]]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}