package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_B[Char],Int)]
case class CC_B(a: T_B[Boolean], b: T_B[CC_A], c: CC_A) extends T_A[(T_B[Char],Int)]
case class CC_C[C](a: (CC_B,CC_B), b: T_A[Boolean]) extends T_B[C]

val v_a: T_A[(T_B[Char],Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_C(_, _), CC_A()) => 1 
}
}