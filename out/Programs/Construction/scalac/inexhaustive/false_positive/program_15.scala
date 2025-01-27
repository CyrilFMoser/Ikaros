package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_C() extends T_A[T_A[Boolean, Boolean], Boolean]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_C((_,CC_B(_)), CC_C((_,_), CC_C(_, _)))