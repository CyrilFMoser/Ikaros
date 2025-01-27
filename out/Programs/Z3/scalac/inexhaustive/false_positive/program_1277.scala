package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[(Int,Boolean), Byte]]

val v_a: T_A[Int, T_A[(Int,Boolean), Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Char Char Wildcard Wildcard Wildcard (T_A Char Char))