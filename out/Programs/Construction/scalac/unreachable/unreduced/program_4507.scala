package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, Char], b: T_A, c: T_B[Int, T_A]) extends T_A
case class CC_B(a: T_B[T_B[CC_A, (Int,Boolean)], Boolean], b: T_B[CC_A, T_A]) extends T_A
case class CC_C[C]() extends T_B[Boolean, C]
case class CC_D[D](a: D, b: CC_A, c: D) extends T_B[Boolean, D]

val v_a: T_B[Boolean, T_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_B(_, _), _), _, _) => 1 
  case CC_D(CC_B(_, _), _, _) => 2 
}
}
// This is not matched: CC_D(CC_A(_, CC_A(_, _, _), _), _, _)