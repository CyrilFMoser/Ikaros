package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Boolean]]
case class CC_B(a: (Int,CC_A), b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: Boolean, b: Boolean, c: T_A[((Int,Int),CC_A)]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((12,CC_A()), _) => 1 
  case CC_B((_,CC_A()), _) => 2 
  case CC_C(_, _, _) => 3 
}
}