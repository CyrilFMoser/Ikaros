package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[T_A[Int, Char], Byte]
case class CC_B(a: T_A[T_A[Boolean, CC_A], CC_A], b: T_A[T_A[Int, Char], Byte]) extends T_A[T_A[Int, Char], Byte]
case class CC_C(a: T_A[T_A[Int, Char], Byte], b: (Boolean,T_A[CC_A, Byte])) extends T_A[T_A[Int, Char], Byte]

val v_a: T_A[T_A[Int, Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, CC_B(_, CC_A(_))) => 2 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 3 
  case CC_B(_, CC_C(_, _)) => 4 
  case CC_C(_, (_,_)) => 5 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _)))