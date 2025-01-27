package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[Char]
case class CC_B(a: T_A[T_A[Char]]) extends T_A[(T_A[Char],T_A[CC_A])]
case class CC_C() extends T_A[(T_A[Char],T_A[CC_A])]

val v_a: T_A[(T_A[Char],T_A[CC_A])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}