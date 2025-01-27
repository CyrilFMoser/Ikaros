package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_A[T_B, (T_B,(Boolean,Int))]) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D], b: CC_A[D], c: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: T_A[T_A[T_B, T_B], T_B], b: CC_A[(T_B,T_B)]) extends T_B
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, CC_C(_, _), _)) => 0 
  case CC_C(_, CC_A(_, CC_D(), _)) => 1 
  case CC_C(_, CC_A(_, CC_E(), _)) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_E()