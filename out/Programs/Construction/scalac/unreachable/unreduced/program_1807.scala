package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B, c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_B(a: T_B, b: ((CC_A,Char),T_A[CC_A]), c: CC_A) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D[B](a: T_A[T_A[T_B]]) extends T_B
case class CC_E(a: CC_A) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_), _) => 0 
  case CC_A(_, CC_E(_), _) => 1 
  case CC_B(CC_D(_), (_,_), CC_A(_, _, _)) => 2 
  case CC_B(CC_E(_), (_,_), CC_A(_, _, _)) => 3 
  case CC_C() => 4 
}
}