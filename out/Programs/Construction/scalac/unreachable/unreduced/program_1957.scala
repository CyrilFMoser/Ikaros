package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B, Boolean]
case class CC_B(a: T_B, b: T_A[T_A[T_B, Boolean], (CC_A,T_B)], c: T_B) extends T_A[T_B, Boolean]
case class CC_C(a: T_B, b: CC_A, c: (T_A[T_B, Boolean],(T_B,CC_A))) extends T_B
case class CC_D(a: Byte, b: CC_C, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_C(CC_C(_, _, _), CC_A(_), _), CC_B(_, _, CC_C(_, _, _))) => 1 
  case CC_D(_, CC_C(CC_C(_, _, _), CC_A(_), _), CC_B(_, _, CC_D(_, _, _))) => 2 
  case CC_D(_, CC_C(CC_D(_, _, _), CC_A(_), _), CC_B(_, _, CC_C(_, _, _))) => 3 
}
}
// This is not matched: CC_D(_, CC_C(CC_D(_, _, _), CC_A(_), _), CC_B(_, _, CC_D(_, _, _)))