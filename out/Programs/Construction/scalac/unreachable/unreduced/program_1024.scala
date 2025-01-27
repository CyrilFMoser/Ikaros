package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Byte,T_A[Byte])) extends T_A[(T_A[Int],T_A[Boolean])]
case class CC_B[C](a: T_B[C], b: Byte, c: T_A[C]) extends T_B[C]
case class CC_C[D](a: T_B[D], b: (T_B[CC_A],T_B[CC_A]), c: T_B[D]) extends T_B[D]
case class CC_D[E](a: Byte, b: T_A[E]) extends T_B[(T_A[CC_A],Byte)]

val v_a: T_B[(T_A[CC_A],Byte)] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_B(CC_C(_, _, _), _, _) => 1 
  case CC_B(CC_D(_, _), _, _) => 2 
  case CC_C(CC_B(_, _, _), _, CC_B(_, _, _)) => 3 
  case CC_C(CC_B(_, _, _), _, CC_C(_, _, _)) => 4 
  case CC_C(CC_B(_, _, _), _, CC_D(_, _)) => 5 
  case CC_C(CC_C(_, _, _), _, CC_B(_, _, _)) => 6 
  case CC_C(CC_C(_, _, _), _, CC_C(_, _, _)) => 7 
  case CC_C(CC_C(_, _, _), _, CC_D(_, _)) => 8 
  case CC_C(CC_D(_, _), _, CC_B(_, _, _)) => 9 
  case CC_C(CC_D(_, _), _, CC_C(_, _, _)) => 10 
  case CC_C(CC_D(_, _), _, CC_D(_, _)) => 11 
  case CC_D(_, _) => 12 
}
}