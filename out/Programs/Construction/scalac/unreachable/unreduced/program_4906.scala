package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[C, T_A[C, Int]], C]
case class CC_B(a: CC_A[CC_A[Boolean]]) extends T_A[T_A[CC_A[(Boolean,Char)], T_A[CC_A[(Boolean,Char)], Int]], CC_A[(Boolean,Char)]]
case class CC_C[D]() extends T_A[T_A[D, T_A[D, Int]], D]

val v_a: T_A[T_A[Char, T_A[Char, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}