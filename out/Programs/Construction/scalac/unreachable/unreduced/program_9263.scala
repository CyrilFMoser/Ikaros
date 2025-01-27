package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: Int, b: T_A[Char, T_A[Char, Char]]) extends T_A[T_A[CC_A[Byte], T_A[Boolean, Char]], T_A[T_A[CC_A[Byte], T_A[Boolean, Char]], T_A[CC_A[Byte], T_A[Boolean, Char]]]]
case class CC_C() extends T_A[T_A[CC_A[Byte], T_A[Boolean, Char]], T_A[T_A[CC_A[Byte], T_A[Boolean, Char]], T_A[CC_A[Byte], T_A[Boolean, Char]]]]

val v_a: T_A[T_A[CC_A[Byte], T_A[Boolean, Char]], T_A[T_A[CC_A[Byte], T_A[Boolean, Char]], T_A[CC_A[Byte], T_A[Boolean, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}