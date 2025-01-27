package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Boolean) extends T_A[T_A[Boolean]]
case class CC_B(a: Byte, b: T_A[T_A[Boolean]], c: CC_A) extends T_A[T_A[Boolean]]
case class CC_C(a: Boolean) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_B(_, CC_A(_, _), _), _) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 2 
  case CC_B(_, CC_B(_, CC_C(_), _), _) => 3 
  case CC_B(_, CC_C(_), _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(_, CC_A(_, _), _)