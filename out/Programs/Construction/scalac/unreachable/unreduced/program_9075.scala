package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Char], T_A[Int, Int]]]
case class CC_B[D](a: Boolean, b: D) extends T_A[Byte, T_A[T_A[Boolean, Char], T_A[Int, Int]]]
case class CC_C[E](a: CC_A[CC_B[E]], b: (Char,T_A[Byte, Boolean])) extends T_A[E, T_A[T_A[Boolean, Char], T_A[Int, Int]]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Char], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}