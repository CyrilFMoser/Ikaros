package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Byte, E]
case class CC_B[F](a: T_A[Byte, F], b: (T_B[Byte, Int],T_A[Char, Int]), c: T_A[Byte, F]) extends T_A[Byte, F]
case class CC_C[G](a: G, b: Byte) extends T_A[T_B[G, G], G]
case class CC_D[H]() extends T_B[H, CC_B[T_A[Byte, H]]]
case class CC_E[I, J]() extends T_B[I, J]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (CC_E(),_), CC_A()) => 1 
  case CC_B(CC_A(), (CC_E(),_), CC_B(_, (_,_), CC_A())) => 2 
  case CC_B(CC_A(), (CC_E(),_), CC_B(_, (_,_), CC_B(_, _, _))) => 3 
  case CC_B(CC_B(CC_A(), _, CC_A()), (CC_E(),_), CC_A()) => 4 
  case CC_B(CC_B(CC_A(), _, CC_A()), (CC_E(),_), CC_B(_, (_,_), CC_A())) => 5 
  case CC_B(CC_B(CC_A(), _, CC_A()), (CC_E(),_), CC_B(_, (_,_), CC_B(_, _, _))) => 6 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), (CC_E(),_), CC_A()) => 7 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), (CC_E(),_), CC_B(_, (_,_), CC_A())) => 8 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), (CC_E(),_), CC_B(_, (_,_), CC_B(_, _, _))) => 9 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), (CC_E(),_), CC_A()) => 10 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), (CC_E(),_), CC_B(_, (_,_), CC_A())) => 11 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), (CC_E(),_), CC_B(_, (_,_), CC_B(_, _, _))) => 12 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), (CC_E(),_), CC_A()) => 13 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), (CC_E(),_), CC_B(_, (_,_), CC_A())) => 14 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), (CC_E(),_), CC_B(_, (_,_), CC_B(_, _, _))) => 15 
}
}