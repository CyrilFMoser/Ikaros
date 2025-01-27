package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[Byte, Boolean]], b: T_A[T_A[Byte, Char], Char]) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]], T_A[Char, T_A[Boolean, Boolean]]]
case class CC_B(a: CC_A, b: Char) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]], T_A[Char, T_A[Boolean, Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]], T_A[Char, T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]], T_A[Char, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}