package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Byte], T_B[Byte, Char]], b: ((Boolean,Char),T_A[Byte]), c: Int) extends T_A[T_B[T_A[Int], T_A[Byte]]]
case class CC_B(a: (Boolean,CC_A)) extends T_A[T_B[T_A[Int], T_A[Byte]]]
case class CC_C[D](a: T_A[D]) extends T_A[D]
case class CC_D[E](a: T_A[E], b: (T_A[CC_A],T_B[CC_A, Int])) extends T_B[T_A[T_A[Int]], E]
case class CC_E[F]() extends T_B[T_A[T_A[Int]], F]

val v_a: T_A[T_B[T_A[Int], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),CC_C(_)), _) => 0 
  case CC_B((_,CC_A(_, _, _))) => 1 
  case CC_C(CC_A(_, (_,_), _)) => 2 
  case CC_C(CC_B((_,_))) => 3 
  case CC_C(CC_C(_)) => 4 
}
}