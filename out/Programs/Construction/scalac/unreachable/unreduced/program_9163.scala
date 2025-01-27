package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], (Byte,(Int,Boolean))]) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, (Char,Int)]], T_A[T_A[Byte, Char], T_A[Char, Boolean]]]
case class CC_B(a: Boolean, b: Char) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, (Char,Int)]], T_A[T_A[Byte, Char], T_A[Char, Boolean]]]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Boolean, (Char,Int)]], T_A[T_A[Byte, Char], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}