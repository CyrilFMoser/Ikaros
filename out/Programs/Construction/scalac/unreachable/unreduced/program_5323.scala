package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Char, Int],T_A[Boolean, Boolean]), c: (T_A[Boolean, Byte],T_A[Boolean, Int])) extends T_A[Int, C]
case class CC_B[D](a: CC_A[D], b: T_A[Int, D], c: CC_A[D]) extends T_A[Int, D]
case class CC_C[E](a: CC_B[E], b: CC_B[E]) extends T_A[Int, E]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,_), (_,_)) => 0 
  case CC_A(CC_B(_, _, _), (_,_), (_,_)) => 1 
  case CC_A(CC_C(_, _), (_,_), (_,_)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_B(CC_A(_, _, _), _, CC_A(_, _, _)), CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_C(CC_B(CC_A(_, _, _), _, CC_A(_, _, _)), CC_B(_, CC_B(_, _, _), CC_A(_, _, _))) => 5 
  case CC_C(CC_B(CC_A(_, _, _), _, CC_A(_, _, _)), CC_B(_, CC_C(_, _), CC_A(_, _, _))) => 6 
}
}