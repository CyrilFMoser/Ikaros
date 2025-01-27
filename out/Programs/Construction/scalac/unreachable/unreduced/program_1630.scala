package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[T_A[(Boolean,Int)]]) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: (CC_A,(Int,CC_A)), b: Char) extends T_A[T_A[T_B]]
case class CC_D(a: Int) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_C(_, _)