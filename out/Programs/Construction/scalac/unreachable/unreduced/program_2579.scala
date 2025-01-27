package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[Char, T_B[T_A, Boolean]]) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C]() extends T_B[Int, C]
case class CC_D[D](a: T_A) extends T_B[Int, D]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_B(_, _, _), _)) => 1 
  case CC_D(CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_D(CC_A(_, CC_A(_, _, _), _))