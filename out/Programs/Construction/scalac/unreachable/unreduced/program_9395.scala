package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[T_A[D, D], D], c: D) extends T_A[T_A[D, D], D]
case class CC_B[E](a: T_A[T_A[E, E], E], b: (T_A[Char, Int],CC_A[Boolean]), c: CC_A[E]) extends T_A[T_A[E, E], E]
case class CC_C() extends T_A[T_A[T_A[T_A[(Byte,Char), (Byte,Char)], (Byte,Char)], T_A[T_A[(Byte,Char), (Byte,Char)], (Byte,Char)]], T_A[T_A[(Byte,Char), (Byte,Char)], (Byte,Char)]]
case class CC_D[F]() extends T_B[F]
case class CC_E() extends T_B[T_A[T_A[T_B[CC_C], T_B[CC_C]], T_B[CC_C]]]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_A(_, CC_B(CC_A(_, _, _), (_,_), CC_A(_, _, _)), _) => 2 
  case CC_A(_, CC_B(CC_B(_, _, _), (_,_), CC_A(_, _, _)), _) => 3 
  case CC_B(CC_A(true, CC_A(_, _, _), _), (_,CC_A(_, _, _)), CC_A(_, _, _)) => 4 
  case CC_B(CC_A(true, CC_B(_, _, _), _), (_,CC_A(_, _, _)), CC_A(_, _, _)) => 5 
  case CC_B(CC_A(false, CC_A(_, _, _), _), (_,CC_A(_, _, _)), CC_A(_, _, _)) => 6 
  case CC_B(CC_A(false, CC_B(_, _, _), _), (_,CC_A(_, _, _)), CC_A(_, _, _)) => 7 
  case CC_B(CC_B(_, _, CC_A(_, _, _)), (_,CC_A(_, _, _)), CC_A(_, _, _)) => 8 
}
}