package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Boolean,Boolean)]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_A[CC_A], b: CC_A) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_A(_)