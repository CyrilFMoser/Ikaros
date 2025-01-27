package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Char, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Byte]]]
case class CC_B(a: CC_A[T_A[Int, Byte]], b: CC_A[T_A[Boolean, Byte]]) extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Char, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Byte]]]
case class CC_C[D](a: CC_B) extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Char, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Char, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_C(CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 2 
}
}