package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], (Char,Byte)]) extends T_A[T_A[T_A[Char, Char], T_A[Byte, Int]], T_A[T_A[Int, Int], T_A[Boolean, Int]]]
case class CC_B() extends T_A[T_A[T_A[Char, Char], T_A[Byte, Int]], T_A[T_A[Int, Int], T_A[Boolean, Int]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Byte, Int]], T_A[T_A[Int, Int], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}