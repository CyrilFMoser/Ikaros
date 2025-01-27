package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: Int) extends T_A[C, D]
case class CC_B[E](a: CC_A[E, E], b: (T_A[Char, Byte],CC_A[Boolean, Int])) extends T_A[E, T_A[T_A[Int, Char], CC_A[Byte, Byte]]]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 12) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}