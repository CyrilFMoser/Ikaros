package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Char,Byte), T_A[Byte, Char]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Char, Byte]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Char], T_A[Char, Byte]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]]
case class CC_C(a: T_A[(CC_B,CC_A), CC_A], b: CC_A, c: Char) extends T_A[T_A[T_A[Boolean, Char], T_A[Char, Byte]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Char, Byte]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)