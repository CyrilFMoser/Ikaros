package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_B[D], b: (CC_A[Boolean],T_A[Boolean])) extends T_A[D]
case class CC_C[E, F](a: T_A[F], b: (CC_A[(Byte,Byte)],T_A[Boolean]), c: T_A[F]) extends T_A[E]
case class CC_D(a: T_A[T_A[Boolean]], b: T_A[T_A[Char]]) extends T_B[CC_B[T_A[Byte]]]
case class CC_E(a: T_B[CC_A[CC_D]]) extends T_B[CC_B[T_A[Byte]]]

val v_a: T_B[CC_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_A(_)) => 0 
  case CC_D(CC_B(_, (_,_)), CC_A(_)) => 1 
  case CC_D(CC_C(_, _, _), CC_A(_)) => 2 
  case CC_D(CC_A(_), CC_B(_, (_,_))) => 3 
  case CC_D(CC_B(_, (_,_)), CC_B(_, (_,_))) => 4 
  case CC_D(CC_C(_, _, _), CC_B(_, (_,_))) => 5 
  case CC_D(CC_A(_), CC_C(_, (_,_), _)) => 6 
  case CC_D(CC_B(_, (_,_)), CC_C(_, (_,_), _)) => 7 
  case CC_D(CC_C(_, _, _), CC_C(_, (_,_), _)) => 8 
  case CC_E(_) => 9 
}
}