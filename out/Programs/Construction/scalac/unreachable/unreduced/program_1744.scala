package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[T_A[Char]]) extends T_A[T_B]
case class CC_B(a: T_B, b: (CC_A,T_A[T_B]), c: T_B) extends T_A[T_B]
case class CC_C[B](a: Boolean) extends T_A[T_B]
case class CC_D(a: CC_C[(CC_A,CC_B)], b: T_A[CC_B], c: CC_B) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _), _) => 0 
  case CC_A(_, CC_E(), _) => 1 
  case CC_B(CC_D(_, _, _), (_,_), CC_D(_, _, _)) => 2 
  case CC_B(CC_D(_, _, _), (_,_), CC_E()) => 3 
  case CC_B(CC_E(), (_,_), CC_D(_, _, _)) => 4 
  case CC_B(CC_E(), (_,_), CC_E()) => 5 
  case CC_C(_) => 6 
}
}