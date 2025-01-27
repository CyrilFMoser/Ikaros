package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[D, D], c: T_A[D, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], C]
case class CC_B[E](a: Boolean) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], E]
case class CC_C(a: T_A[CC_B[Char], CC_B[Char]]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], T_A[T_A[Char, Char], CC_B[Int]]]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], T_A[T_A[Char, Char], CC_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
  case CC_C(_) => 3 
}
}