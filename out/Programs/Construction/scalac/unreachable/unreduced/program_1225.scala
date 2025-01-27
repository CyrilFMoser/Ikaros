package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[(Int,Boolean), T_A[Char, Boolean]]]
case class CC_B(a: CC_A[(Boolean,Boolean)], b: T_A[Boolean, Char]) extends T_A[CC_A[T_A[Char, Boolean]], T_A[(Int,Boolean), T_A[Char, Boolean]]]
case class CC_C[D](a: D) extends T_A[D, T_A[(Int,Boolean), T_A[Char, Boolean]]]

val v_a: T_A[Boolean, T_A[(Int,Boolean), T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}