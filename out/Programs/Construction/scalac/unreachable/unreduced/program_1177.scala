package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[(Char,Int)]]) extends T_A[(T_B,T_A[T_B])]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D[B](a: T_A[B], b: CC_A, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(_, CC_A(_), _) => 2 
}
}