package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_B[T_B[Char, Char], T_A[Byte, Char]], E]
case class CC_B(a: CC_A[T_A[Char, Char]]) extends T_B[CC_A[Boolean], (CC_A[Char],T_B[Boolean, Int])]
case class CC_C() extends T_B[CC_A[Boolean], (CC_A[Char],T_B[Boolean, Int])]
case class CC_D(a: CC_C) extends T_B[CC_A[Boolean], (CC_A[Char],T_B[Boolean, Int])]

val v_a: T_B[CC_A[Boolean], (CC_A[Char],T_B[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C() => 1 
  case CC_D(CC_C()) => 2 
}
}