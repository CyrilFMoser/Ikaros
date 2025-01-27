package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: Char) extends T_A[C, Byte]
case class CC_B(a: T_A[T_A[Int, Char], Boolean], b: T_A[T_A[Int, Byte], Byte]) extends T_A[CC_A[T_A[Boolean, Byte]], Byte]

val v_a: T_A[CC_A[T_A[Boolean, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 'x') => 0 
  case CC_A(CC_B(_, CC_A(_, _)), 'x') => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_A(CC_B(_, CC_A(_, _)), _) => 3 
  case CC_B(_, CC_A(CC_A(_, _), _)) => 4 
}
}