package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Char],T_A[Char])]
case class CC_B(a: T_A[CC_A], b: Char) extends T_A[(T_A[Char],T_A[Char])]
case class CC_C(a: Boolean, b: T_A[CC_B]) extends T_A[(T_A[Char],T_A[Char])]

val v_a: T_A[(T_A[Char],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, _) => 3 
}
}