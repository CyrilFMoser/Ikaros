package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[T_B[Char]]) extends T_A[T_A[T_B[(Boolean,Boolean)]]]
case class CC_C(a: CC_B, b: T_A[T_B[CC_B]]) extends T_A[T_A[T_B[(Boolean,Boolean)]]]
case class CC_D(a: Boolean) extends T_B[(CC_B,CC_B)]
case class CC_E() extends T_B[(CC_B,CC_B)]
case class CC_F() extends T_B[(CC_B,CC_B)]

val v_a: T_A[T_A[T_B[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _)