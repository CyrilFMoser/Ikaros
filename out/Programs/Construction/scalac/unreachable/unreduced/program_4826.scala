package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: CC_A, c: T_B[Byte, Int]) extends T_A
case class CC_D[C]() extends T_B[Char, C]
case class CC_E[D](a: (T_A,CC_C), b: CC_D[D], c: CC_B) extends T_B[Char, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_C(_, _, _)) => 1 
  case CC_B() => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_A(_, CC_A(_, _))