package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Int, C], b: T_A[Int, C]) extends T_A[Int, C]
case class CC_B(a: T_A[T_A[Int, Char], (Char,Byte)]) extends T_A[Int, T_A[CC_A[Boolean], T_A[Int, Byte]]]

val v_a: T_A[Int, T_A[CC_A[Boolean], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_A(CC_A(_, _), CC_B(_))) => 1 
  case CC_A(_, CC_A(CC_B(_), CC_A(_, _))) => 2 
  case CC_A(_, CC_A(CC_B(_), CC_B(_))) => 3 
  case CC_A(_, CC_B(_)) => 4 
  case CC_B(_) => 5 
}
}