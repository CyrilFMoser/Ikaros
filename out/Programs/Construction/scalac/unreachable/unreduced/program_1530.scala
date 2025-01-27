package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_A[Char], b: T_A[T_A[Int, Byte], Boolean], c: Char) extends T_A[T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]], T_A[T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]], T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]]]]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]], T_A[T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]], T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B()) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
  case CC_B() => 3 
  case CC_C(CC_A(_), _, _) => 4 
}
}