package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Int], T_A[Boolean, Char]], b: Boolean, c: Int) extends T_A[Char, T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]]
case class CC_B() extends T_A[Char, T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]]
case class CC_C(a: T_A[Boolean, CC_A], b: CC_A) extends T_A[Char, T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]]

val v_a: T_A[Char, T_A[T_A[Byte, Byte], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)