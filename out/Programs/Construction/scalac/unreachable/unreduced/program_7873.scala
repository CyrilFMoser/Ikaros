package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C(a: T_A[CC_B[T_B], (T_B,T_B)], b: CC_A[T_A[T_B, (Boolean,Char)]]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}