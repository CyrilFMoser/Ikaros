package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_A[T_B, T_B],T_A[Byte, (Int,Boolean)]), b: T_B, c: T_B) extends T_A[(T_A[T_B, T_B],T_A[T_B, T_B]), Boolean]
case class CC_B(a: CC_A, b: CC_A) extends T_A[(T_A[T_B, T_B],T_A[T_B, T_B]), Boolean]
case class CC_C(a: T_A[CC_A, Boolean], b: Char, c: Char) extends T_B
case class CC_D(a: Byte, b: CC_A) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A((_,_), CC_C(_, _, _), _)) => 0 
  case CC_D(_, CC_A((_,_), CC_D(_, _), _)) => 1 
  case CC_D(_, CC_A((_,_), CC_E(), _)) => 2 
  case CC_E() => 3 
}
}
// This is not matched: CC_C(_, _, _)