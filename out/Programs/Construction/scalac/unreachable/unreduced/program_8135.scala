package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (T_A[Char, Char],Char)]
case class CC_B(a: CC_A[Byte], b: T_A[T_A[Byte, Boolean], Byte]) extends T_A[CC_A[CC_A[Boolean]], (T_A[Char, Char],Char)]
case class CC_C(a: Char, b: CC_B) extends T_A[CC_A[CC_A[Boolean]], (T_A[Char, Char],Char)]

val v_a: T_A[CC_A[CC_A[Boolean]], (T_A[Char, Char],Char)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}