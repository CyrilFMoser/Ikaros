package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Boolean],Int), b: Char) extends T_A[T_A[Char, T_B[(Int,Char)]], T_B[Byte]]
case class CC_B[D](a: T_A[D, D]) extends T_B[D]
case class CC_C[E](a: CC_B[E], b: T_A[E, E]) extends T_B[E]
case class CC_D(a: CC_A) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(CC_A(_, 'x')) => 1 
  case CC_D(CC_A(_, _)) => 2 
}
}
// This is not matched: CC_C(_, _)