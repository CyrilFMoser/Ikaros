package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]]
case class CC_B(a: T_A[T_A[Int, Char], CC_A[Char]], b: CC_A[CC_A[Char]], c: T_A[CC_A[Char], T_A[Int, Char]]) extends T_A[T_A[T_A[Int, Char], CC_A[Int]], T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]]
case class CC_C[D](a: CC_B) extends T_A[D, T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]]

val v_a: T_A[Char, T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}