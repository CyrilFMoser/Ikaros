package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (T_A[Char],T_A[Int]), b: T_A[B], c: B) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_), _) => 0 
  case CC_B(CC_A((_,_), _, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}
// This is not matched: CC_A(_, CC_A(_, _, _), _)