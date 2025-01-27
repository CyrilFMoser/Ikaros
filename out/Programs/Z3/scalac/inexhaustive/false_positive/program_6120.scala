package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Byte) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A Char (T_A Char Char)))