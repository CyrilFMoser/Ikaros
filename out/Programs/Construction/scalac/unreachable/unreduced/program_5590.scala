package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C], c: T_B[C]) extends T_A[C]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_A[Boolean], c: T_A[T_B[Boolean]]) extends T_B[(Boolean,CC_A[Char])]
case class CC_C[D](a: Int, b: D, c: T_B[D]) extends T_B[(Boolean,CC_A[Char])]

val v_a: T_B[(Boolean,CC_A[Char])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C(12, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}