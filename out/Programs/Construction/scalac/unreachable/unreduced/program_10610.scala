package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Boolean], b: B) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]], b: CC_A[(Byte,Char)], c: CC_A[T_A[Boolean]]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_B(_, _, CC_A(_, _)), _) => 1 
  case CC_B(_, _, CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_B(_, _, CC_A(CC_A(_, _), CC_B(_, _, _))) => 3 
  case CC_B(_, _, CC_A(CC_B(_, _, _), CC_A(_, _))) => 4 
  case CC_B(_, _, CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 5 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _), _), _)