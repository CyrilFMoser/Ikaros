package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Boolean,Char), T_A[Boolean]], b: T_A[Byte]) extends T_A[T_B[T_A[Byte], T_B[Int, (Int,Int)]]]
case class CC_B[D](a: T_A[Int], b: T_B[D, D]) extends T_A[D]
case class CC_C[E](a: Boolean) extends T_A[E]
case class CC_D() extends T_B[(T_B[(Int,Boolean), CC_A],T_A[CC_A]), CC_A]

val v_a: T_A[T_B[T_A[Byte], T_B[Int, (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(CC_B(_, _), _)) => 0 
  case CC_A(_, CC_B(CC_C(_), _)) => 1 
  case CC_A(_, CC_C(_)) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_B(CC_C(_), _), _) => 4 
  case CC_B(CC_C(_), _) => 5 
  case CC_C(_) => 6 
}
}