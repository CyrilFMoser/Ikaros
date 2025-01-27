package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_A, c: T_A) extends T_A
case class CC_B(a: Int, b: T_A) extends T_A
case class CC_C[C]() extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_B(_, CC_A(_, CC_B(_, _), CC_A(_, _, _))) => 2 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
}
}
// This is not matched: CC_B(_, CC_A(_, CC_B(_, _), CC_B(_, _)))