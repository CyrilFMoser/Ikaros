package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[CC_A, T_A]) extends T_B[CC_A, C]
case class CC_C[D](a: D, b: T_B[D, D]) extends T_B[CC_A, D]
case class CC_D[E](a: E, b: T_A) extends T_B[CC_A, E]

val v_a: T_B[CC_A, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_B(CC_D(_, _))) => 2 
  case CC_B(CC_C(_, _)) => 3 
  case CC_B(CC_D(_, CC_A())) => 4 
  case CC_C(_, _) => 5 
  case CC_D(_, _) => 6 
}
}