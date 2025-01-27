package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: Int, c: T_B[Int]) extends T_A[T_B[T_B[(Char,Int)]]]
case class CC_B[C](a: (T_B[CC_A],T_A[CC_A])) extends T_B[C]
case class CC_C[D](a: (T_A[(Byte,Char)],Int), b: D) extends T_B[D]
case class CC_D[E]() extends T_B[E]

val v_a: T_A[T_B[T_B[(Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B((_,_)), _, CC_B((_,_))) => 0 
  case CC_A(CC_C(_, _), _, CC_B((_,_))) => 1 
  case CC_A(CC_D(), _, CC_B((_,_))) => 2 
  case CC_A(CC_B((_,_)), _, CC_C(_, _)) => 3 
  case CC_A(CC_C(_, _), _, CC_C(_, _)) => 4 
  case CC_A(CC_D(), _, CC_C(_, _)) => 5 
  case CC_A(CC_B((_,_)), _, CC_D()) => 6 
  case CC_A(CC_C(_, _), _, CC_D()) => 7 
  case CC_A(CC_D(), _, CC_D()) => 8 
}
}