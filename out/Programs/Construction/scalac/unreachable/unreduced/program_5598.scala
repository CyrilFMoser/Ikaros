package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: Boolean, b: Boolean) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_B[F]
case class CC_D(a: T_A[T_A[Int, Char], CC_A[(Char,Char)]], b: Boolean) extends T_B[CC_B[CC_C[Boolean]]]

val v_a: T_A[T_B[CC_B[CC_C[Boolean]]], T_A[T_B[CC_B[CC_C[Boolean]]], T_B[CC_B[CC_C[Boolean]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(), _) => 0 
  case CC_A(_, CC_D(_, _), _) => 1 
  case CC_B(_, _) => 2 
}
}