package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D]) extends T_A[T_A[T_A[Char, Boolean], T_A[Byte, Char]], C]
case class CC_B(a: T_A[CC_A[Boolean, Byte], T_A[Int, Boolean]], b: CC_A[Int, CC_A[Byte, Boolean]], c: CC_A[Boolean, T_A[Char, Int]]) extends T_A[T_A[T_A[Char, Boolean], T_A[Byte, Char]], CC_A[T_A[Int, Int], CC_A[Boolean, Int]]]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Byte, Char]], CC_A[T_A[Int, Int], CC_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
}
}