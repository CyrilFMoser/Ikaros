package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[T_A[C]], b: T_A[C], c: C) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: T_A[T_A[Int]], b: T_A[CC_A[Byte]]) extends T_B[T_A[T_A[Byte]]]
case class CC_D(a: Byte, b: T_A[CC_C], c: (T_A[Int],T_B[CC_C])) extends T_B[T_A[T_A[Byte]]]

val v_a: T_B[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B()), _) => 1 
  case CC_C(CC_A(CC_B(), CC_A(_, _, _), CC_A(_, _, _)), _) => 2 
  case CC_C(CC_A(CC_B(), CC_A(_, _, _), CC_B()), _) => 3 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(), CC_A(_, _, _)), _) => 4 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(), CC_B()), _) => 5 
  case CC_C(CC_A(CC_B(), CC_B(), CC_A(_, _, _)), _) => 6 
  case CC_C(CC_A(CC_B(), CC_B(), CC_B()), _) => 7 
  case CC_C(CC_B(), _) => 8 
  case CC_D(_, _, (CC_A(_, _, _),_)) => 9 
  case CC_D(_, _, (CC_B(),_)) => 10 
}
}