package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: T_B[T_B[T_A]], c: T_B[Boolean]) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C(a: T_A, b: CC_A) extends T_A
case class CC_D(a: Int, b: CC_C, c: T_A) extends T_B[T_B[CC_A]]
case class CC_E(a: T_B[Char], b: T_B[T_B[CC_A]]) extends T_B[T_B[CC_A]]
case class CC_F() extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(CC_A(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_D(_, CC_C(CC_B(_), CC_A(_, _, _)), _) => 1 
  case CC_D(_, CC_C(CC_C(_, _), CC_A(_, _, _)), _) => 2 
  case CC_E(_, _) => 3 
  case CC_F() => 4 
}
}