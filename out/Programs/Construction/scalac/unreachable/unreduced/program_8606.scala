package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, E], b: (Boolean,T_B[(Char,Byte)]), c: T_B[E]) extends T_A[D, E]
case class CC_B[G, F](a: T_A[G, F], b: CC_A[G, F]) extends T_A[G, F]
case class CC_C(a: Char, b: T_A[CC_A[Byte, Char], CC_A[Char, Byte]], c: T_A[T_A[Int, (Int,Char)], CC_B[Int, Int]]) extends T_B[T_A[T_A[Int, Byte], (Boolean,Char)]]
case class CC_D(a: T_A[CC_B[Byte, CC_C], T_A[CC_C, Byte]]) extends T_B[T_A[T_A[Int, Byte], (Boolean,Char)]]
case class CC_E(a: (CC_C,Char), b: CC_B[T_A[CC_D, CC_C], T_A[(Char,Int), CC_D]], c: Byte) extends T_B[T_A[T_A[Int, Byte], (Boolean,Char)]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x', CC_A(CC_A(_, _, _), (_,_), _), CC_A(CC_A(_, _, _), (_,_), _)) => 0 
  case CC_C(_, CC_A(CC_A(_, _, _), (_,_), _), CC_A(CC_A(_, _, _), (_,_), _)) => 1 
  case CC_C('x', CC_A(CC_B(_, _), (_,_), _), CC_A(CC_A(_, _, _), (_,_), _)) => 2 
  case CC_C(_, CC_A(CC_B(_, _), (_,_), _), CC_A(CC_A(_, _, _), (_,_), _)) => 3 
  case CC_C('x', CC_B(_, _), CC_A(CC_A(_, _, _), (_,_), _)) => 4 
  case CC_C(_, CC_B(_, _), CC_A(CC_A(_, _, _), (_,_), _)) => 5 
  case CC_C('x', CC_A(CC_A(_, _, _), (_,_), _), CC_A(CC_B(_, _), (_,_), _)) => 6 
  case CC_C(_, CC_A(CC_A(_, _, _), (_,_), _), CC_A(CC_B(_, _), (_,_), _)) => 7 
  case CC_C('x', CC_A(CC_B(_, _), (_,_), _), CC_A(CC_B(_, _), (_,_), _)) => 8 
  case CC_C(_, CC_A(CC_B(_, _), (_,_), _), CC_A(CC_B(_, _), (_,_), _)) => 9 
  case CC_C('x', CC_B(_, _), CC_A(CC_B(_, _), (_,_), _)) => 10 
  case CC_C(_, CC_B(_, _), CC_A(CC_B(_, _), (_,_), _)) => 11 
  case CC_C('x', CC_A(CC_A(_, _, _), (_,_), _), CC_B(_, _)) => 12 
  case CC_C(_, CC_A(CC_A(_, _, _), (_,_), _), CC_B(_, _)) => 13 
  case CC_C('x', CC_A(CC_B(_, _), (_,_), _), CC_B(_, _)) => 14 
  case CC_C(_, CC_A(CC_B(_, _), (_,_), _), CC_B(_, _)) => 15 
  case CC_C('x', CC_B(_, _), CC_B(_, _)) => 16 
  case CC_C(_, CC_B(_, _), CC_B(_, _)) => 17 
}
}