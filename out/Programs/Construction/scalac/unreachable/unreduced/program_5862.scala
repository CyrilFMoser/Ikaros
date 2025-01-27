package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[((Int,Boolean),Char), T_A[Int, Char]], c: T_A[T_A[Int, Char], T_A[Int, Char]]) extends T_A[Int, Char]
case class CC_B(a: Byte) extends T_A[Int, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}