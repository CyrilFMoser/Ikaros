package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, (Char,Boolean)], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Byte, Byte]], T_A[T_A[Byte, Char], T_A[Char, Int]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}