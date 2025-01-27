package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: T_A[T_A[Byte]]) extends T_A[T_A[((Byte,Byte),Int)]]
case class CC_B[C](a: T_B[C], b: T_A[C]) extends T_B[C]
case class CC_C[D](a: T_B[D], b: D, c: T_B[CC_B[D]]) extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_C(_, _, _), _) => 1 
  case CC_C(CC_B(_, _), _, CC_B(_, _)) => 2 
  case CC_C(CC_C(_, _, _), _, CC_B(_, _)) => 3 
  case CC_C(CC_B(_, _), _, CC_C(_, _, _)) => 4 
  case CC_C(CC_C(_, _, _), _, CC_C(_, _, _)) => 5 
}
}