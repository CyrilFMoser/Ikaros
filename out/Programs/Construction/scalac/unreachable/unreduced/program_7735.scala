package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: Boolean, c: (Int,T_B)) extends T_A[T_A[T_B, T_B], Char]
case class CC_B() extends T_A[T_A[T_B, T_B], Char]
case class CC_C(a: CC_B, b: T_A[(CC_B,T_B), CC_B]) extends T_A[T_A[T_B, T_B], Char]
case class CC_D(a: T_A[CC_C, CC_C]) extends T_B

val v_a: T_A[T_A[T_B, T_B], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (12,CC_D(_))) => 0 
  case CC_A(_, _, (_,CC_D(_))) => 1 
  case CC_B() => 2 
  case CC_C(_, _) => 3 
}
}