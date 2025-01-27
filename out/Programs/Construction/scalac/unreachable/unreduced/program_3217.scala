package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: Int, c: (T_B[Boolean],T_B[Int])) extends T_A[C]
case class CC_B[D](a: T_B[T_B[D]], b: CC_A[(Char,Boolean)], c: CC_A[D]) extends T_A[D]
case class CC_C() extends T_B[Byte]
case class CC_D(a: CC_C, b: CC_B[CC_A[CC_C]], c: Char) extends T_B[Byte]
case class CC_E(a: Int, b: CC_C) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_B(_, _, _), 'x') => 1 
  case CC_E(_, CC_C()) => 2 
}
}
// This is not matched: CC_D(_, CC_B(_, _, _), _)