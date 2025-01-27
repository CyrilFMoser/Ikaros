package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Int) extends T_A[T_A[Byte, T_B[Char, Boolean]], T_B[Boolean, T_B[Int, Char]]]
case class CC_B(a: Char, b: T_A[CC_A, Char], c: CC_A) extends T_A[T_A[Byte, T_B[Char, Boolean]], T_B[Boolean, T_B[Int, Char]]]

val v_a: T_A[T_A[Byte, T_B[Char, Boolean]], T_B[Boolean, T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}