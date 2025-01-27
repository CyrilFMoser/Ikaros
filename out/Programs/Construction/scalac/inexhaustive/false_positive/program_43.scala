package Program_62 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]
case class CC_C(a: (T_A[T_B, Char],CC_A[T_B]), b: T_A[T_A[T_B, Char], (T_B,(Int,Byte))]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((CC_A(),_), _) => 0 
}
}
// This is not matched: CC_C()