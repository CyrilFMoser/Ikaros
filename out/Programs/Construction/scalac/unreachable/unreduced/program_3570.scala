package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B(a: T_B[T_B[Int, Int], CC_A], b: T_A, c: CC_A) extends T_A
case class CC_C[C]() extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
}
}
// This is not matched: CC_B(_, CC_B(_, _, CC_A(_)), CC_A(_))