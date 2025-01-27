package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int) extends T_A[Int]
case class CC_B(a: T_A[Int], b: (T_A[T_B],T_B), c: Byte) extends T_A[Int]
case class CC_C[B](a: Int) extends T_B
case class CC_D(a: (CC_A,Char)) extends T_B
case class CC_E(a: Byte, b: T_A[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_, CC_A(_)) => 1 
  case CC_E(_, CC_B(CC_A(_), (_,_), _)) => 2 
  case CC_E(_, CC_B(CC_B(_, _, _), (_,_), _)) => 3 
}
}
// This is not matched: CC_D(_)