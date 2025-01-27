package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte]) extends T_A[T_A[Boolean]]
case class CC_B(a: Char, b: Int, c: T_A[T_A[CC_A]]) extends T_A[T_A[Boolean]]
case class CC_C(a: (Byte,CC_B)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)