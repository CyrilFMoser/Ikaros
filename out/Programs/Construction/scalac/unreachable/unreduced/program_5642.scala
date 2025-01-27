package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, (Char,Boolean)], T_A[Int, Byte]], b: T_A[(Char,Int), T_A[Int, Boolean]]) extends T_A[Byte, T_A[T_A[Byte, Char], T_A[Char, Char]]]
case class CC_B() extends T_A[Byte, T_A[T_A[Byte, Char], T_A[Char, Char]]]

val v_a: T_A[Byte, T_A[T_A[Byte, Char], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}