package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[T_A[Char]]) extends T_A[(T_A[T_B],T_B)]
case class CC_B(a: Char, b: T_B, c: CC_A) extends T_A[(T_A[T_B],T_B)]
case class CC_C() extends T_A[(T_A[T_B],T_B)]

val v_a: T_A[(T_A[T_B],T_B)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}