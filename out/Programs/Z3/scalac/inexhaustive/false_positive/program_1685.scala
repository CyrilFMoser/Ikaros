package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Int)) extends T_A[T_A[Int, Char], C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_A Char (T_A Char))