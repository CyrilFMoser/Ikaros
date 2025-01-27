package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Int,Boolean), T_A[Int, Char]], b: T_A[T_A[Byte, Int], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[(Boolean,Byte), Int], T_A[Int, Byte]], T_A[Int, T_A[Boolean, Int]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}