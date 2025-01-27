package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, T_A[Boolean, Char]], b: Byte, c: T_A[T_A[Boolean, Int], T_A[Char, Boolean]]) extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Byte]]]
case class CC_B() extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Byte]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Byte]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Int, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}