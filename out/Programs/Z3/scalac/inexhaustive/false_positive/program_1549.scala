package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, (Byte,Boolean)], b: Int) extends T_A[D, T_B[Char]]

val v_a: T_A[Int, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_B Char Boolean Boolean Wildcard (T_A Char Boolean))