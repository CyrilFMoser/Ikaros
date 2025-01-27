package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: CC_A[T_A], c: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: (CC_B,CC_B)) extends T_A
case class CC_D() extends T_B[(Boolean,Boolean)]
case class CC_E(a: T_B[CC_D]) extends T_B[CC_D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _))) => 1 
}
}
// This is not matched: CC_B(_, CC_A(), _)