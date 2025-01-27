package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: Int) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: Boolean, b: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: ((Boolean,Byte),CC_A[Boolean]), b: F) extends T_A[F, T_A[F, F]]
case class CC_D(a: CC_C[T_A[Boolean, Byte]], b: CC_A[CC_B[Byte]]) extends T_B[T_A[CC_C[Char], T_A[CC_C[Char], CC_C[Char]]]]

val v_a: T_A[T_B[T_A[CC_C[Char], T_A[CC_C[Char], CC_C[Char]]]], T_A[T_B[T_A[CC_C[Char], T_A[CC_C[Char], CC_C[Char]]]], T_B[T_A[CC_C[Char], T_A[CC_C[Char], CC_C[Char]]]]]] = null
val v_b: Int = v_a match{
  case CC_A(true, 12) => 0 
  case CC_A(true, _) => 1 
  case CC_A(false, 12) => 2 
  case CC_A(false, _) => 3 
  case CC_B(true, _) => 4 
  case CC_B(false, _) => 5 
  case CC_C(_, _) => 6 
}
}