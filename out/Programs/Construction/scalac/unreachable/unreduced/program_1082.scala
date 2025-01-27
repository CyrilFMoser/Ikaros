package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Int]) extends T_A[Int]
case class CC_B(a: (Boolean,T_A[CC_A]), b: T_A[Int], c: CC_A) extends T_A[Int]
case class CC_C[C](a: CC_A, b: Byte) extends T_B[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B((_,_), CC_A(_), _) => 2 
  case CC_B((_,_), CC_B(_, _, _), _) => 3 
}
}