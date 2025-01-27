package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F, G](a: G, b: (T_A[Int, Int],CC_A[Byte, Boolean]), c: T_A[F, F]) extends T_A[F, G]
case class CC_C(a: T_A[T_A[Boolean, Char], CC_B[Int, Byte]], b: T_B[CC_B[Char, Byte]], c: T_A[(Byte,Int), Int]) extends T_B[CC_A[T_A[Boolean, Byte], T_A[Int, Int]]]

val v_a: T_A[CC_C, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B('x', (CC_A(),CC_A()), CC_A()) => 1 
  case CC_B('x', (CC_B(_, _, _),CC_A()), CC_A()) => 2 
  case CC_B('x', (CC_A(),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_A())) => 3 
  case CC_B('x', (CC_B(_, _, _),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_A())) => 4 
  case CC_B('x', (CC_A(),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_B(_, _, _))) => 5 
  case CC_B('x', (CC_B(_, _, _),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_B(_, _, _))) => 6 
  case CC_B(_, (CC_A(),CC_A()), CC_A()) => 7 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_A()) => 8 
  case CC_B(_, (CC_A(),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_A())) => 9 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_A())) => 10 
  case CC_B(_, (CC_A(),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_B(_, _, _))) => 11 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_B(CC_C(_, _, _), (_,_), CC_B(_, _, _))) => 12 
}
}