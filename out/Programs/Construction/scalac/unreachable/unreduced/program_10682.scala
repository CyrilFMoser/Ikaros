package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, T_A[Int, T_A[Char, Char]]]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[Int, T_A[Char, Char]]]
case class CC_C(a: T_A[CC_B[Byte], CC_A[Boolean]]) extends T_A[T_A[CC_B[Boolean], (Byte,Boolean)], T_A[Int, T_A[Char, Char]]]

val v_a: T_A[T_A[CC_B[Boolean], (Byte,Boolean)], T_A[Int, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}